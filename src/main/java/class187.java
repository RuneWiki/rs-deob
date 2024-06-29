import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class187 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[[I")
    public static int[][] field3205;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)Ltc;", line = 4)
    public static final class37 method1318(int arg0, int arg1, int arg2) {
        class295 var3 = class304.field5203[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class37 var4 = var3.field5095;
            var3.field5095 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIIB)V", line = 20)
    public static final void method1319(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3207++;
        if (arg5 >= -84) {
            return;
        }
        class65.field1294 = arg4;
        class218.field3709 = arg2;
        class53.field874 = arg1;
        class306.field5238 = arg3;
        class296.field5099 = arg0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILse;I)V", line = 39)
    public static final void method1320(int arg0, class11 arg1, int arg2) {
        Object[] var3 = arg1.field229;
        int var4 = (Integer) var3[0];
        field3204++;
        class248 var5 = class121.method853(0, var4);
        if (var5 == null) {
            return;
        }
        class119.field2163 = 0;
        if (arg2 != 87) {
            return;
        }
        int var6 = -1;
        int[] var7 = var5.field4306;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = var5.field4314;
        byte var11 = -1;
        try {
            class141.field2486 = new class64[var5.field4325];
            class275.field4720 = new int[var5.field4308];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg1.field225;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg1.field226;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg1.field212 == null ? -1 : arg1.field212.field1080;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg1.field223;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg1.field212 == null ? -1 : arg1.field212.field1167;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg1.field214 == null ? -1 : arg1.field214.field1080;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg1.field214 == null ? -1 : arg1.field214.field1167;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg1.field219;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg1.field221;
                    }
                    class275.field4720[var12++] = var16;
                } else if (var3[var14] instanceof class64) {
                    class64 var15 = (class64) var3[var14];
                    if (var15.method519((byte) 124, class238.field4043)) {
                        var15 = arg1.field222;
                    }
                    class141.field2486[var13++] = var15;
                }
            }
            int var17 = 0;
            label3926: while (true) {
                var17++;
                if (arg0 < var17) {
                    throw new RuntimeException("slow");
                }
                var6++;
                int var483 = var7[var6];
                if (var483 < 100) {
                    if (var483 == 0) {
                        class240.field4103[var9++] = var10[var6];
                        continue;
                    }
                    if (var483 == 1) {
                        int var18 = var10[var6];
                        class240.field4103[var9++] = class289.field4941[var18];
                        continue;
                    }
                    if (var483 == 2) {
                        int var19 = var10[var6];
                        var9--;
                        class42.method326(var19, class240.field4103[var9], -128);
                        continue;
                    }
                    if (var483 == 3) {
                        class314.field5321[var8++] = var5.field4309[var6];
                        continue;
                    }
                    if (var483 == 6) {
                        var6 += var10[var6];
                        continue;
                    }
                    if (var483 == 7) {
                        var9 -= 2;
                        if (class240.field4103[var9 + 1] != class240.field4103[var9]) {
                            var6 += var10[var6];
                        }
                        continue;
                    }
                    if (var483 == 8) {
                        var9 -= 2;
                        if (class240.field4103[var9 + 1] == class240.field4103[var9]) {
                            var6 += var10[var6];
                        }
                        continue;
                    }
                    if (var483 == 9) {
                        var9 -= 2;
                        if (class240.field4103[var9 + 1] > class240.field4103[var9]) {
                            var6 += var10[var6];
                        }
                        continue;
                    }
                    if (var483 == 10) {
                        var9 -= 2;
                        if (class240.field4103[var9] > class240.field4103[var9 + 1]) {
                            var6 += var10[var6];
                        }
                        continue;
                    }
                    if (var483 == 21) {
                        if (class119.field2163 == 0) {
                            return;
                        }
                        class111 var20 = class53.field872[--class119.field2163];
                        class141.field2486 = var20.field2065;
                        var5 = var20.field2045;
                        var6 = var20.field2048;
                        var7 = var5.field4306;
                        class275.field4720 = var20.field2046;
                        var10 = var5.field4314;
                        continue;
                    }
                    if (var483 == 25) {
                        int var21 = var10[var6];
                        class240.field4103[var9++] = class278.method1928((byte) -91, var21);
                        continue;
                    }
                    if (var483 == 27) {
                        int var22 = var10[var6];
                        var9--;
                        class6.method56(121, var22, class240.field4103[var9]);
                        continue;
                    }
                    if (var483 == 31) {
                        var9 -= 2;
                        if (class240.field4103[var9 + 1] >= class240.field4103[var9]) {
                            var6 += var10[var6];
                        }
                        continue;
                    }
                    if (var483 == 32) {
                        var9 -= 2;
                        if (class240.field4103[var9] >= class240.field4103[var9 + 1]) {
                            var6 += var10[var6];
                        }
                        continue;
                    }
                    if (var483 == 33) {
                        class240.field4103[var9++] = class275.field4720[var10[var6]];
                        continue;
                    }
                    int var10001;
                    if (var483 == 34) {
                        var10001 = var10[var6];
                        var9--;
                        class275.field4720[var10001] = class240.field4103[var9];
                        continue;
                    }
                    if (var483 == 35) {
                        class314.field5321[var8++] = class141.field2486[var10[var6]];
                        continue;
                    }
                    if (var483 == 36) {
                        var10001 = var10[var6];
                        var8--;
                        class141.field2486[var10001] = class314.field5321[var8];
                        continue;
                    }
                    if (var483 == 37) {
                        int var23 = var10[var6];
                        var8 -= var23;
                        class64 var24 = class205.method1431(var23, var8, class314.field5321, arg2 - 8984);
                        class314.field5321[var8++] = var24;
                        continue;
                    }
                    if (var483 == 38) {
                        var9--;
                        continue;
                    }
                    if (var483 == 39) {
                        var8--;
                        continue;
                    }
                    if (var483 == 40) {
                        int var25 = var10[var6];
                        class248 var26 = class121.method853(0, var25);
                        int[] var27 = new int[var26.field4308];
                        class64[] var28 = new class64[var26.field4325];
                        for (int var29 = 0; var29 < var26.field4315; var29++) {
                            var27[var29] = class240.field4103[var9 + var29 - var26.field4315];
                        }
                        for (int var30 = 0; var30 < var26.field4319; var30++) {
                            var28[var30] = class314.field5321[var8 + var30 - var26.field4319];
                        }
                        var9 -= var26.field4315;
                        var8 -= var26.field4319;
                        class111 var31 = new class111();
                        var31.field2045 = var5;
                        var31.field2065 = class141.field2486;
                        var31.field2046 = class275.field4720;
                        var31.field2048 = var6;
                        if (class119.field2163 >= class53.field872.length) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class53.field872[class119.field2163++] = var31;
                        var6 = -1;
                        var10 = var26.field4314;
                        class141.field2486 = var28;
                        class275.field4720 = var27;
                        var7 = var26.field4306;
                        continue;
                    }
                    if (var483 == 42) {
                        class240.field4103[var9++] = class40.field633[var10[var6]];
                        continue;
                    }
                    if (var483 == 43) {
                        int var32 = var10[var6];
                        var9--;
                        class40.field633[var32] = class240.field4103[var9];
                        class164.method1174(1, var32);
                        continue;
                    }
                    if (var483 == 44) {
                        int var33 = var10[var6] >> 16;
                        int var34 = var10[var6] & 0xFFFF;
                        var9--;
                        int var35 = class240.field4103[var9];
                        if (var35 >= 0 && var35 <= 5000) {
                            class93.field1737[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label3926;
                                }
                                class278.field4788[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 45) {
                        int var38 = var10[var6];
                        var9--;
                        int var39 = class240.field4103[var9];
                        if (var39 >= 0 && var39 < class93.field1737[var38]) {
                            class240.field4103[var9++] = class278.field4788[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 46) {
                        var9 -= 2;
                        int var40 = var10[var6];
                        int var41 = class240.field4103[var9];
                        if (var41 >= 0 && class93.field1737[var40] > var41) {
                            class278.field4788[var40][var41] = class240.field4103[var9 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 47) {
                        class64 var42 = class32.field533[var10[var6]];
                        if (var42 == null) {
                            var42 = class84.field1554;
                        }
                        class314.field5321[var8++] = var42;
                        continue;
                    }
                    if (var483 == 48) {
                        int var43 = var10[var6];
                        var8--;
                        class32.field533[var43] = class314.field5321[var8];
                        class292.method2019(var43, (byte) 62);
                        continue;
                    }
                    if (var483 == 51) {
                        class159 var44 = var5.field4324[var10[var6]];
                        var9--;
                        class84 var45 = (class84) var44.method1151((long) class240.field4103[var9], 0);
                        if (var45 != null) {
                            var6 += var45.field1552;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var6] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var483 < 300) {
                    if (var483 == 100) {
                        var9 -= 3;
                        int var462 = class240.field4103[var9 + 1];
                        int var463 = class240.field4103[var9];
                        int var464 = class240.field4103[var9 + 2];
                        if (var462 != 0) {
                            class60 var465 = class125.method907(var463, -86);
                            if (var465.field1100 == null) {
                                var465.field1100 = new class60[var464 + 1];
                            }
                            if (var465.field1100.length <= var464) {
                                class60[] var466 = new class60[var464 + 1];
                                for (int var467 = 0; var467 < var465.field1100.length; var467++) {
                                    var466[var467] = var465.field1100[var467];
                                }
                                var465.field1100 = var466;
                            }
                            if (var464 > 0 && var465.field1100[var464 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var464 - 1));
                            }
                            class60 var468 = new class60();
                            var468.field1167 = var464;
                            var468.field1017 = true;
                            var468.field1113 = var468.field1080 = var465.field1080;
                            var468.field1091 = var462;
                            var465.field1100[var464] = var468;
                            if (var46) {
                                class216.field3617 = var468;
                            } else {
                                class186.field3198 = var468;
                            }
                            class190.method1342(var465, 0);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 101) {
                        class60 var469 = var46 ? class216.field3617 : class186.field3198;
                        if (var469.field1167 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class60 var470 = class125.method907(var469.field1080, arg2 - 172);
                        var470.field1100[var469.field1167] = null;
                        class190.method1342(var470, arg2 ^ 0x57);
                        continue;
                    }
                    if (var483 == 102) {
                        var9--;
                        class60 var471 = class125.method907(class240.field4103[var9], -107);
                        var471.field1100 = null;
                        class190.method1342(var471, 0);
                        continue;
                    }
                    if (var483 == 200) {
                        var9 -= 2;
                        int var472 = class240.field4103[var9 + 1];
                        int var473 = class240.field4103[var9];
                        class60 var474 = class25.method229(var472, (byte) 124, var473);
                        if (var474 != null && var472 != -1) {
                            class240.field4103[var9++] = 1;
                            if (var46) {
                                class216.field3617 = var474;
                            } else {
                                class186.field3198 = var474;
                            }
                            continue;
                        }
                        class240.field4103[var9++] = 0;
                        continue;
                    }
                    if (var483 == 201) {
                        var9--;
                        int var475 = class240.field4103[var9];
                        class60 var476 = class125.method907(var475, -90);
                        if (var476 == null) {
                            class240.field4103[var9++] = 0;
                        } else {
                            class240.field4103[var9++] = 1;
                            if (var46) {
                                class216.field3617 = var476;
                            } else {
                                class186.field3198 = var476;
                            }
                        }
                        continue;
                    }
                } else if (var483 < 500) {
                    if (var483 == 403) {
                        var9 -= 2;
                        int var457 = class240.field4103[var9 + 1];
                        int var458 = class240.field4103[var9];
                        if (var458 >= 7) {
                            var458 -= 7;
                        }
                        class139.field2472.field639.method2164(var457, 255, var458);
                        continue;
                    }
                    if (var483 == 404) {
                        var9 -= 2;
                        int var459 = class240.field4103[var9 + 1];
                        int var460 = class240.field4103[var9];
                        class139.field2472.field639.method2151(var460, 1073741823, var459);
                        continue;
                    }
                    if (var483 == 410) {
                        var9--;
                        boolean var461 = class240.field4103[var9] != 0;
                        class139.field2472.field639.method2162(var461, (byte) -125);
                        continue;
                    }
                } else if (!(var483 < 1000 || var483 >= 1100) || !(var483 < 2000 || var483 >= 2100)) {
                    class60 var47;
                    if (var483 >= 2000) {
                        var9--;
                        var47 = class125.method907(class240.field4103[var9], -75);
                        var483 -= 1000;
                    } else {
                        var47 = var46 ? class216.field3617 : class186.field3198;
                    }
                    if (var483 == 1000) {
                        var9 -= 4;
                        var47.field1021 = class240.field4103[var9];
                        var47.field1094 = class240.field4103[var9 + 1];
                        int var48 = class240.field4103[var9 + 3];
                        int var49 = class240.field4103[var9 + 2];
                        if (var48 < 0) {
                            var48 = 0;
                        } else if (var48 > 5) {
                            var48 = 5;
                        }
                        if (var49 < 0) {
                            var49 = 0;
                        } else if (var49 > 5) {
                            var49 = 5;
                        }
                        var47.field1168 = (byte) var49;
                        var47.field1159 = (byte) var48;
                        class190.method1342(var47, arg2 - 87);
                        class66.method552(var47, (byte) -53);
                        if (var47.field1167 == -1) {
                            class269.method1890(11, var47.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1001) {
                        var9 -= 4;
                        var47.field1161 = class240.field4103[var9];
                        var47.field1134 = class240.field4103[var9 + 1];
                        var47.field1140 = 0;
                        var47.field1132 = 0;
                        int var50 = class240.field4103[var9 + 3];
                        int var51 = class240.field4103[var9 + 2];
                        if (var50 < 0) {
                            var50 = 0;
                        } else if (var50 > 4) {
                            var50 = 4;
                        }
                        var47.field1036 = (byte) var50;
                        if (var51 < 0) {
                            var51 = 0;
                        } else if (var51 > 4) {
                            var51 = 4;
                        }
                        var47.field1157 = (byte) var51;
                        class190.method1342(var47, 0);
                        class66.method552(var47, (byte) -106);
                        if (var47.field1091 == 0) {
                            class240.method1744((byte) -106, false, var47);
                        }
                        continue;
                    }
                    if (var483 == 1003) {
                        var9--;
                        boolean var52 = class240.field4103[var9] == 1;
                        if (var52 != var47.field1102) {
                            var47.field1102 = var52;
                            class190.method1342(var47, 0);
                        }
                        if (var47.field1167 == -1) {
                            class278.method1932(var47.field1080, (byte) 83);
                        }
                        continue;
                    }
                    if (var483 == 1004) {
                        var9 -= 2;
                        var47.field1075 = class240.field4103[var9];
                        var47.field1015 = class240.field4103[var9 + 1];
                        class190.method1342(var47, 0);
                        class66.method552(var47, (byte) -46);
                        if (var47.field1091 == 0) {
                            class240.method1744((byte) -109, false, var47);
                        }
                        continue;
                    }
                } else if (var483 >= 1100 && var483 < 1200 || var483 >= 2100 && var483 < 2200) {
                    class60 var53;
                    if (var483 >= 2000) {
                        var9--;
                        var53 = class125.method907(class240.field4103[var9], -95);
                        var483 -= 1000;
                    } else {
                        var53 = var46 ? class216.field3617 : class186.field3198;
                    }
                    if (var483 == 1100) {
                        var9 -= 2;
                        var53.field1175 = class240.field4103[var9];
                        if ((var53.field1112 - var53.field1163) < var53.field1175) {
                            var53.field1175 = var53.field1112 - var53.field1163;
                        }
                        if (var53.field1175 < 0) {
                            var53.field1175 = 0;
                        }
                        var53.field1022 = class240.field4103[var9 + 1];
                        if (var53.field1171 - var53.field1016 < var53.field1022) {
                            var53.field1022 = var53.field1171 - var53.field1016;
                        }
                        if (var53.field1022 < 0) {
                            var53.field1022 = 0;
                        }
                        class190.method1342(var53, 0);
                        if (var53.field1167 == -1) {
                            class108.method790((byte) 108, var53.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1101) {
                        var9--;
                        var53.field1024 = class240.field4103[var9];
                        class190.method1342(var53, arg2 - 87);
                        if (var53.field1167 == -1) {
                            class41.method321(var53.field1080, true);
                        }
                        continue;
                    }
                    if (var483 == 1102) {
                        var9--;
                        var53.field1089 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1103) {
                        var9--;
                        var53.field1181 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1104) {
                        var9--;
                        var53.field1051 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1105) {
                        var9--;
                        var53.field1033 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1106) {
                        var9--;
                        var53.field1155 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1107) {
                        var9--;
                        var53.field1176 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1108) {
                        var53.field1012 = 1;
                        var9--;
                        var53.field1067 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        if (var53.field1167 == -1) {
                            class196.method1376(128, var53.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1109) {
                        var9 -= 6;
                        var53.field1173 = class240.field4103[var9];
                        var53.field1153 = class240.field4103[var9 + 1];
                        var53.field1146 = class240.field4103[var9 + 2];
                        var53.field1009 = class240.field4103[var9 + 3];
                        var53.field1105 = class240.field4103[var9 + 4];
                        var53.field1148 = class240.field4103[var9 + 5];
                        class190.method1342(var53, 0);
                        if (var53.field1167 == -1) {
                            class54.method407(96, var53.field1080);
                            class263.method1846(var53.field1080, 10);
                        }
                        continue;
                    }
                    if (var483 == 1110) {
                        var9--;
                        int var54 = class240.field4103[var9];
                        if (var53.field1026 != var54) {
                            var53.field1085 = 0;
                            var53.field1026 = var54;
                            var53.field1082 = 0;
                            class190.method1342(var53, 0);
                        }
                        if (var53.field1167 == -1) {
                            class146.method1042(-268, var53.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1111) {
                        var9--;
                        var53.field1071 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1112) {
                        var8--;
                        class64 var55 = class314.field5321[var8];
                        if (!var55.method519((byte) 124, var53.field1053)) {
                            var53.field1053 = var55;
                            class190.method1342(var53, 0);
                        }
                        if (var53.field1167 == -1) {
                            class246.method1783(var53.field1080, 60);
                        }
                        continue;
                    }
                    if (var483 == 1113) {
                        var9--;
                        var53.field1111 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1114) {
                        var9 -= 3;
                        var53.field1136 = class240.field4103[var9];
                        var53.field1118 = class240.field4103[var9 + 1];
                        var53.field1018 = class240.field4103[var9 + 2];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1115) {
                        var9--;
                        var53.field1078 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1116) {
                        var9--;
                        var53.field1028 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1117) {
                        var9--;
                        var53.field1044 = class240.field4103[var9];
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1118) {
                        var9--;
                        var53.field1106 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1119) {
                        var9--;
                        var53.field1128 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                    if (var483 == 1120) {
                        var9 -= 2;
                        var53.field1112 = class240.field4103[var9];
                        var53.field1171 = class240.field4103[var9 + 1];
                        class190.method1342(var53, 0);
                        if (var53.field1091 == 0) {
                            class240.method1744((byte) -91, false, var53);
                        }
                        continue;
                    }
                    if (var483 == 1121) {
                        var9 -= 2;
                        var53.field1054 = (short) class240.field4103[var9];
                        var53.field1037 = (short) class240.field4103[var9 + 1];
                        class190.method1342(var53, arg2 - 87);
                        continue;
                    }
                    if (var483 == 1122) {
                        var9--;
                        var53.field1131 = class240.field4103[var9] == 1;
                        class190.method1342(var53, 0);
                        continue;
                    }
                } else if (var483 >= 1200 && var483 < 1300 || var483 >= 2200 && var483 < 2300) {
                    class60 var453;
                    if (var483 >= 2000) {
                        var9--;
                        var453 = class125.method907(class240.field4103[var9], -91);
                        var483 -= 1000;
                    } else {
                        var453 = var46 ? class216.field3617 : class186.field3198;
                    }
                    class190.method1342(var453, 0);
                    if (var483 == 1200 || var483 == 1205) {
                        var9 -= 2;
                        int var454 = class240.field4103[var9];
                        int var455 = class240.field4103[var9 + 1];
                        if (var453.field1167 == -1) {
                            class114.method815(var453.field1080, arg2 ^ 0x7C);
                            class54.method407(arg2 - 212, var453.field1080);
                            class263.method1846(var453.field1080, 10);
                        }
                        if (var454 == -1) {
                            var453.field1067 = -1;
                            var453.field1012 = 1;
                            var453.field1169 = -1;
                        } else {
                            var453.field1169 = var454;
                            var453.field1088 = var455;
                            class92 var456 = class132.method949(var454, false);
                            var453.field1009 = var456.field1723;
                            if (var483 == 1205) {
                                var453.field1165 = false;
                            } else {
                                var453.field1165 = true;
                            }
                            var453.field1146 = var456.field1655;
                            var453.field1148 = var456.field1693;
                            var453.field1173 = var456.field1705;
                            var453.field1105 = var456.field1680;
                            if (var453.field1140 > 0) {
                                var453.field1148 = var453.field1148 * 32 / var453.field1140;
                            } else if (var453.field1161 > 0) {
                                var453.field1148 = var453.field1148 * 32 / var453.field1161;
                            }
                            var453.field1153 = var456.field1690;
                        }
                        continue;
                    }
                    if (var483 == 1201) {
                        var453.field1012 = 2;
                        var9--;
                        var453.field1067 = class240.field4103[var9];
                        if (var453.field1167 == -1) {
                            class196.method1376(128, var453.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1202) {
                        var453.field1012 = 3;
                        var453.field1067 = class139.field2472.field639.method2163(false);
                        if (var453.field1167 == -1) {
                            class196.method1376(128, var453.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1203) {
                        var453.field1012 = 6;
                        var9--;
                        var453.field1067 = class240.field4103[var9];
                        if (var453.field1167 == -1) {
                            class196.method1376(128, var453.field1080);
                        }
                        continue;
                    }
                    if (var483 == 1204) {
                        var453.field1012 = 5;
                        var9--;
                        var453.field1067 = class240.field4103[var9];
                        if (var453.field1167 == -1) {
                            class196.method1376(128, var453.field1080);
                        }
                        continue;
                    }
                } else if ((var483 < 1300 || var483 >= 1400) && (var483 < 2300 || var483 >= 2400)) {
                    if (var483 >= 1400 && var483 < 1500 || var483 >= 2400 && var483 < 2500) {
                        class60 var56;
                        if (var483 < 2000) {
                            var56 = var46 ? class216.field3617 : class186.field3198;
                        } else {
                            var9--;
                            var56 = class125.method907(class240.field4103[var9], -125);
                            var483 -= 1000;
                        }
                        int[] var57 = null;
                        var8--;
                        class64 var58 = class314.field5321[var8];
                        if (var58.method540(28981) > 0 && var58.method495(var58.method540(28981) - 1, (byte) 114) == 89) {
                            var9--;
                            int var59 = class240.field4103[var9];
                            if (var59 > 0) {
                                var57 = new int[var59];
                                while (var59-- > 0) {
                                    var9--;
                                    var57[var59] = class240.field4103[var9];
                                }
                            }
                            var58 = var58.method524(var58.method540(28981) - 1, (byte) 116, 0);
                        }
                        Object[] var60 = new Object[var58.method540(28981) + 1];
                        for (int var61 = var60.length - 1; var61 >= 1; var61--) {
                            if (var58.method495(var61 - 1, (byte) 116) == 115) {
                                var8--;
                                var60[var61] = class314.field5321[var8];
                            } else {
                                var9--;
                                var60[var61] = Integer.valueOf(class240.field4103[var9]);
                            }
                        }
                        var9--;
                        int var62 = class240.field4103[var9];
                        if (var62 == -1) {
                            var60 = null;
                        } else {
                            var60[0] = Integer.valueOf(var62);
                        }
                        var56.field1092 = true;
                        if (var483 == 1400) {
                            var56.field1055 = var60;
                        } else if (var483 == 1401) {
                            var56.field1147 = var60;
                        } else if (var483 == 1402) {
                            var56.field1058 = var60;
                        } else if (var483 == 1403) {
                            var56.field1064 = var60;
                        } else if (var483 == 1404) {
                            var56.field1031 = var60;
                        } else if (var483 == 1405) {
                            var56.field1046 = var60;
                        } else if (var483 == 1406) {
                            var56.field1135 = var60;
                        } else if (var483 == 1407) {
                            var56.field1116 = var57;
                            var56.field1114 = var60;
                        } else if (var483 == 1408) {
                            var56.field1119 = var60;
                        } else if (var483 == 1409) {
                            var56.field1122 = var60;
                        } else if (var483 == 1410) {
                            var56.field1124 = var60;
                        } else if (var483 == 1411) {
                            var56.field1065 = var60;
                        } else if (var483 == 1412) {
                            var56.field1084 = var60;
                        } else if (var483 == 1414) {
                            var56.field1068 = var60;
                            var56.field1170 = var57;
                        } else if (var483 == 1415) {
                            var56.field1020 = var60;
                            var56.field1027 = var57;
                        } else if (var483 == 1416) {
                            var56.field1087 = var60;
                        } else if (var483 == 1417) {
                            var56.field1126 = var60;
                        } else if (var483 == 1418) {
                            var56.field1178 = var60;
                        } else if (var483 == 1419) {
                            var56.field1104 = var60;
                        } else if (var483 == 1420) {
                            var56.field1063 = var60;
                        } else if (var483 == 1421) {
                            var56.field1164 = var60;
                        } else if (var483 == 1422) {
                            var56.field1057 = var60;
                        } else if (var483 == 1423) {
                            var56.field1059 = var60;
                        } else if (var483 == 1424) {
                            var56.field1107 = var60;
                        } else if (var483 == 1425) {
                            var56.field1123 = var60;
                        } else if (var483 == 1426) {
                            var56.field1050 = var60;
                        } else if (var483 == 1427) {
                            var56.field1144 = var60;
                        } else if (var483 == 1428) {
                            var56.field1042 = var57;
                            var56.field1035 = var60;
                        } else if (var483 == 1429) {
                            var56.field1077 = var60;
                            var56.field1081 = var57;
                        }
                        continue;
                    }
                    if (var483 < 1600) {
                        class60 var448 = var46 ? class216.field3617 : class186.field3198;
                        if (var483 == 1500) {
                            class240.field4103[var9++] = var448.field1040;
                            continue;
                        }
                        if (var483 == 1501) {
                            class240.field4103[var9++] = var448.field1032;
                            continue;
                        }
                        if (var483 == 1502) {
                            class240.field4103[var9++] = var448.field1163;
                            continue;
                        }
                        if (var483 == 1503) {
                            class240.field4103[var9++] = var448.field1016;
                            continue;
                        }
                        if (var483 == 1504) {
                            class240.field4103[var9++] = var448.field1102 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 1505) {
                            class240.field4103[var9++] = var448.field1113;
                            continue;
                        }
                    } else if (var483 < 1700) {
                        class60 var63 = var46 ? class216.field3617 : class186.field3198;
                        if (var483 == 1600) {
                            class240.field4103[var9++] = var63.field1175;
                            continue;
                        }
                        if (var483 == 1601) {
                            class240.field4103[var9++] = var63.field1022;
                            continue;
                        }
                        if (var483 == 1602) {
                            class314.field5321[var8++] = var63.field1053;
                            continue;
                        }
                        if (var483 == 1603) {
                            class240.field4103[var9++] = var63.field1112;
                            continue;
                        }
                        if (var483 == 1604) {
                            class240.field4103[var9++] = var63.field1171;
                            continue;
                        }
                        if (var483 == 1605) {
                            class240.field4103[var9++] = var63.field1148;
                            continue;
                        }
                        if (var483 == 1606) {
                            class240.field4103[var9++] = var63.field1146;
                            continue;
                        }
                        if (var483 == 1607) {
                            class240.field4103[var9++] = var63.field1105;
                            continue;
                        }
                        if (var483 == 1608) {
                            class240.field4103[var9++] = var63.field1009;
                            continue;
                        }
                        if (var483 == 1609) {
                            class240.field4103[var9++] = var63.field1181;
                            continue;
                        }
                    } else if (var483 < 1800) {
                        class60 var447 = var46 ? class216.field3617 : class186.field3198;
                        if (var483 == 1700) {
                            class240.field4103[var9++] = var447.field1169;
                            continue;
                        }
                        if (var483 == 1701) {
                            if (var447.field1169 == -1) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = var447.field1088;
                            }
                            continue;
                        }
                        if (var483 == 1702) {
                            class240.field4103[var9++] = var447.field1167;
                            continue;
                        }
                    } else if (var483 < 1900) {
                        class60 var64 = var46 ? class216.field3617 : class186.field3198;
                        if (var483 == 1800) {
                            class240.field4103[var9++] = class69.method562(client.method1762(var64), (byte) 109);
                            continue;
                        }
                        if (var483 == 1801) {
                            var9--;
                            int var65 = class240.field4103[var9];
                            int var484 = var65 - 1;
                            if (var64.field1149 != null && var64.field1149.length > var484 && var64.field1149[var484] != null) {
                                class314.field5321[var8++] = var64.field1149[var484];
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 1802) {
                            if (var64.field1142 == null) {
                                class314.field5321[var8++] = class74.field1404;
                            } else {
                                class314.field5321[var8++] = var64.field1142;
                            }
                            continue;
                        }
                    } else if (var483 < 2600) {
                        var9--;
                        class60 var66 = class125.method907(class240.field4103[var9], -81);
                        if (var483 == 2500) {
                            class240.field4103[var9++] = var66.field1040;
                            continue;
                        }
                        if (var483 == 2501) {
                            class240.field4103[var9++] = var66.field1032;
                            continue;
                        }
                        if (var483 == 2502) {
                            class240.field4103[var9++] = var66.field1163;
                            continue;
                        }
                        if (var483 == 2503) {
                            class240.field4103[var9++] = var66.field1016;
                            continue;
                        }
                        if (var483 == 2504) {
                            class240.field4103[var9++] = var66.field1102 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 2505) {
                            class240.field4103[var9++] = var66.field1113;
                            continue;
                        }
                    } else if (var483 < 2700) {
                        var9--;
                        class60 var67 = class125.method907(class240.field4103[var9], -109);
                        if (var483 == 2600) {
                            class240.field4103[var9++] = var67.field1175;
                            continue;
                        }
                        if (var483 == 2601) {
                            class240.field4103[var9++] = var67.field1022;
                            continue;
                        }
                        if (var483 == 2602) {
                            class314.field5321[var8++] = var67.field1053;
                            continue;
                        }
                        if (var483 == 2603) {
                            class240.field4103[var9++] = var67.field1112;
                            continue;
                        }
                        if (var483 == 2604) {
                            class240.field4103[var9++] = var67.field1171;
                            continue;
                        }
                        if (var483 == 2605) {
                            class240.field4103[var9++] = var67.field1148;
                            continue;
                        }
                        if (var483 == 2606) {
                            class240.field4103[var9++] = var67.field1146;
                            continue;
                        }
                        if (var483 == 2607) {
                            class240.field4103[var9++] = var67.field1105;
                            continue;
                        }
                        if (var483 == 2608) {
                            class240.field4103[var9++] = var67.field1009;
                            continue;
                        }
                        if (var483 == 2609) {
                            class240.field4103[var9++] = var67.field1181;
                            continue;
                        }
                    } else if (var483 < 2800) {
                        if (var483 == 2700) {
                            var9--;
                            class60 var68 = class125.method907(class240.field4103[var9], -100);
                            class240.field4103[var9++] = var68.field1169;
                            continue;
                        }
                        if (var483 != 2701) {
                            if (var483 == 2702) {
                                var9--;
                                int var70 = class240.field4103[var9];
                                class172 var71 = (class172) class159.field2805.method1151((long) var70, 0);
                                if (var71 == null) {
                                    class240.field4103[var9++] = 0;
                                } else {
                                    class240.field4103[var9++] = 1;
                                }
                                continue;
                            }
                            if (var483 == 2703) {
                                var9--;
                                class60 var72 = class125.method907(class240.field4103[var9], -68);
                                if (var72.field1100 == null) {
                                    class240.field4103[var9++] = 0;
                                    continue;
                                }
                                int var73 = var72.field1100.length;
                                for (int var74 = 0; var74 < var72.field1100.length; var74++) {
                                    if (var72.field1100[var74] == null) {
                                        var73 = var74;
                                        break;
                                    }
                                }
                                class240.field4103[var9++] = var73;
                                continue;
                            }
                            if (var483 != 2704 && var483 != 2705) {
                                throw new IllegalStateException();
                            }
                            var9 -= 2;
                            int var75 = class240.field4103[var9];
                            int var76 = class240.field4103[var9 + 1];
                            class172 var77 = (class172) class159.field2805.method1151((long) var75, 0);
                            if (var77 != null && var77.field2967 == var76) {
                                class240.field4103[var9++] = 1;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        var9--;
                        class60 var69 = class125.method907(class240.field4103[var9], -71);
                        if (var69.field1169 == -1) {
                            class240.field4103[var9++] = 0;
                        } else {
                            class240.field4103[var9++] = var69.field1088;
                        }
                        continue;
                    } else if (var483 < 2900) {
                        var9--;
                        class60 var78 = class125.method907(class240.field4103[var9], -72);
                        if (var483 == 2800) {
                            class240.field4103[var9++] = class69.method562(client.method1762(var78), (byte) 109);
                            continue;
                        }
                        if (var483 == 2801) {
                            var9--;
                            int var79 = class240.field4103[var9];
                            int var485 = var79 - 1;
                            if (var78.field1149 != null && var78.field1149.length > var485 && var78.field1149[var485] != null) {
                                class314.field5321[var8++] = var78.field1149[var485];
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 2802) {
                            if (var78.field1142 == null) {
                                class314.field5321[var8++] = class74.field1404;
                            } else {
                                class314.field5321[var8++] = var78.field1142;
                            }
                            continue;
                        }
                    } else if (var483 < 3200) {
                        if (var483 == 3100) {
                            var8--;
                            class64 var80 = class314.field5321[var8];
                            class233.method1670(var80, class74.field1404, 0, (byte) -120);
                            continue;
                        }
                        if (var483 == 3101) {
                            var9 -= 2;
                            class70.method572(class240.field4103[var9 + 1], class240.field4103[var9], 25, class139.field2472);
                            continue;
                        }
                        if (var483 == 3103) {
                            class70.method573(15);
                            continue;
                        }
                        if (var483 == 3104) {
                            var8--;
                            class64 var81 = class314.field5321[var8];
                            int var82 = 0;
                            class188.field3222++;
                            if (var81.method498((byte) -121)) {
                                var82 = var81.method529((byte) 55);
                            }
                            class17.field353.method1214(-48, 148);
                            class17.field353.method128((byte) 119, var82);
                            continue;
                        }
                        if (var483 == 3105) {
                            var8--;
                            class64 var83 = class314.field5321[var8];
                            class17.field353.method1214(-126, 252);
                            class17.field353.method161((byte) -113, var83.method509(31492));
                            class315.field5348++;
                            continue;
                        }
                        if (var483 == 3106) {
                            var8--;
                            class64 var84 = class314.field5321[var8];
                            class306.field5231++;
                            class17.field353.method1214(-61, 122);
                            class17.field353.method130(-1, var84.method540(28981) + 1);
                            class17.field353.method116(false, var84);
                            continue;
                        }
                        if (var483 == 3107) {
                            var8--;
                            class64 var85 = class314.field5321[var8];
                            var9--;
                            int var86 = class240.field4103[var9];
                            class53.method395(true, var86, var85);
                            continue;
                        }
                        if (var483 == 3108) {
                            var9 -= 3;
                            int var87 = class240.field4103[var9];
                            int var88 = class240.field4103[var9 + 1];
                            int var89 = class240.field4103[var9 + 2];
                            class60 var90 = class125.method907(var89, arg2 - 190);
                            class17.method173(var87, (byte) -15, var88, var90);
                            continue;
                        }
                        if (var483 == 3109) {
                            var9 -= 2;
                            int var91 = class240.field4103[var9 + 1];
                            int var92 = class240.field4103[var9];
                            class60 var93 = var46 ? class216.field3617 : class186.field3198;
                            class17.method173(var92, (byte) -15, var91, var93);
                            continue;
                        }
                        if (var483 == 3110) {
                            class237.field3998++;
                            var9--;
                            int var94 = class240.field4103[var9];
                            class17.field353.method1214(arg2 - 151, 58);
                            class17.field353.method145(arg2 + 29, var94);
                            continue;
                        }
                    } else if (var483 < 3300) {
                        if (var483 == 3200) {
                            var9 -= 3;
                            class59.method459(class240.field4103[var9 + 1], class240.field4103[var9], class240.field4103[var9 + 2], (byte) 124);
                            continue;
                        }
                        if (var483 == 3201) {
                            var9--;
                            class154.method1111(-127, class240.field4103[var9]);
                            continue;
                        }
                        if (var483 == 3202) {
                            var9 -= 2;
                            class155.method1118(class240.field4103[var9 + 1], true, class240.field4103[var9]);
                            continue;
                        }
                    } else if (var483 < 3400) {
                        if (var483 == 3300) {
                            class240.field4103[var9++] = class29.field482;
                            continue;
                        }
                        if (var483 == 3301) {
                            var9 -= 2;
                            int var420 = class240.field4103[var9 + 1];
                            int var421 = class240.field4103[var9];
                            class240.field4103[var9++] = class85.method657(var421, var420, 176);
                            continue;
                        }
                        if (var483 == 3302) {
                            var9 -= 2;
                            int var422 = class240.field4103[var9];
                            int var423 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class71.method579(0, var423, var422);
                            continue;
                        }
                        if (var483 == 3303) {
                            var9 -= 2;
                            int var424 = class240.field4103[var9];
                            int var425 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class162.method1164(var424, var425, -4097);
                            continue;
                        }
                        if (var483 == 3304) {
                            var9--;
                            int var426 = class240.field4103[var9];
                            class240.field4103[var9++] = class246.method1779((byte) -64, var426).field2784;
                            continue;
                        }
                        if (var483 == 3305) {
                            var9--;
                            int var427 = class240.field4103[var9];
                            class240.field4103[var9++] = class160.field2824[var427];
                            continue;
                        }
                        if (var483 == 3306) {
                            var9--;
                            int var428 = class240.field4103[var9];
                            class240.field4103[var9++] = class274.field4708[var428];
                            continue;
                        }
                        if (var483 == 3307) {
                            var9--;
                            int var429 = class240.field4103[var9];
                            class240.field4103[var9++] = class77.field1456[var429];
                            continue;
                        }
                        if (var483 == 3308) {
                            int var430 = class20.field364;
                            int var431 = (class139.field2472.field1859 >> 7) + class190.field3269;
                            int var432 = (class139.field2472.field1865 >> 7) + class121.field2184;
                            class240.field4103[var9++] = (var430 << 28) + (var431 << 14) + var432;
                            continue;
                        }
                        if (var483 == 3309) {
                            var9--;
                            int var433 = class240.field4103[var9];
                            class240.field4103[var9++] = class224.method1614(16383, var433 >> 14);
                            continue;
                        }
                        if (var483 == 3310) {
                            var9--;
                            int var434 = class240.field4103[var9];
                            class240.field4103[var9++] = var434 >> 28;
                            continue;
                        }
                        if (var483 == 3311) {
                            var9--;
                            int var435 = class240.field4103[var9];
                            class240.field4103[var9++] = class224.method1614(var435, 16383);
                            continue;
                        }
                        if (var483 == 3312) {
                            class240.field4103[var9++] = class269.field4641 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3313) {
                            var9 -= 2;
                            int var436 = class240.field4103[var9] + 32768;
                            int var437 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class85.method657(var436, var437, arg2 + 89);
                            continue;
                        }
                        if (var483 == 3314) {
                            var9 -= 2;
                            int var438 = class240.field4103[var9 + 1];
                            int var439 = class240.field4103[var9] + 32768;
                            class240.field4103[var9++] = class71.method579(0, var438, var439);
                            continue;
                        }
                        if (var483 == 3315) {
                            var9 -= 2;
                            int var440 = class240.field4103[var9] + 32768;
                            int var441 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class162.method1164(var440, var441, -4097);
                            continue;
                        }
                        if (var483 == 3316) {
                            if (class301.field5174 >= 2) {
                                class240.field4103[var9++] = class301.field5174;
                            } else {
                                class240.field4103[var9++] = 0;
                            }
                            continue;
                        }
                        if (var483 == 3317) {
                            class240.field4103[var9++] = class137.field2438;
                            continue;
                        }
                        if (var483 == 3318) {
                            class240.field4103[var9++] = class76.field1433;
                            continue;
                        }
                        if (var483 == 3321) {
                            class240.field4103[var9++] = class200.field3422;
                            continue;
                        }
                        if (var483 == 3322) {
                            class240.field4103[var9++] = class220.field3724;
                            continue;
                        }
                        if (var483 == 3323) {
                            if (class103.field1871 >= 5 && class103.field1871 <= 9) {
                                class240.field4103[var9++] = 1;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3324) {
                            if (class103.field1871 >= 5 && class103.field1871 <= 9) {
                                class240.field4103[var9++] = class103.field1871;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3325) {
                            class240.field4103[var9++] = class141.field2491 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3326) {
                            class240.field4103[var9++] = class139.field2472.field659;
                            continue;
                        }
                        if (var483 == 3327) {
                            class240.field4103[var9++] = class139.field2472.field639.field5280 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3328) {
                            class240.field4103[var9++] = class41.field642;
                            continue;
                        }
                        if (var483 == 3329) {
                            class240.field4103[var9++] = class130.field2308;
                            continue;
                        }
                        if (var483 == 3330) {
                            var9--;
                            int var442 = class240.field4103[var9];
                            class240.field4103[var9++] = class216.method1520(var442, -21829);
                            continue;
                        }
                        if (var483 == 3331) {
                            var9 -= 2;
                            int var443 = class240.field4103[var9];
                            int var444 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class283.method1970(false, var444, var443, class74.method597(arg2, 35));
                            continue;
                        }
                        if (var483 == 3332) {
                            var9 -= 2;
                            int var445 = class240.field4103[var9];
                            int var446 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class283.method1970(true, var446, var445, 123);
                            continue;
                        }
                        if (var483 == 3333) {
                            class240.field4103[var9++] = class101.field1824;
                            continue;
                        }
                        if (var483 == 3335) {
                            class240.field4103[var9++] = class253.field4411;
                            continue;
                        }
                    } else if (var483 < 3500) {
                        if (var483 == 3400) {
                            var9 -= 2;
                            int var95 = class240.field4103[var9];
                            int var96 = class240.field4103[var9 + 1];
                            class80 var97 = class166.method1186(0, var95);
                            if (var97.field1489 == 115) {
                            }
                            class314.field5321[var8++] = var97.method629(var96, true);
                            continue;
                        }
                        if (var483 == 3408) {
                            var9 -= 4;
                            int var98 = class240.field4103[var9 + 2];
                            int var99 = class240.field4103[var9 + 3];
                            int var100 = class240.field4103[var9 + 1];
                            int var101 = class240.field4103[var9];
                            class80 var102 = class166.method1186(0, var98);
                            if (var102.field1475 == var101 && var102.field1489 == var100) {
                                if (var100 == 115) {
                                    class314.field5321[var8++] = var102.method629(var99, true);
                                } else {
                                    class240.field4103[var9++] = var102.method626(class74.method597(arg2, -38), var99);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var483 == 3409) {
                            var9 -= 3;
                            int var103 = class240.field4103[var9];
                            int var104 = class240.field4103[var9 + 1];
                            int var105 = class240.field4103[var9 + 2];
                            if (var104 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class80 var106 = class166.method1186(arg2 ^ 0x57, var104);
                            if (var106.field1489 != var103) {
                                throw new RuntimeException("C3409-1");
                            }
                            class240.field4103[var9++] = var106.method620(var105, (byte) -128) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3410) {
                            var9--;
                            int var107 = class240.field4103[var9];
                            var8--;
                            class64 var108 = class314.field5321[var8];
                            if (var107 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class80 var109 = class166.method1186(arg2 ^ 0x57, var107);
                            if (var109.field1489 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class240.field4103[var9++] = var109.method623(class74.method597(arg2, 71), var108) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3411) {
                            var9--;
                            int var110 = class240.field4103[var9];
                            class80 var111 = class166.method1186(0, var110);
                            class240.field4103[var9++] = var111.field1485.method1146(1);
                            continue;
                        }
                    } else if (var483 < 3700) {
                        if (var483 == 3600) {
                            if (class298.field5144 == 0) {
                                class240.field4103[var9++] = -2;
                            } else if (class298.field5144 == 1) {
                                class240.field4103[var9++] = -1;
                            } else {
                                class240.field4103[var9++] = class202.field3453;
                            }
                            continue;
                        }
                        if (var483 == 3601) {
                            var9--;
                            int var398 = class240.field4103[var9];
                            if (class298.field5144 == 2 && var398 < class202.field3453) {
                                class314.field5321[var8++] = class29.field493[var398];
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 3602) {
                            var9--;
                            int var399 = class240.field4103[var9];
                            if (class298.field5144 == 2 && class202.field3453 > var399) {
                                class240.field4103[var9++] = class154.field2726[var399];
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3603) {
                            var9--;
                            int var400 = class240.field4103[var9];
                            if (class298.field5144 == 2 && class202.field3453 > var400) {
                                class240.field4103[var9++] = class255.field4426[var400];
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3604) {
                            var8--;
                            class64 var401 = class314.field5321[var8];
                            var9--;
                            int var402 = class240.field4103[var9];
                            class211.method1491(4626, var402, var401);
                            continue;
                        }
                        if (var483 == 3605) {
                            var8--;
                            class64 var403 = class314.field5321[var8];
                            class162.method1163((byte) 62, var403.method509(31492));
                            continue;
                        }
                        if (var483 == 3606) {
                            var8--;
                            class64 var404 = class314.field5321[var8];
                            class49.method359(var404.method509(31492), (byte) -55);
                            continue;
                        }
                        if (var483 == 3607) {
                            var8--;
                            class64 var405 = class314.field5321[var8];
                            class253.method1812(var405.method509(31492), -26074);
                            continue;
                        }
                        if (var483 == 3608) {
                            var8--;
                            class64 var406 = class314.field5321[var8];
                            class182.method1288(var406.method509(arg2 ^ 0x7B53), 0);
                            continue;
                        }
                        if (var483 == 3609) {
                            var8--;
                            class64 var407 = class314.field5321[var8];
                            if (var407.method541(arg2 + 13774, class240.field4098) || var407.method541(arg2 ^ 0x3672, class36.field584)) {
                                var407 = var407.method508((byte) 99, 7);
                            }
                            class240.field4103[var9++] = class118.method837(-83, var407) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3610) {
                            var9--;
                            int var408 = class240.field4103[var9];
                            if (class298.field5144 == 2 && class202.field3453 > var408) {
                                class314.field5321[var8++] = class183.field3131[var408];
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 3611) {
                            if (class54.field908 == null) {
                                class314.field5321[var8++] = class74.field1404;
                            } else {
                                class314.field5321[var8++] = class54.field908.method510(arg2 + 22);
                            }
                            continue;
                        }
                        if (var483 == 3612) {
                            if (class54.field908 == null) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = class109.field2012;
                            }
                            continue;
                        }
                        if (var483 == 3613) {
                            var9--;
                            int var409 = class240.field4103[var9];
                            if (class54.field908 != null && var409 < class109.field2012) {
                                class314.field5321[var8++] = class118.field2153[var409].field2079.method510(-70);
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 3614) {
                            var9--;
                            int var410 = class240.field4103[var9];
                            if (class54.field908 != null && class109.field2012 > var410) {
                                class240.field4103[var9++] = class118.field2153[var410].field2074;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3615) {
                            var9--;
                            int var411 = class240.field4103[var9];
                            if (class54.field908 != null && var411 < class109.field2012) {
                                class240.field4103[var9++] = class118.field2153[var411].field2073;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3616) {
                            class240.field4103[var9++] = class97.field1776;
                            continue;
                        }
                        if (var483 == 3617) {
                            var8--;
                            class64 var412 = class314.field5321[var8];
                            class154.method1115(-32456, var412);
                            continue;
                        }
                        if (var483 == 3618) {
                            class240.field4103[var9++] = class147.field2598;
                            continue;
                        }
                        if (var483 == 3619) {
                            var8--;
                            class64 var413 = class314.field5321[var8];
                            class133.method950((byte) -113, var413.method509(31492));
                            continue;
                        }
                        if (var483 == 3620) {
                            class247.method1788(100);
                            continue;
                        }
                        if (var483 == 3621) {
                            if (class298.field5144 == 0) {
                                class240.field4103[var9++] = -1;
                            } else {
                                class240.field4103[var9++] = class61.field1194;
                            }
                            continue;
                        }
                        if (var483 == 3622) {
                            var9--;
                            int var414 = class240.field4103[var9];
                            if (class298.field5144 != 0 && var414 < class61.field1194) {
                                class314.field5321[var8++] = class99.method734(true, class173.field2981[var414]).method510(99);
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 3623) {
                            var8--;
                            class64 var415 = class314.field5321[var8];
                            if (var415.method541(13861, class240.field4098) || var415.method541(13861, class36.field584)) {
                                var415 = var415.method508((byte) 99, 7);
                            }
                            class240.field4103[var9++] = class124.method903(-116, var415) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3624) {
                            var9--;
                            int var416 = class240.field4103[var9];
                            if (class118.field2153 != null && var416 < class109.field2012 && class118.field2153[var416].field2079.method515(arg2 ^ 0xFFFFFF97, class139.field2472.field672)) {
                                class240.field4103[var9++] = 1;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3625) {
                            if (class238.field4038 == null) {
                                class314.field5321[var8++] = class74.field1404;
                            } else {
                                class314.field5321[var8++] = class238.field4038.method510(-90);
                            }
                            continue;
                        }
                        if (var483 == 3626) {
                            var9--;
                            int var417 = class240.field4103[var9];
                            if (class54.field908 != null && var417 < class109.field2012) {
                                class314.field5321[var8++] = class118.field2153[var417].field2075;
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 3627) {
                            var9--;
                            int var418 = class240.field4103[var9];
                            if (class298.field5144 == 2 && var418 >= 0 && var418 < class202.field3453) {
                                class240.field4103[var9++] = class153.field2707[var418] ? 1 : 0;
                                continue;
                            }
                            class240.field4103[var9++] = 0;
                            continue;
                        }
                        if (var483 == 3628) {
                            var8--;
                            class64 var419 = class314.field5321[var8];
                            if (var419.method541(13861, class240.field4098) || var419.method541(13861, class36.field584)) {
                                var419 = var419.method508((byte) 99, 7);
                            }
                            class240.field4103[var9++] = class240.method1742(var419, 122);
                            continue;
                        }
                    } else if (var483 < 4000) {
                        if (var483 == 3903) {
                            var9--;
                            int var112 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.field2788[var112].method789(0);
                            continue;
                        }
                        if (var483 == 3904) {
                            var9--;
                            int var113 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.field2788[var113].field2004;
                            continue;
                        }
                        if (var483 == 3905) {
                            var9--;
                            int var114 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.field2788[var114].field1999;
                            continue;
                        }
                        if (var483 == 3906) {
                            var9--;
                            int var115 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.field2788[var115].field1995;
                            continue;
                        }
                        if (var483 == 3907) {
                            var9--;
                            int var116 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.field2788[var116].field2002;
                            continue;
                        }
                        if (var483 == 3908) {
                            var9--;
                            int var117 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.field2788[var117].field1994;
                            continue;
                        }
                        if (var483 == 3910) {
                            var9--;
                            int var118 = class240.field4103[var9];
                            int var119 = class158.field2788[var118].method787(arg2 + 16777128);
                            class240.field4103[var9++] = var119 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3911) {
                            var9--;
                            int var120 = class240.field4103[var9];
                            int var121 = class158.field2788[var120].method787(arg2 + 16777128);
                            class240.field4103[var9++] = var121 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3912) {
                            var9--;
                            int var122 = class240.field4103[var9];
                            int var123 = class158.field2788[var122].method787(16777215);
                            class240.field4103[var9++] = var123 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3913) {
                            var9--;
                            int var124 = class240.field4103[var9];
                            int var125 = class158.field2788[var124].method787(16777215);
                            class240.field4103[var9++] = var125 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var483 < 4100) {
                        if (var483 == 4000) {
                            var9 -= 2;
                            int var353 = class240.field4103[var9 + 1];
                            int var354 = class240.field4103[var9];
                            class240.field4103[var9++] = var353 + var354;
                            continue;
                        }
                        if (var483 == 4001) {
                            var9 -= 2;
                            int var355 = class240.field4103[var9];
                            int var356 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = var355 - var356;
                            continue;
                        }
                        if (var483 == 4002) {
                            var9 -= 2;
                            int var357 = class240.field4103[var9];
                            int var358 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = var357 * var358;
                            continue;
                        }
                        if (var483 == 4003) {
                            var9 -= 2;
                            int var359 = class240.field4103[var9];
                            int var360 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = var359 / var360;
                            continue;
                        }
                        if (var483 == 4004) {
                            var9--;
                            int var361 = class240.field4103[var9];
                            class240.field4103[var9++] = (int) (Math.random() * (double) var361);
                            continue;
                        }
                        if (var483 == 4005) {
                            var9--;
                            int var362 = class240.field4103[var9];
                            class240.field4103[var9++] = (int) ((double) (var362 + 1) * Math.random());
                            continue;
                        }
                        if (var483 == 4006) {
                            var9 -= 5;
                            int var363 = class240.field4103[var9];
                            int var364 = class240.field4103[var9 + 3];
                            int var365 = class240.field4103[var9 + 1];
                            int var366 = class240.field4103[var9 + 2];
                            int var367 = class240.field4103[var9 + 4];
                            class240.field4103[var9++] = var363 + ((var365 - var363) * (var367 - var366) / (var364 - var366));
                            continue;
                        }
                        if (var483 == 4007) {
                            var9 -= 2;
                            long var368 = (long) class240.field4103[var9 + 1];
                            long var370 = (long) class240.field4103[var9];
                            class240.field4103[var9++] = (int) (var368 * var370 / 100L + var370);
                            continue;
                        }
                        if (var483 == 4008) {
                            var9 -= 2;
                            int var372 = class240.field4103[var9 + 1];
                            int var373 = class240.field4103[var9];
                            class240.field4103[var9++] = class11.method91(0x1 << var372, var373);
                            continue;
                        }
                        if (var483 == 4009) {
                            var9 -= 2;
                            int var374 = class240.field4103[var9];
                            int var375 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class224.method1614(var374, -(0x1 << var375) - 1);
                            continue;
                        }
                        if (var483 == 4010) {
                            var9 -= 2;
                            int var376 = class240.field4103[var9];
                            int var377 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class224.method1614(var376, 0x1 << var377) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var483 == 4011) {
                            var9 -= 2;
                            int var378 = class240.field4103[var9 + 1];
                            int var379 = class240.field4103[var9];
                            class240.field4103[var9++] = var379 % var378;
                            continue;
                        }
                        if (var483 == 4012) {
                            var9 -= 2;
                            int var380 = class240.field4103[var9];
                            int var381 = class240.field4103[var9 + 1];
                            if (var380 == 0) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = (int) Math.pow((double) var380, (double) var381);
                            }
                            continue;
                        }
                        if (var483 == 4013) {
                            var9 -= 2;
                            int var382 = class240.field4103[var9];
                            int var383 = class240.field4103[var9 + 1];
                            if (var382 == 0) {
                                class240.field4103[var9++] = 0;
                            } else if (var383 == 0) {
                                class240.field4103[var9++] = Integer.MAX_VALUE;
                            } else {
                                class240.field4103[var9++] = (int) Math.pow((double) var382, 1.0D / (double) var383);
                            }
                            continue;
                        }
                        if (var483 == 4014) {
                            var9 -= 2;
                            int var384 = class240.field4103[var9];
                            int var385 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class224.method1614(var385, var384);
                            continue;
                        }
                        if (var483 == 4015) {
                            var9 -= 2;
                            int var386 = class240.field4103[var9];
                            int var387 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class11.method91(var387, var386);
                            continue;
                        }
                        if (var483 == 4016) {
                            var9 -= 2;
                            int var388 = class240.field4103[var9];
                            int var389 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = var389 <= var388 ? var389 : var388;
                            continue;
                        }
                        if (var483 == 4017) {
                            var9 -= 2;
                            int var390 = class240.field4103[var9];
                            int var391 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = var390 <= var391 ? var391 : var390;
                            continue;
                        }
                        if (var483 == 4018) {
                            var9 -= 3;
                            long var392 = (long) class240.field4103[var9];
                            long var394 = (long) class240.field4103[var9 + 2];
                            long var396 = (long) class240.field4103[var9 + 1];
                            class240.field4103[var9++] = (int) (var392 * var394 / var396);
                            continue;
                        }
                    } else if (var483 < 4200) {
                        if (var483 == 4100) {
                            var8--;
                            class64 var301 = class314.field5321[var8];
                            var9--;
                            int var302 = class240.field4103[var9];
                            class314.field5321[var8++] = class104.method768(new class64[] { var301, class310.method2149(var302, (byte) 85) }, false);
                            continue;
                        }
                        if (var483 == 4101) {
                            var8 -= 2;
                            class64 var303 = class314.field5321[var8 + 1];
                            class64 var304 = class314.field5321[var8];
                            class314.field5321[var8++] = class104.method768(new class64[] { var304, var303 }, false);
                            continue;
                        }
                        if (var483 == 4102) {
                            var8--;
                            class64 var305 = class314.field5321[var8];
                            var9--;
                            int var306 = class240.field4103[var9];
                            class314.field5321[var8++] = class104.method768(new class64[] { var305, class85.method649(var306, 10, true) }, false);
                            continue;
                        }
                        if (var483 == 4103) {
                            var8--;
                            class64 var307 = class314.field5321[var8];
                            class314.field5321[var8++] = var307.method522(-41);
                            continue;
                        }
                        if (var483 == 4104) {
                            var9--;
                            int var308 = class240.field4103[var9];
                            long var309 = ((long) var308 + 11745L) * 86400000L;
                            class163.field2858.setTime(new Date(var309));
                            int var311 = class163.field2858.get(5);
                            int var312 = class163.field2858.get(2);
                            int var313 = class163.field2858.get(1);
                            class314.field5321[var8++] = class104.method768(new class64[] { class310.method2149(var311, (byte) 6), class14.field314, class244.field4245[var312], class14.field314, class310.method2149(var313, (byte) -33) }, false);
                            continue;
                        }
                        if (var483 == 4105) {
                            var8 -= 2;
                            class64 var314 = class314.field5321[var8];
                            class64 var315 = class314.field5321[var8 + 1];
                            if (class139.field2472.field639 != null && class139.field2472.field639.field5280) {
                                class314.field5321[var8++] = var315;
                                continue;
                            }
                            class314.field5321[var8++] = var314;
                            continue;
                        }
                        if (var483 == 4106) {
                            var9--;
                            int var316 = class240.field4103[var9];
                            class314.field5321[var8++] = class310.method2149(var316, (byte) -56);
                            continue;
                        }
                        if (var483 == 4107) {
                            var8 -= 2;
                            class240.field4103[var9++] = class314.field5321[var8].method512(class314.field5321[var8 + 1], false);
                            continue;
                        }
                        if (var483 == 4108) {
                            var8--;
                            class64 var317 = class314.field5321[var8];
                            var9 -= 2;
                            int var318 = class240.field4103[var9];
                            int var319 = class240.field4103[var9 + 1];
                            byte[] var320 = class143.field2504.method1580(0, 0, var319);
                            class231 var321 = new class231(var320);
                            var321.method1259(class99.field1796, (int[]) null);
                            class240.field4103[var9++] = var321.method1266(var317, var318);
                            continue;
                        }
                        if (var483 == 4109) {
                            var9 -= 2;
                            int var322 = class240.field4103[var9];
                            var8--;
                            class64 var323 = class314.field5321[var8];
                            int var324 = class240.field4103[var9 + 1];
                            byte[] var325 = class143.field2504.method1580(0, 0, var324);
                            class231 var326 = new class231(var325);
                            var326.method1259(class99.field1796, (int[]) null);
                            class240.field4103[var9++] = var326.method1277(var323, var322);
                            continue;
                        }
                        if (var483 == 4110) {
                            var8 -= 2;
                            class64 var327 = class314.field5321[var8 + 1];
                            class64 var328 = class314.field5321[var8];
                            var9--;
                            if (class240.field4103[var9] == 1) {
                                class314.field5321[var8++] = var328;
                            } else {
                                class314.field5321[var8++] = var327;
                            }
                            continue;
                        }
                        if (var483 == 4111) {
                            var8--;
                            class64 var329 = class314.field5321[var8];
                            class314.field5321[var8++] = class179.method1254(var329);
                            continue;
                        }
                        if (var483 == 4112) {
                            var8--;
                            class64 var330 = class314.field5321[var8];
                            var9--;
                            int var331 = class240.field4103[var9];
                            if (var331 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class314.field5321[var8++] = var330.method532(false, var331);
                            continue;
                        }
                        if (var483 == 4113) {
                            var9--;
                            int var332 = class240.field4103[var9];
                            class240.field4103[var9++] = class158.method1133(false, var332) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4114) {
                            var9--;
                            int var333 = class240.field4103[var9];
                            class240.field4103[var9++] = class306.method2136(var333, -66) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4115) {
                            var9--;
                            int var334 = class240.field4103[var9];
                            class240.field4103[var9++] = class195.method1369(var334, (byte) 127) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4116) {
                            var9--;
                            int var335 = class240.field4103[var9];
                            class240.field4103[var9++] = class138.method987(-128, var335) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4117) {
                            var8--;
                            class64 var336 = class314.field5321[var8];
                            if (var336 == null) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = var336.method540(arg2 + 28894);
                            }
                            continue;
                        }
                        if (var483 == 4118) {
                            var8--;
                            class64 var337 = class314.field5321[var8];
                            var9 -= 2;
                            int var338 = class240.field4103[var9 + 1];
                            int var339 = class240.field4103[var9];
                            class314.field5321[var8++] = var337.method524(var338, (byte) 86, var339);
                            continue;
                        }
                        if (var483 == 4119) {
                            boolean var340 = false;
                            var8--;
                            class64 var341 = class314.field5321[var8];
                            class64 var342 = class156.method1128(1, var341.method540(28981));
                            for (int var343 = 0; var341.method540(arg2 ^ 0x7162) > var343; var343++) {
                                int var344 = var341.method495(var343, (byte) 114);
                                if (var344 == 60) {
                                    var340 = true;
                                } else if (var344 == 62) {
                                    var340 = false;
                                } else if (!var340) {
                                    var342.method516(arg2 - 51, var344);
                                }
                            }
                            var342.method497(0);
                            class314.field5321[var8++] = var342;
                            continue;
                        }
                        if (var483 == 4120) {
                            var9 -= 2;
                            var8--;
                            class64 var345 = class314.field5321[var8];
                            int var346 = class240.field4103[var9 + 1];
                            int var347 = class240.field4103[var9];
                            class240.field4103[var9++] = var345.method538(19027, var347, var346);
                            continue;
                        }
                        if (var483 == 4121) {
                            var8 -= 2;
                            class64 var348 = class314.field5321[var8 + 1];
                            class64 var349 = class314.field5321[var8];
                            var9--;
                            int var350 = class240.field4103[var9];
                            class240.field4103[var9++] = var349.method526(var348, var350, arg2 - 179);
                            continue;
                        }
                        if (var483 == 4122) {
                            var9--;
                            int var351 = class240.field4103[var9];
                            class240.field4103[var9++] = class289.method1993(-100, var351);
                            continue;
                        }
                        if (var483 == 4123) {
                            var9--;
                            int var352 = class240.field4103[var9];
                            class240.field4103[var9++] = class267.method1867(var352, -123);
                            continue;
                        }
                    } else if (var483 < 4300) {
                        if (var483 == 4200) {
                            var9--;
                            int var282 = class240.field4103[var9];
                            class314.field5321[var8++] = class132.method949(var282, false).field1669;
                            continue;
                        }
                        if (var483 == 4201) {
                            var9 -= 2;
                            int var283 = class240.field4103[var9 + 1];
                            int var284 = class240.field4103[var9];
                            class92 var285 = class132.method949(var284, false);
                            if (var283 >= 1 && var283 <= 5 && var285.field1713[var283 - 1] != null) {
                                class314.field5321[var8++] = var285.field1713[var283 - 1];
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 4202) {
                            var9 -= 2;
                            int var286 = class240.field4103[var9 + 1];
                            int var287 = class240.field4103[var9];
                            class92 var288 = class132.method949(var287, false);
                            if (var286 >= 1 && var286 <= 5 && var288.field1682[var286 - 1] != null) {
                                class314.field5321[var8++] = var288.field1682[var286 - 1];
                                continue;
                            }
                            class314.field5321[var8++] = class74.field1404;
                            continue;
                        }
                        if (var483 == 4203) {
                            var9--;
                            int var289 = class240.field4103[var9];
                            class240.field4103[var9++] = class132.method949(var289, false).field1721;
                            continue;
                        }
                        if (var483 == 4204) {
                            var9--;
                            int var290 = class240.field4103[var9];
                            class240.field4103[var9++] = class132.method949(var290, false).field1704 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4205) {
                            var9--;
                            int var291 = class240.field4103[var9];
                            class92 var292 = class132.method949(var291, false);
                            if (var292.field1681 == -1 && var292.field1703 >= 0) {
                                class240.field4103[var9++] = var292.field1703;
                                continue;
                            }
                            class240.field4103[var9++] = var291;
                            continue;
                        }
                        if (var483 == 4206) {
                            var9--;
                            int var293 = class240.field4103[var9];
                            class92 var294 = class132.method949(var293, false);
                            if (var294.field1681 >= 0 && var294.field1703 >= 0) {
                                class240.field4103[var9++] = var294.field1703;
                                continue;
                            }
                            class240.field4103[var9++] = var293;
                            continue;
                        }
                        if (var483 == 4207) {
                            var9--;
                            int var295 = class240.field4103[var9];
                            class240.field4103[var9++] = class132.method949(var295, false).field1660 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4208) {
                            var9 -= 2;
                            int var296 = class240.field4103[var9];
                            int var297 = class240.field4103[var9 + 1];
                            class122 var298 = class227.method1645(16, var297);
                            if (var298.method855(26205)) {
                                class314.field5321[var8++] = class132.method949(var296, false).method707(var297, (byte) 31, var298.field2191);
                            } else {
                                class240.field4103[var9++] = class132.method949(var296, false).method693(19661280, var298.field2188, var297);
                            }
                            continue;
                        }
                        if (var483 == 4210) {
                            var8--;
                            class64 var299 = class314.field5321[var8];
                            var9--;
                            int var300 = class240.field4103[var9];
                            class164.method1171((byte) -54, var300 == 1, var299);
                            class240.field4103[var9++] = class113.field2087;
                            continue;
                        }
                        if (var483 == 4211) {
                            if (class107.field1970 != null && class113.field2087 > class134.field2380) {
                                class240.field4103[var9++] = class224.method1614(65535, class107.field1970[class134.field2380++]);
                                continue;
                            }
                            class240.field4103[var9++] = -1;
                            continue;
                        }
                        if (var483 == 4212) {
                            class134.field2380 = 0;
                            continue;
                        }
                    } else if (var483 < 4400) {
                        if (var483 == 4300) {
                            var9 -= 2;
                            int var272 = class240.field4103[var9];
                            int var273 = class240.field4103[var9 + 1];
                            class122 var274 = class227.method1645(16, var273);
                            if (var274.method855(arg2 ^ 0x660A)) {
                                class314.field5321[var8++] = class9.method79((byte) 94, var272).method57(var274.field2191, true, var273);
                            } else {
                                class240.field4103[var9++] = class9.method79((byte) 94, var272).method58(var274.field2188, class74.method597(arg2, -86), var273);
                            }
                            continue;
                        }
                        if (var483 == 4301) {
                            var9--;
                            int var275 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var275).field132;
                            continue;
                        }
                        if (var483 == 4302) {
                            var9--;
                            int var276 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var276).field167;
                            continue;
                        }
                        if (var483 == 4303) {
                            var9--;
                            int var277 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var277).field113;
                            continue;
                        }
                        if (var483 == 4304) {
                            var9--;
                            int var278 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var278).field158;
                            continue;
                        }
                        if (var483 == 4305) {
                            var9--;
                            int var279 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var279).field111;
                            continue;
                        }
                        if (var483 == 4306) {
                            var9--;
                            int var280 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var280).field124;
                            continue;
                        }
                        if (var483 == 4307) {
                            var9--;
                            int var281 = class240.field4103[var9];
                            class240.field4103[var9++] = class9.method79((byte) 94, var281).field112;
                            continue;
                        }
                    } else if (var483 < 4500) {
                        if (var483 == 4400) {
                            var9 -= 2;
                            int var126 = class240.field4103[var9 + 1];
                            int var127 = class240.field4103[var9];
                            class122 var128 = class227.method1645(16, var126);
                            if (var128.method855(26205)) {
                                class314.field5321[var8++] = class172.method1207(var127, -122).method1998(var128.field2191, var126, (byte) -114);
                            } else {
                                class240.field4103[var9++] = class172.method1207(var127, -128).method2004(var126, 31, var128.field2188);
                            }
                            continue;
                        }
                    } else if (var483 < 4600) {
                        if (var483 == 4500) {
                            var9 -= 2;
                            int var129 = class240.field4103[var9];
                            int var130 = class240.field4103[var9 + 1];
                            class122 var131 = class227.method1645(16, var130);
                            if (var131.method855(26205)) {
                                class314.field5321[var8++] = class117.method832((byte) -118, var129).method730(var131.field2191, var130, 96);
                            } else {
                                class240.field4103[var9++] = class117.method832((byte) -102, var129).method729(var131.field2188, var130, 2);
                            }
                            continue;
                        }
                    } else if (var483 < 5100) {
                        if (var483 == 5000) {
                            class240.field4103[var9++] = class184.field3157;
                            continue;
                        }
                        if (var483 == 5001) {
                            var9 -= 3;
                            class131.field2322++;
                            class184.field3157 = class240.field4103[var9];
                            class60.field1184 = class240.field4103[var9 + 1];
                            class163.field2869 = class240.field4103[var9 + 2];
                            class17.field353.method1214(-25, 152);
                            class17.field353.method130(-1, class184.field3157);
                            class17.field353.method130(-1, class60.field1184);
                            class17.field353.method130(-1, class163.field2869);
                            continue;
                        }
                        if (var483 == 5002) {
                            class270.field4666++;
                            var9 -= 2;
                            var8--;
                            class64 var209 = class314.field5321[var8];
                            int var210 = class240.field4103[var9];
                            int var211 = class240.field4103[var9 + 1];
                            class17.field353.method1214(-57, 247);
                            class17.field353.method161((byte) 113, var209.method509(31492));
                            class17.field353.method130(-1, var210 - 1);
                            class17.field353.method130(-1, var211);
                            continue;
                        }
                        if (var483 == 5003) {
                            var9--;
                            int var212 = class240.field4103[var9];
                            class64 var213 = null;
                            if (var212 < 100) {
                                var213 = class7.field177[var212];
                            }
                            if (var213 == null) {
                                var213 = class74.field1404;
                            }
                            class314.field5321[var8++] = var213;
                            continue;
                        }
                        if (var483 == 5004) {
                            var9--;
                            int var214 = class240.field4103[var9];
                            int var215 = -1;
                            if (var214 < 100 && class7.field177[var214] != null) {
                                var215 = class37.field601[var214];
                            }
                            class240.field4103[var9++] = var215;
                            continue;
                        }
                        if (var483 == 5005) {
                            class240.field4103[var9++] = class60.field1184;
                            continue;
                        }
                        if (var483 == 5008) {
                            var8--;
                            class64 var216 = class314.field5321[var8];
                            if (!var216.method541(13861, class197.field3374)) {
                                if (class301.field5174 == 0 && (class41.field642 == 1 || class130.field2308 == 1)) {
                                    continue;
                                }
                                class295.field5085++;
                                class64 var217 = var216.method522(-41);
                                byte var218 = 0;
                                if (var217.method541(13861, class94.field1746)) {
                                    var218 = 0;
                                    var216 = var216.method508((byte) 99, class94.field1746.method540(arg2 + 28894));
                                } else if (var217.method541(13861, class84.field1551)) {
                                    var218 = 1;
                                    var216 = var216.method508((byte) 99, class84.field1551.method540(28981));
                                } else if (var217.method541(13861, class47.field787)) {
                                    var218 = 2;
                                    var216 = var216.method508((byte) 99, class47.field787.method540(28981));
                                } else if (var217.method541(arg2 + 13774, class315.field5335)) {
                                    var216 = var216.method508((byte) 99, class315.field5335.method540(28981));
                                    var218 = 3;
                                } else if (var217.method541(13861, class132.field2358)) {
                                    var216 = var216.method508((byte) 99, class132.field2358.method540(28981));
                                    var218 = 4;
                                } else if (var217.method541(13861, class189.field3255)) {
                                    var216 = var216.method508((byte) 99, class189.field3255.method540(28981));
                                    var218 = 5;
                                } else if (var217.method541(13861, class76.field1429)) {
                                    var216 = var216.method508((byte) 99, class76.field1429.method540(28981));
                                    var218 = 6;
                                } else if (var217.method541(13861, class161.field2831)) {
                                    var216 = var216.method508((byte) 99, class161.field2831.method540(28981));
                                    var218 = 7;
                                } else if (var217.method541(13861, class297.field5119)) {
                                    var218 = 8;
                                    var216 = var216.method508((byte) 99, class297.field5119.method540(28981));
                                } else if (var217.method541(arg2 ^ 0x3672, class205.field3510)) {
                                    var216 = var216.method508((byte) 99, class205.field3510.method540(28981));
                                    var218 = 9;
                                } else if (var217.method541(13861, class149.field2602)) {
                                    var218 = 10;
                                    var216 = var216.method508((byte) 99, class149.field2602.method540(28981));
                                } else if (var217.method541(13861, class9.field199)) {
                                    var216 = var216.method508((byte) 99, class9.field199.method540(arg2 + 28894));
                                    var218 = 11;
                                } else if (class253.field4411 != 0) {
                                    if (var217.method541(arg2 ^ 0x3672, class94.field1748)) {
                                        var216 = var216.method508((byte) 99, class94.field1748.method540(28981));
                                        var218 = 0;
                                    } else if (var217.method541(13861, class84.field1559)) {
                                        var216 = var216.method508((byte) 99, class84.field1559.method540(arg2 + 28894));
                                        var218 = 1;
                                    } else if (var217.method541(13861, class47.field772)) {
                                        var216 = var216.method508((byte) 99, class47.field772.method540(arg2 ^ 0x7162));
                                        var218 = 2;
                                    } else if (var217.method541(13861, class315.field5339)) {
                                        var218 = 3;
                                        var216 = var216.method508((byte) 99, class315.field5339.method540(28981));
                                    } else if (var217.method541(13861, class132.field2357)) {
                                        var216 = var216.method508((byte) 99, class132.field2357.method540(28981));
                                        var218 = 4;
                                    } else if (var217.method541(arg2 ^ 0x3672, class189.field3253)) {
                                        var218 = 5;
                                        var216 = var216.method508((byte) 99, class189.field3253.method540(28981));
                                    } else if (var217.method541(13861, class76.field1431)) {
                                        var218 = 6;
                                        var216 = var216.method508((byte) 99, class76.field1431.method540(28981));
                                    } else if (var217.method541(arg2 ^ 0x3672, class161.field2834)) {
                                        var216 = var216.method508((byte) 99, class161.field2834.method540(28981));
                                        var218 = 7;
                                    } else if (var217.method541(13861, class297.field5127)) {
                                        var218 = 8;
                                        var216 = var216.method508((byte) 99, class297.field5127.method540(28981));
                                    } else if (var217.method541(13861, class205.field3504)) {
                                        var218 = 9;
                                        var216 = var216.method508((byte) 99, class205.field3504.method540(28981));
                                    } else if (var217.method541(13861, class149.field2609)) {
                                        var218 = 10;
                                        var216 = var216.method508((byte) 99, class149.field2609.method540(28981));
                                    } else if (var217.method541(13861, class9.field194)) {
                                        var216 = var216.method508((byte) 99, class9.field194.method540(28981));
                                        var218 = 11;
                                    }
                                }
                                class64 var219 = var216.method522(-41);
                                byte var220 = 0;
                                if (var219.method541(arg2 ^ 0x3672, class223.field3805)) {
                                    var220 = 1;
                                    var216 = var216.method508((byte) 99, class223.field3805.method540(28981));
                                } else if (var219.method541(13861, class12.field232)) {
                                    var220 = 2;
                                    var216 = var216.method508((byte) 99, class12.field232.method540(arg2 + 28894));
                                } else if (var219.method541(13861, class34.field556)) {
                                    var216 = var216.method508((byte) 99, class34.field556.method540(arg2 ^ 0x7162));
                                    var220 = 3;
                                } else if (var219.method541(13861, class224.field3812)) {
                                    var216 = var216.method508((byte) 99, class224.field3812.method540(28981));
                                    var220 = 4;
                                } else if (var219.method541(13861, class226.field3841)) {
                                    var220 = 5;
                                    var216 = var216.method508((byte) 99, class226.field3841.method540(28981));
                                } else if (class253.field4411 != 0) {
                                    if (var219.method541(13861, class223.field3802)) {
                                        var216 = var216.method508((byte) 99, class223.field3802.method540(28981));
                                        var220 = 1;
                                    } else if (var219.method541(arg2 + 13774, class12.field235)) {
                                        var220 = 2;
                                        var216 = var216.method508((byte) 99, class12.field235.method540(28981));
                                    } else if (var219.method541(arg2 ^ 0x3672, class34.field561)) {
                                        var216 = var216.method508((byte) 99, class34.field561.method540(28981));
                                        var220 = 3;
                                    } else if (var219.method541(13861, class224.field3823)) {
                                        var216 = var216.method508((byte) 99, class224.field3823.method540(28981));
                                        var220 = 4;
                                    } else if (var219.method541(13861, class226.field3846)) {
                                        var220 = 5;
                                        var216 = var216.method508((byte) 99, class226.field3846.method540(arg2 ^ 0x7162));
                                    }
                                }
                                class17.field353.method1214(arg2 - 181, 87);
                                class17.field353.method130(-1, 0);
                                int var221 = class17.field353.field281;
                                class17.field353.method130(-1, var218);
                                class17.field353.method130(-1, var220);
                                class234.method1679(var216, -1, class17.field353);
                                class17.field353.method155(125, class17.field353.field281 - var221);
                                continue;
                            }
                            class6.method60(0, var216);
                            continue;
                        }
                        if (var483 == 5009) {
                            var8 -= 2;
                            class64 var222 = class314.field5321[var8];
                            class64 var223 = class314.field5321[var8 + 1];
                            if (class301.field5174 != 0 || class41.field642 != 1 && class130.field2308 != 1) {
                                class17.field353.method1214(-109, 52);
                                class121.field2181++;
                                class17.field353.method130(-1, 0);
                                int var224 = class17.field353.field281;
                                class17.field353.method161((byte) 99, var222.method509(31492));
                                class234.method1679(var223, -1, class17.field353);
                                class17.field353.method155(arg2 ^ 0x39, class17.field353.field281 - var224);
                            }
                            continue;
                        }
                        if (var483 == 5010) {
                            class64 var225 = null;
                            var9--;
                            int var226 = class240.field4103[var9];
                            if (var226 < 100) {
                                var225 = class9.field196[var226];
                            }
                            if (var225 == null) {
                                var225 = class74.field1404;
                            }
                            class314.field5321[var8++] = var225;
                            continue;
                        }
                        if (var483 == 5011) {
                            class64 var227 = null;
                            var9--;
                            int var228 = class240.field4103[var9];
                            if (var228 < 100) {
                                var227 = class237.field4002[var228];
                            }
                            if (var227 == null) {
                                var227 = class74.field1404;
                            }
                            class314.field5321[var8++] = var227;
                            continue;
                        }
                        if (var483 == 5012) {
                            var9--;
                            int var229 = class240.field4103[var9];
                            int var230 = -1;
                            if (var229 < 100) {
                                var230 = class108.field2007[var229];
                            }
                            class240.field4103[var9++] = var230;
                            continue;
                        }
                        if (var483 == 5015) {
                            class64 var231;
                            if (class139.field2472 == null || class139.field2472.field672 == null) {
                                var231 = class188.field3232;
                            } else {
                                var231 = class139.field2472.method323(-1);
                            }
                            class314.field5321[var8++] = var231;
                            continue;
                        }
                        if (var483 == 5016) {
                            class240.field4103[var9++] = class163.field2869;
                            continue;
                        }
                        if (var483 == 5017) {
                            class240.field4103[var9++] = class70.field1354;
                            continue;
                        }
                        if (var483 == 5050) {
                            var9--;
                            int var232 = class240.field4103[var9];
                            class314.field5321[var8++] = class306.method2134(arg2 - 87, var232).field4624;
                            continue;
                        }
                        if (var483 == 5051) {
                            var9--;
                            int var233 = class240.field4103[var9];
                            class268 var234 = class306.method2134(0, var233);
                            if (var234.field4610 == null) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = var234.field4610.length;
                            }
                            continue;
                        }
                        if (var483 == 5052) {
                            var9 -= 2;
                            int var235 = class240.field4103[var9];
                            int var236 = class240.field4103[var9 + 1];
                            class268 var237 = class306.method2134(arg2 - 87, var235);
                            int var238 = var237.field4610[var236];
                            class240.field4103[var9++] = var238;
                            continue;
                        }
                        if (var483 == 5053) {
                            var9--;
                            int var239 = class240.field4103[var9];
                            class268 var240 = class306.method2134(0, var239);
                            if (var240.field4627 == null) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = var240.field4627.length;
                            }
                            continue;
                        }
                        if (var483 == 5054) {
                            var9 -= 2;
                            int var241 = class240.field4103[var9 + 1];
                            int var242 = class240.field4103[var9];
                            class240.field4103[var9++] = class306.method2134(0, var242).field4627[var241];
                            continue;
                        }
                        if (var483 == 5055) {
                            var9--;
                            int var243 = class240.field4103[var9];
                            class314.field5321[var8++] = class47.method352(var243, 32767).method580(-65);
                            continue;
                        }
                        if (var483 == 5056) {
                            var9--;
                            int var244 = class240.field4103[var9];
                            class71 var245 = class47.method352(var244, 32767);
                            if (var245.field1371 == null) {
                                class240.field4103[var9++] = 0;
                            } else {
                                class240.field4103[var9++] = var245.field1371.length;
                            }
                            continue;
                        }
                        if (var483 == 5057) {
                            var9 -= 2;
                            int var246 = class240.field4103[var9];
                            int var247 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class47.method352(var246, 32767).field1371[var247];
                            continue;
                        }
                        if (var483 == 5058) {
                            class186.field3201 = new class119();
                            var9--;
                            class186.field3201.field2159 = class240.field4103[var9];
                            class186.field3201.field2158 = class47.method352(class186.field3201.field2159, 32767);
                            class186.field3201.field2160 = new int[class186.field3201.field2158.method582(-5416)];
                            continue;
                        }
                        if (var483 == 5059) {
                            class267.field4589++;
                            class17.field353.method1214(-78, 130);
                            class17.field353.method130(arg2 ^ 0xFFFFFFA8, 0);
                            int var248 = class17.field353.field281;
                            class17.field353.method130(-1, 0);
                            class17.field353.method145(103, class186.field3201.field2159);
                            class186.field3201.field2158.method577((byte) 83, class186.field3201.field2160, class17.field353);
                            class17.field353.method155(arg2 - 150, -var248 + class17.field353.field281);
                            continue;
                        }
                        if (var483 == 5060) {
                            class92.field1689++;
                            var8--;
                            class64 var249 = class314.field5321[var8];
                            class17.field353.method1214(-19, 64);
                            class17.field353.method130(-1, 0);
                            int var250 = class17.field353.field281;
                            class17.field353.method161((byte) 90, var249.method509(arg2 ^ 0x7B53));
                            class17.field353.method145(125, class186.field3201.field2159);
                            class186.field3201.field2158.method577((byte) 83, class186.field3201.field2160, class17.field353);
                            class17.field353.method155(115, class17.field353.field281 - var250);
                            continue;
                        }
                        if (var483 == 5061) {
                            class17.field353.method1214(-125, 130);
                            class17.field353.method130(-1, 0);
                            class267.field4589++;
                            int var251 = class17.field353.field281;
                            class17.field353.method130(-1, 1);
                            class17.field353.method145(111, class186.field3201.field2159);
                            class186.field3201.field2158.method577((byte) 83, class186.field3201.field2160, class17.field353);
                            class17.field353.method155(-25, class17.field353.field281 - var251);
                            continue;
                        }
                        if (var483 == 5062) {
                            var9 -= 2;
                            int var252 = class240.field4103[var9];
                            int var253 = class240.field4103[var9 + 1];
                            class240.field4103[var9++] = class306.method2134(0, var252).field4621[var253];
                            continue;
                        }
                        if (var483 == 5063) {
                            var9 -= 2;
                            int var254 = class240.field4103[var9 + 1];
                            int var255 = class240.field4103[var9];
                            class240.field4103[var9++] = class306.method2134(0, var255).field4613[var254];
                            continue;
                        }
                        if (var483 == 5064) {
                            var9 -= 2;
                            int var256 = class240.field4103[var9 + 1];
                            int var257 = class240.field4103[var9];
                            if (var256 == -1) {
                                class240.field4103[var9++] = -1;
                            } else {
                                class240.field4103[var9++] = class306.method2134(class74.method597(arg2, 87), var257).method1879(var256, (byte) 124);
                            }
                            continue;
                        }
                        if (var483 == 5065) {
                            var9 -= 2;
                            int var258 = class240.field4103[var9];
                            int var259 = class240.field4103[var9 + 1];
                            if (var259 == -1) {
                                class240.field4103[var9++] = -1;
                            } else {
                                class240.field4103[var9++] = class306.method2134(0, var258).method1875(var259, (byte) 79);
                            }
                            continue;
                        }
                        if (var483 == 5066) {
                            var9--;
                            int var260 = class240.field4103[var9];
                            class240.field4103[var9++] = class47.method352(var260, 32767).method582(-5416);
                            continue;
                        }
                        if (var483 == 5067) {
                            var9 -= 2;
                            int var261 = class240.field4103[var9 + 1];
                            int var262 = class240.field4103[var9];
                            int var263 = class47.method352(var262, 32767).method578((byte) 127, var261);
                            class240.field4103[var9++] = var263;
                            continue;
                        }
                        if (var483 == 5068) {
                            var9 -= 2;
                            int var264 = class240.field4103[var9];
                            int var265 = class240.field4103[var9 + 1];
                            class186.field3201.field2160[var264] = var265;
                            continue;
                        }
                        if (var483 == 5069) {
                            var9 -= 2;
                            int var266 = class240.field4103[var9];
                            int var267 = class240.field4103[var9 + 1];
                            class186.field3201.field2160[var266] = var267;
                            continue;
                        }
                        if (var483 == 5070) {
                            var9 -= 3;
                            int var268 = class240.field4103[var9];
                            int var269 = class240.field4103[var9 + 1];
                            int var270 = class240.field4103[var9 + 2];
                            class71 var271 = class47.method352(var268, 32767);
                            if (var271.method578((byte) 86, var269) != 0) {
                                throw new RuntimeException("bad command");
                            }
                            class240.field4103[var9++] = var271.method583(var270, var269, false);
                            continue;
                        }
                    } else if (var483 < 5200) {
                        if (var483 == 5100) {
                            if (class120.field2174[86]) {
                                class240.field4103[var9++] = 1;
                            } else {
                                class240.field4103[var9++] = 0;
                            }
                            continue;
                        }
                        if (var483 == 5101) {
                            if (class120.field2174[82]) {
                                class240.field4103[var9++] = 1;
                            } else {
                                class240.field4103[var9++] = 0;
                            }
                            continue;
                        }
                        if (var483 == 5102) {
                            if (class120.field2174[81]) {
                                class240.field4103[var9++] = 1;
                            } else {
                                class240.field4103[var9++] = 0;
                            }
                            continue;
                        }
                    } else {
                        int var10000;
                        if (var483 < 5300) {
                            if (var483 == 5200) {
                                var9--;
                                class85.method653(true, class240.field4103[var9]);
                                continue;
                            }
                            if (var483 == 5201) {
                                class240.field4103[var9++] = class111.method804(-62);
                                continue;
                            }
                            if (var483 == 5202) {
                                var9--;
                                class193.method1359(class240.field4103[var9], (byte) 81);
                                continue;
                            }
                            if (var483 == 5203) {
                                var10000 = arg2 - 87;
                                var8--;
                                class143.method1015(var10000, class314.field5321[var8]);
                                continue;
                            }
                            if (var483 == 5204) {
                                class314.field5321[var8 - 1] = class182.method1291(class314.field5321[var8 - 1], 0);
                                continue;
                            }
                            if (var483 == 5205) {
                                var8--;
                                class230.method1658(class314.field5321[var8], (byte) -103);
                                continue;
                            }
                            if (var483 == 5206) {
                                var9--;
                                int var132 = class240.field4103[var9];
                                class306 var133 = class238.method1731(var132 & 0x3FFF, -5784, var132 >> 14 & 0x3FFF);
                                if (var133 == null) {
                                    class314.field5321[var8++] = class74.field1404;
                                } else {
                                    class314.field5321[var8++] = var133.field5233;
                                }
                                continue;
                            }
                            if (var483 == 5207) {
                                var8--;
                                class306 var134 = class120.method847(true, class314.field5321[var8]);
                                if (var134 != null && var134.field5232 != null) {
                                    class314.field5321[var8++] = var134.field5232;
                                    continue;
                                }
                                class314.field5321[var8++] = class74.field1404;
                                continue;
                            }
                        } else if (var483 < 5400) {
                            if (var483 == 5300) {
                                var9 -= 2;
                                int var135 = class240.field4103[var9];
                                int var136 = class240.field4103[var9 + 1];
                                class295.method2063(false, (byte) 73, 3, var135, var136);
                                class240.field4103[var9++] = class263.field4514 == null ? 0 : 1;
                                continue;
                            }
                            if (var483 == 5301) {
                                if (class263.field4514 != null) {
                                    class295.method2063(false, (byte) 78, class304.field5200, -1, -1);
                                }
                                continue;
                            }
                            if (var483 == 5302) {
                                class289[] var137 = class200.method1408((byte) 123);
                                class240.field4103[var9++] = var137.length;
                                continue;
                            }
                            if (var483 == 5303) {
                                var9--;
                                int var138 = class240.field4103[var9];
                                class289[] var139 = class200.method1408((byte) 118);
                                class240.field4103[var9++] = var139[var138].field4943;
                                class240.field4103[var9++] = var139[var138].field4944;
                                continue;
                            }
                            if (var483 == 5305) {
                                int var140 = class268.field4616;
                                int var141 = class289.field4937;
                                int var142 = -1;
                                class289[] var143 = class200.method1408((byte) 120);
                                for (int var144 = 0; var144 < var143.length; var144++) {
                                    class289 var145 = var143[var144];
                                    if (var145.field4943 == var140 && var145.field4944 == var141) {
                                        var142 = var144;
                                        break;
                                    }
                                }
                                class240.field4103[var9++] = var142;
                                continue;
                            }
                            if (var483 == 5306) {
                                class240.field4103[var9++] = class97.method731(arg2 + 29896);
                                continue;
                            }
                            if (var483 == 5307) {
                                var9--;
                                int var146 = class240.field4103[var9];
                                if (var146 < 0 || var146 > 2) {
                                    var146 = 0;
                                }
                                class295.method2063(false, (byte) 124, var146, -1, -1);
                                continue;
                            }
                            if (var483 == 5308) {
                                class240.field4103[var9++] = class304.field5200;
                                continue;
                            }
                            if (var483 == 5309) {
                                var9--;
                                int var147 = class240.field4103[var9];
                                if (var147 < 0 || var147 > 2) {
                                    var147 = 0;
                                }
                                class304.field5200 = var147;
                                class274.method1899(class228.field3876, (byte) -41);
                                continue;
                            }
                        } else if (var483 < 5500) {
                            if (var483 == 5400) {
                                class245.field4258++;
                                var8 -= 2;
                                class64 var148 = class314.field5321[var8];
                                class64 var149 = class314.field5321[var8 + 1];
                                var9--;
                                int var150 = class240.field4103[var9];
                                class17.field353.method1214(-18, 65);
                                class17.field353.method130(-1, class122.method861(var148, -37) - (-class122.method861(var149, -24) - 1));
                                class17.field353.method116(false, var148);
                                class17.field353.method116(false, var149);
                                class17.field353.method130(-1, var150);
                                continue;
                            }
                            if (var483 == 5401) {
                                var9 -= 2;
                                class157.field2766[class240.field4103[var9]] = (short) class135.method964(class240.field4103[var9 + 1], 217);
                                class312.method2156(-120);
                                class223.method1612((byte) 52);
                                class270.method1892(1792);
                                class65.method547(true);
                                class242.method1770((byte) 108);
                                continue;
                            }
                            if (var483 == 5405) {
                                var9 -= 2;
                                int var151 = class240.field4103[var9 + 1];
                                int var152 = class240.field4103[var9];
                                if (var152 >= 0 && var152 < 2) {
                                    class3.field34[var152] = new int[var151 << 1][4];
                                }
                                continue;
                            }
                            if (var483 == 5406) {
                                var9 -= 7;
                                int var153 = class240.field4103[var9];
                                int var154 = class240.field4103[var9 + 1] << 1;
                                int var155 = class240.field4103[var9 + 5];
                                int var156 = class240.field4103[var9 + 4];
                                int var157 = class240.field4103[var9 + 3];
                                int var158 = class240.field4103[var9 + 2];
                                int var159 = class240.field4103[var9 + 6];
                                if (var153 >= 0 && var153 < 2 && class3.field34[var153] != null && var154 >= 0 && class3.field34[var153].length > var154) {
                                    class3.field34[var153][var154] = new int[] { class224.method1614(16383, var158 >> 14) * 128, var157, class224.method1614(var158, 16383) * 128, var159 };
                                    class3.field34[var153][var154 + 1] = new int[] { class224.method1614(var156 >> 14, 16383) * 128, var155, class224.method1614(var156, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var483 == 5407) {
                                var9--;
                                int var160 = class3.field34[class240.field4103[var9]].length >> 1;
                                class240.field4103[var9++] = var160;
                                continue;
                            }
                            if (var483 == 5411) {
                                if (class263.field4514 != null) {
                                    class295.method2063(false, (byte) 105, class304.field5200, -1, -1);
                                }
                                if (class27.field441 == null) {
                                    class314.method2173(false, arg2 - 7791, class287.method1982((byte) -120));
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var483 == 5419) {
                                class64 var161 = class74.field1404;
                                if (class106.field1956 != null) {
                                    var161 = class164.method1173((byte) 120, class106.field1956.field376);
                                    try {
                                        if (class106.field1956.field377 != null) {
                                            byte[] var162 = ((String) class106.field1956.field377).getBytes("ISO-8859-1");
                                            var161 = class292.method2015(0, var162, 0, var162.length);
                                        }
                                    } catch (UnsupportedEncodingException var481) {
                                    }
                                }
                                class314.field5321[var8++] = var161;
                                continue;
                            }
                            if (var483 == 5420) {
                                class240.field4103[var9++] = class282.field4846 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 5421) {
                                if (class263.field4514 != null) {
                                    class295.method2063(false, (byte) 79, class304.field5200, -1, -1);
                                }
                                var8--;
                                class64 var164 = class314.field5321[var8];
                                var9--;
                                boolean var165 = class240.field4103[var9] == 1;
                                class64 var166 = class104.method768(new class64[] { class287.method1982((byte) 107), var164 }, false);
                                if (class27.field441 != null || var165 && class282.field4846 != 3 && class282.field4848.startsWith("win") && !class151.field2695) {
                                    class84.field1555 = var165;
                                    class124.field2249 = var166;
                                    class42.field691 = class228.field3876.method1956((byte) 60, new String(var166.method536(0), "ISO-8859-1"));
                                    continue;
                                }
                                class314.method2173(var165, -7704, var166);
                                continue;
                            }
                            if (var483 == 5422) {
                                var8 -= 2;
                                class64 var167 = class314.field5321[var8];
                                var9--;
                                int var168 = class240.field4103[var9];
                                class64 var169 = class314.field5321[var8 + 1];
                                if (var167.method540(28981) > 0) {
                                    if (class160.field2826 == null) {
                                        class160.field2826 = new class64[class54.field887[class172.field2971]];
                                    }
                                    class160.field2826[var168] = var167;
                                }
                                if (var169.method540(arg2 + 28894) > 0) {
                                    if (class26.field430 == null) {
                                        class26.field430 = new class64[class54.field887[class172.field2971]];
                                    }
                                    class26.field430[var168] = var169;
                                }
                                continue;
                            }
                            if (var483 == 5423) {
                                var8--;
                                class314.field5321[var8].method527((byte) 121);
                                continue;
                            }
                        } else if (var483 < 5600) {
                            if (var483 == 5500) {
                                var9 -= 4;
                                int var197 = class240.field4103[var9 + 2];
                                int var198 = class240.field4103[var9];
                                int var199 = class240.field4103[var9 + 1];
                                int var200 = class240.field4103[var9 + 3];
                                class312.method2160((var198 & 0x3FFF) - class121.field2184, true, false, var199, var200, ((var198 & 0xFFFED4F) >> 14) - class190.field3269, var197);
                                continue;
                            }
                            if (var483 == 5501) {
                                var9 -= 4;
                                int var201 = class240.field4103[var9 + 1];
                                int var202 = class240.field4103[var9 + 2];
                                int var203 = class240.field4103[var9];
                                int var204 = class240.field4103[var9 + 3];
                                class89.method680(var202, (byte) 47, (var203 >> 14 & 0x3FFF) - class190.field3269, (var203 & 0x3FFF) + -class121.field2184, var204, var201);
                                continue;
                            }
                            if (var483 == 5502) {
                                var9 -= 6;
                                int var205 = class240.field4103[var9];
                                if (var205 >= 2) {
                                    throw new RuntimeException();
                                }
                                class218.field3703 = var205;
                                int var206 = class240.field4103[var9 + 1];
                                if ((var206 + 1) >= (class3.field34[class218.field3703].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class161.field2829 = 0;
                                class255.field4432 = var206;
                                class154.field2723 = class240.field4103[var9 + 2];
                                class235.field3969 = class240.field4103[var9 + 3];
                                int var207 = class240.field4103[var9 + 4];
                                if (var207 >= 2) {
                                    throw new RuntimeException();
                                }
                                class113.field2082 = var207;
                                int var208 = class240.field4103[var9 + 5];
                                if (class3.field34[class113.field2082].length >> 1 <= var208 + 1) {
                                    throw new RuntimeException();
                                }
                                class238.field4054 = 3;
                                class196.field3348 = var208;
                                continue;
                            }
                            if (var483 == 5503) {
                                class269.method1884(true);
                                continue;
                            }
                            if (var483 == 5504) {
                                var9 -= 2;
                                class77.field1459 = class240.field4103[var9];
                                class241.field4157 = class240.field4103[var9 + 1];
                                class299.method2090(arg2 ^ 0x17F57);
                                continue;
                            }
                            if (var483 == 5505) {
                                class240.field4103[var9++] = class77.field1459;
                                continue;
                            }
                            if (var483 == 5506) {
                                class240.field4103[var9++] = class241.field4157;
                                continue;
                            }
                        } else if (var483 < 5700) {
                            if (var483 == 5600) {
                                var8 -= 2;
                                class64 var193 = class314.field5321[var8];
                                var9--;
                                int var194 = class240.field4103[var9];
                                class64 var195 = class314.field5321[var8 + 1];
                                if (class128.field2277 == 10 && class281.field4837 == 0 && class131.field2333 == 0 && class99.field1792 == 0 && class48.field794 == 0) {
                                    class102.method756(var195, var194, 3430, var193);
                                }
                                continue;
                            }
                            if (var483 == 5601) {
                                class181.method1285(30111);
                                continue;
                            }
                            if (var483 == 5602) {
                                if (class131.field2333 == 0) {
                                    class125.field2260 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5603) {
                                var9 -= 4;
                                if (class128.field2277 == 10 && class281.field4837 == 0 && class131.field2333 == 0 && class99.field1792 == 0 && class48.field794 == 0) {
                                    class168.method1196(-125, class240.field4103[var9], class240.field4103[var9 + 3], class240.field4103[var9 + 1], class240.field4103[var9 + 2]);
                                }
                                continue;
                            }
                            if (var483 == 5604) {
                                var8--;
                                if (class128.field2277 == 10 && class281.field4837 == 0 && class131.field2333 == 0 && class99.field1792 == 0 && class48.field794 == 0) {
                                    class128.method932(class314.field5321[var8].method509(31492), 381662980);
                                }
                                continue;
                            }
                            if (var483 == 5605) {
                                var8 -= 2;
                                var9 -= 4;
                                if (class128.field2277 == 10 && class281.field4837 == 0 && class131.field2333 == 0 && class99.field1792 == 0 && class48.field794 == 0) {
                                    class25.method231(class240.field4103[var9 + 3], class314.field5321[var8].method509(31492), 105, class314.field5321[var8 + 1], class240.field4103[var9 + 2], class240.field4103[var9], class240.field4103[var9 + 1]);
                                }
                                continue;
                            }
                            if (var483 == 5606) {
                                if (class99.field1792 == 0) {
                                    class138.field2456 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5607) {
                                class240.field4103[var9++] = class125.field2260;
                                continue;
                            }
                            if (var483 == 5608) {
                                class240.field4103[var9++] = class80.field1491;
                                continue;
                            }
                            if (var483 == 5609) {
                                class240.field4103[var9++] = class138.field2456;
                                continue;
                            }
                            if (var483 == 5610) {
                                for (int var196 = 0; var196 < 5; var196++) {
                                    class314.field5321[var8++] = class135.field2407.length > var196 ? class135.field2407[var196].method510(-32) : class74.field1404;
                                }
                                class135.field2407 = null;
                                continue;
                            }
                            if (var483 == 5611) {
                                class240.field4103[var9++] = class229.field3883;
                                continue;
                            }
                        } else if (var483 < 6100) {
                            if (var483 == 6001) {
                                var9--;
                                int var170 = class240.field4103[var9];
                                if (var170 < 1) {
                                    var170 = 1;
                                }
                                if (var170 > 4) {
                                    var170 = 4;
                                }
                                class201.field3441 = var170;
                                if (!class123.field2216 || !class274.field4701) {
                                    if (class201.field3441 == 1) {
                                        class50.method361(0.9F);
                                    }
                                    if (class201.field3441 == 2) {
                                        class50.method361(0.8F);
                                    }
                                    if (class201.field3441 == 3) {
                                        class50.method361(0.7F);
                                    }
                                    if (class201.field3441 == 4) {
                                        class50.method361(0.6F);
                                    }
                                }
                                if (class123.field2216) {
                                    class81.method633(116);
                                    if (!class274.field4701) {
                                        class306.method2133((byte) 75);
                                    }
                                }
                                class223.method1612((byte) 116);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6002) {
                                var10000 = arg2 ^ 0xFFFFFFC1;
                                var9--;
                                class11.method96(var10000, class240.field4103[var9] == 1);
                                class261.method1840(10);
                                class306.method2133((byte) -106);
                                class46.method346(-4);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6003) {
                                var9--;
                                class69.field1324 = class240.field4103[var9] == 1;
                                class46.method346(-4);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6005) {
                                var9--;
                                class222.field3762 = class240.field4103[var9] == 1;
                                class306.method2133((byte) 38);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6006) {
                                var9--;
                                class83.field1522 = class240.field4103[var9] == 1;
                                ((class241) class50.field816).method1753(-8268, !class83.field1522);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6007) {
                                var9--;
                                class117.field2136 = class240.field4103[var9] == 1;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6008) {
                                var9--;
                                class220.field3729 = class240.field4103[var9] == 1;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6009) {
                                var9--;
                                class109.field2015 = class240.field4103[var9] == 1;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6010) {
                                var9--;
                                class263.field4510 = class240.field4103[var9] == 1;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6011) {
                                var9--;
                                int var171 = class240.field4103[var9];
                                if (var171 < 0 || var171 > 2) {
                                    var171 = 0;
                                }
                                class244.field4251 = var171;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6012) {
                                if (class123.field2216) {
                                    class125.method908(0, -5, 0);
                                }
                                var9--;
                                class274.field4701 = class240.field4103[var9] == 1;
                                if (class123.field2216 && class274.field4701) {
                                    class50.method361(0.7F);
                                } else {
                                    if (class201.field3441 == 1) {
                                        class50.method361(0.9F);
                                    }
                                    if (class201.field3441 == 2) {
                                        class50.method361(0.8F);
                                    }
                                    if (class201.field3441 == 3) {
                                        class50.method361(0.7F);
                                    }
                                    if (class201.field3441 == 4) {
                                        class50.method361(0.6F);
                                    }
                                }
                                class306.method2133((byte) -127);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6014) {
                                var9--;
                                class250.field4342 = class240.field4103[var9] == 1;
                                if (class123.field2216) {
                                    class306.method2133((byte) -118);
                                }
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6015) {
                                var9--;
                                class175.field3000 = class240.field4103[var9] == 1;
                                if (class123.field2216) {
                                    class81.method633(63);
                                }
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6016) {
                                var9--;
                                int var172 = class240.field4103[var9];
                                if (class123.field2216) {
                                    class189.field3252 = true;
                                }
                                if (var172 < 0 || var172 > 2) {
                                    var172 = 0;
                                }
                                class155.field2741 = var172;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6017) {
                                var9--;
                                class275.field4718 = class240.field4103[var9] == 1;
                                class313.method2165((byte) 77);
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6018) {
                                var9--;
                                int var173 = class240.field4103[var9];
                                if (var173 < 0) {
                                    var173 = 0;
                                }
                                if (var173 > 127) {
                                    var173 = 127;
                                }
                                class58.field959 = var173;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6019) {
                                var9--;
                                int var174 = class240.field4103[var9];
                                if (var174 < 0) {
                                    var174 = 0;
                                }
                                if (var174 > 255) {
                                    var174 = 255;
                                }
                                if (class163.field2865 != var174) {
                                    if (class163.field2865 == 0 && class78.field1469 != -1) {
                                        class137.method981(class78.field1469, var174, (byte) 63, class297.field5114, false, 0);
                                        class43.field696 = false;
                                    } else if (var174 == 0) {
                                        class196.method1375((byte) -81);
                                        class43.field696 = false;
                                    } else {
                                        class248.method1789((byte) -44, var174);
                                    }
                                    class163.field2865 = var174;
                                }
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6020) {
                                var9--;
                                int var175 = class240.field4103[var9];
                                if (var175 < 0) {
                                    var175 = 0;
                                }
                                if (var175 > 127) {
                                    var175 = 127;
                                }
                                class106.field1960 = var175;
                                class274.method1899(class228.field3876, (byte) -41);
                                class259.field4465 = false;
                                continue;
                            }
                            if (var483 == 6021) {
                                var9--;
                                class158.field2785 = class240.field4103[var9] == 1;
                                class46.method346(arg2 ^ 0xFFFFFFAB);
                                continue;
                            }
                        } else if (var483 < 6200) {
                            if (var483 == 6101) {
                                class240.field4103[var9++] = class201.field3441;
                                continue;
                            }
                            if (var483 == 6102) {
                                class240.field4103[var9++] = class141.method1001((byte) -63) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6103) {
                                class240.field4103[var9++] = class69.field1324 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6105) {
                                class240.field4103[var9++] = class222.field3762 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6106) {
                                class240.field4103[var9++] = class83.field1522 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6107) {
                                class240.field4103[var9++] = class117.field2136 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6108) {
                                class240.field4103[var9++] = class220.field3729 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6109) {
                                class240.field4103[var9++] = class109.field2015 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6110) {
                                class240.field4103[var9++] = class263.field4510 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6111) {
                                class240.field4103[var9++] = class244.field4251;
                                continue;
                            }
                            if (var483 == 6112) {
                                class240.field4103[var9++] = class274.field4701 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6114) {
                                class240.field4103[var9++] = class250.field4342 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6115) {
                                class240.field4103[var9++] = class175.field3000 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6116) {
                                class240.field4103[var9++] = class155.field2741;
                                continue;
                            }
                            if (var483 == 6117) {
                                class240.field4103[var9++] = class275.field4718 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6118) {
                                class240.field4103[var9++] = class58.field959;
                                continue;
                            }
                            if (var483 == 6119) {
                                class240.field4103[var9++] = class163.field2865;
                                continue;
                            }
                            if (var483 == 6120) {
                                class240.field4103[var9++] = class106.field1960;
                                continue;
                            }
                            if (var483 == 6121) {
                                if (class123.field2216) {
                                    class240.field4103[var9++] = class123.field2231 ? 1 : 0;
                                } else {
                                    class240.field4103[var9++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 6300) {
                            if (var483 == 6200) {
                                var9 -= 2;
                                class228.field3877 = (short) class240.field4103[var9];
                                if (class228.field3877 <= 0) {
                                    class228.field3877 = 256;
                                }
                                class229.field3887 = (short) class240.field4103[var9 + 1];
                                if (class229.field3887 <= 0) {
                                    class229.field3887 = 205;
                                }
                                continue;
                            }
                            if (var483 == 6201) {
                                var9 -= 2;
                                class92.field1720 = (short) class240.field4103[var9];
                                if (class92.field1720 <= 0) {
                                    class92.field1720 = 256;
                                }
                                class121.field2182 = (short) class240.field4103[var9 + 1];
                                if (class121.field2182 <= 0) {
                                    class121.field2182 = 320;
                                }
                                continue;
                            }
                            if (var483 == 6202) {
                                var9 -= 4;
                                class137.field2427 = (short) class240.field4103[var9];
                                if (class137.field2427 <= 0) {
                                    class137.field2427 = 1;
                                }
                                class277.field4757 = (short) class240.field4103[var9 + 1];
                                if (class277.field4757 <= 0) {
                                    class277.field4757 = 32767;
                                } else if (class137.field2427 > class277.field4757) {
                                    class277.field4757 = class137.field2427;
                                }
                                class242.field4192 = (short) class240.field4103[var9 + 2];
                                if (class242.field4192 <= 0) {
                                    class242.field4192 = 1;
                                }
                                class250.field4335 = (short) class240.field4103[var9 + 3];
                                if (class250.field4335 <= 0) {
                                    class250.field4335 = 32767;
                                } else if (class242.field4192 > class250.field4335) {
                                    class250.field4335 = class242.field4192;
                                }
                                continue;
                            }
                            if (var483 == 6203) {
                                class238.method1736(false, 0, 0, -113, class261.field4497.field1016, class261.field4497.field1163);
                                class240.field4103[var9++] = class60.field1030;
                                class240.field4103[var9++] = class250.field4353;
                                continue;
                            }
                            if (var483 == 6204) {
                                class240.field4103[var9++] = class92.field1720;
                                class240.field4103[var9++] = class121.field2182;
                                continue;
                            }
                            if (var483 == 6205) {
                                class240.field4103[var9++] = class228.field3877;
                                class240.field4103[var9++] = class229.field3887;
                                continue;
                            }
                        } else if (var483 < 6400) {
                            if (var483 == 6300) {
                                class240.field4103[var9++] = (int) (class154.method1114(true) / 60000L);
                                continue;
                            }
                            if (var483 == 6301) {
                                class240.field4103[var9++] = (int) (class154.method1114(true) / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6302) {
                                var9 -= 3;
                                int var176 = class240.field4103[var9];
                                int var177 = class240.field4103[var9 + 1];
                                int var178 = class240.field4103[var9 + 2];
                                class163.field2858.clear();
                                class163.field2858.set(11, 12);
                                class163.field2858.set(var178, var177, var176);
                                class240.field4103[var9++] = (int) (class163.field2858.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6303) {
                                class163.field2858.clear();
                                class163.field2858.setTime(new Date(class154.method1114(true)));
                                class240.field4103[var9++] = class163.field2858.get(1);
                                continue;
                            }
                            if (var483 == 6304) {
                                boolean var179 = true;
                                var9--;
                                int var180 = class240.field4103[var9];
                                if (var180 < 0) {
                                    var179 = (var180 + 1) % 4 == 0;
                                } else if (var180 < 1582) {
                                    var179 = (var180 % 4) == 0;
                                } else if ((var180 % 4) != 0) {
                                    var179 = false;
                                } else if (var180 % 100 != 0) {
                                    var179 = true;
                                } else if ((var180 % 400) != 0) {
                                    var179 = false;
                                }
                                class240.field4103[var9++] = var179 ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6500) {
                            if (var483 == 6405) {
                                class240.field4103[var9++] = class111.method805(true) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6406) {
                                class240.field4103[var9++] = class277.method1923(-29554) ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6600) {
                            if (var483 == 6500) {
                                if (class128.field2277 == 10 && class281.field4837 == 0 && class131.field2333 == 0 && class99.field1792 == 0) {
                                    class240.field4103[var9++] = class255.method1822((byte) 117) ? 1 : 0;
                                    continue;
                                }
                                class240.field4103[var9++] = 1;
                                continue;
                            }
                            if (var483 == 6501) {
                                class9 var181 = class77.method612(true);
                                if (var181 == null) {
                                    class240.field4103[var9++] = -1;
                                    class240.field4103[var9++] = 0;
                                    class314.field5321[var8++] = class74.field1404;
                                    class240.field4103[var9++] = 0;
                                    class314.field5321[var8++] = class74.field1404;
                                    class240.field4103[var9++] = 0;
                                } else {
                                    class240.field4103[var9++] = var181.field186;
                                    class240.field4103[var9++] = var181.field4567;
                                    class314.field5321[var8++] = var181.field191;
                                    class63 var182 = var181.method83((byte) -68);
                                    class240.field4103[var9++] = var182.field1220;
                                    class314.field5321[var8++] = var182.field1219;
                                    class240.field4103[var9++] = var181.field4576;
                                }
                                continue;
                            }
                            if (var483 == 6502) {
                                class9 var183 = class164.method1177((byte) -3);
                                if (var183 == null) {
                                    class240.field4103[var9++] = -1;
                                    class240.field4103[var9++] = 0;
                                    class314.field5321[var8++] = class74.field1404;
                                    class240.field4103[var9++] = 0;
                                    class314.field5321[var8++] = class74.field1404;
                                    class240.field4103[var9++] = 0;
                                } else {
                                    class240.field4103[var9++] = var183.field186;
                                    class240.field4103[var9++] = var183.field4567;
                                    class314.field5321[var8++] = var183.field191;
                                    class63 var184 = var183.method83((byte) -60);
                                    class240.field4103[var9++] = var184.field1220;
                                    class314.field5321[var8++] = var184.field1219;
                                    class240.field4103[var9++] = var183.field4576;
                                }
                                continue;
                            }
                            if (var483 == 6503) {
                                var9--;
                                int var185 = class240.field4103[var9];
                                if (class128.field2277 == 10 && class281.field4837 == 0 && class131.field2333 == 0 && class99.field1792 == 0) {
                                    class240.field4103[var9++] = class97.method727(var185, true) ? 1 : 0;
                                    continue;
                                }
                                class240.field4103[var9++] = 0;
                                continue;
                            }
                            if (var483 == 6504) {
                                var9--;
                                class195.field3310 = class240.field4103[var9];
                                class274.method1899(class228.field3876, (byte) -41);
                                continue;
                            }
                            if (var483 == 6505) {
                                class240.field4103[var9++] = class195.field3310;
                                continue;
                            }
                            if (var483 == 6506) {
                                var9--;
                                int var186 = class240.field4103[var9];
                                class9 var187 = class83.method643(var186, -24383);
                                if (var187 == null) {
                                    class240.field4103[var9++] = -1;
                                    class314.field5321[var8++] = class74.field1404;
                                    class240.field4103[var9++] = 0;
                                    class314.field5321[var8++] = class74.field1404;
                                    class240.field4103[var9++] = 0;
                                } else {
                                    class240.field4103[var9++] = var187.field4567;
                                    class314.field5321[var8++] = var187.field191;
                                    class63 var188 = var187.method83((byte) -71);
                                    class240.field4103[var9++] = var188.field1220;
                                    class314.field5321[var8++] = var188.field1219;
                                    class240.field4103[var9++] = var187.field4576;
                                }
                                continue;
                            }
                            if (var483 == 6507) {
                                var9 -= 4;
                                int var189 = class240.field4103[var9];
                                boolean var190 = class240.field4103[var9 + 3] == 1;
                                boolean var191 = class240.field4103[var9 + 1] == 1;
                                int var192 = class240.field4103[var9 + 2];
                                class237.method1692(var190, var192, 100, var189, var191);
                                continue;
                            }
                        }
                    }
                } else {
                    class60 var449;
                    if (var483 < 2000) {
                        var449 = var46 ? class216.field3617 : class186.field3198;
                    } else {
                        var9--;
                        var449 = class125.method907(class240.field4103[var9], arg2 ^ 0xFFFFFFD8);
                        var483 -= 1000;
                    }
                    if (var483 == 1300) {
                        var9--;
                        int var450 = class240.field4103[var9] - 1;
                        if (var450 >= 0 && var450 <= 9) {
                            var8--;
                            var449.method470(-116, class314.field5321[var8], var450);
                            continue;
                        }
                        var8--;
                        continue;
                    }
                    if (var483 == 1301) {
                        var9 -= 2;
                        int var451 = class240.field4103[var9 + 1];
                        int var452 = class240.field4103[var9];
                        var449.field1083 = class25.method229(var451, (byte) 124, var452);
                        continue;
                    }
                    if (var483 == 1302) {
                        var9--;
                        var449.field1158 = class240.field4103[var9] == 1;
                        continue;
                    }
                    if (var483 == 1303) {
                        var9--;
                        var449.field1099 = class240.field4103[var9];
                        continue;
                    }
                    if (var483 == 1304) {
                        var9--;
                        var449.field1154 = class240.field4103[var9];
                        continue;
                    }
                    if (var483 == 1305) {
                        var8--;
                        var449.field1142 = class314.field5321[var8];
                        continue;
                    }
                    if (var483 == 1306) {
                        var8--;
                        var449.field1138 = class314.field5321[var8];
                        continue;
                    }
                    if (var483 == 1307) {
                        var449.field1149 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var482) {
            if (var5.field4307 == null) {
                if (class3.field33 != 0) {
                    class233.method1670(class118.field2146, class74.field1404, 0, (byte) -114);
                }
                class309.method2146((byte) -74, "CS2 - scr:" + var5.field417 + " op:" + var11, var482);
            } else {
                class64 var478 = class156.method1128(arg2 - 86, 30);
                var478.method502((byte) -113, class99.field1795).method502((byte) -128, var5.field4307);
                for (int var479 = class119.field2163 - 1; var479 >= 0; var479--) {
                    var478.method502((byte) -111, class53.field873).method502((byte) -115, class53.field872[var479].field2045.field4307);
                }
                if (var11 == 40) {
                    int var480 = var10[var6];
                    var478.method502((byte) -118, class108.field2000).method502((byte) -127, class310.method2149(var480, (byte) 89));
                }
                if (class3.field33 != 0) {
                    class233.method1670(class104.method768(new class64[] { class41.field671, var5.field4307 }, false), class74.field1404, 0, (byte) -126);
                }
                class309.method2146((byte) -100, "CS2 - scr:" + var5.field417 + " op:" + var11 + new String(var478.method536(0)), var482);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V", line = 5866)
    public static void method1321(boolean arg0) {
        if (!arg0) {
            field3205 = (int[][]) null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lpj;II)V", line = 5878)
    public static final void method1322(class173 arg0, int arg1, int arg2) {
        if (arg1 != 4) {
            method1322((class173) null, -61, 64);
        }
        field3206++;
        while (true) {
            class253 var3 = (class253) class244.field4233.method778(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4420; var5++) {
                if (var3.field4419[var5] != null) {
                    if (var3.field4419[var5].field375 == 2) {
                        var3.field4414[var5] = -5;
                    }
                    if (var3.field4419[var5].field375 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4408[var5] != null) {
                    if (var3.field4408[var5].field375 == 2) {
                        var3.field4414[var5] = -6;
                    }
                    if (var3.field4408[var5].field375 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1214(-96, arg2);
            arg0.method130(-1, 0);
            int var6 = arg0.field281;
            arg0.method128((byte) 115, var3.field4403);
            for (int var7 = 0; var7 < var3.field4420; var7++) {
                if (var3.field4414[var7] == 0) {
                    try {
                        int var8 = var3.field4406[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field4419[var7].field377;
                            int var13 = var12.getInt((Object) null);
                            arg0.method130(-1, 0);
                            arg0.method128((byte) 115, var13);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field4419[var7].field377;
                            var9.setInt((Object) null, var3.field4402[var7]);
                            arg0.method130(-1, 0);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field4419[var7].field377;
                            int var11 = var10.getModifiers();
                            arg0.method130(arg1 ^ 0xFFFFFFFB, 0);
                            arg0.method128((byte) 115, var11);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4408[var7].field377;
                            byte[][] var17 = var3.field4404[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method130(-1, 0);
                            } else if ((var21 instanceof Number)) {
                                arg0.method130(arg1 - 5, 1);
                                arg0.method161((byte) 95, ((Number) var21).longValue());
                            } else if ((var21 instanceof class64)) {
                                arg0.method130(-1, 2);
                                arg0.method116(false, (class64) var21);
                            } else {
                                arg0.method130(-1, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4408[var7].field377;
                            int var15 = var14.getModifiers();
                            arg0.method130(-1, 0);
                            arg0.method128((byte) 121, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method130(-1, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method130(-1, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method130(-1, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method130(-1, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method130(-1, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method130(-1, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method130(-1, -16);
                    } catch (SecurityException var41) {
                        arg0.method130(-1, -17);
                    } catch (IOException var42) {
                        arg0.method130(arg1 - 5, -18);
                    } catch (NullPointerException var43) {
                        arg0.method130(-1, -19);
                    } catch (Exception var44) {
                        arg0.method130(-1, -20);
                    } catch (Throwable var45) {
                        arg0.method130(-1, -21);
                    }
                } else {
                    arg0.method130(-1, var3.field4414[var7]);
                }
            }
            arg0.method124(true, var6);
            arg0.method155(-117, arg0.field281 - var6);
            var3.method232(arg1 ^ 0x84);
        }
    }
}
