import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class247 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[Z")
    public static boolean[] field4138 = new boolean[5];

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "[I")
    public static int[] field4147 = new int[100];

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field4140 = -1;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field4146 = 1;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "Lve;")
    private static class255 field4143 = class87.method607(104, "Starting 3d Library");

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Lve;")
    public static class255 field4145 = field4143;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "Lve;")
    public static class255 field4142 = class87.method607(61, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field4144;

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILsd;)V", line = 7)
    public static final void method1701(int arg0, int arg1, class26 arg2) {
        field4149++;
        if (arg0 > -86) {
            field4138 = (boolean[]) null;
        }
        Object[] var3 = arg2.field414;
        int var4 = (Integer) var3[0];
        class313 var5 = class215.method1534(var4, (byte) 126);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        class132.field2182 = 0;
        int[] var8 = var5.field5309;
        int var9 = -1;
        int[] var10 = var5.field5304;
        byte var11 = -1;
        try {
            class41.field637 = new class255[var5.field5302];
            class195.field3211 = new int[var5.field5301];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg2.field420;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field423;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field424 == null ? -1 : arg2.field424.field3256;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field426;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field424 == null ? -1 : arg2.field424.field3273;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field416 == null ? -1 : arg2.field416.field3256;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field416 == null ? -1 : arg2.field416.field3273;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field417;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field415;
                    }
                    class195.field3211[var12++] = var16;
                } else if (var3[var14] instanceof class255) {
                    class255 var15 = (class255) var3[var14];
                    if (var15.method1752(true, class264.field4464)) {
                        var15 = arg2.field425;
                    }
                    class41.field637[var13++] = var15;
                }
            }
            int var17 = 0;
            label3962: while (true) {
                var17++;
                if (var17 > arg1) {
                    throw new RuntimeException("slow");
                }
                var9++;
                int var483 = var10[var9];
                if (var483 < 100) {
                    if (var483 == 0) {
                        class41.field640[var6++] = var8[var9];
                        continue;
                    }
                    if (var483 == 1) {
                        int var18 = var8[var9];
                        class41.field640[var6++] = class76.field1246[var18];
                        continue;
                    }
                    if (var483 == 2) {
                        int var19 = var8[var9];
                        var6--;
                        class190.method1309(class41.field640[var6], (byte) -99, var19);
                        continue;
                    }
                    if (var483 == 3) {
                        class192.field3076[var7++] = var5.field5310[var9];
                        continue;
                    }
                    if (var483 == 6) {
                        var9 += var8[var9];
                        continue;
                    }
                    if (var483 == 7) {
                        var6 -= 2;
                        if (class41.field640[var6 + 1] != class41.field640[var6]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var483 == 8) {
                        var6 -= 2;
                        if (class41.field640[var6 + 1] == class41.field640[var6]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var483 == 9) {
                        var6 -= 2;
                        if (class41.field640[var6 + 1] > class41.field640[var6]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var483 == 10) {
                        var6 -= 2;
                        if (class41.field640[var6 + 1] < class41.field640[var6]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var483 == 21) {
                        if (class132.field2182 == 0) {
                            return;
                        }
                        class11 var20 = class116.field1978[--class132.field2182];
                        var5 = var20.field160;
                        var9 = var20.field158;
                        var8 = var5.field5309;
                        class195.field3211 = var20.field162;
                        var10 = var5.field5304;
                        class41.field637 = var20.field167;
                        continue;
                    }
                    if (var483 == 25) {
                        int var21 = var8[var9];
                        class41.field640[var6++] = class282.method1995((byte) -48, var21);
                        continue;
                    }
                    if (var483 == 27) {
                        int var22 = var8[var9];
                        var6--;
                        class73.method528(class41.field640[var6], var22, 116);
                        continue;
                    }
                    if (var483 == 31) {
                        var6 -= 2;
                        if (class41.field640[var6 + 1] >= class41.field640[var6]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var483 == 32) {
                        var6 -= 2;
                        if (class41.field640[var6 + 1] <= class41.field640[var6]) {
                            var9 += var8[var9];
                        }
                        continue;
                    }
                    if (var483 == 33) {
                        class41.field640[var6++] = class195.field3211[var8[var9]];
                        continue;
                    }
                    int var10001;
                    if (var483 == 34) {
                        var10001 = var8[var9];
                        var6--;
                        class195.field3211[var10001] = class41.field640[var6];
                        continue;
                    }
                    if (var483 == 35) {
                        class192.field3076[var7++] = class41.field637[var8[var9]];
                        continue;
                    }
                    if (var483 == 36) {
                        var10001 = var8[var9];
                        var7--;
                        class41.field637[var10001] = class192.field3076[var7];
                        continue;
                    }
                    if (var483 == 37) {
                        int var23 = var8[var9];
                        var7 -= var23;
                        class255 var24 = class266.method1849(var23, var7, false, class192.field3076);
                        class192.field3076[var7++] = var24;
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
                        int var25 = var8[var9];
                        class313 var26 = class215.method1534(var25, (byte) 125);
                        int[] var27 = new int[var26.field5301];
                        class255[] var28 = new class255[var26.field5302];
                        for (int var29 = 0; var29 < var26.field5307; var29++) {
                            var27[var29] = class41.field640[var29 + var6 - var26.field5307];
                        }
                        for (int var30 = 0; var30 < var26.field5308; var30++) {
                            var28[var30] = class192.field3076[var30 + var7 - var26.field5308];
                        }
                        var7 -= var26.field5308;
                        var6 -= var26.field5307;
                        class11 var31 = new class11();
                        var31.field160 = var5;
                        var31.field158 = var9;
                        var31.field167 = class41.field637;
                        var31.field162 = class195.field3211;
                        if (class132.field2182 >= class116.field1978.length) {
                            throw new RuntimeException();
                        }
                        var9 = -1;
                        class116.field1978[class132.field2182++] = var31;
                        class41.field637 = var28;
                        class195.field3211 = var27;
                        var5 = var26;
                        var10 = var26.field5304;
                        var8 = var26.field5309;
                        continue;
                    }
                    if (var483 == 42) {
                        class41.field640[var6++] = class305.field5209[var8[var9]];
                        continue;
                    }
                    if (var483 == 43) {
                        int var32 = var8[var9];
                        var6--;
                        class305.field5209[var32] = class41.field640[var6];
                        class23.method128(var32, (byte) 99);
                        continue;
                    }
                    if (var483 == 44) {
                        int var33 = var8[var9] >> 16;
                        int var34 = var8[var9] & 0xFFFF;
                        var6--;
                        int var35 = class41.field640[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            class115.field1964[var33] = var35;
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label3962;
                                }
                                class29.field457[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 45) {
                        int var38 = var8[var9];
                        var6--;
                        int var39 = class41.field640[var6];
                        if (var39 >= 0 && class115.field1964[var38] > var39) {
                            class41.field640[var6++] = class29.field457[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 46) {
                        int var40 = var8[var9];
                        var6 -= 2;
                        int var41 = class41.field640[var6];
                        if (var41 >= 0 && class115.field1964[var40] > var41) {
                            class29.field457[var40][var41] = class41.field640[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 47) {
                        class255 var42 = class14.field189[var8[var9]];
                        if (var42 == null) {
                            var42 = class309.field5261;
                        }
                        class192.field3076[var7++] = var42;
                        continue;
                    }
                    if (var483 == 48) {
                        int var43 = var8[var9];
                        var7--;
                        class14.field189[var43] = class192.field3076[var7];
                        class231.method1599(var43, (byte) 95);
                        continue;
                    }
                    if (var483 == 51) {
                        class47 var44 = var5.field5313[var8[var9]];
                        var6--;
                        class172 var45 = (class172) var44.method280((long) class41.field640[var6], 29153);
                        if (var45 != null) {
                            var9 += var45.field2849;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var8[var9] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var483 < 300) {
                    if (var483 == 100) {
                        var6 -= 3;
                        int var47 = class41.field640[var6 + 2];
                        int var48 = class41.field640[var6 + 1];
                        int var49 = class41.field640[var6];
                        if (var48 != 0) {
                            class197 var50 = class58.method353(var49, (byte) -114);
                            if (var50.field3359 == null) {
                                var50.field3359 = new class197[var47 + 1];
                            }
                            if (var47 >= var50.field3359.length) {
                                class197[] var51 = new class197[var47 + 1];
                                for (int var52 = 0; var52 < var50.field3359.length; var52++) {
                                    var51[var52] = var50.field3359[var52];
                                }
                                var50.field3359 = var51;
                            }
                            if (var47 > 0 && var50.field3359[var47 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var47 - 1));
                            }
                            class197 var53 = new class197();
                            var53.field3273 = var47;
                            var53.field3281 = var48;
                            var53.field3353 = var53.field3256 = var50.field3256;
                            var53.field3365 = true;
                            var50.field3359[var47] = var53;
                            if (var46) {
                                class218.field3690 = var53;
                            } else {
                                class43.field680 = var53;
                            }
                            class108.method834((byte) 49, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var483 == 101) {
                        class197 var54 = var46 ? class218.field3690 : class43.field680;
                        if (var54.field3273 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class197 var55 = class58.method353(var54.field3256, (byte) 94);
                        var55.field3359[var54.field3273] = null;
                        class108.method834((byte) 49, var55);
                        continue;
                    }
                    if (var483 == 102) {
                        var6--;
                        class197 var56 = class58.method353(class41.field640[var6], (byte) -29);
                        var56.field3359 = null;
                        class108.method834((byte) 49, var56);
                        continue;
                    }
                    if (var483 == 200) {
                        var6 -= 2;
                        int var57 = class41.field640[var6];
                        int var58 = class41.field640[var6 + 1];
                        class197 var59 = class91.method685(var57, (byte) -93, var58);
                        if (var59 != null && var58 != -1) {
                            class41.field640[var6++] = 1;
                            if (var46) {
                                class218.field3690 = var59;
                            } else {
                                class43.field680 = var59;
                            }
                            continue;
                        }
                        class41.field640[var6++] = 0;
                        continue;
                    }
                    if (var483 == 201) {
                        var6--;
                        int var60 = class41.field640[var6];
                        class197 var61 = class58.method353(var60, (byte) -107);
                        if (var61 == null) {
                            class41.field640[var6++] = 0;
                        } else {
                            class41.field640[var6++] = 1;
                            if (var46) {
                                class218.field3690 = var61;
                            } else {
                                class43.field680 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var483 < 500) {
                    if (var483 == 403) {
                        var6 -= 2;
                        int var472 = class41.field640[var6];
                        if (var472 >= 7) {
                            var472 -= 7;
                        }
                        int var473 = class41.field640[var6 + 1];
                        class276.field4742.field4057.method2153(-92, var473, var472);
                        continue;
                    }
                    if (var483 == 404) {
                        var6 -= 2;
                        int var474 = class41.field640[var6 + 1];
                        int var475 = class41.field640[var6];
                        class276.field4742.field4057.method2151((byte) 86, var474, var475);
                        continue;
                    }
                    if (var483 == 410) {
                        var6--;
                        boolean var476 = class41.field640[var6] != 0;
                        class276.field4742.field4057.method2156(-10409, var476);
                        continue;
                    }
                } else if (!(var483 < 1000 || var483 >= 1100) || !(var483 < 2000 || var483 >= 2100)) {
                    class197 var466;
                    if (var483 < 2000) {
                        var466 = var46 ? class218.field3690 : class43.field680;
                    } else {
                        var483 -= 1000;
                        var6--;
                        var466 = class58.method353(class41.field640[var6], (byte) -107);
                    }
                    if (var483 == 1000) {
                        var6 -= 4;
                        var466.field3393 = class41.field640[var6];
                        var466.field3254 = class41.field640[var6 + 1];
                        int var467 = class41.field640[var6 + 2];
                        if (var467 < 0) {
                            var467 = 0;
                        } else if (var467 > 5) {
                            var467 = 5;
                        }
                        int var468 = class41.field640[var6 + 3];
                        if (var468 < 0) {
                            var468 = 0;
                        } else if (var468 > 5) {
                            var468 = 5;
                        }
                        var466.field3307 = (byte) var467;
                        var466.field3276 = (byte) var468;
                        class108.method834((byte) 49, var466);
                        class58.method358((byte) 115, var466);
                        if (var466.field3273 == -1) {
                            class43.method264(var466.field3256, -104);
                        }
                        continue;
                    }
                    if (var483 == 1001) {
                        var6 -= 4;
                        var466.field3343 = class41.field640[var6];
                        var466.field3303 = class41.field640[var6 + 1];
                        var466.field3280 = 0;
                        var466.field3400 = 0;
                        int var469 = class41.field640[var6 + 2];
                        if (var469 < 0) {
                            var469 = 0;
                        } else if (var469 > 4) {
                            var469 = 4;
                        }
                        int var470 = class41.field640[var6 + 3];
                        if (var470 < 0) {
                            var470 = 0;
                        } else if (var470 > 4) {
                            var470 = 4;
                        }
                        var466.field3341 = (byte) var470;
                        var466.field3292 = (byte) var469;
                        class108.method834((byte) 49, var466);
                        class58.method358((byte) 115, var466);
                        if (var466.field3281 == 0) {
                            class131.method972((byte) 126, false, var466);
                        }
                        continue;
                    }
                    if (var483 == 1003) {
                        var6--;
                        boolean var471 = class41.field640[var6] == 1;
                        if (var466.field3250 != var471) {
                            var466.field3250 = var471;
                            class108.method834((byte) 49, var466);
                        }
                        if (var466.field3273 == -1) {
                            class95.method748((byte) -106, var466.field3256);
                        }
                        continue;
                    }
                    if (var483 == 1004) {
                        var6 -= 2;
                        var466.field3246 = class41.field640[var6];
                        var466.field3286 = class41.field640[var6 + 1];
                        class108.method834((byte) 49, var466);
                        class58.method358((byte) 100, var466);
                        if (var466.field3281 == 0) {
                            class131.method972((byte) 71, false, var466);
                        }
                        continue;
                    }
                } else if (var483 >= 1100 && var483 < 1200 || var483 >= 2100 && var483 < 2200) {
                    class197 var463;
                    if (var483 >= 2000) {
                        var6--;
                        var463 = class58.method353(class41.field640[var6], (byte) -127);
                        var483 -= 1000;
                    } else {
                        var463 = var46 ? class218.field3690 : class43.field680;
                    }
                    if (var483 == 1100) {
                        var6 -= 2;
                        var463.field3371 = class41.field640[var6];
                        if (var463.field3371 > var463.field3261 - var463.field3294) {
                            var463.field3371 = var463.field3261 - var463.field3294;
                        }
                        if (var463.field3371 < 0) {
                            var463.field3371 = 0;
                        }
                        var463.field3310 = class41.field640[var6 + 1];
                        if (var463.field3310 > (var463.field3384 - var463.field3253)) {
                            var463.field3310 = var463.field3384 - var463.field3253;
                        }
                        if (var463.field3310 < 0) {
                            var463.field3310 = 0;
                        }
                        class108.method834((byte) 49, var463);
                        if (var463.field3273 == -1) {
                            class251.method1724(var463.field3256, (byte) 83);
                        }
                        continue;
                    }
                    if (var483 == 1101) {
                        var6--;
                        var463.field3331 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        if (var463.field3273 == -1) {
                            class158.method1155(var463.field3256, -101);
                        }
                        continue;
                    }
                    if (var483 == 1102) {
                        var6--;
                        var463.field3288 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1103) {
                        var6--;
                        var463.field3339 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1104) {
                        var6--;
                        var463.field3394 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1105) {
                        var6--;
                        var463.field3337 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1106) {
                        var6--;
                        var463.field3385 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1107) {
                        var6--;
                        var463.field3368 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1108) {
                        var463.field3274 = 1;
                        var6--;
                        var463.field3399 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        if (var463.field3273 == -1) {
                            class255.method1744(var463.field3256, 127);
                        }
                        continue;
                    }
                    if (var483 == 1109) {
                        var6 -= 6;
                        var463.field3258 = class41.field640[var6];
                        var463.field3357 = class41.field640[var6 + 1];
                        var463.field3251 = class41.field640[var6 + 2];
                        var463.field3350 = class41.field640[var6 + 3];
                        var463.field3340 = class41.field640[var6 + 4];
                        var463.field3259 = class41.field640[var6 + 5];
                        class108.method834((byte) 49, var463);
                        if (var463.field3273 == -1) {
                            class303.method2113(var463.field3256, false);
                            class271.method1883(false, var463.field3256);
                        }
                        continue;
                    }
                    if (var483 == 1110) {
                        var6--;
                        int var464 = class41.field640[var6];
                        if (var463.field3309 != var464) {
                            var463.field3309 = var464;
                            var463.field3317 = 0;
                            var463.field3373 = 0;
                            class108.method834((byte) 49, var463);
                        }
                        if (var463.field3273 == -1) {
                            class18.method95(var463.field3256, (byte) 114);
                        }
                        continue;
                    }
                    if (var483 == 1111) {
                        var6--;
                        var463.field3403 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1112) {
                        var7--;
                        class255 var465 = class192.field3076[var7];
                        if (!var465.method1752(true, var463.field3298)) {
                            var463.field3298 = var465;
                            class108.method834((byte) 49, var463);
                        }
                        if (var463.field3273 == -1) {
                            class209.method1505(var463.field3256, 3);
                        }
                        continue;
                    }
                    if (var483 == 1113) {
                        var6--;
                        var463.field3325 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1114) {
                        var6 -= 3;
                        var463.field3283 = class41.field640[var6];
                        var463.field3252 = class41.field640[var6 + 1];
                        var463.field3328 = class41.field640[var6 + 2];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1115) {
                        var6--;
                        var463.field3265 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1116) {
                        var6--;
                        var463.field3299 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1117) {
                        var6--;
                        var463.field3323 = class41.field640[var6];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1118) {
                        var6--;
                        var463.field3383 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1119) {
                        var6--;
                        var463.field3291 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1120) {
                        var6 -= 2;
                        var463.field3261 = class41.field640[var6];
                        var463.field3384 = class41.field640[var6 + 1];
                        class108.method834((byte) 49, var463);
                        if (var463.field3281 == 0) {
                            class131.method972((byte) 120, false, var463);
                        }
                        continue;
                    }
                    if (var483 == 1121) {
                        var6 -= 2;
                        var463.field3379 = (short) class41.field640[var6];
                        var463.field3377 = (short) class41.field640[var6 + 1];
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                    if (var483 == 1122) {
                        var6--;
                        var463.field3358 = class41.field640[var6] == 1;
                        class108.method834((byte) 49, var463);
                        continue;
                    }
                } else if (var483 >= 1200 && var483 < 1300 || var483 >= 2200 && var483 < 2300) {
                    class197 var459;
                    if (var483 >= 2000) {
                        var6--;
                        var459 = class58.method353(class41.field640[var6], (byte) 69);
                        var483 -= 1000;
                    } else {
                        var459 = var46 ? class218.field3690 : class43.field680;
                    }
                    class108.method834((byte) 49, var459);
                    if (var483 == 1200 || var483 == 1205) {
                        var6 -= 2;
                        int var460 = class41.field640[var6];
                        int var461 = class41.field640[var6 + 1];
                        if (var459.field3273 == -1) {
                            class245.method1694(var459.field3256, 76);
                            class303.method2113(var459.field3256, false);
                            class271.method1883(false, var459.field3256);
                        }
                        if (var460 == -1) {
                            var459.field3397 = -1;
                            var459.field3274 = 1;
                            var459.field3399 = -1;
                        } else {
                            var459.field3262 = var461;
                            var459.field3397 = var460;
                            class192 var462 = class132.method990((byte) -119, var460);
                            var459.field3340 = var462.field3111;
                            var459.field3258 = var462.field3082;
                            var459.field3357 = var462.field3073;
                            var459.field3251 = var462.field3077;
                            var459.field3259 = var462.field3092;
                            var459.field3350 = var462.field3110;
                            if (var483 == 1205) {
                                var459.field3268 = false;
                            } else {
                                var459.field3268 = true;
                            }
                            if (var459.field3400 > 0) {
                                var459.field3259 = var459.field3259 * 32 / var459.field3400;
                            } else if (var459.field3343 > 0) {
                                var459.field3259 = var459.field3259 * 32 / var459.field3343;
                            }
                        }
                        continue;
                    }
                    if (var483 == 1201) {
                        var459.field3274 = 2;
                        var6--;
                        var459.field3399 = class41.field640[var6];
                        if (var459.field3273 == -1) {
                            class255.method1744(var459.field3256, 110);
                        }
                        continue;
                    }
                    if (var483 == 1202) {
                        var459.field3274 = 3;
                        var459.field3399 = class276.field4742.field4057.method2154(-76);
                        if (var459.field3273 == -1) {
                            class255.method1744(var459.field3256, 107);
                        }
                        continue;
                    }
                    if (var483 == 1203) {
                        var459.field3274 = 6;
                        var6--;
                        var459.field3399 = class41.field640[var6];
                        if (var459.field3273 == -1) {
                            class255.method1744(var459.field3256, 126);
                        }
                        continue;
                    }
                    if (var483 == 1204) {
                        var459.field3274 = 5;
                        var6--;
                        var459.field3399 = class41.field640[var6];
                        if (var459.field3273 == -1) {
                            class255.method1744(var459.field3256, 114);
                        }
                        continue;
                    }
                } else if ((var483 < 1300 || var483 >= 1400) && (var483 < 2300 || var483 >= 2400)) {
                    if (var483 >= 1400 && var483 < 1500 || var483 >= 2400 && var483 < 2500) {
                        class197 var66;
                        if (var483 >= 2000) {
                            var6--;
                            var66 = class58.method353(class41.field640[var6], (byte) -112);
                            var483 -= 1000;
                        } else {
                            var66 = var46 ? class218.field3690 : class43.field680;
                        }
                        var7--;
                        class255 var67 = class192.field3076[var7];
                        int[] var68 = null;
                        if (var67.method1774(-41) > 0 && var67.method1757(83, var67.method1774(-41) - 1) == 89) {
                            var6--;
                            int var69 = class41.field640[var6];
                            if (var69 > 0) {
                                var68 = new int[var69];
                                while (var69-- > 0) {
                                    var6--;
                                    var68[var69] = class41.field640[var6];
                                }
                            }
                            var67 = var67.method1780(var67.method1774(-41) - 1, -10449, 0);
                        }
                        Object[] var70 = new Object[var67.method1774(-41) + 1];
                        for (int var71 = var70.length - 1; var71 >= 1; var71--) {
                            if (var67.method1757(123, var71 - 1) == 115) {
                                var7--;
                                var70[var71] = class192.field3076[var7];
                            } else {
                                var6--;
                                var70[var71] = Integer.valueOf(class41.field640[var6]);
                            }
                        }
                        var6--;
                        int var72 = class41.field640[var6];
                        if (var72 == -1) {
                            var70 = null;
                        } else {
                            var70[0] = Integer.valueOf(var72);
                        }
                        var66.field3272 = true;
                        if (var483 == 1400) {
                            var66.field3318 = var70;
                        } else if (var483 == 1401) {
                            var66.field3308 = var70;
                        } else if (var483 == 1402) {
                            var66.field3411 = var70;
                        } else if (var483 == 1403) {
                            var66.field3270 = var70;
                        } else if (var483 == 1404) {
                            var66.field3401 = var70;
                        } else if (var483 == 1405) {
                            var66.field3402 = var70;
                        } else if (var483 == 1406) {
                            var66.field3293 = var70;
                        } else if (var483 == 1407) {
                            var66.field3249 = var68;
                            var66.field3349 = var70;
                        } else if (var483 == 1408) {
                            var66.field3406 = var70;
                        } else if (var483 == 1409) {
                            var66.field3326 = var70;
                        } else if (var483 == 1410) {
                            var66.field3336 = var70;
                        } else if (var483 == 1411) {
                            var66.field3302 = var70;
                        } else if (var483 == 1412) {
                            var66.field3380 = var70;
                        } else if (var483 == 1414) {
                            var66.field3376 = var70;
                            var66.field3304 = var68;
                        } else if (var483 == 1415) {
                            var66.field3346 = var70;
                            var66.field3245 = var68;
                        } else if (var483 == 1416) {
                            var66.field3408 = var70;
                        } else if (var483 == 1417) {
                            var66.field3396 = var70;
                        } else if (var483 == 1418) {
                            var66.field3372 = var70;
                        } else if (var483 == 1419) {
                            var66.field3370 = var70;
                        } else if (var483 == 1420) {
                            var66.field3313 = var70;
                        } else if (var483 == 1421) {
                            var66.field3260 = var70;
                        } else if (var483 == 1422) {
                            var66.field3296 = var70;
                        } else if (var483 == 1423) {
                            var66.field3247 = var70;
                        } else if (var483 == 1424) {
                            var66.field3242 = var70;
                        } else if (var483 == 1425) {
                            var66.field3375 = var70;
                        } else if (var483 == 1426) {
                            var66.field3361 = var70;
                        } else if (var483 == 1427) {
                            var66.field3410 = var70;
                        } else if (var483 == 1428) {
                            var66.field3366 = var70;
                            var66.field3287 = var68;
                        } else if (var483 == 1429) {
                            var66.field3295 = var70;
                            var66.field3409 = var68;
                        }
                        continue;
                    }
                    if (var483 < 1600) {
                        class197 var73 = var46 ? class218.field3690 : class43.field680;
                        if (var483 == 1500) {
                            class41.field640[var6++] = var73.field3332;
                            continue;
                        }
                        if (var483 == 1501) {
                            class41.field640[var6++] = var73.field3305;
                            continue;
                        }
                        if (var483 == 1502) {
                            class41.field640[var6++] = var73.field3294;
                            continue;
                        }
                        if (var483 == 1503) {
                            class41.field640[var6++] = var73.field3253;
                            continue;
                        }
                        if (var483 == 1504) {
                            class41.field640[var6++] = var73.field3250 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 1505) {
                            class41.field640[var6++] = var73.field3353;
                            continue;
                        }
                    } else if (var483 < 1700) {
                        class197 var74 = var46 ? class218.field3690 : class43.field680;
                        if (var483 == 1600) {
                            class41.field640[var6++] = var74.field3371;
                            continue;
                        }
                        if (var483 == 1601) {
                            class41.field640[var6++] = var74.field3310;
                            continue;
                        }
                        if (var483 == 1602) {
                            class192.field3076[var7++] = var74.field3298;
                            continue;
                        }
                        if (var483 == 1603) {
                            class41.field640[var6++] = var74.field3261;
                            continue;
                        }
                        if (var483 == 1604) {
                            class41.field640[var6++] = var74.field3384;
                            continue;
                        }
                        if (var483 == 1605) {
                            class41.field640[var6++] = var74.field3259;
                            continue;
                        }
                        if (var483 == 1606) {
                            class41.field640[var6++] = var74.field3251;
                            continue;
                        }
                        if (var483 == 1607) {
                            class41.field640[var6++] = var74.field3340;
                            continue;
                        }
                        if (var483 == 1608) {
                            class41.field640[var6++] = var74.field3350;
                            continue;
                        }
                        if (var483 == 1609) {
                            class41.field640[var6++] = var74.field3339;
                            continue;
                        }
                    } else if (var483 < 1800) {
                        class197 var458 = var46 ? class218.field3690 : class43.field680;
                        if (var483 == 1700) {
                            class41.field640[var6++] = var458.field3397;
                            continue;
                        }
                        if (var483 == 1701) {
                            if (var458.field3397 == -1) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = var458.field3262;
                            }
                            continue;
                        }
                        if (var483 == 1702) {
                            class41.field640[var6++] = var458.field3273;
                            continue;
                        }
                    } else if (var483 < 1900) {
                        class197 var456 = var46 ? class218.field3690 : class43.field680;
                        if (var483 == 1800) {
                            class41.field640[var6++] = class64.method389(client.method1673(var456), 265157387);
                            continue;
                        }
                        if (var483 == 1801) {
                            var6--;
                            int var457 = class41.field640[var6];
                            int var485 = var457 - 1;
                            if (var456.field3300 != null && var485 < var456.field3300.length && var456.field3300[var485] != null) {
                                class192.field3076[var7++] = var456.field3300[var485];
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 1802) {
                            if (var456.field3335 == null) {
                                class192.field3076[var7++] = class59.field898;
                            } else {
                                class192.field3076[var7++] = var456.field3335;
                            }
                            continue;
                        }
                    } else if (var483 < 2600) {
                        var6--;
                        class197 var455 = class58.method353(class41.field640[var6], (byte) -113);
                        if (var483 == 2500) {
                            class41.field640[var6++] = var455.field3332;
                            continue;
                        }
                        if (var483 == 2501) {
                            class41.field640[var6++] = var455.field3305;
                            continue;
                        }
                        if (var483 == 2502) {
                            class41.field640[var6++] = var455.field3294;
                            continue;
                        }
                        if (var483 == 2503) {
                            class41.field640[var6++] = var455.field3253;
                            continue;
                        }
                        if (var483 == 2504) {
                            class41.field640[var6++] = var455.field3250 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 2505) {
                            class41.field640[var6++] = var455.field3353;
                            continue;
                        }
                    } else if (var483 < 2700) {
                        var6--;
                        class197 var75 = class58.method353(class41.field640[var6], (byte) 102);
                        if (var483 == 2600) {
                            class41.field640[var6++] = var75.field3371;
                            continue;
                        }
                        if (var483 == 2601) {
                            class41.field640[var6++] = var75.field3310;
                            continue;
                        }
                        if (var483 == 2602) {
                            class192.field3076[var7++] = var75.field3298;
                            continue;
                        }
                        if (var483 == 2603) {
                            class41.field640[var6++] = var75.field3261;
                            continue;
                        }
                        if (var483 == 2604) {
                            class41.field640[var6++] = var75.field3384;
                            continue;
                        }
                        if (var483 == 2605) {
                            class41.field640[var6++] = var75.field3259;
                            continue;
                        }
                        if (var483 == 2606) {
                            class41.field640[var6++] = var75.field3251;
                            continue;
                        }
                        if (var483 == 2607) {
                            class41.field640[var6++] = var75.field3340;
                            continue;
                        }
                        if (var483 == 2608) {
                            class41.field640[var6++] = var75.field3350;
                            continue;
                        }
                        if (var483 == 2609) {
                            class41.field640[var6++] = var75.field3339;
                            continue;
                        }
                    } else if (var483 < 2800) {
                        if (var483 == 2700) {
                            var6--;
                            class197 var445 = class58.method353(class41.field640[var6], (byte) -118);
                            class41.field640[var6++] = var445.field3397;
                            continue;
                        }
                        if (var483 == 2701) {
                            var6--;
                            class197 var446 = class58.method353(class41.field640[var6], (byte) -127);
                            if (var446.field3397 == -1) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = var446.field3262;
                            }
                            continue;
                        }
                        if (var483 == 2702) {
                            var6--;
                            int var447 = class41.field640[var6];
                            class155 var448 = (class155) class158.field2675.method280((long) var447, 29153);
                            if (var448 == null) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = 1;
                            }
                            continue;
                        }
                        if (var483 == 2703) {
                            var6--;
                            class197 var449 = class58.method353(class41.field640[var6], (byte) -5);
                            if (var449.field3359 == null) {
                                class41.field640[var6++] = 0;
                                continue;
                            }
                            int var450 = var449.field3359.length;
                            for (int var451 = 0; var451 < var449.field3359.length; var451++) {
                                if (var449.field3359[var451] == null) {
                                    var450 = var451;
                                    break;
                                }
                            }
                            class41.field640[var6++] = var450;
                            continue;
                        }
                        if (var483 == 2704 || var483 == 2705) {
                            var6 -= 2;
                            int var452 = class41.field640[var6];
                            int var453 = class41.field640[var6 + 1];
                            class155 var454 = (class155) class158.field2675.method280((long) var452, 29153);
                            if (var454 != null && var454.field2637 == var453) {
                                class41.field640[var6++] = 1;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                    } else if (var483 < 2900) {
                        var6--;
                        class197 var443 = class58.method353(class41.field640[var6], (byte) -16);
                        if (var483 == 2800) {
                            class41.field640[var6++] = class64.method389(client.method1673(var443), 265157387);
                            continue;
                        }
                        if (var483 == 2801) {
                            var6--;
                            int var444 = class41.field640[var6];
                            int var484 = var444 - 1;
                            if (var443.field3300 != null && var443.field3300.length > var484 && var443.field3300[var484] != null) {
                                class192.field3076[var7++] = var443.field3300[var484];
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 2802) {
                            if (var443.field3335 == null) {
                                class192.field3076[var7++] = class59.field898;
                            } else {
                                class192.field3076[var7++] = var443.field3335;
                            }
                            continue;
                        }
                    } else if (var483 < 3200) {
                        if (var483 == 3100) {
                            var7--;
                            class255 var76 = class192.field3076[var7];
                            class260.method1807(1, class59.field898, var76, 0);
                            continue;
                        }
                        if (var483 == 3101) {
                            var6 -= 2;
                            class172.method1224(class41.field640[var6 + 1], class41.field640[var6], (byte) 5, class276.field4742);
                            continue;
                        }
                        if (var483 == 3103) {
                            class121.method899(-125);
                            continue;
                        }
                        if (var483 == 3104) {
                            class74.field1221++;
                            var7--;
                            class255 var77 = class192.field3076[var7];
                            int var78 = 0;
                            if (var77.method1776((byte) 111)) {
                                var78 = var77.method1746((byte) 106);
                            }
                            class255.field4318.method1523(22260, 122);
                            class255.field4318.method436(var78, -18820);
                            continue;
                        }
                        if (var483 == 3105) {
                            class141.field2345++;
                            var7--;
                            class255 var79 = class192.field3076[var7];
                            class255.field4318.method1523(22260, 204);
                            class255.field4318.method449(16711680, var79.method1764((byte) -126));
                            continue;
                        }
                        if (var483 == 3106) {
                            class153.field2607++;
                            var7--;
                            class255 var80 = class192.field3076[var7];
                            class255.field4318.method1523(22260, 188);
                            class255.field4318.method463(false, var80.method1774(-41) + 1);
                            class255.field4318.method483(-99755000, var80);
                            continue;
                        }
                        if (var483 == 3107) {
                            var6--;
                            int var81 = class41.field640[var6];
                            var7--;
                            class255 var82 = class192.field3076[var7];
                            class129.method957(var82, (byte) 110, var81);
                            continue;
                        }
                        if (var483 == 3108) {
                            var6 -= 3;
                            int var83 = class41.field640[var6 + 1];
                            int var84 = class41.field640[var6 + 2];
                            int var85 = class41.field640[var6];
                            class197 var86 = class58.method353(var84, (byte) 7);
                            class123.method909(-37, var86, var85, var83);
                            continue;
                        }
                        if (var483 == 3109) {
                            var6 -= 2;
                            int var87 = class41.field640[var6];
                            class197 var88 = var46 ? class218.field3690 : class43.field680;
                            int var89 = class41.field640[var6 + 1];
                            class123.method909(-31, var88, var87, var89);
                            continue;
                        }
                        if (var483 == 3110) {
                            var6--;
                            int var90 = class41.field640[var6];
                            class255.field4318.method1523(22260, 221);
                            class255.field4318.method462(var90, (byte) -61);
                            class111.field1866++;
                            continue;
                        }
                    } else if (var483 < 3300) {
                        if (var483 == 3200) {
                            var6 -= 3;
                            class2.method6(class41.field640[var6 + 1], class41.field640[var6], (byte) 121, class41.field640[var6 + 2]);
                            continue;
                        }
                        if (var483 == 3201) {
                            var6--;
                            class297.method2089(class41.field640[var6], 0);
                            continue;
                        }
                        if (var483 == 3202) {
                            var6 -= 2;
                            class84.method589(class41.field640[var6], 1, class41.field640[var6 + 1]);
                            continue;
                        }
                    } else if (var483 < 3400) {
                        if (var483 == 3300) {
                            class41.field640[var6++] = class277.field4768;
                            continue;
                        }
                        if (var483 == 3301) {
                            var6 -= 2;
                            int var91 = class41.field640[var6];
                            int var92 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class132.method992(var91, -125, var92);
                            continue;
                        }
                        if (var483 == 3302) {
                            var6 -= 2;
                            int var93 = class41.field640[var6];
                            int var94 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class30.method174(0, var94, var93);
                            continue;
                        }
                        if (var483 == 3303) {
                            var6 -= 2;
                            int var95 = class41.field640[var6 + 1];
                            int var96 = class41.field640[var6];
                            class41.field640[var6++] = class96.method751(var95, -63, var96);
                            continue;
                        }
                        if (var483 == 3304) {
                            var6--;
                            int var97 = class41.field640[var6];
                            class41.field640[var6++] = class16.method76((byte) -98, var97).field4460;
                            continue;
                        }
                        if (var483 == 3305) {
                            var6--;
                            int var98 = class41.field640[var6];
                            class41.field640[var6++] = class217.field3678[var98];
                            continue;
                        }
                        if (var483 == 3306) {
                            var6--;
                            int var99 = class41.field640[var6];
                            class41.field640[var6++] = class271.field4678[var99];
                            continue;
                        }
                        if (var483 == 3307) {
                            var6--;
                            int var100 = class41.field640[var6];
                            class41.field640[var6++] = class143.field2386[var100];
                            continue;
                        }
                        if (var483 == 3308) {
                            int var101 = client.field4039;
                            int var102 = (class276.field4742.field5173 >> 7) + class268.field4615;
                            int var103 = (class276.field4742.field5130 >> 7) + class197.field3355;
                            class41.field640[var6++] = (var101 << 28) + var102 + (var103 << 14);
                            continue;
                        }
                        if (var483 == 3309) {
                            var6--;
                            int var104 = class41.field640[var6];
                            class41.field640[var6++] = class154.method1134(var104 >> 14, 16383);
                            continue;
                        }
                        if (var483 == 3310) {
                            var6--;
                            int var105 = class41.field640[var6];
                            class41.field640[var6++] = var105 >> 28;
                            continue;
                        }
                        if (var483 == 3311) {
                            var6--;
                            int var106 = class41.field640[var6];
                            class41.field640[var6++] = class154.method1134(16383, var106);
                            continue;
                        }
                        if (var483 == 3312) {
                            class41.field640[var6++] = class112.field1902 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3313) {
                            var6 -= 2;
                            int var107 = class41.field640[var6] + 32768;
                            int var108 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class132.method992(var107, -128, var108);
                            continue;
                        }
                        if (var483 == 3314) {
                            var6 -= 2;
                            int var109 = class41.field640[var6] + 32768;
                            int var110 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class30.method174(0, var110, var109);
                            continue;
                        }
                        if (var483 == 3315) {
                            var6 -= 2;
                            int var111 = class41.field640[var6] + 32768;
                            int var112 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class96.method751(var112, -68, var111);
                            continue;
                        }
                        if (var483 == 3316) {
                            if (class201.field3483 < 2) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = class201.field3483;
                            }
                            continue;
                        }
                        if (var483 == 3317) {
                            class41.field640[var6++] = class186.field2998;
                            continue;
                        }
                        if (var483 == 3318) {
                            class41.field640[var6++] = class25.field386;
                            continue;
                        }
                        if (var483 == 3321) {
                            class41.field640[var6++] = class114.field1938;
                            continue;
                        }
                        if (var483 == 3322) {
                            class41.field640[var6++] = class15.field221;
                            continue;
                        }
                        if (var483 == 3323) {
                            if (class17.field259 >= 5 && class17.field259 <= 9) {
                                class41.field640[var6++] = 1;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3324) {
                            if (class17.field259 >= 5 && class17.field259 <= 9) {
                                class41.field640[var6++] = class17.field259;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3325) {
                            class41.field640[var6++] = class11.field161 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3326) {
                            class41.field640[var6++] = class276.field4742.field4074;
                            continue;
                        }
                        if (var483 == 3327) {
                            class41.field640[var6++] = class276.field4742.field4057.field5277 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3328) {
                            class41.field640[var6++] = class2.field35;
                            continue;
                        }
                        if (var483 == 3329) {
                            class41.field640[var6++] = class231.field3837;
                            continue;
                        }
                        if (var483 == 3330) {
                            var6--;
                            int var113 = class41.field640[var6];
                            class41.field640[var6++] = class136.method1019(true, var113);
                            continue;
                        }
                        if (var483 == 3331) {
                            var6 -= 2;
                            int var114 = class41.field640[var6];
                            int var115 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class121.method901(false, var114, 3881, var115);
                            continue;
                        }
                        if (var483 == 3332) {
                            var6 -= 2;
                            int var116 = class41.field640[var6];
                            int var117 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class121.method901(true, var116, 3881, var117);
                            continue;
                        }
                        if (var483 == 3333) {
                            class41.field640[var6++] = class79.field1284;
                            continue;
                        }
                        if (var483 == 3335) {
                            class41.field640[var6++] = class166.field2791;
                            continue;
                        }
                    } else if (var483 < 3500) {
                        if (var483 == 3400) {
                            var6 -= 2;
                            int var118 = class41.field640[var6];
                            int var119 = class41.field640[var6 + 1];
                            class51 var120 = class130.method960(var118, 48000);
                            if (var120.field779 == 115) {
                            }
                            class192.field3076[var7++] = var120.method307(var119, (byte) -60);
                            continue;
                        }
                        if (var483 == 3408) {
                            var6 -= 4;
                            int var121 = class41.field640[var6];
                            int var122 = class41.field640[var6 + 1];
                            int var123 = class41.field640[var6 + 2];
                            int var124 = class41.field640[var6 + 3];
                            class51 var125 = class130.method960(var123, 48000);
                            if (var125.field778 == var121 && var125.field779 == var122) {
                                if (var122 == 115) {
                                    class192.field3076[var7++] = var125.method307(var124, (byte) -115);
                                } else {
                                    class41.field640[var6++] = var125.method299(-9487, var124);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var483 == 3409) {
                            var6 -= 3;
                            int var126 = class41.field640[var6];
                            int var127 = class41.field640[var6 + 1];
                            int var128 = class41.field640[var6 + 2];
                            if (var127 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class51 var129 = class130.method960(var127, 48000);
                            if (var129.field779 != var126) {
                                throw new RuntimeException("C3409-1");
                            }
                            class41.field640[var6++] = var129.method297(-3, var128) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3410) {
                            var7--;
                            class255 var130 = class192.field3076[var7];
                            var6--;
                            int var131 = class41.field640[var6];
                            if (var131 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class51 var132 = class130.method960(var131, 48000);
                            if (var132.field779 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class41.field640[var6++] = var132.method298(false, var130) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3411) {
                            var6--;
                            int var133 = class41.field640[var6];
                            class51 var134 = class130.method960(var133, 48000);
                            class41.field640[var6++] = var134.field766.method286((byte) -106);
                            continue;
                        }
                    } else if (var483 < 3700) {
                        if (var483 == 3600) {
                            if (class78.field1269 == 0) {
                                class41.field640[var6++] = -2;
                            } else if (class78.field1269 == 1) {
                                class41.field640[var6++] = -1;
                            } else {
                                class41.field640[var6++] = class33.field529;
                            }
                            continue;
                        }
                        if (var483 == 3601) {
                            var6--;
                            int var135 = class41.field640[var6];
                            if (class78.field1269 == 2 && var135 < class33.field529) {
                                class192.field3076[var7++] = class32.field519[var135];
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 3602) {
                            var6--;
                            int var136 = class41.field640[var6];
                            if (class78.field1269 == 2 && class33.field529 > var136) {
                                class41.field640[var6++] = class93.field1595[var136];
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3603) {
                            var6--;
                            int var137 = class41.field640[var6];
                            if (class78.field1269 == 2 && var137 < class33.field529) {
                                class41.field640[var6++] = class70.field1110[var137];
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3604) {
                            var7--;
                            class255 var138 = class192.field3076[var7];
                            var6--;
                            int var139 = class41.field640[var6];
                            class127.method945(var138, (byte) -84, var139);
                            continue;
                        }
                        if (var483 == 3605) {
                            var7--;
                            class255 var140 = class192.field3076[var7];
                            class155.method1146(0, var140.method1764((byte) 102));
                            continue;
                        }
                        if (var483 == 3606) {
                            var7--;
                            class255 var141 = class192.field3076[var7];
                            class185.method1291((byte) -113, var141.method1764((byte) -94));
                            continue;
                        }
                        if (var483 == 3607) {
                            var7--;
                            class255 var142 = class192.field3076[var7];
                            class145.method1076(100, var142.method1764((byte) 124));
                            continue;
                        }
                        if (var483 == 3608) {
                            var7--;
                            class255 var143 = class192.field3076[var7];
                            class23.method129(true, var143.method1764((byte) -92));
                            continue;
                        }
                        if (var483 == 3609) {
                            var7--;
                            class255 var144 = class192.field3076[var7];
                            if (var144.method1768(true, class11.field154) || var144.method1768(true, class88.field1459)) {
                                var144 = var144.method1786(7, 9751);
                            }
                            class41.field640[var6++] = method1703(var144, 15408) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3610) {
                            var6--;
                            int var145 = class41.field640[var6];
                            if (class78.field1269 == 2 && var145 < class33.field529) {
                                class192.field3076[var7++] = class198.field3420[var145];
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 3611) {
                            if (class217.field3680 == null) {
                                class192.field3076[var7++] = class59.field898;
                            } else {
                                class192.field3076[var7++] = class217.field3680.method1787(true);
                            }
                            continue;
                        }
                        if (var483 == 3612) {
                            if (class217.field3680 == null) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = class255.field4358;
                            }
                            continue;
                        }
                        if (var483 == 3613) {
                            var6--;
                            int var146 = class41.field640[var6];
                            if (class217.field3680 != null && var146 < class255.field4358) {
                                class192.field3076[var7++] = class153.field2594[var146].field4236.method1787(true);
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 3614) {
                            var6--;
                            int var147 = class41.field640[var6];
                            if (class217.field3680 != null && var147 < class255.field4358) {
                                class41.field640[var6++] = class153.field2594[var147].field4225;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3615) {
                            var6--;
                            int var148 = class41.field640[var6];
                            if (class217.field3680 != null && class255.field4358 > var148) {
                                class41.field640[var6++] = class153.field2594[var148].field4232;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3616) {
                            class41.field640[var6++] = class102.field1717;
                            continue;
                        }
                        if (var483 == 3617) {
                            var7--;
                            class255 var149 = class192.field3076[var7];
                            class133.method998((byte) 46, var149);
                            continue;
                        }
                        if (var483 == 3618) {
                            class41.field640[var6++] = class43.field676;
                            continue;
                        }
                        if (var483 == 3619) {
                            var7--;
                            class255 var150 = class192.field3076[var7];
                            class42.method259(var150.method1764((byte) -91), (byte) 125);
                            continue;
                        }
                        if (var483 == 3620) {
                            class3.method16(13);
                            continue;
                        }
                        if (var483 == 3621) {
                            if (class78.field1269 == 0) {
                                class41.field640[var6++] = -1;
                            } else {
                                class41.field640[var6++] = class29.field453;
                            }
                            continue;
                        }
                        if (var483 == 3622) {
                            var6--;
                            int var151 = class41.field640[var6];
                            if (class78.field1269 != 0 && var151 < class29.field453) {
                                class192.field3076[var7++] = class147.method1091(class114.field1933[var151], -128).method1787(true);
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 3623) {
                            var7--;
                            class255 var152 = class192.field3076[var7];
                            if (var152.method1768(true, class11.field154) || var152.method1768(true, class88.field1459)) {
                                var152 = var152.method1786(7, 9751);
                            }
                            class41.field640[var6++] = class280.method1950(var152, 108) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3624) {
                            var6--;
                            int var153 = class41.field640[var6];
                            if (class153.field2594 != null && var153 < class255.field4358 && class153.field2594[var153].field4236.method1779(105, class276.field4742.field4068)) {
                                class41.field640[var6++] = 1;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3625) {
                            if (class42.field657 == null) {
                                class192.field3076[var7++] = class59.field898;
                            } else {
                                class192.field3076[var7++] = class42.field657.method1787(true);
                            }
                            continue;
                        }
                        if (var483 == 3626) {
                            var6--;
                            int var154 = class41.field640[var6];
                            if (class217.field3680 != null && class255.field4358 > var154) {
                                class192.field3076[var7++] = class153.field2594[var154].field4229;
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 3627) {
                            var6--;
                            int var155 = class41.field640[var6];
                            if (class78.field1269 == 2 && var155 >= 0 && var155 < class33.field529) {
                                class41.field640[var6++] = class220.field3713[var155] ? 1 : 0;
                                continue;
                            }
                            class41.field640[var6++] = 0;
                            continue;
                        }
                        if (var483 == 3628) {
                            var7--;
                            class255 var156 = class192.field3076[var7];
                            if (var156.method1768(true, class11.field154) || var156.method1768(true, class88.field1459)) {
                                var156 = var156.method1786(7, 9751);
                            }
                            class41.field640[var6++] = class54.method334(var156, (byte) 54);
                            continue;
                        }
                    } else if (var483 < 4000) {
                        if (var483 == 3903) {
                            var6--;
                            int var429 = class41.field640[var6];
                            class41.field640[var6++] = class60.field933[var429].method1568(18914);
                            continue;
                        }
                        if (var483 == 3904) {
                            var6--;
                            int var430 = class41.field640[var6];
                            class41.field640[var6++] = class60.field933[var430].field3755;
                            continue;
                        }
                        if (var483 == 3905) {
                            var6--;
                            int var431 = class41.field640[var6];
                            class41.field640[var6++] = class60.field933[var431].field3758;
                            continue;
                        }
                        if (var483 == 3906) {
                            var6--;
                            int var432 = class41.field640[var6];
                            class41.field640[var6++] = class60.field933[var432].field3754;
                            continue;
                        }
                        if (var483 == 3907) {
                            var6--;
                            int var433 = class41.field640[var6];
                            class41.field640[var6++] = class60.field933[var433].field3757;
                            continue;
                        }
                        if (var483 == 3908) {
                            var6--;
                            int var434 = class41.field640[var6];
                            class41.field640[var6++] = class60.field933[var434].field3760;
                            continue;
                        }
                        if (var483 == 3910) {
                            var6--;
                            int var435 = class41.field640[var6];
                            int var436 = class60.field933[var435].method1566((byte) -98);
                            class41.field640[var6++] = var436 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3911) {
                            var6--;
                            int var437 = class41.field640[var6];
                            int var438 = class60.field933[var437].method1566((byte) -101);
                            class41.field640[var6++] = var438 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3912) {
                            var6--;
                            int var439 = class41.field640[var6];
                            int var440 = class60.field933[var439].method1566((byte) -94);
                            class41.field640[var6++] = var440 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 3913) {
                            var6--;
                            int var441 = class41.field640[var6];
                            int var442 = class60.field933[var441].method1566((byte) -120);
                            class41.field640[var6++] = var442 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var483 < 4100) {
                        if (var483 == 4000) {
                            var6 -= 2;
                            int var157 = class41.field640[var6 + 1];
                            int var158 = class41.field640[var6];
                            class41.field640[var6++] = var158 + var157;
                            continue;
                        }
                        if (var483 == 4001) {
                            var6 -= 2;
                            int var159 = class41.field640[var6];
                            int var160 = class41.field640[var6 + 1];
                            class41.field640[var6++] = var159 - var160;
                            continue;
                        }
                        if (var483 == 4002) {
                            var6 -= 2;
                            int var161 = class41.field640[var6 + 1];
                            int var162 = class41.field640[var6];
                            class41.field640[var6++] = var161 * var162;
                            continue;
                        }
                        if (var483 == 4003) {
                            var6 -= 2;
                            int var163 = class41.field640[var6 + 1];
                            int var164 = class41.field640[var6];
                            class41.field640[var6++] = var164 / var163;
                            continue;
                        }
                        if (var483 == 4004) {
                            var6--;
                            int var165 = class41.field640[var6];
                            class41.field640[var6++] = (int) ((double) var165 * Math.random());
                            continue;
                        }
                        if (var483 == 4005) {
                            var6--;
                            int var166 = class41.field640[var6];
                            class41.field640[var6++] = (int) ((double) (var166 + 1) * Math.random());
                            continue;
                        }
                        if (var483 == 4006) {
                            var6 -= 5;
                            int var167 = class41.field640[var6 + 1];
                            int var168 = class41.field640[var6 + 2];
                            int var169 = class41.field640[var6];
                            int var170 = class41.field640[var6 + 3];
                            int var171 = class41.field640[var6 + 4];
                            class41.field640[var6++] = var169 + ((var171 - var168) * (var167 - var169) / (var170 - var168));
                            continue;
                        }
                        if (var483 == 4007) {
                            var6 -= 2;
                            long var172 = (long) class41.field640[var6];
                            long var174 = (long) class41.field640[var6 + 1];
                            class41.field640[var6++] = (int) (var172 * var174 / 100L + var172);
                            continue;
                        }
                        if (var483 == 4008) {
                            var6 -= 2;
                            int var176 = class41.field640[var6];
                            int var177 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class264.method1836(var176, 0x1 << var177);
                            continue;
                        }
                        if (var483 == 4009) {
                            var6 -= 2;
                            int var178 = class41.field640[var6 + 1];
                            int var179 = class41.field640[var6];
                            class41.field640[var6++] = class154.method1134(var179, -(0x1 << var178) - 1);
                            continue;
                        }
                        if (var483 == 4010) {
                            var6 -= 2;
                            int var180 = class41.field640[var6];
                            int var181 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class154.method1134(0x1 << var181, var180) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var483 == 4011) {
                            var6 -= 2;
                            int var182 = class41.field640[var6];
                            int var183 = class41.field640[var6 + 1];
                            class41.field640[var6++] = var182 % var183;
                            continue;
                        }
                        if (var483 == 4012) {
                            var6 -= 2;
                            int var184 = class41.field640[var6];
                            int var185 = class41.field640[var6 + 1];
                            if (var184 == 0) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = (int) Math.pow((double) var184, (double) var185);
                            }
                            continue;
                        }
                        if (var483 == 4013) {
                            var6 -= 2;
                            int var186 = class41.field640[var6];
                            int var187 = class41.field640[var6 + 1];
                            if (var186 == 0) {
                                class41.field640[var6++] = 0;
                            } else if (var187 == 0) {
                                class41.field640[var6++] = Integer.MAX_VALUE;
                            } else {
                                class41.field640[var6++] = (int) Math.pow((double) var186, 1.0D / (double) var187);
                            }
                            continue;
                        }
                        if (var483 == 4014) {
                            var6 -= 2;
                            int var188 = class41.field640[var6 + 1];
                            int var189 = class41.field640[var6];
                            class41.field640[var6++] = class154.method1134(var189, var188);
                            continue;
                        }
                        if (var483 == 4015) {
                            var6 -= 2;
                            int var190 = class41.field640[var6];
                            int var191 = class41.field640[var6 + 1];
                            class41.field640[var6++] = class264.method1836(var190, var191);
                            continue;
                        }
                        if (var483 == 4016) {
                            var6 -= 2;
                            int var192 = class41.field640[var6];
                            int var193 = class41.field640[var6 + 1];
                            class41.field640[var6++] = var192 >= var193 ? var193 : var192;
                            continue;
                        }
                        if (var483 == 4017) {
                            var6 -= 2;
                            int var194 = class41.field640[var6 + 1];
                            int var195 = class41.field640[var6];
                            class41.field640[var6++] = var194 >= var195 ? var194 : var195;
                            continue;
                        }
                        if (var483 == 4018) {
                            var6 -= 3;
                            long var196 = (long) class41.field640[var6];
                            long var198 = (long) class41.field640[var6 + 1];
                            long var200 = (long) class41.field640[var6 + 2];
                            class41.field640[var6++] = (int) (var196 * var200 / var198);
                            continue;
                        }
                    } else if (var483 < 4200) {
                        if (var483 == 4100) {
                            var6--;
                            int var202 = class41.field640[var6];
                            var7--;
                            class255 var203 = class192.field3076[var7];
                            class192.field3076[var7++] = class3.method14(new class255[] { var203, class215.method1532(var202, true) }, (byte) -66);
                            continue;
                        }
                        if (var483 == 4101) {
                            var7 -= 2;
                            class255 var204 = class192.field3076[var7];
                            class255 var205 = class192.field3076[var7 + 1];
                            class192.field3076[var7++] = class3.method14(new class255[] { var204, var205 }, (byte) -80);
                            continue;
                        }
                        if (var483 == 4102) {
                            var6--;
                            int var206 = class41.field640[var6];
                            var7--;
                            class255 var207 = class192.field3076[var7];
                            class192.field3076[var7++] = class3.method14(new class255[] { var207, class88.method626(var206, true, 100) }, (byte) -118);
                            continue;
                        }
                        if (var483 == 4103) {
                            var7--;
                            class255 var208 = class192.field3076[var7];
                            class192.field3076[var7++] = var208.method1777(-157);
                            continue;
                        }
                        if (var483 == 4104) {
                            var6--;
                            int var209 = class41.field640[var6];
                            long var210 = ((long) var209 + 11745L) * 86400000L;
                            class100.field1698.setTime(new Date(var210));
                            int var212 = class100.field1698.get(5);
                            int var213 = class100.field1698.get(2);
                            int var214 = class100.field1698.get(1);
                            class192.field3076[var7++] = class3.method14(new class255[] { class215.method1532(var212, true), class284.field4891, class25.field411[var213], class284.field4891, class215.method1532(var214, true) }, (byte) -88);
                            continue;
                        }
                        if (var483 == 4105) {
                            var7 -= 2;
                            class255 var215 = class192.field3076[var7];
                            class255 var216 = class192.field3076[var7 + 1];
                            if (class276.field4742.field4057 != null && class276.field4742.field4057.field5277) {
                                class192.field3076[var7++] = var216;
                                continue;
                            }
                            class192.field3076[var7++] = var215;
                            continue;
                        }
                        if (var483 == 4106) {
                            var6--;
                            int var217 = class41.field640[var6];
                            class192.field3076[var7++] = class215.method1532(var217, true);
                            continue;
                        }
                        if (var483 == 4107) {
                            var7 -= 2;
                            class41.field640[var6++] = class192.field3076[var7].method1767(true, class192.field3076[var7 + 1]);
                            continue;
                        }
                        if (var483 == 4108) {
                            var7--;
                            class255 var218 = class192.field3076[var7];
                            var6 -= 2;
                            int var219 = class41.field640[var6];
                            int var220 = class41.field640[var6 + 1];
                            byte[] var221 = class167.field2814.method636(var220, (byte) 58, 0);
                            class290 var222 = new class290(var221);
                            var222.method503(class44.field681, (int[]) null);
                            class41.field640[var6++] = var222.method496(var218, var219);
                            continue;
                        }
                        if (var483 == 4109) {
                            var6 -= 2;
                            var7--;
                            class255 var223 = class192.field3076[var7];
                            int var224 = class41.field640[var6];
                            int var225 = class41.field640[var6 + 1];
                            byte[] var226 = class167.field2814.method636(var225, (byte) 53, 0);
                            class290 var227 = new class290(var226);
                            var227.method503(class44.field681, (int[]) null);
                            class41.field640[var6++] = var227.method495(var223, var224);
                            continue;
                        }
                        if (var483 == 4110) {
                            var7 -= 2;
                            class255 var228 = class192.field3076[var7];
                            class255 var229 = class192.field3076[var7 + 1];
                            var6--;
                            if (class41.field640[var6] == 1) {
                                class192.field3076[var7++] = var228;
                            } else {
                                class192.field3076[var7++] = var229;
                            }
                            continue;
                        }
                        if (var483 == 4111) {
                            var7--;
                            class255 var230 = class192.field3076[var7];
                            class192.field3076[var7++] = class71.method508(var230);
                            continue;
                        }
                        if (var483 == 4112) {
                            var7--;
                            class255 var231 = class192.field3076[var7];
                            var6--;
                            int var232 = class41.field640[var6];
                            if (var232 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class192.field3076[var7++] = var231.method1748(var232, (byte) 118);
                            continue;
                        }
                        if (var483 == 4113) {
                            var6--;
                            int var233 = class41.field640[var6];
                            class41.field640[var6++] = class59.method363(var233, 239) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4114) {
                            var6--;
                            int var234 = class41.field640[var6];
                            class41.field640[var6++] = class67.method407(0, var234) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4115) {
                            var6--;
                            int var235 = class41.field640[var6];
                            class41.field640[var6++] = class259.method1804(var235, false) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4116) {
                            var6--;
                            int var236 = class41.field640[var6];
                            class41.field640[var6++] = class114.method871(var236, -63) ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4117) {
                            var7--;
                            class255 var237 = class192.field3076[var7];
                            if (var237 == null) {
                                class41.field640[var6++] = 0;
                            } else {
                                class41.field640[var6++] = var237.method1774(-41);
                            }
                            continue;
                        }
                        if (var483 == 4118) {
                            var6 -= 2;
                            var7--;
                            class255 var238 = class192.field3076[var7];
                            int var239 = class41.field640[var6];
                            int var240 = class41.field640[var6 + 1];
                            class192.field3076[var7++] = var238.method1780(var240, -10449, var239);
                            continue;
                        }
                        if (var483 == 4119) {
                            var7--;
                            class255 var241 = class192.field3076[var7];
                            boolean var242 = false;
                            class255 var243 = class285.method2025(var241.method1774(-41), (byte) 122);
                            for (int var244 = 0; var244 < var241.method1774(-41); var244++) {
                                int var245 = var241.method1757(76, var244);
                                if (var245 == 60) {
                                    var242 = true;
                                } else if (var245 == 62) {
                                    var242 = false;
                                } else if (!var242) {
                                    var243.method1750(var245, 0);
                                }
                            }
                            var243.method1778(true);
                            class192.field3076[var7++] = var243;
                            continue;
                        }
                        if (var483 == 4120) {
                            var7--;
                            class255 var246 = class192.field3076[var7];
                            var6 -= 2;
                            int var247 = class41.field640[var6 + 1];
                            int var248 = class41.field640[var6];
                            class41.field640[var6++] = var246.method1741(var247, var248, (byte) -119);
                            continue;
                        }
                        if (var483 == 4121) {
                            var7 -= 2;
                            var6--;
                            int var249 = class41.field640[var6];
                            class255 var250 = class192.field3076[var7];
                            class255 var251 = class192.field3076[var7 + 1];
                            class41.field640[var6++] = var250.method1738(var249, var251, 94);
                            continue;
                        }
                        if (var483 == 4122) {
                            var6--;
                            int var252 = class41.field640[var6];
                            class41.field640[var6++] = class75.method537(var252, 29150);
                            continue;
                        }
                        if (var483 == 4123) {
                            var6--;
                            int var253 = class41.field640[var6];
                            class41.field640[var6++] = class177.method1265(247, var253);
                            continue;
                        }
                    } else if (var483 < 4300) {
                        if (var483 == 4200) {
                            var6--;
                            int var410 = class41.field640[var6];
                            class192.field3076[var7++] = class132.method990((byte) -119, var410).field3112;
                            continue;
                        }
                        if (var483 == 4201) {
                            var6 -= 2;
                            int var411 = class41.field640[var6 + 1];
                            int var412 = class41.field640[var6];
                            class192 var413 = class132.method990((byte) -119, var412);
                            if (var411 >= 1 && var411 <= 5 && var413.field3101[var411 - 1] != null) {
                                class192.field3076[var7++] = var413.field3101[var411 - 1];
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 4202) {
                            var6 -= 2;
                            int var414 = class41.field640[var6];
                            int var415 = class41.field640[var6 + 1];
                            class192 var416 = class132.method990((byte) -119, var414);
                            if (var415 >= 1 && var415 <= 5 && var416.field3090[var415 - 1] != null) {
                                class192.field3076[var7++] = var416.field3090[var415 - 1];
                                continue;
                            }
                            class192.field3076[var7++] = class59.field898;
                            continue;
                        }
                        if (var483 == 4203) {
                            var6--;
                            int var417 = class41.field640[var6];
                            class41.field640[var6++] = class132.method990((byte) -119, var417).field3122;
                            continue;
                        }
                        if (var483 == 4204) {
                            var6--;
                            int var418 = class41.field640[var6];
                            class41.field640[var6++] = class132.method990((byte) -119, var418).field3066 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4205) {
                            var6--;
                            int var419 = class41.field640[var6];
                            class192 var420 = class132.method990((byte) -119, var419);
                            if (var420.field3130 == -1 && var420.field3089 >= 0) {
                                class41.field640[var6++] = var420.field3089;
                                continue;
                            }
                            class41.field640[var6++] = var419;
                            continue;
                        }
                        if (var483 == 4206) {
                            var6--;
                            int var421 = class41.field640[var6];
                            class192 var422 = class132.method990((byte) -119, var421);
                            if (var422.field3130 >= 0 && var422.field3089 >= 0) {
                                class41.field640[var6++] = var422.field3089;
                                continue;
                            }
                            class41.field640[var6++] = var421;
                            continue;
                        }
                        if (var483 == 4207) {
                            var6--;
                            int var423 = class41.field640[var6];
                            class41.field640[var6++] = class132.method990((byte) -119, var423).field3129 ? 1 : 0;
                            continue;
                        }
                        if (var483 == 4208) {
                            var6 -= 2;
                            int var424 = class41.field640[var6];
                            int var425 = class41.field640[var6 + 1];
                            class149 var426 = class106.method820(var425, (byte) 106);
                            if (var426.method1101((byte) -11)) {
                                class192.field3076[var7++] = class132.method990((byte) -119, var424).method1328(var425, -16647, var426.field2519);
                            } else {
                                class41.field640[var6++] = class132.method990((byte) -119, var424).method1316((byte) 107, var426.field2515, var425);
                            }
                            continue;
                        }
                        if (var483 == 4210) {
                            var6--;
                            int var427 = class41.field640[var6];
                            var7--;
                            class255 var428 = class192.field3076[var7];
                            class232.method1610(6081, var427 == 1, var428);
                            class41.field640[var6++] = class291.field4991;
                            continue;
                        }
                        if (var483 == 4211) {
                            if (class133.field2219 != null && class49.field744 < class291.field4991) {
                                class41.field640[var6++] = class154.method1134(65535, class133.field2219[class49.field744++]);
                                continue;
                            }
                            class41.field640[var6++] = -1;
                            continue;
                        }
                        if (var483 == 4212) {
                            class49.field744 = 0;
                            continue;
                        }
                    } else if (var483 < 4400) {
                        if (var483 == 4300) {
                            var6 -= 2;
                            int var400 = class41.field640[var6 + 1];
                            int var401 = class41.field640[var6];
                            class149 var402 = class106.method820(var400, (byte) 101);
                            if (var402.method1101((byte) -11)) {
                                class192.field3076[var7++] = class143.method1068(-78, var401).method1635(var400, var402.field2519, -51);
                            } else {
                                class41.field640[var6++] = class143.method1068(-98, var401).method1638(var400, 31253, var402.field2515);
                            }
                            continue;
                        }
                        if (var483 == 4301) {
                            var6--;
                            int var403 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-110, var403).field3897;
                            continue;
                        }
                        if (var483 == 4302) {
                            var6--;
                            int var404 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-97, var404).field3903;
                            continue;
                        }
                        if (var483 == 4303) {
                            var6--;
                            int var405 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-65, var405).field3883;
                            continue;
                        }
                        if (var483 == 4304) {
                            var6--;
                            int var406 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-123, var406).field3937;
                            continue;
                        }
                        if (var483 == 4305) {
                            var6--;
                            int var407 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-85, var407).field3942;
                            continue;
                        }
                        if (var483 == 4306) {
                            var6--;
                            int var408 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-65, var408).field3881;
                            continue;
                        }
                        if (var483 == 4307) {
                            var6--;
                            int var409 = class41.field640[var6];
                            class41.field640[var6++] = class143.method1068(-105, var409).field3928;
                            continue;
                        }
                    } else if (var483 >= 4500) {
                        if (var483 < 4600) {
                            if (var483 == 4500) {
                                var6 -= 2;
                                int var254 = class41.field640[var6];
                                int var255 = class41.field640[var6 + 1];
                                class149 var256 = class106.method820(var255, (byte) -88);
                                if (var256.method1101((byte) -11)) {
                                    class192.field3076[var7++] = class269.method1875(var254, (byte) -110).method826((byte) -125, var255, var256.field2519);
                                } else {
                                    class41.field640[var6++] = class269.method1875(var254, (byte) 81).method825(var255, -112, var256.field2515);
                                }
                                continue;
                            }
                        } else if (var483 < 5100) {
                            if (var483 == 5000) {
                                class41.field640[var6++] = class111.field1874;
                                continue;
                            }
                            if (var483 == 5001) {
                                var6 -= 3;
                                class111.field1874 = class41.field640[var6];
                                class246.field4137 = class41.field640[var6 + 1];
                                class69.field1031 = class41.field640[var6 + 2];
                                class255.field4318.method1523(22260, 253);
                                class11.field155++;
                                class255.field4318.method463(false, class111.field1874);
                                class255.field4318.method463(false, class246.field4137);
                                class255.field4318.method463(false, class69.field1031);
                                continue;
                            }
                            if (var483 == 5002) {
                                var6 -= 2;
                                class241.field4020++;
                                var7--;
                                class255 var334 = class192.field3076[var7];
                                int var335 = class41.field640[var6];
                                int var336 = class41.field640[var6 + 1];
                                class255.field4318.method1523(22260, 6);
                                class255.field4318.method449(16711680, var334.method1764((byte) -119));
                                class255.field4318.method463(false, var335 - 1);
                                class255.field4318.method463(false, var336);
                                continue;
                            }
                            if (var483 == 5003) {
                                var6--;
                                int var337 = class41.field640[var6];
                                class255 var338 = null;
                                if (var337 < 100) {
                                    var338 = class67.field1005[var337];
                                }
                                if (var338 == null) {
                                    var338 = class59.field898;
                                }
                                class192.field3076[var7++] = var338;
                                continue;
                            }
                            if (var483 == 5004) {
                                var6--;
                                int var339 = class41.field640[var6];
                                int var340 = -1;
                                if (var339 < 100 && class67.field1005[var339] != null) {
                                    var340 = class97.field1682[var339];
                                }
                                class41.field640[var6++] = var340;
                                continue;
                            }
                            if (var483 == 5005) {
                                class41.field640[var6++] = class246.field4137;
                                continue;
                            }
                            if (var483 == 5008) {
                                var7--;
                                class255 var341 = class192.field3076[var7];
                                if (!var341.method1768(true, class279.field4778)) {
                                    if (class201.field3483 == 0 && (class2.field35 == 1 || class231.field3837 == 1)) {
                                        continue;
                                    }
                                    class307.field5240++;
                                    byte var342 = 0;
                                    class255 var343 = var341.method1777(-157);
                                    byte var344 = 0;
                                    if (var343.method1768(true, class276.field4737)) {
                                        var341 = var341.method1786(class276.field4737.method1774(-41), 9751);
                                        var342 = 0;
                                    } else if (var343.method1768(true, class254.field4287)) {
                                        var341 = var341.method1786(class254.field4287.method1774(-41), 9751);
                                        var342 = 1;
                                    } else if (var343.method1768(true, class220.field3702)) {
                                        var342 = 2;
                                        var341 = var341.method1786(class220.field3702.method1774(-41), 9751);
                                    } else if (var343.method1768(true, class37.field565)) {
                                        var342 = 3;
                                        var341 = var341.method1786(class37.field565.method1774(-41), 9751);
                                    } else if (var343.method1768(true, class106.field1775)) {
                                        var341 = var341.method1786(class106.field1775.method1774(-41), 9751);
                                        var342 = 4;
                                    } else if (var343.method1768(true, class160.field2697)) {
                                        var341 = var341.method1786(class160.field2697.method1774(-41), 9751);
                                        var342 = 5;
                                    } else if (var343.method1768(true, class68.field1022)) {
                                        var342 = 6;
                                        var341 = var341.method1786(class68.field1022.method1774(-41), 9751);
                                    } else if (var343.method1768(true, class151.field2557)) {
                                        var341 = var341.method1786(class151.field2557.method1774(-41), 9751);
                                        var342 = 7;
                                    } else if (var343.method1768(true, class285.field4908)) {
                                        var341 = var341.method1786(class285.field4908.method1774(-41), 9751);
                                        var342 = 8;
                                    } else if (var343.method1768(true, class120.field1999)) {
                                        var342 = 9;
                                        var341 = var341.method1786(class120.field1999.method1774(-41), 9751);
                                    } else if (var343.method1768(true, class124.field2056)) {
                                        var341 = var341.method1786(class124.field2056.method1774(-41), 9751);
                                        var342 = 10;
                                    } else if (var343.method1768(true, class11.field166)) {
                                        var341 = var341.method1786(class11.field166.method1774(-41), 9751);
                                        var342 = 11;
                                    } else if (class166.field2791 != 0) {
                                        if (var343.method1768(true, class276.field4741)) {
                                            var341 = var341.method1786(class276.field4741.method1774(-41), 9751);
                                            var342 = 0;
                                        } else if (var343.method1768(true, class254.field4280)) {
                                            var341 = var341.method1786(class254.field4280.method1774(-41), 9751);
                                            var342 = 1;
                                        } else if (var343.method1768(true, class220.field3705)) {
                                            var342 = 2;
                                            var341 = var341.method1786(class220.field3705.method1774(-41), 9751);
                                        } else if (var343.method1768(true, class37.field575)) {
                                            var342 = 3;
                                            var341 = var341.method1786(class37.field575.method1774(-41), 9751);
                                        } else if (var343.method1768(true, class106.field1781)) {
                                            var341 = var341.method1786(class106.field1781.method1774(-41), 9751);
                                            var342 = 4;
                                        } else if (var343.method1768(true, class160.field2704)) {
                                            var342 = 5;
                                            var341 = var341.method1786(class160.field2704.method1774(-41), 9751);
                                        } else if (var343.method1768(true, class68.field1019)) {
                                            var341 = var341.method1786(class68.field1019.method1774(-41), 9751);
                                            var342 = 6;
                                        } else if (var343.method1768(true, class151.field2563)) {
                                            var342 = 7;
                                            var341 = var341.method1786(class151.field2563.method1774(-41), 9751);
                                        } else if (var343.method1768(true, class285.field4902)) {
                                            var342 = 8;
                                            var341 = var341.method1786(class285.field4902.method1774(-41), 9751);
                                        } else if (var343.method1768(true, class120.field2006)) {
                                            var341 = var341.method1786(class120.field2006.method1774(-41), 9751);
                                            var342 = 9;
                                        } else if (var343.method1768(true, class124.field2071)) {
                                            var341 = var341.method1786(class124.field2071.method1774(-41), 9751);
                                            var342 = 10;
                                        } else if (var343.method1768(true, class11.field151)) {
                                            var342 = 11;
                                            var341 = var341.method1786(class11.field151.method1774(-41), 9751);
                                        }
                                    }
                                    class255 var345 = var341.method1777(-157);
                                    if (var345.method1768(true, class96.field1657)) {
                                        var341 = var341.method1786(class96.field1657.method1774(-41), 9751);
                                        var344 = 1;
                                    } else if (var345.method1768(true, class163.field2765)) {
                                        var344 = 2;
                                        var341 = var341.method1786(class163.field2765.method1774(-41), 9751);
                                    } else if (var345.method1768(true, class25.field395)) {
                                        var341 = var341.method1786(class25.field395.method1774(-41), 9751);
                                        var344 = 3;
                                    } else if (var345.method1768(true, class210.field3584)) {
                                        var344 = 4;
                                        var341 = var341.method1786(class210.field3584.method1774(-41), 9751);
                                    } else if (var345.method1768(true, class218.field3699)) {
                                        var341 = var341.method1786(class218.field3699.method1774(-41), 9751);
                                        var344 = 5;
                                    } else if (class166.field2791 != 0) {
                                        if (var345.method1768(true, class96.field1666)) {
                                            var341 = var341.method1786(class96.field1666.method1774(-41), 9751);
                                            var344 = 1;
                                        } else if (var345.method1768(true, class163.field2763)) {
                                            var344 = 2;
                                            var341 = var341.method1786(class163.field2763.method1774(-41), 9751);
                                        } else if (var345.method1768(true, class25.field379)) {
                                            var344 = 3;
                                            var341 = var341.method1786(class25.field379.method1774(-41), 9751);
                                        } else if (var345.method1768(true, class210.field3582)) {
                                            var344 = 4;
                                            var341 = var341.method1786(class210.field3582.method1774(-41), 9751);
                                        } else if (var345.method1768(true, class218.field3693)) {
                                            var344 = 5;
                                            var341 = var341.method1786(class218.field3693.method1774(-41), 9751);
                                        }
                                    }
                                    class255.field4318.method1523(22260, 111);
                                    class255.field4318.method463(false, 0);
                                    int var346 = class255.field4318.field1068;
                                    class255.field4318.method463(false, var342);
                                    class255.field4318.method463(false, var344);
                                    class269.method1870(-82, var341, class255.field4318);
                                    class255.field4318.method432(-4931, class255.field4318.field1068 - var346);
                                    continue;
                                }
                                class29.method159(var341, 0);
                                continue;
                            }
                            if (var483 == 5009) {
                                var7 -= 2;
                                class255 var347 = class192.field3076[var7 + 1];
                                class255 var348 = class192.field3076[var7];
                                if (class201.field3483 != 0 || class2.field35 != 1 && class231.field3837 != 1) {
                                    class255.field4318.method1523(22260, 136);
                                    class255.field4318.method463(false, 0);
                                    int var349 = class255.field4318.field1068;
                                    class255.field4318.method449(16711680, var348.method1764((byte) 66));
                                    class107.field1799++;
                                    class269.method1870(89, var347, class255.field4318);
                                    class255.field4318.method432(-4931, class255.field4318.field1068 - var349);
                                }
                                continue;
                            }
                            if (var483 == 5010) {
                                var6--;
                                int var350 = class41.field640[var6];
                                class255 var351 = null;
                                if (var350 < 100) {
                                    var351 = class216.field3666[var350];
                                }
                                if (var351 == null) {
                                    var351 = class59.field898;
                                }
                                class192.field3076[var7++] = var351;
                                continue;
                            }
                            if (var483 == 5011) {
                                class255 var352 = null;
                                var6--;
                                int var353 = class41.field640[var6];
                                if (var353 < 100) {
                                    var352 = class119.field1997[var353];
                                }
                                if (var352 == null) {
                                    var352 = class59.field898;
                                }
                                class192.field3076[var7++] = var352;
                                continue;
                            }
                            if (var483 == 5012) {
                                int var354 = -1;
                                var6--;
                                int var355 = class41.field640[var6];
                                if (var355 < 100) {
                                    var354 = class42.field660[var355];
                                }
                                class41.field640[var6++] = var354;
                                continue;
                            }
                            if (var483 == 5015) {
                                class255 var356;
                                if (class276.field4742 == null || class276.field4742.field4068 == null) {
                                    var356 = class49.field731;
                                } else {
                                    var356 = class276.field4742.method1688(-73);
                                }
                                class192.field3076[var7++] = var356;
                                continue;
                            }
                            if (var483 == 5016) {
                                class41.field640[var6++] = class69.field1031;
                                continue;
                            }
                            if (var483 == 5017) {
                                class41.field640[var6++] = class199.field3427;
                                continue;
                            }
                            if (var483 == 5050) {
                                var6--;
                                int var357 = class41.field640[var6];
                                class192.field3076[var7++] = class158.method1154((byte) -95, var357).field1032;
                                continue;
                            }
                            if (var483 == 5051) {
                                var6--;
                                int var358 = class41.field640[var6];
                                class69 var359 = class158.method1154((byte) -81, var358);
                                if (var359.field1026 == null) {
                                    class41.field640[var6++] = 0;
                                } else {
                                    class41.field640[var6++] = var359.field1026.length;
                                }
                                continue;
                            }
                            if (var483 == 5052) {
                                var6 -= 2;
                                int var360 = class41.field640[var6];
                                int var361 = class41.field640[var6 + 1];
                                class69 var362 = class158.method1154((byte) -113, var360);
                                int var363 = var362.field1026[var361];
                                class41.field640[var6++] = var363;
                                continue;
                            }
                            if (var483 == 5053) {
                                var6--;
                                int var364 = class41.field640[var6];
                                class69 var365 = class158.method1154((byte) -88, var364);
                                if (var365.field1034 == null) {
                                    class41.field640[var6++] = 0;
                                } else {
                                    class41.field640[var6++] = var365.field1034.length;
                                }
                                continue;
                            }
                            if (var483 == 5054) {
                                var6 -= 2;
                                int var366 = class41.field640[var6 + 1];
                                int var367 = class41.field640[var6];
                                class41.field640[var6++] = class158.method1154((byte) -121, var367).field1034[var366];
                                continue;
                            }
                            if (var483 == 5055) {
                                var6--;
                                int var368 = class41.field640[var6];
                                class192.field3076[var7++] = class38.method225(1, var368).method1590(0);
                                continue;
                            }
                            if (var483 == 5056) {
                                var6--;
                                int var369 = class41.field640[var6];
                                class229 var370 = class38.method225(1, var369);
                                if (var370.field3794 == null) {
                                    class41.field640[var6++] = 0;
                                } else {
                                    class41.field640[var6++] = var370.field3794.length;
                                }
                                continue;
                            }
                            if (var483 == 5057) {
                                var6 -= 2;
                                int var371 = class41.field640[var6];
                                int var372 = class41.field640[var6 + 1];
                                class41.field640[var6++] = class38.method225(1, var371).field3794[var372];
                                continue;
                            }
                            if (var483 == 5058) {
                                class248.field4162 = new class288();
                                var6--;
                                class248.field4162.field4959 = class41.field640[var6];
                                class248.field4162.field4952 = class38.method225(1, class248.field4162.field4959);
                                class248.field4162.field4958 = new int[class248.field4162.field4952.method1585(-112)];
                                continue;
                            }
                            if (var483 == 5059) {
                                class195.field3210++;
                                class255.field4318.method1523(22260, 126);
                                class255.field4318.method463(false, 0);
                                int var373 = class255.field4318.field1068;
                                class255.field4318.method463(false, 0);
                                class255.field4318.method462(class248.field4162.field4959, (byte) -61);
                                class248.field4162.field4952.method1591(class255.field4318, class248.field4162.field4958, 120);
                                class255.field4318.method432(-4931, class255.field4318.field1068 - var373);
                                continue;
                            }
                            if (var483 == 5060) {
                                class260.field4403++;
                                var7--;
                                class255 var374 = class192.field3076[var7];
                                class255.field4318.method1523(22260, 209);
                                class255.field4318.method463(false, 0);
                                int var375 = class255.field4318.field1068;
                                class255.field4318.method449(16711680, var374.method1764((byte) -124));
                                class255.field4318.method462(class248.field4162.field4959, (byte) -61);
                                class248.field4162.field4952.method1591(class255.field4318, class248.field4162.field4958, 122);
                                class255.field4318.method432(-4931, class255.field4318.field1068 - var375);
                                continue;
                            }
                            if (var483 == 5061) {
                                class255.field4318.method1523(22260, 126);
                                class195.field3210++;
                                class255.field4318.method463(false, 0);
                                int var376 = class255.field4318.field1068;
                                class255.field4318.method463(false, 1);
                                class255.field4318.method462(class248.field4162.field4959, (byte) -61);
                                class248.field4162.field4952.method1591(class255.field4318, class248.field4162.field4958, 126);
                                class255.field4318.method432(-4931, class255.field4318.field1068 - var376);
                                continue;
                            }
                            if (var483 == 5062) {
                                var6 -= 2;
                                int var377 = class41.field640[var6];
                                int var378 = class41.field640[var6 + 1];
                                class41.field640[var6++] = class158.method1154((byte) -127, var377).field1025[var378];
                                continue;
                            }
                            if (var483 == 5063) {
                                var6 -= 2;
                                int var379 = class41.field640[var6];
                                int var380 = class41.field640[var6 + 1];
                                class41.field640[var6++] = class158.method1154((byte) -76, var379).field1039[var380];
                                continue;
                            }
                            if (var483 == 5064) {
                                var6 -= 2;
                                int var381 = class41.field640[var6];
                                int var382 = class41.field640[var6 + 1];
                                if (var382 == -1) {
                                    class41.field640[var6++] = -1;
                                } else {
                                    class41.field640[var6++] = class158.method1154((byte) -90, var381).method417((byte) 80, var382);
                                }
                                continue;
                            }
                            if (var483 == 5065) {
                                var6 -= 2;
                                int var383 = class41.field640[var6];
                                int var384 = class41.field640[var6 + 1];
                                if (var384 == -1) {
                                    class41.field640[var6++] = -1;
                                } else {
                                    class41.field640[var6++] = class158.method1154((byte) -106, var383).method421(16028, var384);
                                }
                                continue;
                            }
                            if (var483 == 5066) {
                                var6--;
                                int var385 = class41.field640[var6];
                                class41.field640[var6++] = class38.method225(1, var385).method1585(-96);
                                continue;
                            }
                            if (var483 == 5067) {
                                var6 -= 2;
                                int var386 = class41.field640[var6];
                                int var387 = class41.field640[var6 + 1];
                                int var388 = class38.method225(1, var386).method1588(-74, var387);
                                class41.field640[var6++] = var388;
                                continue;
                            }
                            if (var483 == 5068) {
                                var6 -= 2;
                                int var389 = class41.field640[var6 + 1];
                                int var390 = class41.field640[var6];
                                class248.field4162.field4958[var390] = var389;
                                continue;
                            }
                            if (var483 == 5069) {
                                var6 -= 2;
                                int var391 = class41.field640[var6];
                                int var392 = class41.field640[var6 + 1];
                                class248.field4162.field4958[var391] = var392;
                                continue;
                            }
                            if (var483 == 5070) {
                                var6 -= 3;
                                int var393 = class41.field640[var6];
                                int var394 = class41.field640[var6 + 1];
                                int var395 = class41.field640[var6 + 2];
                                class229 var396 = class38.method225(1, var393);
                                if (var396.method1588(-53, var394) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class41.field640[var6++] = var396.method1589(var395, 0, var394);
                                continue;
                            }
                        } else if (var483 < 5200) {
                            if (var483 == 5100) {
                                if (class128.field2114[86]) {
                                    class41.field640[var6++] = 1;
                                } else {
                                    class41.field640[var6++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5101) {
                                if (class128.field2114[82]) {
                                    class41.field640[var6++] = 1;
                                } else {
                                    class41.field640[var6++] = 0;
                                }
                                continue;
                            }
                            if (var483 == 5102) {
                                if (class128.field2114[81]) {
                                    class41.field640[var6++] = 1;
                                } else {
                                    class41.field640[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 5300) {
                            if (var483 == 5200) {
                                var6--;
                                class59.method360(class41.field640[var6], true);
                                continue;
                            }
                            if (var483 == 5201) {
                                class41.field640[var6++] = class260.method1808(15535);
                                continue;
                            }
                            if (var483 == 5202) {
                                var6--;
                                class54.method340(-102, class41.field640[var6]);
                                continue;
                            }
                            if (var483 == 5203) {
                                var7--;
                                class53.method332(class192.field3076[var7], -16);
                                continue;
                            }
                            if (var483 == 5204) {
                                class192.field3076[var7 - 1] = class162.method1169(0, class192.field3076[var7 - 1]);
                                continue;
                            }
                            if (var483 == 5205) {
                                var7--;
                                class205.method1486((byte) -50, class192.field3076[var7]);
                                continue;
                            }
                            if (var483 == 5206) {
                                var6--;
                                int var257 = class41.field640[var6];
                                class91 var258 = class10.method51(32, var257 >> 14 & 0x3FFF, var257 & 0x3FFF);
                                if (var258 == null) {
                                    class192.field3076[var7++] = class59.field898;
                                } else {
                                    class192.field3076[var7++] = var258.field1568;
                                }
                                continue;
                            }
                            if (var483 == 5207) {
                                var7--;
                                class91 var259 = class201.method1463(class192.field3076[var7], (byte) -26);
                                if (var259 != null && var259.field1564 != null) {
                                    class192.field3076[var7++] = var259.field1564;
                                    continue;
                                }
                                class192.field3076[var7++] = class59.field898;
                                continue;
                            }
                        } else if (var483 < 5400) {
                            if (var483 == 5300) {
                                var6 -= 2;
                                int var321 = class41.field640[var6 + 1];
                                int var322 = class41.field640[var6];
                                class149.method1105(false, var322, var321, false, 3);
                                class41.field640[var6++] = class307.field5221 == null ? 0 : 1;
                                continue;
                            }
                            if (var483 == 5301) {
                                if (class307.field5221 != null) {
                                    class149.method1105(false, -1, -1, false, class289.field4979);
                                }
                                continue;
                            }
                            if (var483 == 5302) {
                                class248[] var323 = class173.method1229((byte) 100);
                                class41.field640[var6++] = var323.length;
                                continue;
                            }
                            if (var483 == 5303) {
                                var6--;
                                int var324 = class41.field640[var6];
                                class248[] var325 = class173.method1229((byte) -126);
                                class41.field640[var6++] = var325[var324].field4161;
                                class41.field640[var6++] = var325[var324].field4150;
                                continue;
                            }
                            if (var483 == 5305) {
                                int var326 = class264.field4469;
                                int var327 = class9.field133;
                                int var328 = -1;
                                class248[] var329 = class173.method1229((byte) -102);
                                for (int var330 = 0; var330 < var329.length; var330++) {
                                    class248 var331 = var329[var330];
                                    if (var331.field4161 == var326 && var331.field4150 == var327) {
                                        var328 = var330;
                                        break;
                                    }
                                }
                                class41.field640[var6++] = var328;
                                continue;
                            }
                            if (var483 == 5306) {
                                class41.field640[var6++] = class261.method1820((byte) 89);
                                continue;
                            }
                            if (var483 == 5307) {
                                var6--;
                                int var332 = class41.field640[var6];
                                if (var332 < 0 || var332 > 2) {
                                    var332 = 0;
                                }
                                class149.method1105(false, -1, -1, false, var332);
                                continue;
                            }
                            if (var483 == 5308) {
                                class41.field640[var6++] = class289.field4979;
                                continue;
                            }
                            if (var483 == 5309) {
                                var6--;
                                int var333 = class41.field640[var6];
                                if (var333 < 0 || var333 > 2) {
                                    var333 = 0;
                                }
                                class289.field4979 = var333;
                                class174.method1235(100, class221.field3728);
                                continue;
                            }
                        } else if (var483 < 5500) {
                            if (var483 == 5400) {
                                var7 -= 2;
                                class58.field886++;
                                class255 var260 = class192.field3076[var7];
                                class255 var261 = class192.field3076[var7 + 1];
                                var6--;
                                int var262 = class41.field640[var6];
                                class255.field4318.method1523(22260, 146);
                                class255.field4318.method463(false, (class271.method1891(var260, 109) + class271.method1891(var261, -65)) + 1);
                                class255.field4318.method483(-99755000, var260);
                                class255.field4318.method483(-99755000, var261);
                                class255.field4318.method463(false, var262);
                                continue;
                            }
                            if (var483 == 5401) {
                                var6 -= 2;
                                class150.field2544[class41.field640[var6]] = (short) class289.method2044(-120, class41.field640[var6 + 1]);
                                class256.method1793(6793);
                                class197.method1421(22159);
                                class205.method1490((byte) 102);
                                class17.method83(-2);
                                class282.method1994(-1);
                                continue;
                            }
                            if (var483 == 5405) {
                                var6 -= 2;
                                int var263 = class41.field640[var6];
                                int var264 = class41.field640[var6 + 1];
                                if (var263 >= 0 && var263 < 2) {
                                    class277.field4763[var263] = new int[var264 << 1][4];
                                }
                                continue;
                            }
                            if (var483 == 5406) {
                                var6 -= 7;
                                int var265 = class41.field640[var6];
                                int var266 = class41.field640[var6 + 1] << 1;
                                int var267 = class41.field640[var6 + 2];
                                int var268 = class41.field640[var6 + 3];
                                int var269 = class41.field640[var6 + 4];
                                int var270 = class41.field640[var6 + 6];
                                int var271 = class41.field640[var6 + 5];
                                if (var265 >= 0 && var265 < 2 && class277.field4763[var265] != null && var266 >= 0 && var266 < class277.field4763[var265].length) {
                                    class277.field4763[var265][var266] = new int[] { (class154.method1134(var267, 268421006) >> 14) * 128, var268, class154.method1134(16383, var267) * 128, var270 };
                                    class277.field4763[var265][var266 + 1] = new int[] { class154.method1134(var269 >> 14, 16383) * 128, var271, class154.method1134(var269, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var483 == 5407) {
                                var6--;
                                int var272 = class277.field4763[class41.field640[var6]].length >> 1;
                                class41.field640[var6++] = var272;
                                continue;
                            }
                            if (var483 == 5411) {
                                if (class307.field5221 != null) {
                                    class149.method1105(false, -1, -1, false, class289.field4979);
                                }
                                if (class37.field561 == null) {
                                    class130.method958(false, (byte) -118, class2.method7(-114));
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var483 == 5419) {
                                class255 var273 = class59.field898;
                                if (class152.field2575 != null) {
                                    var273 = class275.method1928((byte) -18, class152.field2575.field2831);
                                    try {
                                        if (class152.field2575.field2832 != null) {
                                            byte[] var274 = ((String) class152.field2575.field2832).getBytes("ISO-8859-1");
                                            var273 = class33.method185(var274, var274.length, 0, false);
                                        }
                                    } catch (UnsupportedEncodingException var481) {
                                    }
                                }
                                class192.field3076[var7++] = var273;
                                continue;
                            }
                            if (var483 == 5420) {
                                class41.field640[var6++] = class40.field624 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 5421) {
                                if (class307.field5221 != null) {
                                    class149.method1105(false, -1, -1, false, class289.field4979);
                                }
                                var7--;
                                class255 var276 = class192.field3076[var7];
                                var6--;
                                boolean var277 = class41.field640[var6] == 1;
                                class255 var278 = class3.method14(new class255[] { class2.method7(-116), var276 }, (byte) -81);
                                if (class37.field561 != null || var277 && class40.field624 != 3 && class40.field619.startsWith("win") && !class137.field2292) {
                                    class147.field2494 = var278;
                                    class81.field1317 = var277;
                                    class235.field3867 = class221.field3728.method245(new String(var278.method1742((byte) -28), "ISO-8859-1"), false);
                                    continue;
                                }
                                class130.method958(var277, (byte) 127, var278);
                                continue;
                            }
                            if (var483 == 5422) {
                                var7 -= 2;
                                class255 var279 = class192.field3076[var7 + 1];
                                var6--;
                                int var280 = class41.field640[var6];
                                class255 var281 = class192.field3076[var7];
                                if (var281.method1774(-41) > 0) {
                                    if (class102.field1718 == null) {
                                        class102.field1718 = new class255[class49.field741[class245.field4123]];
                                    }
                                    class102.field1718[var280] = var281;
                                }
                                if (var279.method1774(-41) > 0) {
                                    if (class85.field1379 == null) {
                                        class85.field1379 = new class255[class49.field741[class245.field4123]];
                                    }
                                    class85.field1379[var280] = var279;
                                }
                                continue;
                            }
                            if (var483 == 5423) {
                                var7--;
                                class192.field3076[var7].method1749(0);
                                continue;
                            }
                        } else if (var483 < 5600) {
                            if (var483 == 5500) {
                                var6 -= 4;
                                int var282 = class41.field640[var6 + 3];
                                int var283 = class41.field640[var6 + 1];
                                int var284 = class41.field640[var6];
                                int var285 = class41.field640[var6 + 2];
                                class280.method1949((var284 >> 14 & 0x3FFF) - class197.field3355, (byte) -124, (var284 & 0x3FFF) - class268.field4615, var282, var283, var285, false);
                                continue;
                            }
                            if (var483 == 5501) {
                                var6 -= 4;
                                int var286 = class41.field640[var6];
                                int var287 = class41.field640[var6 + 3];
                                int var288 = class41.field640[var6 + 2];
                                int var289 = class41.field640[var6 + 1];
                                class155.method1147(((var286 & 0xFFFE3A6) >> 14) - class197.field3355, var289, (var286 & 0x3FFF) - class268.field4615, var288, var287, (byte) 16);
                                continue;
                            }
                            if (var483 == 5502) {
                                var6 -= 6;
                                int var290 = class41.field640[var6];
                                if (var290 >= 2) {
                                    throw new RuntimeException();
                                }
                                class68.field1017 = var290;
                                int var291 = class41.field640[var6 + 1];
                                if ((class277.field4763[class68.field1017].length >> 1) <= (var291 + 1)) {
                                    throw new RuntimeException();
                                }
                                class194.field3205 = var291;
                                class125.field2075 = 0;
                                class185.field2984 = class41.field640[var6 + 2];
                                class43.field670 = class41.field640[var6 + 3];
                                int var292 = class41.field640[var6 + 4];
                                if (var292 >= 2) {
                                    throw new RuntimeException();
                                }
                                class17.field258 = var292;
                                int var293 = class41.field640[var6 + 5];
                                if (var293 + 1 >= class277.field4763[class17.field258].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class218.field3689 = var293;
                                class3.field50 = 3;
                                continue;
                            }
                            if (var483 == 5503) {
                                class271.method1880((byte) 123);
                                continue;
                            }
                            if (var483 == 5504) {
                                var6 -= 2;
                                class271.field4652 = class41.field640[var6];
                                class76.field1253 = class41.field640[var6 + 1];
                                class148.method1096((byte) -100);
                                continue;
                            }
                            if (var483 == 5505) {
                                class41.field640[var6++] = class271.field4652;
                                continue;
                            }
                            if (var483 == 5506) {
                                class41.field640[var6++] = class76.field1253;
                                continue;
                            }
                        } else if (var483 < 5700) {
                            if (var483 == 5600) {
                                var7 -= 2;
                                class255 var294 = class192.field3076[var7];
                                class255 var295 = class192.field3076[var7 + 1];
                                var6--;
                                int var296 = class41.field640[var6];
                                if (class18.field281 == 10 && class114.field1948 == 0 && class160.field2702 == 0 && class88.field1433 == 0 && class88.field1432 == 0) {
                                    class135.method1012(var296, var295, (byte) -86, var294);
                                }
                                continue;
                            }
                            if (var483 == 5601) {
                                class173.method1230(6);
                                continue;
                            }
                            if (var483 == 5602) {
                                if (class160.field2702 == 0) {
                                    class284.field4886 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5603) {
                                var6 -= 4;
                                if (class18.field281 == 10 && class114.field1948 == 0 && class160.field2702 == 0 && class88.field1433 == 0 && class88.field1432 == 0) {
                                    class88.method640(class41.field640[var6], class41.field640[var6 + 2], 23929, class41.field640[var6 + 1], class41.field640[var6 + 3]);
                                }
                                continue;
                            }
                            if (var483 == 5604) {
                                var7--;
                                if (class18.field281 == 10 && class114.field1948 == 0 && class160.field2702 == 0 && class88.field1433 == 0 && class88.field1432 == 0) {
                                    class96.method754(-16222, class192.field3076[var7].method1764((byte) 55));
                                }
                                continue;
                            }
                            if (var483 == 5605) {
                                var6 -= 4;
                                var7 -= 2;
                                if (class18.field281 == 10 && class114.field1948 == 0 && class160.field2702 == 0 && class88.field1433 == 0 && class88.field1432 == 0) {
                                    class309.method2143(class41.field640[var6 + 1], class41.field640[var6 + 2], 845398476, class41.field640[var6 + 3], class192.field3076[var7 + 1], class192.field3076[var7].method1764((byte) 34), class41.field640[var6]);
                                }
                                continue;
                            }
                            if (var483 == 5606) {
                                if (class88.field1433 == 0) {
                                    class46.field693 = -2;
                                }
                                continue;
                            }
                            if (var483 == 5607) {
                                class41.field640[var6++] = class284.field4886;
                                continue;
                            }
                            if (var483 == 5608) {
                                class41.field640[var6++] = class285.field4896;
                                continue;
                            }
                            if (var483 == 5609) {
                                class41.field640[var6++] = class46.field693;
                                continue;
                            }
                            if (var483 == 5610) {
                                for (int var297 = 0; var297 < 5; var297++) {
                                    class192.field3076[var7++] = var297 >= class34.field549.length ? class59.field898 : class34.field549[var297].method1787(true);
                                }
                                class34.field549 = null;
                                continue;
                            }
                            if (var483 == 5611) {
                                class41.field640[var6++] = client.field4040;
                                continue;
                            }
                        } else if (var483 < 6100) {
                            if (var483 == 6001) {
                                var6--;
                                int var298 = class41.field640[var6];
                                if (var298 < 1) {
                                    var298 = 1;
                                }
                                if (var298 > 4) {
                                    var298 = 4;
                                }
                                class79.field1291 = var298;
                                if (!class281.field4827 || !class114.field1921) {
                                    if (class79.field1291 == 1) {
                                        class283.method2008(0.9F);
                                    }
                                    if (class79.field1291 == 2) {
                                        class283.method2008(0.8F);
                                    }
                                    if (class79.field1291 == 3) {
                                        class283.method2008(0.7F);
                                    }
                                    if (class79.field1291 == 4) {
                                        class283.method2008(0.6F);
                                    }
                                }
                                if (class281.field4827) {
                                    class185.method1294(0);
                                    if (!class114.field1921) {
                                        class70.method440(255);
                                    }
                                }
                                class197.method1421(22159);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6002) {
                                var6--;
                                class20.method110(true, class41.field640[var6] == 1);
                                class58.method354(284750128);
                                class70.method440(255);
                                class3.method18(-981);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6003) {
                                var6--;
                                class136.field2259 = class41.field640[var6] == 1;
                                class3.method18(-981);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6005) {
                                var6--;
                                class229.field3788 = class41.field640[var6] == 1;
                                class70.method440(255);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6006) {
                                var6--;
                                class298.field5094 = class41.field640[var6] == 1;
                                ((class132) class283.field4866).method988(!class298.field5094, (byte) 64);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6007) {
                                var6--;
                                class314.field5328 = class41.field640[var6] == 1;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6008) {
                                var6--;
                                class143.field2392 = class41.field640[var6] == 1;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6009) {
                                var6--;
                                class136.field2262 = class41.field640[var6] == 1;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6010) {
                                var6--;
                                class190.field3048 = class41.field640[var6] == 1;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6011) {
                                var6--;
                                int var299 = class41.field640[var6];
                                if (var299 < 0 || var299 > 2) {
                                    var299 = 0;
                                }
                                class13.field176 = var299;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6012) {
                                if (class281.field4827) {
                                    class256.method1795(0, 0, -536);
                                }
                                var6--;
                                class114.field1921 = class41.field640[var6] == 1;
                                if (class281.field4827 && class114.field1921) {
                                    class283.method2008(0.7F);
                                } else {
                                    if (class79.field1291 == 1) {
                                        class283.method2008(0.9F);
                                    }
                                    if (class79.field1291 == 2) {
                                        class283.method2008(0.8F);
                                    }
                                    if (class79.field1291 == 3) {
                                        class283.method2008(0.7F);
                                    }
                                    if (class79.field1291 == 4) {
                                        class283.method2008(0.6F);
                                    }
                                }
                                class70.method440(255);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6014) {
                                var6--;
                                class258.field4390 = class41.field640[var6] == 1;
                                if (class281.field4827) {
                                    class70.method440(255);
                                }
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6015) {
                                var6--;
                                class304.field5199 = class41.field640[var6] == 1;
                                if (class281.field4827) {
                                    class185.method1294(0);
                                }
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6016) {
                                var6--;
                                int var300 = class41.field640[var6];
                                if (class281.field4827) {
                                    class37.field570 = true;
                                }
                                if (var300 < 0 || var300 > 2) {
                                    var300 = 0;
                                }
                                class250.field4222 = var300;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6017) {
                                var6--;
                                class150.field2546 = class41.field640[var6] == 1;
                                class29.method164((byte) 30);
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6018) {
                                var6--;
                                int var301 = class41.field640[var6];
                                if (var301 < 0) {
                                    var301 = 0;
                                }
                                if (var301 > 127) {
                                    var301 = 127;
                                }
                                class25.field392 = var301;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6019) {
                                var6--;
                                int var302 = class41.field640[var6];
                                if (var302 < 0) {
                                    var302 = 0;
                                }
                                if (var302 > 255) {
                                    var302 = 255;
                                }
                                if (class184.field2963 != var302) {
                                    if (class184.field2963 == 0 && class124.field2070 != -1) {
                                        class197.method1420(class143.field2379, var302, false, class124.field2070, (byte) 50, 0);
                                        class148.field2505 = false;
                                    } else if (var302 == 0) {
                                        class91.method682((byte) 97);
                                        class148.field2505 = false;
                                    } else {
                                        class289.method2047(var302, 109);
                                    }
                                    class184.field2963 = var302;
                                }
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6020) {
                                var6--;
                                int var303 = class41.field640[var6];
                                if (var303 < 0) {
                                    var303 = 0;
                                }
                                if (var303 > 127) {
                                    var303 = 127;
                                }
                                class301.field5169 = var303;
                                class174.method1235(100, class221.field3728);
                                class43.field674 = false;
                                continue;
                            }
                            if (var483 == 6021) {
                                var6--;
                                class109.field1834 = class41.field640[var6] == 1;
                                class3.method18(-981);
                                continue;
                            }
                        } else if (var483 < 6200) {
                            if (var483 == 6101) {
                                class41.field640[var6++] = class79.field1291;
                                continue;
                            }
                            if (var483 == 6102) {
                                class41.field640[var6++] = class96.method761(true) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6103) {
                                class41.field640[var6++] = class136.field2259 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6105) {
                                class41.field640[var6++] = class229.field3788 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6106) {
                                class41.field640[var6++] = class298.field5094 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6107) {
                                class41.field640[var6++] = class314.field5328 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6108) {
                                class41.field640[var6++] = class143.field2392 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6109) {
                                class41.field640[var6++] = class136.field2262 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6110) {
                                class41.field640[var6++] = class190.field3048 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6111) {
                                class41.field640[var6++] = class13.field176;
                                continue;
                            }
                            if (var483 == 6112) {
                                class41.field640[var6++] = class114.field1921 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6114) {
                                class41.field640[var6++] = class258.field4390 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6115) {
                                class41.field640[var6++] = class304.field5199 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6116) {
                                class41.field640[var6++] = class250.field4222;
                                continue;
                            }
                            if (var483 == 6117) {
                                class41.field640[var6++] = class150.field2546 ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6118) {
                                class41.field640[var6++] = class25.field392;
                                continue;
                            }
                            if (var483 == 6119) {
                                class41.field640[var6++] = class184.field2963;
                                continue;
                            }
                            if (var483 == 6120) {
                                class41.field640[var6++] = class301.field5169;
                                continue;
                            }
                            if (var483 == 6121) {
                                if (class281.field4827) {
                                    class41.field640[var6++] = class281.field4819 ? 1 : 0;
                                } else {
                                    class41.field640[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var483 < 6300) {
                            if (var483 == 6200) {
                                var6 -= 2;
                                class114.field1930 = (short) class41.field640[var6];
                                if (class114.field1930 <= 0) {
                                    class114.field1930 = 256;
                                }
                                class258.field4385 = (short) class41.field640[var6 + 1];
                                if (class258.field4385 <= 0) {
                                    class258.field4385 = 205;
                                }
                                continue;
                            }
                            if (var483 == 6201) {
                                var6 -= 2;
                                class187.field3028 = (short) class41.field640[var6];
                                if (class187.field3028 <= 0) {
                                    class187.field3028 = 256;
                                }
                                class129.field2125 = (short) class41.field640[var6 + 1];
                                if (class129.field2125 <= 0) {
                                    class129.field2125 = 320;
                                }
                                continue;
                            }
                            if (var483 == 6202) {
                                var6 -= 4;
                                class119.field1986 = (short) class41.field640[var6];
                                if (class119.field1986 <= 0) {
                                    class119.field1986 = 1;
                                }
                                class97.field1679 = (short) class41.field640[var6 + 1];
                                if (class97.field1679 <= 0) {
                                    class97.field1679 = 32767;
                                } else if (class97.field1679 < class119.field1986) {
                                    class97.field1679 = class119.field1986;
                                }
                                class275.field4723 = (short) class41.field640[var6 + 2];
                                if (class275.field4723 <= 0) {
                                    class275.field4723 = 1;
                                }
                                class15.field222 = (short) class41.field640[var6 + 3];
                                if (class15.field222 <= 0) {
                                    class15.field222 = 32767;
                                } else if (class15.field222 < class275.field4723) {
                                    class15.field222 = class275.field4723;
                                }
                                continue;
                            }
                            if (var483 == 6203) {
                                class315.method2173(0, class288.field4961.field3294, false, (byte) -44, class288.field4961.field3253, 0);
                                class41.field640[var6++] = class153.field2597;
                                class41.field640[var6++] = class34.field547;
                                continue;
                            }
                            if (var483 == 6204) {
                                class41.field640[var6++] = class187.field3028;
                                class41.field640[var6++] = class129.field2125;
                                continue;
                            }
                            if (var483 == 6205) {
                                class41.field640[var6++] = class114.field1930;
                                class41.field640[var6++] = class258.field4385;
                                continue;
                            }
                        } else if (var483 < 6400) {
                            if (var483 == 6300) {
                                class41.field640[var6++] = (int) (class218.method1541(35) / 60000L);
                                continue;
                            }
                            if (var483 == 6301) {
                                class41.field640[var6++] = (int) (class218.method1541(124) / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6302) {
                                var6 -= 3;
                                int var316 = class41.field640[var6];
                                int var317 = class41.field640[var6 + 1];
                                int var318 = class41.field640[var6 + 2];
                                class100.field1698.clear();
                                class100.field1698.set(11, 12);
                                class100.field1698.set(var318, var317, var316);
                                class41.field640[var6++] = (int) (class100.field1698.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var483 == 6303) {
                                class100.field1698.clear();
                                class100.field1698.setTime(new Date(class218.method1541(-73)));
                                class41.field640[var6++] = class100.field1698.get(1);
                                continue;
                            }
                            if (var483 == 6304) {
                                var6--;
                                int var319 = class41.field640[var6];
                                boolean var320 = true;
                                if (var319 < 0) {
                                    var320 = ((var319 + 1) % 4) == 0;
                                } else if (var319 < 1582) {
                                    var320 = (var319 % 4) == 0;
                                } else if ((var319 % 4) != 0) {
                                    var320 = false;
                                } else if ((var319 % 100) != 0) {
                                    var320 = true;
                                } else if ((var319 % 400) != 0) {
                                    var320 = false;
                                }
                                class41.field640[var6++] = var320 ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6500) {
                            if (var483 == 6405) {
                                class41.field640[var6++] = class120.method893((byte) 110) ? 1 : 0;
                                continue;
                            }
                            if (var483 == 6406) {
                                class41.field640[var6++] = class30.method172(-27667) ? 1 : 0;
                                continue;
                            }
                        } else if (var483 < 6600) {
                            if (var483 == 6500) {
                                if (class18.field281 == 10 && class114.field1948 == 0 && class160.field2702 == 0 && class88.field1433 == 0) {
                                    class41.field640[var6++] = class76.method538((byte) 127) ? 1 : 0;
                                    continue;
                                }
                                class41.field640[var6++] = 1;
                                continue;
                            }
                            if (var483 == 6501) {
                                class238 var304 = class50.method295(0);
                                if (var304 == null) {
                                    class41.field640[var6++] = -1;
                                    class41.field640[var6++] = 0;
                                    class192.field3076[var7++] = class59.field898;
                                    class41.field640[var6++] = 0;
                                    class192.field3076[var7++] = class59.field898;
                                    class41.field640[var6++] = 0;
                                } else {
                                    class41.field640[var6++] = var304.field3951;
                                    class41.field640[var6++] = var304.field378;
                                    class192.field3076[var7++] = var304.field3948;
                                    class282 var305 = var304.method1645(0);
                                    class41.field640[var6++] = var305.field4848;
                                    class192.field3076[var7++] = var305.field4854;
                                    class41.field640[var6++] = var304.field359;
                                }
                                continue;
                            }
                            if (var483 == 6502) {
                                class238 var306 = class97.method766(4);
                                if (var306 == null) {
                                    class41.field640[var6++] = -1;
                                    class41.field640[var6++] = 0;
                                    class192.field3076[var7++] = class59.field898;
                                    class41.field640[var6++] = 0;
                                    class192.field3076[var7++] = class59.field898;
                                    class41.field640[var6++] = 0;
                                } else {
                                    class41.field640[var6++] = var306.field3951;
                                    class41.field640[var6++] = var306.field378;
                                    class192.field3076[var7++] = var306.field3948;
                                    class282 var307 = var306.method1645(0);
                                    class41.field640[var6++] = var307.field4848;
                                    class192.field3076[var7++] = var307.field4854;
                                    class41.field640[var6++] = var306.field359;
                                }
                                continue;
                            }
                            if (var483 == 6503) {
                                var6--;
                                int var308 = class41.field640[var6];
                                if (class18.field281 == 10 && class114.field1948 == 0 && class160.field2702 == 0 && class88.field1433 == 0) {
                                    class41.field640[var6++] = class90.method674(-101, var308) ? 1 : 0;
                                    continue;
                                }
                                class41.field640[var6++] = 0;
                                continue;
                            }
                            if (var483 == 6504) {
                                var6--;
                                class293.field5023 = class41.field640[var6];
                                class174.method1235(100, class221.field3728);
                                continue;
                            }
                            if (var483 == 6505) {
                                class41.field640[var6++] = class293.field5023;
                                continue;
                            }
                            if (var483 == 6506) {
                                var6--;
                                int var309 = class41.field640[var6];
                                class238 var310 = class262.method1825((byte) -70, var309);
                                if (var310 == null) {
                                    class41.field640[var6++] = -1;
                                    class192.field3076[var7++] = class59.field898;
                                    class41.field640[var6++] = 0;
                                    class192.field3076[var7++] = class59.field898;
                                    class41.field640[var6++] = 0;
                                } else {
                                    class41.field640[var6++] = var310.field378;
                                    class192.field3076[var7++] = var310.field3948;
                                    class282 var311 = var310.method1645(0);
                                    class41.field640[var6++] = var311.field4848;
                                    class192.field3076[var7++] = var311.field4854;
                                    class41.field640[var6++] = var310.field359;
                                }
                                continue;
                            }
                            if (var483 == 6507) {
                                var6 -= 4;
                                int var312 = class41.field640[var6];
                                boolean var313 = class41.field640[var6 + 1] == 1;
                                int var314 = class41.field640[var6 + 2];
                                boolean var315 = class41.field640[var6 + 3] == 1;
                                class190.method1310(0, var313, var315, var312, var314);
                                continue;
                            }
                        }
                    } else if (var483 == 4400) {
                        var6 -= 2;
                        int var397 = class41.field640[var6];
                        int var398 = class41.field640[var6 + 1];
                        class149 var399 = class106.method820(var398, (byte) 102);
                        if (var399.method1101((byte) -11)) {
                            class192.field3076[var7++] = class289.method2046(-12453, var397).method1074(var398, 115, var399.field2519);
                        } else {
                            class41.field640[var6++] = class289.method2046(-12453, var397).method1086(var399.field2515, -1, var398);
                        }
                        continue;
                    }
                } else {
                    class197 var62;
                    if (var483 >= 2000) {
                        var483 -= 1000;
                        var6--;
                        var62 = class58.method353(class41.field640[var6], (byte) 35);
                    } else {
                        var62 = var46 ? class218.field3690 : class43.field680;
                    }
                    if (var483 == 1300) {
                        var6--;
                        int var63 = class41.field640[var6] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var7--;
                            var62.method1411(var63, class192.field3076[var7], 1);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var483 == 1301) {
                        var6 -= 2;
                        int var64 = class41.field640[var6];
                        int var65 = class41.field640[var6 + 1];
                        var62.field3271 = class91.method685(var64, (byte) -73, var65);
                        continue;
                    }
                    if (var483 == 1302) {
                        var6--;
                        var62.field3363 = class41.field640[var6] == 1;
                        continue;
                    }
                    if (var483 == 1303) {
                        var6--;
                        var62.field3405 = class41.field640[var6];
                        continue;
                    }
                    if (var483 == 1304) {
                        var6--;
                        var62.field3395 = class41.field640[var6];
                        continue;
                    }
                    if (var483 == 1305) {
                        var7--;
                        var62.field3335 = class192.field3076[var7];
                        continue;
                    }
                    if (var483 == 1306) {
                        var7--;
                        var62.field3414 = class192.field3076[var7];
                        continue;
                    }
                    if (var483 == 1307) {
                        var62.field3300 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var482) {
            if (var5.field5314 == null) {
                if (class53.field831 != 0) {
                    class260.method1807(1, class59.field898, class264.field4458, 0);
                }
                class195.method1393(var482, 0, "CS2 - scr:" + var5.field3568 + " op:" + var11);
            } else {
                class255 var478 = class285.method2025(30, (byte) 124);
                var478.method1765(class137.field2294, 55).method1765(var5.field5314, 55);
                for (int var479 = class132.field2182 - 1; var479 >= 0; var479--) {
                    var478.method1765(class235.field3868, 55).method1765(class116.field1978[var479].field160.field5314, 55);
                }
                if (var11 == 40) {
                    int var480 = var8[var9];
                    var478.method1765(class90.field1542, 55).method1765(class215.method1532(var480, true), 55);
                }
                if (class53.field831 != 0) {
                    class260.method1807(1, class59.field898, class3.method14(new class255[] { class3.field48, var5.field5314 }, (byte) -68), 0);
                }
                class195.method1393(var482, 0, "CS2 - scr:" + var5.field3568 + " op:" + var11 + new String(var478.method1742((byte) -28)));
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BZ[Lhc;II[B)V", line = 5899)
    public static final void method1702(byte arg0, boolean arg1, class163[] arg2, int arg3, int arg4, byte[] arg5) {
        field4148++;
        class70 var6 = new class70(arg5);
        if (arg0 < 13) {
            return;
        }
        int var7 = -1;
        while (true) {
            int var8 = var6.method457(true);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method486((byte) 101);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var6.method481(0);
                int var14 = var13 >> 2;
                int var15 = var9 >> 12;
                int var16 = arg3 + var11;
                int var17 = var13 & 0x3;
                int var18 = var12 + arg4;
                if (var16 > 0 && var18 > 0 && var16 < 103 && var18 < 103) {
                    class163 var19 = null;
                    if (!arg1) {
                        int var20 = var15;
                        if ((class166.field2800[1][var16][var18] & 0x2) == 2) {
                            var20 = var15 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class44.method268(arg1, var15, var19, var17, var14, var15, var7, 1, var16, var18, !arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lve;I)Z", line = 5975)
    public static final boolean method1703(class255 arg0, int arg1) {
        field4139++;
        if (arg0 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 15408) {
            field4147 = (int[]) null;
        }
        while (class33.field529 > var2) {
            if (arg0.method1779(98, class32.field519[var2])) {
                return true;
            }
            var2++;
        }
        if (arg0.method1779(-72, class276.field4742.field4068)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 6007)
    public static final void method1704(int arg0, int arg1) {
        class284.field4892 = arg1;
        class85.method595(3, 0);
        class85.method595(4, arg0 ^ arg0);
        field4144++;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZIIIIII)V", line = 6017)
    public static final void method1705(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4141++;
        if (!arg1) {
            method1701(54, 12, (class26) null);
        }
        if (arg2 < 128 || arg0 < 128 || arg2 > 13056 || arg0 > 13056) {
            class152.field2573 = -1;
            class236.field3874 = -1;
            return;
        }
        int var8 = class113.method861((byte) -80, arg2, arg0, client.field4039) - arg4;
        int var9 = arg0 - class256.field4373;
        int var10 = var8 - class153.field2599;
        int var11 = class283.field4877[class260.field4409];
        int var12 = arg2 - class221.field3723;
        int var13 = class283.field4870[class305.field5216];
        int var14 = class283.field4877[class305.field5216];
        int var15 = class283.field4870[class260.field4409];
        int var16 = var9 * var14 + var12 * var13 >> 16;
        int var17 = var9 * var13 - var12 * var14 >> 16;
        int var19 = var10 * var15 - (var11 * var17) >> 16;
        int var20 = var10 * var11 + (var15 * var17) >> 16;
        if (var20 < 50) {
            class236.field3874 = -1;
            class152.field2573 = -1;
        } else if (class281.field4827) {
            int var22 = arg7 * 512 >> 8;
            class236.field3874 = arg6 + (var16 * var22 / var20);
            int var23 = arg3 * 512 >> 8;
            class152.field2573 = var19 * var23 / var20 + arg5;
        } else {
            class152.field2573 = (var19 << 9) / var20 + arg5;
            class236.field3874 = (var16 << 9) / var20 + arg6;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 6079)
    public static void method1706(int arg0) {
        field4138 = null;
        field4143 = null;
        field4142 = null;
        field4145 = null;
        if (arg0 != 15448) {
            method1706(53);
        }
        field4147 = null;
    }
}
