import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class167 {

    @OriginalMember(owner = "client!af", name = "f", descriptor = "J")
    public long field2814 = 0L;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lwa;")
    public static class75 field2812 = class66.method560("Fertigkeit)2", false);

    @OriginalMember(owner = "client!af", name = "h", descriptor = "Z")
    public static boolean field2816 = true;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "J")
    public static long field2817 = 0L;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field2813 = -1;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lwa;")
    public static class75 field2824 = class66.method560("Lade Wordpack )2 ", false);

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Z")
    public static boolean field2825 = false;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field2818;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public int field2819;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public int field2821;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public int field2822;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field2823;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Lpj;")
    public class171 field2809;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lpj;")
    public class171 field2815;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1238(byte arg0) {
        field2811++;
        class24.field312.method1000(true);
        if (arg0 <= -30) {
            class7.field96.method855(93);
            class217.field3712.method855(94);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)[Lbh;", line = 33)
    public static final class258[] method1239(int arg0) {
        field2826++;
        class258[] var1 = new class258[class149.field2563];
        for (int var2 = 0; var2 < class149.field2563; var2++) {
            int var3 = class287.field4936[var2] * class210.field3590[var2];
            byte[] var4 = class42.field687[var2];
            if (class156.field2673[var2]) {
                byte[] var5 = class155.field2653[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class102.method799(class191.field3184[class235.method1710(255, var4[var7])], class235.method1710(var5[var7] << 24, -16777216));
                }
                var1[var2] = new class193(class263.field4571, class76.field1321, class85.field1404[var2], class232.field3934[var2], class210.field3590[var2], class287.field4936[var2], var6);
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class191.field3184[class235.method1710(255, var4[var9])];
                }
                var1[var2] = new class277(class263.field4571, class76.field1321, class85.field1404[var2], class232.field3934[var2], class210.field3590[var2], class287.field4936[var2], var8);
            }
        }
        class235.method1713(0);
        if (arg0 != 2) {
            field2812 = (class75) null;
        }
        return var1;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 108)
    public static void method1240(int arg0) {
        field2824 = null;
        field2812 = null;
        if (arg0 != 9544) {
            method1238((byte) -54);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lod;II)V", line = 129)
    public static final void method1241(class24 arg0, int arg1, int arg2) {
        Object[] var3 = arg0.field302;
        field2820++;
        int var4 = (Integer) var3[arg1];
        class3 var5 = class139.method1059((byte) 117, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        class112.field1902 = 0;
        int[] var7 = var5.field33;
        int var8 = -1;
        int[] var9 = var5.field39;
        int var10 = 0;
        byte var11 = -1;
        try {
            class178.field3009 = new class75[var5.field36];
            class139.field2373 = new int[var5.field34];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg0.field309;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg0.field308;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg0.field301 == null ? -1 : arg0.field301.field4418;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg0.field311;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg0.field301 == null ? -1 : arg0.field301.field4382;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg0.field304 == null ? -1 : arg0.field304.field4418;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg0.field304 == null ? -1 : arg0.field304.field4382;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg0.field313;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg0.field310;
                    }
                    class139.field2373[var13++] = var15;
                } else if (var3[var14] instanceof class75) {
                    class75 var16 = (class75) var3[var14];
                    if (var16.method660(class295.field5071, arg1 + 99)) {
                        var16 = arg0.field315;
                    }
                    class178.field3009[var12++] = var16;
                }
            }
            int var17 = 0;
            label3875: while (true) {
                var17++;
                if (arg2 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var474 = var7[var8];
                if (var474 < 100) {
                    if (var474 == 0) {
                        class163.field2769[var6++] = var9[var8];
                        continue;
                    }
                    if (var474 == 1) {
                        int var18 = var9[var8];
                        class163.field2769[var6++] = class286.field4920[var18];
                        continue;
                    }
                    if (var474 == 2) {
                        int var19 = var9[var8];
                        var6--;
                        class286.method2013(class163.field2769[var6], var19, false);
                        continue;
                    }
                    if (var474 == 3) {
                        class249.field4193[var10++] = var5.field40[var8];
                        continue;
                    }
                    if (var474 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var474 == 7) {
                        var6 -= 2;
                        if (class163.field2769[var6 + 1] != class163.field2769[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var474 == 8) {
                        var6 -= 2;
                        if (class163.field2769[var6 + 1] == class163.field2769[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var474 == 9) {
                        var6 -= 2;
                        if (class163.field2769[var6 + 1] > class163.field2769[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var474 == 10) {
                        var6 -= 2;
                        if (class163.field2769[var6 + 1] < class163.field2769[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var474 == 21) {
                        if (class112.field1902 == 0) {
                            return;
                        }
                        class287 var20 = class198.field3311[--class112.field1902];
                        var5 = var20.field4942;
                        var7 = var5.field33;
                        class139.field2373 = var20.field4932;
                        var9 = var5.field39;
                        var8 = var20.field4943;
                        class178.field3009 = var20.field4940;
                        continue;
                    }
                    if (var474 == 25) {
                        int var21 = var9[var8];
                        class163.field2769[var6++] = class149.method1149(0, var21);
                        continue;
                    }
                    if (var474 == 27) {
                        int var22 = var9[var8];
                        var6--;
                        class13.method70(class163.field2769[var6], 0, var22);
                        continue;
                    }
                    if (var474 == 31) {
                        var6 -= 2;
                        if (class163.field2769[var6 + 1] >= class163.field2769[var6]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var474 == 32) {
                        var6 -= 2;
                        if (class163.field2769[var6] >= class163.field2769[var6 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var474 == 33) {
                        class163.field2769[var6++] = class139.field2373[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var474 == 34) {
                        var10001 = var9[var8];
                        var6--;
                        class139.field2373[var10001] = class163.field2769[var6];
                        continue;
                    }
                    if (var474 == 35) {
                        class249.field4193[var10++] = class178.field3009[var9[var8]];
                        continue;
                    }
                    if (var474 == 36) {
                        var10001 = var9[var8];
                        var10--;
                        class178.field3009[var10001] = class249.field4193[var10];
                        continue;
                    }
                    if (var474 == 37) {
                        int var23 = var9[var8];
                        var10 -= var23;
                        class75 var24 = class30.method207(var10, class249.field4193, var23, -28540);
                        class249.field4193[var10++] = var24;
                        continue;
                    }
                    if (var474 == 38) {
                        var6--;
                        continue;
                    }
                    if (var474 == 39) {
                        var10--;
                        continue;
                    }
                    if (var474 == 40) {
                        int var25 = var9[var8];
                        class3 var26 = class139.method1059((byte) 107, var25);
                        class75[] var27 = new class75[var26.field36];
                        int[] var28 = new int[var26.field34];
                        for (int var29 = 0; var29 < var26.field26; var29++) {
                            var28[var29] = class163.field2769[var6 + var29 - var26.field26];
                        }
                        for (int var30 = 0; var30 < var26.field25; var30++) {
                            var27[var30] = class249.field4193[var10 + var30 - var26.field25];
                        }
                        var10 -= var26.field25;
                        var6 -= var26.field26;
                        class287 var31 = new class287();
                        var31.field4943 = var8;
                        var31.field4942 = var5;
                        var31.field4932 = class139.field2373;
                        var31.field4940 = class178.field3009;
                        if (class198.field3311.length <= class112.field1902) {
                            throw new RuntimeException();
                        }
                        class198.field3311[class112.field1902++] = var31;
                        class178.field3009 = var27;
                        class139.field2373 = var28;
                        var8 = -1;
                        var5 = var26;
                        var7 = var26.field33;
                        var9 = var26.field39;
                        continue;
                    }
                    if (var474 == 42) {
                        class163.field2769[var6++] = class72.field1218[var9[var8]];
                        continue;
                    }
                    if (var474 == 43) {
                        int var32 = var9[var8];
                        var6--;
                        class72.field1218[var32] = class163.field2769[var6];
                        class121.method917((byte) -108, var32);
                        continue;
                    }
                    if (var474 == 44) {
                        int var33 = var9[var8] & 0xFFFF;
                        var6--;
                        int var34 = class163.field2769[var6];
                        int var35 = var9[var8] >> 16;
                        if (var34 >= 0 && var34 <= 5000) {
                            class187.field3120[var35] = var34;
                            byte var36 = -1;
                            if (var33 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label3875;
                                }
                                class240.field4054[var35][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 45) {
                        int var38 = var9[var8];
                        var6--;
                        int var39 = class163.field2769[var6];
                        if (var39 >= 0 && var39 < class187.field3120[var38]) {
                            class163.field2769[var6++] = class240.field4054[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 46) {
                        var6 -= 2;
                        int var40 = class163.field2769[var6];
                        int var41 = var9[var8];
                        if (var40 >= 0 && var40 < class187.field3120[var41]) {
                            class240.field4054[var41][var40] = class163.field2769[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var474 == 47) {
                        class75 var42 = class69.field1190[var9[var8]];
                        if (var42 == null) {
                            var42 = class253.field4248;
                        }
                        class249.field4193[var10++] = var42;
                        continue;
                    }
                    if (var474 == 48) {
                        int var43 = var9[var8];
                        var10--;
                        class69.field1190[var43] = class249.field4193[var10];
                        class258.method1836(-17970, var43);
                        continue;
                    }
                    if (var474 == 51) {
                        class126 var44 = var5.field38[var9[var8]];
                        var6--;
                        class8 var45 = (class8) var44.method1007((long) class163.field2769[var6], arg1 ^ 0xFFFFBD94);
                        if (var45 != null) {
                            var8 += var45.field109;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var9[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                int var10000;
                if (var474 < 300) {
                    if (var474 == 100) {
                        var6 -= 3;
                        int var452 = class163.field2769[var6 + 1];
                        int var453 = class163.field2769[var6];
                        int var454 = class163.field2769[var6 + 2];
                        if (var452 == 0) {
                            throw new RuntimeException();
                        }
                        class262 var455 = class51.method374(-46, var453);
                        if (var455.field4532 == null) {
                            var455.field4532 = new class262[var454 + 1];
                        }
                        if (var454 >= var455.field4532.length) {
                            class262[] var456 = new class262[var454 + 1];
                            for (int var457 = 0; var457 < var455.field4532.length; var457++) {
                                var456[var457] = var455.field4532[var457];
                            }
                            var455.field4532 = var456;
                        }
                        if (var454 > 0 && var455.field4532[var454 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var454 - 1));
                        }
                        class262 var458 = new class262();
                        var458.field4382 = var454;
                        var458.field4446 = var458.field4418 = var455.field4418;
                        var458.field4441 = var452;
                        var458.field4540 = true;
                        var455.field4532[var454] = var458;
                        if (var46) {
                            class205.field3474 = var458;
                        } else {
                            class302.field5175 = var458;
                        }
                        class291.method2027(var455, 14580);
                        continue;
                    }
                    if (var474 == 101) {
                        class262 var459 = var46 ? class205.field3474 : class302.field5175;
                        if (var459.field4382 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class262 var460 = class51.method374(117, var459.field4418);
                        var460.field4532[var459.field4382] = null;
                        class291.method2027(var460, 14580);
                        continue;
                    }
                    if (var474 == 102) {
                        var10000 = arg1 + 126;
                        var6--;
                        class262 var461 = class51.method374(var10000, class163.field2769[var6]);
                        var461.field4532 = null;
                        class291.method2027(var461, 14580);
                        continue;
                    }
                    if (var474 == 200) {
                        var6 -= 2;
                        int var462 = class163.field2769[var6];
                        int var463 = class163.field2769[var6 + 1];
                        class262 var464 = class161.method1208(var462, var463, (byte) 99);
                        if (var464 != null && var463 != -1) {
                            class163.field2769[var6++] = 1;
                            if (var46) {
                                class205.field3474 = var464;
                            } else {
                                class302.field5175 = var464;
                            }
                            continue;
                        }
                        class163.field2769[var6++] = 0;
                        continue;
                    }
                    if (var474 == 201) {
                        var6--;
                        int var465 = class163.field2769[var6];
                        class262 var466 = class51.method374(arg1 + 104, var465);
                        if (var466 == null) {
                            class163.field2769[var6++] = 0;
                        } else {
                            class163.field2769[var6++] = 1;
                            if (var46) {
                                class205.field3474 = var466;
                            } else {
                                class302.field5175 = var466;
                            }
                        }
                        continue;
                    }
                } else if (var474 < 500) {
                    if (var474 == 403) {
                        var6 -= 2;
                        int var47 = class163.field2769[var6];
                        int var48 = class163.field2769[var6 + 1];
                        if (var47 >= 7) {
                            var47 -= 7;
                        }
                        class279.field4831.field1564.method1650(false, var48, var47);
                        continue;
                    }
                    if (var474 == 404) {
                        var6 -= 2;
                        int var49 = class163.field2769[var6 + 1];
                        int var50 = class163.field2769[var6];
                        class279.field4831.field1564.method1643(var49, (byte) 21, var50);
                        continue;
                    }
                    if (var474 == 410) {
                        var6--;
                        boolean var51 = class163.field2769[var6] != 0;
                        class279.field4831.field1564.method1649(var51, arg1 + 90);
                        continue;
                    }
                } else if (!(var474 < 1000 || var474 >= 1100) || !(var474 < 2000 || var474 >= 2100)) {
                    class262 var446;
                    if (var474 < 2000) {
                        var446 = var46 ? class205.field3474 : class302.field5175;
                    } else {
                        var474 -= 1000;
                        var10000 = arg1 ^ 0x68;
                        var6--;
                        var446 = class51.method374(var10000, class163.field2769[var6]);
                    }
                    if (var474 == 1000) {
                        var6 -= 4;
                        var446.field4486 = class163.field2769[var6];
                        var446.field4500 = class163.field2769[var6 + 1];
                        int var447 = class163.field2769[var6 + 2];
                        int var448 = class163.field2769[var6 + 3];
                        if (var447 < 0) {
                            var447 = 0;
                        } else if (var447 > 5) {
                            var447 = 5;
                        }
                        if (var448 < 0) {
                            var448 = 0;
                        } else if (var448 > 5) {
                            var448 = 5;
                        }
                        var446.field4379 = (byte) var448;
                        var446.field4539 = (byte) var447;
                        class291.method2027(var446, 14580);
                        class116.method889(var446, (byte) -96);
                        if (var446.field4382 == -1) {
                            class190.method1437(var446.field4418, false);
                        }
                        continue;
                    }
                    if (var474 == 1001) {
                        var6 -= 4;
                        var446.field4429 = class163.field2769[var6];
                        var446.field4408 = class163.field2769[var6 + 1];
                        var446.field4414 = 0;
                        var446.field4381 = 0;
                        int var449 = class163.field2769[var6 + 3];
                        if (var449 < 0) {
                            var449 = 0;
                        } else if (var449 > 4) {
                            var449 = 4;
                        }
                        int var450 = class163.field2769[var6 + 2];
                        if (var450 < 0) {
                            var450 = 0;
                        } else if (var450 > 4) {
                            var450 = 4;
                        }
                        var446.field4465 = (byte) var449;
                        var446.field4412 = (byte) var450;
                        class291.method2027(var446, arg1 ^ 0x38F4);
                        class116.method889(var446, (byte) -96);
                        if (var446.field4441 == 0) {
                            class180.method1324(false, var446, true);
                        }
                        continue;
                    }
                    if (var474 == 1003) {
                        var6--;
                        boolean var451 = class163.field2769[var6] == 1;
                        if (var451 != var446.field4491) {
                            var446.field4491 = var451;
                            class291.method2027(var446, 14580);
                        }
                        if (var446.field4382 == -1) {
                            class296.method2053((byte) -81, var446.field4418);
                        }
                        continue;
                    }
                    if (var474 == 1004) {
                        var6 -= 2;
                        var446.field4451 = class163.field2769[var6];
                        var446.field4428 = class163.field2769[var6 + 1];
                        class291.method2027(var446, 14580);
                        class116.method889(var446, (byte) -96);
                        if (var446.field4441 == 0) {
                            class180.method1324(false, var446, true);
                        }
                        continue;
                    }
                } else if (var474 >= 1100 && var474 < 1200 || var474 >= 2100 && var474 < 2200) {
                    class262 var443;
                    if (var474 >= 2000) {
                        var6--;
                        var443 = class51.method374(-56, class163.field2769[var6]);
                        var474 -= 1000;
                    } else {
                        var443 = var46 ? class205.field3474 : class302.field5175;
                    }
                    if (var474 == 1100) {
                        var6 -= 2;
                        var443.field4430 = class163.field2769[var6];
                        if (var443.field4430 > (var443.field4503 - var443.field4531)) {
                            var443.field4430 = var443.field4503 - var443.field4531;
                        }
                        if (var443.field4430 < 0) {
                            var443.field4430 = 0;
                        }
                        var443.field4501 = class163.field2769[var6 + 1];
                        if ((var443.field4384 - var443.field4517) < var443.field4501) {
                            var443.field4501 = var443.field4384 - var443.field4517;
                        }
                        if (var443.field4501 < 0) {
                            var443.field4501 = 0;
                        }
                        class291.method2027(var443, 14580);
                        if (var443.field4382 == -1) {
                            class296.method2054(var443.field4418, 58);
                        }
                        continue;
                    }
                    if (var474 == 1101) {
                        var6--;
                        var443.field4497 = class163.field2769[var6];
                        class291.method2027(var443, arg1 + 14580);
                        if (var443.field4382 == -1) {
                            class275.method1961(var443.field4418, (byte) -121);
                        }
                        continue;
                    }
                    if (var474 == 1102) {
                        var6--;
                        var443.field4469 = class163.field2769[var6] == 1;
                        class291.method2027(var443, arg1 + 14580);
                        continue;
                    }
                    if (var474 == 1103) {
                        var6--;
                        var443.field4386 = class163.field2769[var6];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1104) {
                        var6--;
                        var443.field4473 = class163.field2769[var6];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1105) {
                        var6--;
                        var443.field4444 = class163.field2769[var6];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1106) {
                        var6--;
                        var443.field4480 = class163.field2769[var6];
                        class291.method2027(var443, arg1 + 14580);
                        continue;
                    }
                    if (var474 == 1107) {
                        var6--;
                        var443.field4419 = class163.field2769[var6] == 1;
                        class291.method2027(var443, arg1 ^ 0x38F4);
                        continue;
                    }
                    if (var474 == 1108) {
                        var443.field4467 = 1;
                        var6--;
                        var443.field4535 = class163.field2769[var6];
                        class291.method2027(var443, 14580);
                        if (var443.field4382 == -1) {
                            class7.method39(var443.field4418, 4);
                        }
                        continue;
                    }
                    if (var474 == 1109) {
                        var6 -= 6;
                        var443.field4392 = class163.field2769[var6];
                        var443.field4536 = class163.field2769[var6 + 1];
                        var443.field4477 = class163.field2769[var6 + 2];
                        var443.field4390 = class163.field2769[var6 + 3];
                        var443.field4395 = class163.field2769[var6 + 4];
                        var443.field4463 = class163.field2769[var6 + 5];
                        class291.method2027(var443, arg1 + 14580);
                        if (var443.field4382 == -1) {
                            class188.method1418(126, var443.field4418);
                            class20.method129(var443.field4418, (byte) 105);
                        }
                        continue;
                    }
                    if (var474 == 1110) {
                        var6--;
                        int var444 = class163.field2769[var6];
                        if (var443.field4447 != var444) {
                            var443.field4447 = var444;
                            var443.field4505 = 0;
                            var443.field4406 = 0;
                            class291.method2027(var443, 14580);
                        }
                        if (var443.field4382 == -1) {
                            class37.method247(92, var443.field4418);
                        }
                        continue;
                    }
                    if (var474 == 1111) {
                        var6--;
                        var443.field4397 = class163.field2769[var6] == 1;
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1112) {
                        var10--;
                        class75 var445 = class249.field4193[var10];
                        if (!var445.method660(var443.field4396, 68)) {
                            var443.field4396 = var445;
                            class291.method2027(var443, arg1 ^ 0x38F4);
                        }
                        if (var443.field4382 == -1) {
                            class35.method237(-3120, var443.field4418);
                        }
                        continue;
                    }
                    if (var474 == 1113) {
                        var6--;
                        var443.field4479 = class163.field2769[var6];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1114) {
                        var6 -= 3;
                        var443.field4454 = class163.field2769[var6];
                        var443.field4431 = class163.field2769[var6 + 1];
                        var443.field4413 = class163.field2769[var6 + 2];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1115) {
                        var6--;
                        var443.field4453 = class163.field2769[var6] == 1;
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1116) {
                        var6--;
                        var443.field4523 = class163.field2769[var6];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1117) {
                        var6--;
                        var443.field4422 = class163.field2769[var6];
                        class291.method2027(var443, arg1 + 14580);
                        continue;
                    }
                    if (var474 == 1118) {
                        var6--;
                        var443.field4403 = class163.field2769[var6] == 1;
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1119) {
                        var6--;
                        var443.field4504 = class163.field2769[var6] == 1;
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1120) {
                        var6 -= 2;
                        var443.field4503 = class163.field2769[var6];
                        var443.field4384 = class163.field2769[var6 + 1];
                        class291.method2027(var443, 14580);
                        if (var443.field4441 == 0) {
                            class180.method1324(false, var443, true);
                        }
                        continue;
                    }
                    if (var474 == 1121) {
                        var6 -= 2;
                        var443.field4457 = (short) class163.field2769[var6];
                        var443.field4404 = (short) class163.field2769[var6 + 1];
                        class291.method2027(var443, 14580);
                        continue;
                    }
                    if (var474 == 1122) {
                        var6--;
                        var443.field4543 = class163.field2769[var6] == 1;
                        class291.method2027(var443, 14580);
                        continue;
                    }
                } else if (var474 >= 1200 && var474 < 1300 || var474 >= 2200 && var474 < 2300) {
                    class262 var52;
                    if (var474 < 2000) {
                        var52 = var46 ? class205.field3474 : class302.field5175;
                    } else {
                        var6--;
                        var52 = class51.method374(100, class163.field2769[var6]);
                        var474 -= 1000;
                    }
                    class291.method2027(var52, 14580);
                    if (var474 == 1200 || var474 == 1205) {
                        var6 -= 2;
                        int var53 = class163.field2769[var6];
                        int var54 = class163.field2769[var6 + 1];
                        if (var52.field4382 == -1) {
                            class266.method1889(var52.field4418, (byte) -118);
                            class188.method1418(arg1 ^ 0x7C, var52.field4418);
                            class20.method129(var52.field4418, (byte) 101);
                        }
                        if (var53 == -1) {
                            var52.field4467 = 1;
                            var52.field4445 = -1;
                            var52.field4535 = -1;
                        } else {
                            var52.field4495 = var54;
                            var52.field4445 = var53;
                            class278 var55 = class199.method1475(var53, (byte) -51);
                            var52.field4463 = var55.field4820;
                            var52.field4392 = var55.field4802;
                            var52.field4536 = var55.field4780;
                            if (var474 == 1205) {
                                var52.field4432 = false;
                            } else {
                                var52.field4432 = true;
                            }
                            var52.field4395 = var55.field4761;
                            var52.field4390 = var55.field4762;
                            if (var52.field4381 > 0) {
                                var52.field4463 = var52.field4463 * 32 / var52.field4381;
                            } else if (var52.field4429 > 0) {
                                var52.field4463 = var52.field4463 * 32 / var52.field4429;
                            }
                            var52.field4477 = var55.field4808;
                        }
                        continue;
                    }
                    if (var474 == 1201) {
                        var52.field4467 = 2;
                        var6--;
                        var52.field4535 = class163.field2769[var6];
                        if (var52.field4382 == -1) {
                            class7.method39(var52.field4418, arg1 ^ 0x4);
                        }
                        continue;
                    }
                    if (var474 == 1202) {
                        var52.field4467 = 3;
                        var52.field4535 = class279.field4831.field1564.method1644(-23641);
                        if (var52.field4382 == -1) {
                            class7.method39(var52.field4418, arg1 ^ 0x4);
                        }
                        continue;
                    }
                    if (var474 == 1203) {
                        var52.field4467 = 6;
                        var6--;
                        var52.field4535 = class163.field2769[var6];
                        if (var52.field4382 == -1) {
                            class7.method39(var52.field4418, 4);
                        }
                        continue;
                    }
                    if (var474 == 1204) {
                        var52.field4467 = 5;
                        var6--;
                        var52.field4535 = class163.field2769[var6];
                        if (var52.field4382 == -1) {
                            class7.method39(var52.field4418, 4);
                        }
                        continue;
                    }
                } else if (var474 >= 1300 && var474 < 1400 || var474 >= 2300 && var474 < 2400) {
                    class262 var439;
                    if (var474 >= 2000) {
                        var474 -= 1000;
                        var10000 = arg1 - 69;
                        var6--;
                        var439 = class51.method374(var10000, class163.field2769[var6]);
                    } else {
                        var439 = var46 ? class205.field3474 : class302.field5175;
                    }
                    if (var474 == 1300) {
                        var6--;
                        int var440 = class163.field2769[var6] - 1;
                        if (var440 >= 0 && var440 <= 9) {
                            var10--;
                            var439.method1876(class249.field4193[var10], var440, (byte) 18);
                            continue;
                        }
                        var10--;
                        continue;
                    }
                    if (var474 == 1301) {
                        var6 -= 2;
                        int var441 = class163.field2769[var6];
                        int var442 = class163.field2769[var6 + 1];
                        var439.field4510 = class161.method1208(var441, var442, (byte) 56);
                        continue;
                    }
                    if (var474 == 1302) {
                        var6--;
                        var439.field4426 = class163.field2769[var6] == 1;
                        continue;
                    }
                    if (var474 == 1303) {
                        var6--;
                        var439.field4380 = class163.field2769[var6];
                        continue;
                    }
                    if (var474 == 1304) {
                        var6--;
                        var439.field4385 = class163.field2769[var6];
                        continue;
                    }
                    if (var474 == 1305) {
                        var10--;
                        var439.field4524 = class249.field4193[var10];
                        continue;
                    }
                    if (var474 == 1306) {
                        var10--;
                        var439.field4424 = class249.field4193[var10];
                        continue;
                    }
                    if (var474 == 1307) {
                        var439.field4398 = null;
                        continue;
                    }
                } else {
                    if (var474 >= 1400 && var474 < 1500 || var474 >= 2400 && var474 < 2500) {
                        class262 var432;
                        if (var474 >= 2000) {
                            var474 -= 1000;
                            var10000 = arg1 - 50;
                            var6--;
                            var432 = class51.method374(var10000, class163.field2769[var6]);
                        } else {
                            var432 = var46 ? class205.field3474 : class302.field5175;
                        }
                        var10--;
                        class75 var433 = class249.field4193[var10];
                        int[] var434 = null;
                        if (var433.method640(1) > 0 && var433.method626(160, var433.method640(1) - 1) == 89) {
                            var6--;
                            int var435 = class163.field2769[var6];
                            if (var435 > 0) {
                                var434 = new int[var435];
                                while (var435-- > 0) {
                                    var6--;
                                    var434[var435] = class163.field2769[var6];
                                }
                            }
                            var433 = var433.method661(arg1 + 99, 0, var433.method640(1) - 1);
                        }
                        Object[] var436 = new Object[var433.method640(1) + 1];
                        for (int var437 = var436.length - 1; var437 >= 1; var437--) {
                            if (var433.method626(160, var437 - 1) == 115) {
                                var10--;
                                var436[var437] = class249.field4193[var10];
                            } else {
                                var6--;
                                var436[var437] = Integer.valueOf(class163.field2769[var6]);
                            }
                        }
                        var6--;
                        int var438 = class163.field2769[var6];
                        if (var438 == -1) {
                            var436 = null;
                        } else {
                            var436[0] = Integer.valueOf(var438);
                        }
                        if (var474 == 1400) {
                            var432.field4450 = var436;
                        } else if (var474 == 1401) {
                            var432.field4478 = var436;
                        } else if (var474 == 1402) {
                            var432.field4512 = var436;
                        } else if (var474 == 1403) {
                            var432.field4494 = var436;
                        } else if (var474 == 1404) {
                            var432.field4534 = var436;
                        } else if (var474 == 1405) {
                            var432.field4475 = var436;
                        } else if (var474 == 1406) {
                            var432.field4509 = var436;
                        } else if (var474 == 1407) {
                            var432.field4437 = var436;
                            var432.field4538 = var434;
                        } else if (var474 == 1408) {
                            var432.field4507 = var436;
                        } else if (var474 == 1409) {
                            var432.field4518 = var436;
                        } else if (var474 == 1410) {
                            var432.field4449 = var436;
                        } else if (var474 == 1411) {
                            var432.field4460 = var436;
                        } else if (var474 == 1412) {
                            var432.field4407 = var436;
                        } else if (var474 == 1414) {
                            var432.field4526 = var436;
                            var432.field4427 = var434;
                        } else if (var474 == 1415) {
                            var432.field4423 = var434;
                            var432.field4482 = var436;
                        } else if (var474 == 1416) {
                            var432.field4464 = var436;
                        } else if (var474 == 1417) {
                            var432.field4519 = var436;
                        } else if (var474 == 1418) {
                            var432.field4435 = var436;
                        } else if (var474 == 1419) {
                            var432.field4399 = var436;
                        } else if (var474 == 1420) {
                            var432.field4484 = var436;
                        } else if (var474 == 1421) {
                            var432.field4472 = var436;
                        } else if (var474 == 1422) {
                            var432.field4378 = var436;
                        } else if (var474 == 1423) {
                            var432.field4533 = var436;
                        } else if (var474 == 1424) {
                            var432.field4514 = var436;
                        } else if (var474 == 1425) {
                            var432.field4525 = var436;
                        } else if (var474 == 1426) {
                            var432.field4442 = var436;
                        } else if (var474 == 1427) {
                            var432.field4506 = var436;
                        } else if (var474 == 1428) {
                            var432.field4515 = var434;
                            var432.field4401 = var436;
                        } else if (var474 == 1429) {
                            var432.field4415 = var434;
                            var432.field4483 = var436;
                        }
                        var432.field4448 = true;
                        continue;
                    }
                    if (var474 < 1600) {
                        class262 var56 = var46 ? class205.field3474 : class302.field5175;
                        if (var474 == 1500) {
                            class163.field2769[var6++] = var56.field4521;
                            continue;
                        }
                        if (var474 == 1501) {
                            class163.field2769[var6++] = var56.field4439;
                            continue;
                        }
                        if (var474 == 1502) {
                            class163.field2769[var6++] = var56.field4531;
                            continue;
                        }
                        if (var474 == 1503) {
                            class163.field2769[var6++] = var56.field4517;
                            continue;
                        }
                        if (var474 == 1504) {
                            class163.field2769[var6++] = var56.field4491 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 1505) {
                            class163.field2769[var6++] = var56.field4446;
                            continue;
                        }
                    } else if (var474 < 1700) {
                        class262 var431 = var46 ? class205.field3474 : class302.field5175;
                        if (var474 == 1600) {
                            class163.field2769[var6++] = var431.field4430;
                            continue;
                        }
                        if (var474 == 1601) {
                            class163.field2769[var6++] = var431.field4501;
                            continue;
                        }
                        if (var474 == 1602) {
                            class249.field4193[var10++] = var431.field4396;
                            continue;
                        }
                        if (var474 == 1603) {
                            class163.field2769[var6++] = var431.field4503;
                            continue;
                        }
                        if (var474 == 1604) {
                            class163.field2769[var6++] = var431.field4384;
                            continue;
                        }
                        if (var474 == 1605) {
                            class163.field2769[var6++] = var431.field4463;
                            continue;
                        }
                        if (var474 == 1606) {
                            class163.field2769[var6++] = var431.field4477;
                            continue;
                        }
                        if (var474 == 1607) {
                            class163.field2769[var6++] = var431.field4395;
                            continue;
                        }
                        if (var474 == 1608) {
                            class163.field2769[var6++] = var431.field4390;
                            continue;
                        }
                        if (var474 == 1609) {
                            class163.field2769[var6++] = var431.field4386;
                            continue;
                        }
                    } else if (var474 < 1800) {
                        class262 var430 = var46 ? class205.field3474 : class302.field5175;
                        if (var474 == 1700) {
                            class163.field2769[var6++] = var430.field4445;
                            continue;
                        }
                        if (var474 == 1701) {
                            if (var430.field4445 == -1) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = var430.field4495;
                            }
                            continue;
                        }
                        if (var474 == 1702) {
                            class163.field2769[var6++] = var430.field4382;
                            continue;
                        }
                    } else if (var474 < 1900) {
                        class262 var57 = var46 ? class205.field3474 : class302.field5175;
                        if (var474 == 1800) {
                            class163.field2769[var6++] = class133.method1035(7127, client.method1734(var57));
                            continue;
                        }
                        if (var474 == 1801) {
                            var6--;
                            int var58 = class163.field2769[var6];
                            int var475 = var58 - 1;
                            if (var57.field4398 != null && var57.field4398.length > var475 && var57.field4398[var475] != null) {
                                class249.field4193[var10++] = var57.field4398[var475];
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 1802) {
                            if (var57.field4524 == null) {
                                class249.field4193[var10++] = class110.field1886;
                            } else {
                                class249.field4193[var10++] = var57.field4524;
                            }
                            continue;
                        }
                    } else if (var474 < 2600) {
                        var6--;
                        class262 var429 = class51.method374(111, class163.field2769[var6]);
                        if (var474 == 2500) {
                            class163.field2769[var6++] = var429.field4521;
                            continue;
                        }
                        if (var474 == 2501) {
                            class163.field2769[var6++] = var429.field4439;
                            continue;
                        }
                        if (var474 == 2502) {
                            class163.field2769[var6++] = var429.field4531;
                            continue;
                        }
                        if (var474 == 2503) {
                            class163.field2769[var6++] = var429.field4517;
                            continue;
                        }
                        if (var474 == 2504) {
                            class163.field2769[var6++] = var429.field4491 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 2505) {
                            class163.field2769[var6++] = var429.field4446;
                            continue;
                        }
                    } else if (var474 < 2700) {
                        var6--;
                        class262 var428 = class51.method374(110, class163.field2769[var6]);
                        if (var474 == 2600) {
                            class163.field2769[var6++] = var428.field4430;
                            continue;
                        }
                        if (var474 == 2601) {
                            class163.field2769[var6++] = var428.field4501;
                            continue;
                        }
                        if (var474 == 2602) {
                            class249.field4193[var10++] = var428.field4396;
                            continue;
                        }
                        if (var474 == 2603) {
                            class163.field2769[var6++] = var428.field4503;
                            continue;
                        }
                        if (var474 == 2604) {
                            class163.field2769[var6++] = var428.field4384;
                            continue;
                        }
                        if (var474 == 2605) {
                            class163.field2769[var6++] = var428.field4463;
                            continue;
                        }
                        if (var474 == 2606) {
                            class163.field2769[var6++] = var428.field4477;
                            continue;
                        }
                        if (var474 == 2607) {
                            class163.field2769[var6++] = var428.field4395;
                            continue;
                        }
                        if (var474 == 2608) {
                            class163.field2769[var6++] = var428.field4390;
                            continue;
                        }
                        if (var474 == 2609) {
                            class163.field2769[var6++] = var428.field4386;
                            continue;
                        }
                    } else if (var474 < 2800) {
                        if (var474 == 2700) {
                            var6--;
                            class262 var59 = class51.method374(-81, class163.field2769[var6]);
                            class163.field2769[var6++] = var59.field4445;
                            continue;
                        }
                        if (var474 == 2701) {
                            var6--;
                            class262 var60 = class51.method374(-42, class163.field2769[var6]);
                            if (var60.field4445 == -1) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = var60.field4495;
                            }
                            continue;
                        }
                        if (var474 == 2702) {
                            var6--;
                            int var61 = class163.field2769[var6];
                            class93 var62 = (class93) class73.field1224.method1007((long) var61, arg1 ^ 0xFFFFBD94);
                            if (var62 == null) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = 1;
                            }
                            continue;
                        }
                        if (var474 == 2703) {
                            var6--;
                            class262 var63 = class51.method374(-53, class163.field2769[var6]);
                            if (var63.field4532 == null) {
                                class163.field2769[var6++] = 0;
                                continue;
                            }
                            int var64 = var63.field4532.length;
                            for (int var65 = 0; var65 < var63.field4532.length; var65++) {
                                if (var63.field4532[var65] == null) {
                                    var64 = var65;
                                    break;
                                }
                            }
                            class163.field2769[var6++] = var64;
                            continue;
                        }
                        if (var474 == 2704 || var474 == 2705) {
                            var6 -= 2;
                            int var66 = class163.field2769[var6];
                            int var67 = class163.field2769[var6 + 1];
                            class93 var68 = (class93) class73.field1224.method1007((long) var66, arg1 ^ 0xFFFFBD94);
                            if (var68 != null && var68.field1518 == var67) {
                                class163.field2769[var6++] = 1;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                    } else if (var474 < 2900) {
                        var6--;
                        class262 var69 = class51.method374(117, class163.field2769[var6]);
                        if (var474 == 2800) {
                            class163.field2769[var6++] = class133.method1035(7127, client.method1734(var69));
                            continue;
                        }
                        if (var474 == 2801) {
                            var6--;
                            int var70 = class163.field2769[var6];
                            int var476 = var70 - 1;
                            if (var69.field4398 != null && var69.field4398.length > var476 && var69.field4398[var476] != null) {
                                class249.field4193[var10++] = var69.field4398[var476];
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 2802) {
                            if (var69.field4524 == null) {
                                class249.field4193[var10++] = class110.field1886;
                            } else {
                                class249.field4193[var10++] = var69.field4524;
                            }
                            continue;
                        }
                    } else if (var474 < 3200) {
                        if (var474 == 3100) {
                            var10--;
                            class75 var413 = class249.field4193[var10];
                            class162.method1216((byte) 38, 0, var413, class110.field1886);
                            continue;
                        }
                        if (var474 == 3101) {
                            var6 -= 2;
                            class299.method2063(class163.field2769[var6], (byte) 106, class163.field2769[var6 + 1], class279.field4831);
                            continue;
                        }
                        if (var474 == 3103) {
                            class274.method1955(83);
                            continue;
                        }
                        if (var474 == 3104) {
                            class203.field3431++;
                            var10--;
                            class75 var414 = class249.field4193[var10];
                            int var415 = 0;
                            if (var414.method643(arg1 ^ 0xA)) {
                                var415 = var414.method647((byte) -60);
                            }
                            class89.field1470.method87(65280, 130);
                            class89.field1470.method510(var415, arg1 ^ 0xFFFFFF96);
                            continue;
                        }
                        if (var474 == 3105) {
                            class311.field5299++;
                            var10--;
                            class75 var416 = class249.field4193[var10];
                            class89.field1470.method87(65280, 235);
                            class89.field1470.method514(30009, var416.method630(-99));
                            continue;
                        }
                        if (var474 == 3106) {
                            class7.field87++;
                            var10--;
                            class75 var417 = class249.field4193[var10];
                            class89.field1470.method87(65280, 51);
                            class89.field1470.method518(121, var417.method640(1) + 1);
                            class89.field1470.method516((byte) -20, var417);
                            continue;
                        }
                        if (var474 == 3107) {
                            var6--;
                            int var418 = class163.field2769[var6];
                            var10--;
                            class75 var419 = class249.field4193[var10];
                            class163.method1221(var418, var419, 29458);
                            continue;
                        }
                        if (var474 == 3108) {
                            var6 -= 3;
                            int var420 = class163.field2769[var6];
                            int var421 = class163.field2769[var6 + 1];
                            int var422 = class163.field2769[var6 + 2];
                            class262 var423 = class51.method374(99, var422);
                            class48.method349(var421, var420, (byte) 95, var423);
                            continue;
                        }
                        if (var474 == 3109) {
                            var6 -= 2;
                            int var424 = class163.field2769[var6];
                            int var425 = class163.field2769[var6 + 1];
                            class262 var426 = var46 ? class205.field3474 : class302.field5175;
                            class48.method349(var425, var424, (byte) 100, var426);
                            continue;
                        }
                        if (var474 == 3110) {
                            var6--;
                            int var427 = class163.field2769[var6];
                            class161.field2729++;
                            class89.field1470.method87(65280, 114);
                            class89.field1470.method503(-597878072, var427);
                            continue;
                        }
                    } else if (var474 < 3300) {
                        if (var474 == 3200) {
                            var6 -= 3;
                            class20.method130(class163.field2769[var6], class163.field2769[var6 + 1], class163.field2769[var6 + 2], 57);
                            continue;
                        }
                        if (var474 == 3201) {
                            var6--;
                            class154.method1175(class163.field2769[var6], arg1 + 1);
                            continue;
                        }
                        if (var474 == 3202) {
                            var6 -= 2;
                            class48.method350(class163.field2769[var6], class163.field2769[var6 + 1], 2157);
                            continue;
                        }
                    } else if (var474 < 3400) {
                        if (var474 == 3300) {
                            class163.field2769[var6++] = class143.field2463;
                            continue;
                        }
                        if (var474 == 3301) {
                            var6 -= 2;
                            int var71 = class163.field2769[var6];
                            int var72 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class176.method1299(var71, var72, (byte) -123);
                            continue;
                        }
                        if (var474 == 3302) {
                            var6 -= 2;
                            int var73 = class163.field2769[var6];
                            int var74 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class214.method1581(var74, var73, (byte) 18);
                            continue;
                        }
                        if (var474 == 3303) {
                            var6 -= 2;
                            int var75 = class163.field2769[var6];
                            int var76 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class163.method1219(var75, class93.method728(arg1, 0), var76);
                            continue;
                        }
                        if (var474 == 3304) {
                            var6--;
                            int var77 = class163.field2769[var6];
                            class163.field2769[var6++] = class143.method1106(120, var77).field158;
                            continue;
                        }
                        if (var474 == 3305) {
                            var6--;
                            int var78 = class163.field2769[var6];
                            class163.field2769[var6++] = class187.field3124[var78];
                            continue;
                        }
                        if (var474 == 3306) {
                            var6--;
                            int var79 = class163.field2769[var6];
                            class163.field2769[var6++] = class127.field2206[var79];
                            continue;
                        }
                        if (var474 == 3307) {
                            var6--;
                            int var80 = class163.field2769[var6];
                            class163.field2769[var6++] = class267.field4596[var80];
                            continue;
                        }
                        if (var474 == 3308) {
                            int var81 = class67.field1174;
                            int var82 = (class279.field4831.field3259 >> 7) + class275.field4737;
                            int var83 = (class279.field4831.field3218 >> 7) + class175.field2939;
                            class163.field2769[var6++] = (var81 << 28) + (var82 << 14) + var83;
                            continue;
                        }
                        if (var474 == 3309) {
                            var6--;
                            int var84 = class163.field2769[var6];
                            class163.field2769[var6++] = class235.method1710(16383, var84 >> 14);
                            continue;
                        }
                        if (var474 == 3310) {
                            var6--;
                            int var85 = class163.field2769[var6];
                            class163.field2769[var6++] = var85 >> 28;
                            continue;
                        }
                        if (var474 == 3311) {
                            var6--;
                            int var86 = class163.field2769[var6];
                            class163.field2769[var6++] = class235.method1710(var86, 16383);
                            continue;
                        }
                        if (var474 == 3312) {
                            class163.field2769[var6++] = class120.field2016 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3313) {
                            var6 -= 2;
                            int var87 = class163.field2769[var6 + 1];
                            int var88 = class163.field2769[var6] + 32768;
                            class163.field2769[var6++] = class176.method1299(var88, var87, (byte) -128);
                            continue;
                        }
                        if (var474 == 3314) {
                            var6 -= 2;
                            int var89 = class163.field2769[var6] + 32768;
                            int var90 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class214.method1581(var90, var89, (byte) 18);
                            continue;
                        }
                        if (var474 == 3315) {
                            var6 -= 2;
                            int var91 = class163.field2769[var6 + 1];
                            int var92 = class163.field2769[var6] + 32768;
                            class163.field2769[var6++] = class163.method1219(var92, class93.method728(arg1, 0), var91);
                            continue;
                        }
                        if (var474 == 3316) {
                            if (class250.field4201 < 2) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = class250.field4201;
                            }
                            continue;
                        }
                        if (var474 == 3317) {
                            class163.field2769[var6++] = class154.field2647;
                            continue;
                        }
                        if (var474 == 3318) {
                            class163.field2769[var6++] = class246.field4160;
                            continue;
                        }
                        if (var474 == 3321) {
                            class163.field2769[var6++] = class194.field3233;
                            continue;
                        }
                        if (var474 == 3322) {
                            class163.field2769[var6++] = class154.field2648;
                            continue;
                        }
                        if (var474 == 3323) {
                            if (class72.field1215 >= 5 && class72.field1215 <= 9) {
                                class163.field2769[var6++] = 1;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3324) {
                            if (class72.field1215 >= 5 && class72.field1215 <= 9) {
                                class163.field2769[var6++] = class72.field1215;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3325) {
                            if (class212.field3606 <= 0) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = 1;
                            }
                            continue;
                        }
                        if (var474 == 3326) {
                            class163.field2769[var6++] = class279.field4831.field1576;
                            continue;
                        }
                        if (var474 == 3327) {
                            class163.field2769[var6++] = class279.field4831.field1564.field3778 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3328) {
                            class163.field2769[var6++] = class188.field3140;
                            continue;
                        }
                        if (var474 == 3329) {
                            class163.field2769[var6++] = class213.field3627;
                            continue;
                        }
                        if (var474 == 3330) {
                            var6--;
                            int var93 = class163.field2769[var6];
                            class163.field2769[var6++] = class267.method1922(arg1 - 1, var93);
                            continue;
                        }
                        if (var474 == 3331) {
                            var6 -= 2;
                            int var94 = class163.field2769[var6 + 1];
                            int var95 = class163.field2769[var6];
                            class163.field2769[var6++] = class158.method1195(var94, 64, false, var95);
                            continue;
                        }
                        if (var474 == 3332) {
                            var6 -= 2;
                            int var96 = class163.field2769[var6];
                            int var97 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class158.method1195(var97, 64, true, var96);
                            continue;
                        }
                        if (var474 == 3333) {
                            class163.field2769[var6++] = class117.field1991;
                            continue;
                        }
                    } else if (var474 < 3500) {
                        if (var474 == 3400) {
                            var6 -= 2;
                            int var98 = class163.field2769[var6 + 1];
                            int var99 = class163.field2769[var6];
                            class302 var100 = class115.method886(-23454, var99);
                            if (var100.field5176 != 115) {
                            }
                            class249.field4193[var10++] = var100.method2076(var98, false);
                            continue;
                        }
                        if (var474 == 3408) {
                            var6 -= 4;
                            int var101 = class163.field2769[var6 + 1];
                            int var102 = class163.field2769[var6];
                            int var103 = class163.field2769[var6 + 2];
                            int var104 = class163.field2769[var6 + 3];
                            class302 var105 = class115.method886(-23454, var103);
                            if (var105.field5165 == var102 && var105.field5176 == var101) {
                                if (var101 == 115) {
                                    class249.field4193[var10++] = var105.method2076(var104, false);
                                } else {
                                    class163.field2769[var6++] = var105.method2083(var104, true);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var474 == 3409) {
                            var6 -= 3;
                            int var106 = class163.field2769[var6];
                            int var107 = class163.field2769[var6 + 1];
                            int var108 = class163.field2769[var6 + 2];
                            if (var107 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class302 var109 = class115.method886(arg1 - 23454, var107);
                            if (var109.field5176 != var106) {
                                throw new RuntimeException("C3409-1");
                            }
                            class163.field2769[var6++] = var109.method2081(-5, var108) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3410) {
                            var6--;
                            int var110 = class163.field2769[var6];
                            var10--;
                            class75 var111 = class249.field4193[var10];
                            if (var110 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class302 var112 = class115.method886(-23454, var110);
                            if (var112.field5176 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class163.field2769[var6++] = var112.method2074(5, var111) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3411) {
                            var6--;
                            int var113 = class163.field2769[var6];
                            class302 var114 = class115.method886(arg1 ^ 0xFFFFA462, var113);
                            class163.field2769[var6++] = var114.field5159.method999(false);
                            continue;
                        }
                    } else if (var474 < 3700) {
                        if (var474 == 3600) {
                            if (class272.field4699 == 0) {
                                class163.field2769[var6++] = -2;
                            } else if (class272.field4699 == 1) {
                                class163.field2769[var6++] = -1;
                            } else {
                                class163.field2769[var6++] = class40.field628;
                            }
                            continue;
                        }
                        if (var474 == 3601) {
                            var6--;
                            int var391 = class163.field2769[var6];
                            if (class272.field4699 == 2 && var391 < class40.field628) {
                                class249.field4193[var10++] = class106.field1779[var391];
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 3602) {
                            var6--;
                            int var392 = class163.field2769[var6];
                            if (class272.field4699 == 2 && var392 < class40.field628) {
                                class163.field2769[var6++] = class173.field2930[var392];
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3603) {
                            var6--;
                            int var393 = class163.field2769[var6];
                            if (class272.field4699 == 2 && var393 < class40.field628) {
                                class163.field2769[var6++] = class112.field1910[var393];
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3604) {
                            var10--;
                            class75 var394 = class249.field4193[var10];
                            var6--;
                            int var395 = class163.field2769[var6];
                            class8.method40(var395, var394, false);
                            continue;
                        }
                        if (var474 == 3605) {
                            var10--;
                            class75 var396 = class249.field4193[var10];
                            class3.method20(0, var396.method630(-54));
                            continue;
                        }
                        if (var474 == 3606) {
                            var10--;
                            class75 var397 = class249.field4193[var10];
                            class45.method303(124, var397.method630(-43));
                            continue;
                        }
                        if (var474 == 3607) {
                            var10--;
                            class75 var398 = class249.field4193[var10];
                            class126.method1008((byte) 41, var398.method630(arg1 ^ 0xFFFFFFDE));
                            continue;
                        }
                        if (var474 == 3608) {
                            var10--;
                            class75 var399 = class249.field4193[var10];
                            class168.method1243(true, var399.method630(-87));
                            continue;
                        }
                        if (var474 == 3609) {
                            var10--;
                            class75 var400 = class249.field4193[var10];
                            if (var400.method638(class240.field4055, (byte) -112) || var400.method638(class213.field3621, (byte) -112)) {
                                var400 = var400.method650(arg1 ^ 0x0, 7);
                            }
                            class163.field2769[var6++] = class263.method1882(var400, false) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3610) {
                            var6--;
                            int var401 = class163.field2769[var6];
                            if (class272.field4699 == 2 && var401 < class40.field628) {
                                class249.field4193[var10++] = class120.field2020[var401];
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 3611) {
                            if (class253.field4253 == null) {
                                class249.field4193[var10++] = class110.field1886;
                            } else {
                                class249.field4193[var10++] = class253.field4253.method613(122);
                            }
                            continue;
                        }
                        if (var474 == 3612) {
                            if (class253.field4253 == null) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = class205.field3477;
                            }
                            continue;
                        }
                        if (var474 == 3613) {
                            var6--;
                            int var402 = class163.field2769[var6];
                            if (class253.field4253 != null && class205.field3477 > var402) {
                                class249.field4193[var10++] = class311.field5295[var402].field3149.method613(122);
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 3614) {
                            var6--;
                            int var403 = class163.field2769[var6];
                            if (class253.field4253 != null && class205.field3477 > var403) {
                                class163.field2769[var6++] = class311.field5295[var403].field3152;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3615) {
                            var6--;
                            int var404 = class163.field2769[var6];
                            if (class253.field4253 != null && var404 < class205.field3477) {
                                class163.field2769[var6++] = class311.field5295[var404].field3160;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3616) {
                            class163.field2769[var6++] = class42.field697;
                            continue;
                        }
                        if (var474 == 3617) {
                            var10--;
                            class75 var405 = class249.field4193[var10];
                            class199.method1478(65, var405);
                            continue;
                        }
                        if (var474 == 3618) {
                            class163.field2769[var6++] = class16.field213;
                            continue;
                        }
                        if (var474 == 3619) {
                            var10--;
                            class75 var406 = class249.field4193[var10];
                            class74.method608(var406.method630(-37), true);
                            continue;
                        }
                        if (var474 == 3620) {
                            class2.method10(-120);
                            continue;
                        }
                        if (var474 == 3621) {
                            if (class272.field4699 == 0) {
                                class163.field2769[var6++] = -1;
                            } else {
                                class163.field2769[var6++] = class205.field3472;
                            }
                            continue;
                        }
                        if (var474 == 3622) {
                            var6--;
                            int var407 = class163.field2769[var6];
                            if (class272.field4699 != 0 && class205.field3472 > var407) {
                                class249.field4193[var10++] = class260.method1855(class66.field1152[var407], false).method613(122);
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 3623) {
                            var10--;
                            class75 var408 = class249.field4193[var10];
                            if (var408.method638(class240.field4055, (byte) -112) || var408.method638(class213.field3621, (byte) -112)) {
                                var408 = var408.method650(0, 7);
                            }
                            class163.field2769[var6++] = class8.method43(arg1 - 77, var408) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3624) {
                            var6--;
                            int var409 = class163.field2769[var6];
                            if (class311.field5295 != null && class205.field3477 > var409 && class311.field5295[var409].field3149.method614(class279.field4831.field1561, arg1 ^ 0xFFFFFFBE)) {
                                class163.field2769[var6++] = 1;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3625) {
                            if (class28.field378 == null) {
                                class249.field4193[var10++] = class110.field1886;
                            } else {
                                class249.field4193[var10++] = class28.field378.method613(122);
                            }
                            continue;
                        }
                        if (var474 == 3626) {
                            var6--;
                            int var410 = class163.field2769[var6];
                            if (class253.field4253 != null && class205.field3477 > var410) {
                                class249.field4193[var10++] = class311.field5295[var410].field3158;
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 3627) {
                            var6--;
                            int var411 = class163.field2769[var6];
                            if (class272.field4699 == 2 && var411 >= 0 && var411 < class40.field628) {
                                class163.field2769[var6++] = class111.field1898[var411] ? 1 : 0;
                                continue;
                            }
                            class163.field2769[var6++] = 0;
                            continue;
                        }
                        if (var474 == 3628) {
                            var10--;
                            class75 var412 = class249.field4193[var10];
                            if (var412.method638(class240.field4055, (byte) -112) || var412.method638(class213.field3621, (byte) -112)) {
                                var412 = var412.method650(0, 7);
                            }
                            class163.field2769[var6++] = class218.method1594(var412, false);
                            continue;
                        }
                    } else if (var474 < 4000) {
                        if (var474 == 3903) {
                            var6--;
                            int var115 = class163.field2769[var6];
                            class163.field2769[var6++] = class194.field3273[var115].method1443((byte) 60);
                            continue;
                        }
                        if (var474 == 3904) {
                            var6--;
                            int var116 = class163.field2769[var6];
                            class163.field2769[var6++] = class194.field3273[var116].field3177;
                            continue;
                        }
                        if (var474 == 3905) {
                            var6--;
                            int var117 = class163.field2769[var6];
                            class163.field2769[var6++] = class194.field3273[var117].field3180;
                            continue;
                        }
                        if (var474 == 3906) {
                            var6--;
                            int var118 = class163.field2769[var6];
                            class163.field2769[var6++] = class194.field3273[var118].field3175;
                            continue;
                        }
                        if (var474 == 3907) {
                            var6--;
                            int var119 = class163.field2769[var6];
                            class163.field2769[var6++] = class194.field3273[var119].field3176;
                            continue;
                        }
                        if (var474 == 3908) {
                            var6--;
                            int var120 = class163.field2769[var6];
                            class163.field2769[var6++] = class194.field3273[var120].field3179;
                            continue;
                        }
                        if (var474 == 3910) {
                            var6--;
                            int var121 = class163.field2769[var6];
                            int var122 = class194.field3273[var121].method1444(18133);
                            class163.field2769[var6++] = var122 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3911) {
                            var6--;
                            int var123 = class163.field2769[var6];
                            int var124 = class194.field3273[var123].method1444(18133);
                            class163.field2769[var6++] = var124 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3912) {
                            var6--;
                            int var125 = class163.field2769[var6];
                            int var126 = class194.field3273[var125].method1444(18133);
                            class163.field2769[var6++] = var126 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 3913) {
                            var6--;
                            int var127 = class163.field2769[var6];
                            int var128 = class194.field3273[var127].method1444(18133);
                            class163.field2769[var6++] = var128 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var474 < 4100) {
                        if (var474 == 4000) {
                            var6 -= 2;
                            int var346 = class163.field2769[var6 + 1];
                            int var347 = class163.field2769[var6];
                            class163.field2769[var6++] = var346 + var347;
                            continue;
                        }
                        if (var474 == 4001) {
                            var6 -= 2;
                            int var348 = class163.field2769[var6 + 1];
                            int var349 = class163.field2769[var6];
                            class163.field2769[var6++] = var349 - var348;
                            continue;
                        }
                        if (var474 == 4002) {
                            var6 -= 2;
                            int var350 = class163.field2769[var6 + 1];
                            int var351 = class163.field2769[var6];
                            class163.field2769[var6++] = var350 * var351;
                            continue;
                        }
                        if (var474 == 4003) {
                            var6 -= 2;
                            int var352 = class163.field2769[var6];
                            int var353 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = var352 / var353;
                            continue;
                        }
                        if (var474 == 4004) {
                            var6--;
                            int var354 = class163.field2769[var6];
                            class163.field2769[var6++] = (int) ((double) var354 * Math.random());
                            continue;
                        }
                        if (var474 == 4005) {
                            var6--;
                            int var355 = class163.field2769[var6];
                            class163.field2769[var6++] = (int) ((double) (var355 + 1) * Math.random());
                            continue;
                        }
                        if (var474 == 4006) {
                            var6 -= 5;
                            int var356 = class163.field2769[var6];
                            int var357 = class163.field2769[var6 + 2];
                            int var358 = class163.field2769[var6 + 3];
                            int var359 = class163.field2769[var6 + 1];
                            int var360 = class163.field2769[var6 + 4];
                            class163.field2769[var6++] = (var359 - var356) * (var360 - var357) / (var358 - var357) + var356;
                            continue;
                        }
                        if (var474 == 4007) {
                            var6 -= 2;
                            long var361 = (long) class163.field2769[var6];
                            long var363 = (long) class163.field2769[var6 + 1];
                            class163.field2769[var6++] = (int) (var361 + (var361 * var363 / 100L));
                            continue;
                        }
                        if (var474 == 4008) {
                            var6 -= 2;
                            int var365 = class163.field2769[var6];
                            int var366 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class102.method799(var365, 0x1 << var366);
                            continue;
                        }
                        if (var474 == 4009) {
                            var6 -= 2;
                            int var367 = class163.field2769[var6 + 1];
                            int var368 = class163.field2769[var6];
                            class163.field2769[var6++] = class235.method1710(-(0x1 << var367) - 1, var368);
                            continue;
                        }
                        if (var474 == 4010) {
                            var6 -= 2;
                            int var369 = class163.field2769[var6 + 1];
                            int var370 = class163.field2769[var6];
                            class163.field2769[var6++] = class235.method1710(0x1 << var369, var370) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var474 == 4011) {
                            var6 -= 2;
                            int var371 = class163.field2769[var6];
                            int var372 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = var371 % var372;
                            continue;
                        }
                        if (var474 == 4012) {
                            var6 -= 2;
                            int var373 = class163.field2769[var6];
                            int var374 = class163.field2769[var6 + 1];
                            if (var373 == 0) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = (int) Math.pow((double) var373, (double) var374);
                            }
                            continue;
                        }
                        if (var474 == 4013) {
                            var6 -= 2;
                            int var375 = class163.field2769[var6 + 1];
                            int var376 = class163.field2769[var6];
                            if (var376 == 0) {
                                class163.field2769[var6++] = 0;
                            } else if (var375 == 0) {
                                class163.field2769[var6++] = Integer.MAX_VALUE;
                            } else {
                                class163.field2769[var6++] = (int) Math.pow((double) var376, 1.0D / (double) var375);
                            }
                            continue;
                        }
                        if (var474 == 4014) {
                            var6 -= 2;
                            int var377 = class163.field2769[var6];
                            int var378 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class235.method1710(var377, var378);
                            continue;
                        }
                        if (var474 == 4015) {
                            var6 -= 2;
                            int var379 = class163.field2769[var6];
                            int var380 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = class102.method799(var380, var379);
                            continue;
                        }
                        if (var474 == 4016) {
                            var6 -= 2;
                            int var381 = class163.field2769[var6];
                            int var382 = class163.field2769[var6 + 1];
                            class163.field2769[var6++] = var381 < var382 ? var381 : var382;
                            continue;
                        }
                        if (var474 == 4017) {
                            var6 -= 2;
                            int var383 = class163.field2769[var6 + 1];
                            int var384 = class163.field2769[var6];
                            class163.field2769[var6++] = var383 < var384 ? var384 : var383;
                            continue;
                        }
                        if (var474 == 4018) {
                            var6 -= 3;
                            long var385 = (long) class163.field2769[var6];
                            long var387 = (long) class163.field2769[var6 + 2];
                            long var389 = (long) class163.field2769[var6 + 1];
                            class163.field2769[var6++] = (int) (var385 * var387 / var389);
                            continue;
                        }
                    } else if (var474 < 4200) {
                        if (var474 == 4100) {
                            var10--;
                            class75 var294 = class249.field4193[var10];
                            var6--;
                            int var295 = class163.field2769[var6];
                            class249.field4193[var10++] = class66.method562((byte) 124, new class75[] { var294, class67.method565(56, var295) });
                            continue;
                        }
                        if (var474 == 4101) {
                            var10 -= 2;
                            class75 var296 = class249.field4193[var10];
                            class75 var297 = class249.field4193[var10 + 1];
                            class249.field4193[var10++] = class66.method562((byte) 121, new class75[] { var296, var297 });
                            continue;
                        }
                        if (var474 == 4102) {
                            var10--;
                            class75 var298 = class249.field4193[var10];
                            var6--;
                            int var299 = class163.field2769[var6];
                            class249.field4193[var10++] = class66.method562((byte) 123, new class75[] { var298, class67.method566(var299, -92, true) });
                            continue;
                        }
                        if (var474 == 4103) {
                            var10--;
                            class75 var300 = class249.field4193[var10];
                            class249.field4193[var10++] = var300.method622(0);
                            continue;
                        }
                        if (var474 == 4104) {
                            var6--;
                            int var301 = class163.field2769[var6];
                            long var302 = (long) var301 * 86400000L + 1014768000000L;
                            class123.field2057.setTime(new Date(var302));
                            int var304 = class123.field2057.get(5);
                            int var305 = class123.field2057.get(2);
                            int var306 = class123.field2057.get(1);
                            class249.field4193[var10++] = class66.method562((byte) -56, new class75[] { class67.method565(arg1 + 81, var304), class41.field637, class98.field1636[var305], class41.field637, class67.method565(arg1 + 87, var306) });
                            continue;
                        }
                        if (var474 == 4105) {
                            var10 -= 2;
                            class75 var307 = class249.field4193[var10];
                            class75 var308 = class249.field4193[var10 + 1];
                            if (class279.field4831.field1564 != null && class279.field4831.field1564.field3778) {
                                class249.field4193[var10++] = var308;
                                continue;
                            }
                            class249.field4193[var10++] = var307;
                            continue;
                        }
                        if (var474 == 4106) {
                            var6--;
                            int var309 = class163.field2769[var6];
                            class249.field4193[var10++] = class67.method565(77, var309);
                            continue;
                        }
                        if (var474 == 4107) {
                            var10 -= 2;
                            class163.field2769[var6++] = class249.field4193[var10].method652(class249.field4193[var10 + 1], -49);
                            continue;
                        }
                        if (var474 == 4108) {
                            var6 -= 2;
                            int var310 = class163.field2769[var6 + 1];
                            var10--;
                            class75 var311 = class249.field4193[var10];
                            int var312 = class163.field2769[var6];
                            byte[] var313 = class118.field1995.method1911(var310, 0, -113);
                            class80 var314 = new class80(var313);
                            var314.method796(class24.field316, (int[]) null);
                            class163.field2769[var6++] = var314.method776(var311, var312);
                            continue;
                        }
                        if (var474 == 4109) {
                            var6 -= 2;
                            var10--;
                            class75 var315 = class249.field4193[var10];
                            int var316 = class163.field2769[var6];
                            int var317 = class163.field2769[var6 + 1];
                            byte[] var318 = class118.field1995.method1911(var317, 0, -69);
                            class80 var319 = new class80(var318);
                            var319.method796(class24.field316, (int[]) null);
                            class163.field2769[var6++] = var319.method789(var315, var316);
                            continue;
                        }
                        if (var474 == 4110) {
                            var10 -= 2;
                            class75 var320 = class249.field4193[var10 + 1];
                            class75 var321 = class249.field4193[var10];
                            var6--;
                            if (class163.field2769[var6] == 1) {
                                class249.field4193[var10++] = var321;
                            } else {
                                class249.field4193[var10++] = var320;
                            }
                            continue;
                        }
                        if (var474 == 4111) {
                            var10--;
                            class75 var322 = class249.field4193[var10];
                            class249.field4193[var10++] = class101.method787(var322);
                            continue;
                        }
                        if (var474 == 4112) {
                            var10--;
                            class75 var323 = class249.field4193[var10];
                            var6--;
                            int var324 = class163.field2769[var6];
                            if (var324 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class249.field4193[var10++] = var323.method639(63, var324);
                            continue;
                        }
                        if (var474 == 4113) {
                            var6--;
                            int var325 = class163.field2769[var6];
                            class163.field2769[var6++] = class268.method1925(var325, true) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4114) {
                            var6--;
                            int var326 = class163.field2769[var6];
                            class163.field2769[var6++] = class140.method1080(-91, var326) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4115) {
                            var6--;
                            int var327 = class163.field2769[var6];
                            class163.field2769[var6++] = class125.method994(var327, false) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4116) {
                            var6--;
                            int var328 = class163.field2769[var6];
                            class163.field2769[var6++] = class290.method2023(arg1, var328) ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4117) {
                            var10--;
                            class75 var329 = class249.field4193[var10];
                            if (var329 == null) {
                                class163.field2769[var6++] = 0;
                            } else {
                                class163.field2769[var6++] = var329.method640(1);
                            }
                            continue;
                        }
                        if (var474 == 4118) {
                            var10--;
                            class75 var330 = class249.field4193[var10];
                            var6 -= 2;
                            int var331 = class163.field2769[var6 + 1];
                            int var332 = class163.field2769[var6];
                            class249.field4193[var10++] = var330.method661(109, var332, var331);
                            continue;
                        }
                        if (var474 == 4119) {
                            var10--;
                            class75 var333 = class249.field4193[var10];
                            class75 var334 = class89.method708(arg1 + 7391, var333.method640(1));
                            boolean var335 = false;
                            for (int var336 = 0; var336 < var333.method640(arg1 ^ 0x1); var336++) {
                                int var337 = var333.method626(160, var336);
                                if (var337 == 60) {
                                    var335 = true;
                                } else if (var337 == 62) {
                                    var335 = false;
                                } else if (!var335) {
                                    var334.method617(var337, 255);
                                }
                            }
                            var334.method623(false);
                            class249.field4193[var10++] = var334;
                            continue;
                        }
                        if (var474 == 4120) {
                            var10--;
                            class75 var338 = class249.field4193[var10];
                            var6 -= 2;
                            int var339 = class163.field2769[var6 + 1];
                            int var340 = class163.field2769[var6];
                            class163.field2769[var6++] = var338.method627(-4813, var340, var339);
                            continue;
                        }
                        if (var474 == 4121) {
                            var10 -= 2;
                            class75 var341 = class249.field4193[var10];
                            class75 var342 = class249.field4193[var10 + 1];
                            var6--;
                            int var343 = class163.field2769[var6];
                            class163.field2769[var6++] = var341.method653(var343, (byte) -26, var342);
                            continue;
                        }
                        if (var474 == 4122) {
                            var6--;
                            int var344 = class163.field2769[var6];
                            class163.field2769[var6++] = class66.method559(false, var344);
                            continue;
                        }
                        if (var474 == 4123) {
                            var6--;
                            int var345 = class163.field2769[var6];
                            class163.field2769[var6++] = class116.method887(var345, -256);
                            continue;
                        }
                    } else if (var474 < 4300) {
                        if (var474 == 4200) {
                            var6--;
                            int var129 = class163.field2769[var6];
                            class249.field4193[var10++] = class199.method1475(var129, (byte) -98).field4770;
                            continue;
                        }
                        if (var474 == 4201) {
                            var6 -= 2;
                            int var130 = class163.field2769[var6];
                            int var131 = class163.field2769[var6 + 1];
                            class278 var132 = class199.method1475(var130, (byte) -108);
                            if (var131 >= 1 && var131 <= 5 && var132.field4822[var131 - 1] != null) {
                                class249.field4193[var10++] = var132.field4822[var131 - 1];
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 4202) {
                            var6 -= 2;
                            int var133 = class163.field2769[var6];
                            int var134 = class163.field2769[var6 + 1];
                            class278 var135 = class199.method1475(var133, (byte) -27);
                            if (var134 >= 1 && var134 <= 5 && var135.field4769[var134 - 1] != null) {
                                class249.field4193[var10++] = var135.field4769[var134 - 1];
                                continue;
                            }
                            class249.field4193[var10++] = class110.field1886;
                            continue;
                        }
                        if (var474 == 4203) {
                            var6--;
                            int var136 = class163.field2769[var6];
                            class163.field2769[var6++] = class199.method1475(var136, (byte) -44).field4819;
                            continue;
                        }
                        if (var474 == 4204) {
                            var6--;
                            int var137 = class163.field2769[var6];
                            class163.field2769[var6++] = class199.method1475(var137, (byte) 109).field4779 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4205) {
                            var6--;
                            int var138 = class163.field2769[var6];
                            class278 var139 = class199.method1475(var138, (byte) 109);
                            if (var139.field4800 == -1 && var139.field4795 >= 0) {
                                class163.field2769[var6++] = var139.field4795;
                                continue;
                            }
                            class163.field2769[var6++] = var138;
                            continue;
                        }
                        if (var474 == 4206) {
                            var6--;
                            int var140 = class163.field2769[var6];
                            class278 var141 = class199.method1475(var140, (byte) 109);
                            if (var141.field4800 >= 0 && var141.field4795 >= 0) {
                                class163.field2769[var6++] = var141.field4795;
                                continue;
                            }
                            class163.field2769[var6++] = var140;
                            continue;
                        }
                        if (var474 == 4207) {
                            var6--;
                            int var142 = class163.field2769[var6];
                            class163.field2769[var6++] = class199.method1475(var142, (byte) -70).field4804 ? 1 : 0;
                            continue;
                        }
                        if (var474 == 4208) {
                            var6 -= 2;
                            int var143 = class163.field2769[var6 + 1];
                            int var144 = class163.field2769[var6];
                            class247 var145 = class19.method124((byte) -124, var143);
                            if (var145.method1784(4166)) {
                                class249.field4193[var10++] = class199.method1475(var144, (byte) 113).method1980(var145.field4175, (byte) 104, var143);
                            } else {
                                class163.field2769[var6++] = class199.method1475(var144, (byte) 126).method1971(var145.field4176, (byte) 69, var143);
                            }
                            continue;
                        }
                        if (var474 == 4210) {
                            var10--;
                            class75 var146 = class249.field4193[var10];
                            var6--;
                            int var147 = class163.field2769[var6];
                            class138.method1055(var147 == 1, var146, 40);
                            class163.field2769[var6++] = class263.field4568;
                            continue;
                        }
                        if (var474 == 4211) {
                            if (class306.field5233 != null && class115.field1952 < class263.field4568) {
                                class163.field2769[var6++] = class235.method1710(class306.field5233[class115.field1952++], 65535);
                                continue;
                            }
                            class163.field2769[var6++] = -1;
                            continue;
                        }
                        if (var474 == 4212) {
                            class115.field1952 = 0;
                            continue;
                        }
                    } else if (var474 < 4400) {
                        if (var474 == 4300) {
                            var6 -= 2;
                            int var148 = class163.field2769[var6 + 1];
                            int var149 = class163.field2769[var6];
                            class247 var150 = class19.method124((byte) -123, var148);
                            if (var150.method1784(arg1 ^ 0x1046)) {
                                class249.field4193[var10++] = class182.method1343(var149, (byte) 62).method1677(var150.field4175, 55, var148);
                            } else {
                                class163.field2769[var6++] = class182.method1343(var149, (byte) 62).method1680(var150.field4176, var148, -1);
                            }
                            continue;
                        }
                        if (var474 == 4301) {
                            var6--;
                            int var151 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var151, (byte) 62).field3846;
                            continue;
                        }
                        if (var474 == 4302) {
                            var6--;
                            int var152 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var152, (byte) 62).field3849;
                            continue;
                        }
                        if (var474 == 4303) {
                            var6--;
                            int var153 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var153, (byte) 62).field3850;
                            continue;
                        }
                        if (var474 == 4304) {
                            var6--;
                            int var154 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var154, (byte) 62).field3895;
                            continue;
                        }
                        if (var474 == 4305) {
                            var6--;
                            int var155 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var155, (byte) 62).field3882;
                            continue;
                        }
                        if (var474 == 4306) {
                            var6--;
                            int var156 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var156, (byte) 62).field3885;
                            continue;
                        }
                        if (var474 == 4307) {
                            var6--;
                            int var157 = class163.field2769[var6];
                            class163.field2769[var6++] = class182.method1343(var157, (byte) 62).field3884;
                            continue;
                        }
                    } else if (var474 >= 4500) {
                        if (var474 < 4600) {
                            if (var474 == 4500) {
                                var6 -= 2;
                                int var158 = class163.field2769[var6];
                                int var159 = class163.field2769[var6 + 1];
                                class247 var160 = class19.method124((byte) -115, var159);
                                if (var160.method1784(4166)) {
                                    class249.field4193[var10++] = class185.method1399(true, var158).method1043(var159, var160.field4175, (byte) -107);
                                } else {
                                    class163.field2769[var6++] = class185.method1399(true, var158).method1041((byte) 97, var160.field4176, var159);
                                }
                                continue;
                            }
                        } else if (var474 < 5100) {
                            if (var474 == 5000) {
                                class163.field2769[var6++] = class185.field3065;
                                continue;
                            }
                            if (var474 == 5001) {
                                var6 -= 3;
                                class188.field3130++;
                                class185.field3065 = class163.field2769[var6];
                                class258.field4333 = class163.field2769[var6 + 1];
                                class28.field364 = class163.field2769[var6 + 2];
                                class89.field1470.method87(65280, 247);
                                class89.field1470.method518(101, class185.field3065);
                                class89.field1470.method518(125, class258.field4333);
                                class89.field1470.method518(112, class28.field364);
                                continue;
                            }
                            if (var474 == 5002) {
                                class81.field1366++;
                                var10--;
                                class75 var161 = class249.field4193[var10];
                                var6 -= 2;
                                int var162 = class163.field2769[var6];
                                int var163 = class163.field2769[var6 + 1];
                                class89.field1470.method87(arg1 + 65280, 40);
                                class89.field1470.method514(30009, var161.method630(arg1 - 120));
                                class89.field1470.method518(arg1 + 107, var162 + -1);
                                class89.field1470.method518(116, var163);
                                continue;
                            }
                            if (var474 == 5003) {
                                class75 var164 = null;
                                var6--;
                                int var165 = class163.field2769[var6];
                                if (var165 < 100) {
                                    var164 = class194.field3254[var165];
                                }
                                if (var164 == null) {
                                    var164 = class110.field1886;
                                }
                                class249.field4193[var10++] = var164;
                                continue;
                            }
                            if (var474 == 5004) {
                                int var166 = -1;
                                var6--;
                                int var167 = class163.field2769[var6];
                                if (var167 < 100 && class194.field3254[var167] != null) {
                                    var166 = client.field4022[var167];
                                }
                                class163.field2769[var6++] = var166;
                                continue;
                            }
                            if (var474 == 5005) {
                                class163.field2769[var6++] = class258.field4333;
                                continue;
                            }
                            if (var474 == 5008) {
                                var10--;
                                class75 var168 = class249.field4193[var10];
                                if (!var168.method638(class171.field2882, (byte) -112)) {
                                    if (class250.field4201 == 0 && (class188.field3140 == 1 || class213.field3627 == 1)) {
                                        continue;
                                    }
                                    class207.field3504++;
                                    class75 var169 = var168.method622(0);
                                    byte var170 = 0;
                                    byte var171 = 0;
                                    if (var169.method638(class65.field1125, (byte) -112)) {
                                        var168 = var168.method650(0, class65.field1125.method640(1));
                                        var171 = 0;
                                    } else if (var169.method638(class199.field3352, (byte) -112)) {
                                        var168 = var168.method650(0, class199.field3352.method640(arg1 ^ 0x1));
                                        var171 = 1;
                                    } else if (var169.method638(class94.field1534, (byte) -112)) {
                                        var171 = 2;
                                        var168 = var168.method650(0, class94.field1534.method640(1));
                                    } else if (var169.method638(class197.field3306, (byte) -112)) {
                                        var168 = var168.method650(0, class197.field3306.method640(1));
                                        var171 = 3;
                                    } else if (var169.method638(class54.field889, (byte) -112)) {
                                        var171 = 4;
                                        var168 = var168.method650(arg1, class54.field889.method640(1));
                                    } else if (var169.method638(class189.field3156, (byte) -112)) {
                                        var171 = 5;
                                        var168 = var168.method650(0, class189.field3156.method640(1));
                                    } else if (var169.method638(class261.field4375, (byte) -112)) {
                                        var171 = 6;
                                        var168 = var168.method650(0, class261.field4375.method640(1));
                                    } else if (var169.method638(class247.field4178, (byte) -112)) {
                                        var168 = var168.method650(0, class247.field4178.method640(1));
                                        var171 = 7;
                                    } else if (var169.method638(class235.field3971, (byte) -112)) {
                                        var168 = var168.method650(arg1 ^ 0x0, class235.field3971.method640(arg1 + 1));
                                        var171 = 8;
                                    } else if (var169.method638(class255.field4271, (byte) -112)) {
                                        var171 = 9;
                                        var168 = var168.method650(0, class255.field4271.method640(1));
                                    } else if (var169.method638(class143.field2479, (byte) -112)) {
                                        var168 = var168.method650(0, class143.field2479.method640(1));
                                        var171 = 10;
                                    } else if (var169.method638(class106.field1784, (byte) -112)) {
                                        var171 = 11;
                                        var168 = var168.method650(0, class106.field1784.method640(1));
                                    } else if (class151.field2592 != 0) {
                                        if (var169.method638(class65.field1121, (byte) -112)) {
                                            var171 = 0;
                                            var168 = var168.method650(0, class65.field1121.method640(1));
                                        } else if (var169.method638(class199.field3351, (byte) -112)) {
                                            var171 = 1;
                                            var168 = var168.method650(0, class199.field3351.method640(1));
                                        } else if (var169.method638(class94.field1535, (byte) -112)) {
                                            var168 = var168.method650(arg1 ^ 0x0, class94.field1535.method640(1));
                                            var171 = 2;
                                        } else if (var169.method638(class197.field3301, (byte) -112)) {
                                            var171 = 3;
                                            var168 = var168.method650(arg1 ^ 0x0, class197.field3301.method640(1));
                                        } else if (var169.method638(class54.field892, (byte) -112)) {
                                            var168 = var168.method650(arg1, class54.field892.method640(1));
                                            var171 = 4;
                                        } else if (var169.method638(class189.field3154, (byte) -112)) {
                                            var168 = var168.method650(0, class189.field3154.method640(1));
                                            var171 = 5;
                                        } else if (var169.method638(class261.field4373, (byte) -112)) {
                                            var168 = var168.method650(0, class261.field4373.method640(1));
                                            var171 = 6;
                                        } else if (var169.method638(class247.field4174, (byte) -112)) {
                                            var168 = var168.method650(0, class247.field4174.method640(1));
                                            var171 = 7;
                                        } else if (var169.method638(class235.field3974, (byte) -112)) {
                                            var171 = 8;
                                            var168 = var168.method650(arg1 ^ 0x0, class235.field3974.method640(1));
                                        } else if (var169.method638(class255.field4268, (byte) -112)) {
                                            var168 = var168.method650(0, class255.field4268.method640(arg1 + 1));
                                            var171 = 9;
                                        } else if (var169.method638(class143.field2465, (byte) -112)) {
                                            var168 = var168.method650(0, class143.field2465.method640(1));
                                            var171 = 10;
                                        } else if (var169.method638(class106.field1787, (byte) -112)) {
                                            var171 = 11;
                                            var168 = var168.method650(0, class106.field1787.method640(1));
                                        }
                                    }
                                    class75 var172 = var168.method622(0);
                                    if (var172.method638(class59.field983, (byte) -112)) {
                                        var168 = var168.method650(0, class59.field983.method640(1));
                                        var170 = 1;
                                    } else if (var172.method638(class301.field5146, (byte) -112)) {
                                        var168 = var168.method650(0, class301.field5146.method640(1));
                                        var170 = 2;
                                    } else if (var172.method638(class240.field4058, (byte) -112)) {
                                        var170 = 3;
                                        var168 = var168.method650(0, class240.field4058.method640(1));
                                    } else if (var172.method638(class302.field5178, (byte) -112)) {
                                        var170 = 4;
                                        var168 = var168.method650(0, class302.field5178.method640(1));
                                    } else if (var172.method638(class51.field854, (byte) -112)) {
                                        var170 = 5;
                                        var168 = var168.method650(arg1 ^ 0x0, class51.field854.method640(1));
                                    } else if (class151.field2592 != 0) {
                                        if (var172.method638(class59.field987, (byte) -112)) {
                                            var170 = 1;
                                            var168 = var168.method650(0, class59.field987.method640(1));
                                        } else if (var172.method638(class301.field5154, (byte) -112)) {
                                            var170 = 2;
                                            var168 = var168.method650(0, class301.field5154.method640(1));
                                        } else if (var172.method638(class240.field4063, (byte) -112)) {
                                            var170 = 3;
                                            var168 = var168.method650(0, class240.field4063.method640(arg1 + 1));
                                        } else if (var172.method638(class302.field5166, (byte) -112)) {
                                            var168 = var168.method650(arg1, class302.field5166.method640(arg1 ^ 0x1));
                                            var170 = 4;
                                        } else if (var172.method638(class51.field834, (byte) -112)) {
                                            var170 = 5;
                                            var168 = var168.method650(0, class51.field834.method640(1));
                                        }
                                    }
                                    class89.field1470.method87(arg1 ^ 0xFF00, 93);
                                    class89.field1470.method518(100, 0);
                                    int var173 = class89.field1470.field1012;
                                    class89.field1470.method518(126, var171);
                                    class89.field1470.method518(120, var170);
                                    class113.method879(var168, class89.field1470, 0);
                                    class89.field1470.method520(class89.field1470.field1012 - var173, -1);
                                    continue;
                                }
                                class306.method2099(32, var168);
                                continue;
                            }
                            if (var474 == 5009) {
                                var10 -= 2;
                                class75 var174 = class249.field4193[var10];
                                class75 var175 = class249.field4193[var10 + 1];
                                if (class250.field4201 != 0 || class188.field3140 != 1 && class213.field3627 != 1) {
                                    class89.field1470.method87(arg1 + 65280, 249);
                                    class89.field1470.method518(arg1 + 111, 0);
                                    class116.field1959++;
                                    int var176 = class89.field1470.field1012;
                                    class89.field1470.method514(30009, var174.method630(-44));
                                    class113.method879(var175, class89.field1470, 0);
                                    class89.field1470.method520(class89.field1470.field1012 - var176, -1);
                                }
                                continue;
                            }
                            if (var474 == 5010) {
                                var6--;
                                int var177 = class163.field2769[var6];
                                class75 var178 = null;
                                if (var177 < 100) {
                                    var178 = class88.field1455[var177];
                                }
                                if (var178 == null) {
                                    var178 = class110.field1886;
                                }
                                class249.field4193[var10++] = var178;
                                continue;
                            }
                            if (var474 == 5011) {
                                var6--;
                                int var179 = class163.field2769[var6];
                                class75 var180 = null;
                                if (var179 < 100) {
                                    var180 = class153.field2637[var179];
                                }
                                if (var180 == null) {
                                    var180 = class110.field1886;
                                }
                                class249.field4193[var10++] = var180;
                                continue;
                            }
                            if (var474 == 5012) {
                                var6--;
                                int var181 = class163.field2769[var6];
                                int var182 = -1;
                                if (var181 < 100) {
                                    var182 = class190.field3164[var181];
                                }
                                class163.field2769[var6++] = var182;
                                continue;
                            }
                            if (var474 == 5015) {
                                class75 var183;
                                if (class279.field4831 == null || class279.field4831.field1561 == null) {
                                    var183 = class121.field2044;
                                } else {
                                    var183 = class279.field4831.method738((byte) -128);
                                }
                                class249.field4193[var10++] = var183;
                                continue;
                            }
                            if (var474 == 5016) {
                                class163.field2769[var6++] = class28.field364;
                                continue;
                            }
                            if (var474 == 5017) {
                                class163.field2769[var6++] = class147.field2558;
                                continue;
                            }
                            if (var474 == 5050) {
                                var6--;
                                int var184 = class163.field2769[var6];
                                class249.field4193[var10++] = class186.method1405(-20942, var184).field2435;
                                continue;
                            }
                            if (var474 == 5051) {
                                var6--;
                                int var185 = class163.field2769[var6];
                                class140 var186 = class186.method1405(-20942, var185);
                                if (var186.field2432 == null) {
                                    class163.field2769[var6++] = 0;
                                } else {
                                    class163.field2769[var6++] = var186.field2432.length;
                                }
                                continue;
                            }
                            if (var474 == 5052) {
                                var6 -= 2;
                                int var187 = class163.field2769[var6];
                                int var188 = class163.field2769[var6 + 1];
                                class140 var189 = class186.method1405(arg1 ^ 0xFFFFAE32, var187);
                                int var190 = var189.field2432[var188];
                                class163.field2769[var6++] = var190;
                                continue;
                            }
                            if (var474 == 5053) {
                                var6--;
                                int var191 = class163.field2769[var6];
                                class140 var192 = class186.method1405(-20942, var191);
                                if (var192.field2422 == null) {
                                    class163.field2769[var6++] = 0;
                                } else {
                                    class163.field2769[var6++] = var192.field2422.length;
                                }
                                continue;
                            }
                            if (var474 == 5054) {
                                var6 -= 2;
                                int var193 = class163.field2769[var6];
                                int var194 = class163.field2769[var6 + 1];
                                class163.field2769[var6++] = class186.method1405(-20942, var193).field2422[var194];
                                continue;
                            }
                            if (var474 == 5055) {
                                var6--;
                                int var195 = class163.field2769[var6];
                                class249.field4193[var10++] = class303.method2087(class93.method728(arg1, 1), var195).method1279(18696);
                                continue;
                            }
                            if (var474 == 5056) {
                                var6--;
                                int var196 = class163.field2769[var6];
                                class173 var197 = class303.method2087(arg1 ^ 0x1, var196);
                                if (var197.field2918 == null) {
                                    class163.field2769[var6++] = 0;
                                } else {
                                    class163.field2769[var6++] = var197.field2918.length;
                                }
                                continue;
                            }
                            if (var474 == 5057) {
                                var6 -= 2;
                                int var198 = class163.field2769[var6];
                                int var199 = class163.field2769[var6 + 1];
                                class163.field2769[var6++] = class303.method2087(1, var198).field2918[var199];
                                continue;
                            }
                            if (var474 == 5058) {
                                class59.field992 = new class200();
                                var6--;
                                class59.field992.field3377 = class163.field2769[var6];
                                class59.field992.field3390 = class303.method2087(1, class59.field992.field3377);
                                class59.field992.field3382 = new int[class59.field992.field3390.method1280(6972)];
                                continue;
                            }
                            if (var474 == 5059) {
                                class89.field1470.method87(arg1 ^ 0xFF00, 59);
                                class72.field1222++;
                                class89.field1470.method518(arg1 ^ 0x6F, 0);
                                int var200 = class89.field1470.field1012;
                                class89.field1470.method518(108, 0);
                                class89.field1470.method503(-597878072, class59.field992.field3377);
                                class59.field992.field3390.method1285(class59.field992.field3382, class89.field1470, (byte) 1);
                                class89.field1470.method520(class89.field1470.field1012 - var200, arg1 + -1);
                                continue;
                            }
                            if (var474 == 5060) {
                                class113.field1921++;
                                var10--;
                                class75 var201 = class249.field4193[var10];
                                class89.field1470.method87(65280, 147);
                                class89.field1470.method518(105, 0);
                                int var202 = class89.field1470.field1012;
                                class89.field1470.method514(30009, var201.method630(-112));
                                class89.field1470.method503(-597878072, class59.field992.field3377);
                                class59.field992.field3390.method1285(class59.field992.field3382, class89.field1470, (byte) 1);
                                class89.field1470.method520(class89.field1470.field1012 - var202, -1);
                                continue;
                            }
                            if (var474 == 5061) {
                                class89.field1470.method87(arg1 ^ 0xFF00, 59);
                                class89.field1470.method518(100, 0);
                                class72.field1222++;
                                int var203 = class89.field1470.field1012;
                                class89.field1470.method518(106, 1);
                                class89.field1470.method503(arg1 - 597878072, class59.field992.field3377);
                                class59.field992.field3390.method1285(class59.field992.field3382, class89.field1470, (byte) 1);
                                class89.field1470.method520(class89.field1470.field1012 - var203, -1);
                                continue;
                            }
                            if (var474 == 5062) {
                                var6 -= 2;
                                int var204 = class163.field2769[var6];
                                int var205 = class163.field2769[var6 + 1];
                                class163.field2769[var6++] = class186.method1405(-20942, var204).field2434[var205];
                                continue;
                            }
                            if (var474 == 5063) {
                                var6 -= 2;
                                int var206 = class163.field2769[var6];
                                int var207 = class163.field2769[var6 + 1];
                                class163.field2769[var6++] = class186.method1405(-20942, var206).field2440[var207];
                                continue;
                            }
                            if (var474 == 5064) {
                                var6 -= 2;
                                int var208 = class163.field2769[var6 + 1];
                                int var209 = class163.field2769[var6];
                                if (var208 == -1) {
                                    class163.field2769[var6++] = -1;
                                } else {
                                    class163.field2769[var6++] = class186.method1405(-20942, var209).method1087(108, var208);
                                }
                                continue;
                            }
                            if (var474 == 5065) {
                                var6 -= 2;
                                int var210 = class163.field2769[var6];
                                int var211 = class163.field2769[var6 + 1];
                                if (var211 == -1) {
                                    class163.field2769[var6++] = -1;
                                } else {
                                    class163.field2769[var6++] = class186.method1405(-20942, var210).method1084(var211, true);
                                }
                                continue;
                            }
                            if (var474 == 5066) {
                                var6--;
                                int var212 = class163.field2769[var6];
                                class163.field2769[var6++] = class303.method2087(1, var212).method1280(6972);
                                continue;
                            }
                            if (var474 == 5067) {
                                var6 -= 2;
                                int var213 = class163.field2769[var6 + 1];
                                int var214 = class163.field2769[var6];
                                int var215 = class303.method2087(arg1 ^ 0x1, var214).method1278(var213, (byte) 103);
                                class163.field2769[var6++] = var215;
                                continue;
                            }
                            if (var474 == 5068) {
                                var6 -= 2;
                                int var216 = class163.field2769[var6 + 1];
                                int var217 = class163.field2769[var6];
                                class59.field992.field3382[var217] = var216;
                                continue;
                            }
                            if (var474 == 5069) {
                                var6 -= 2;
                                int var218 = class163.field2769[var6];
                                int var219 = class163.field2769[var6 + 1];
                                class59.field992.field3382[var218] = var219;
                                continue;
                            }
                            if (var474 == 5070) {
                                var6 -= 3;
                                int var220 = class163.field2769[var6 + 1];
                                int var221 = class163.field2769[var6];
                                int var222 = class163.field2769[var6 + 2];
                                class173 var223 = class303.method2087(arg1 ^ 0x1, var221);
                                if (var223.method1278(var220, (byte) 103) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class163.field2769[var6++] = var223.method1282(var220, var222, -127);
                                continue;
                            }
                        } else if (var474 < 5200) {
                            if (var474 == 5100) {
                                if (class163.field2767[86]) {
                                    class163.field2769[var6++] = 1;
                                } else {
                                    class163.field2769[var6++] = 0;
                                }
                                continue;
                            }
                            if (var474 == 5101) {
                                if (class163.field2767[82]) {
                                    class163.field2769[var6++] = 1;
                                } else {
                                    class163.field2769[var6++] = 0;
                                }
                                continue;
                            }
                            if (var474 == 5102) {
                                if (class163.field2767[81]) {
                                    class163.field2769[var6++] = 1;
                                } else {
                                    class163.field2769[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var474 < 5300) {
                            if (var474 == 5200) {
                                var6--;
                                class153.method1169(class163.field2769[var6], false);
                                continue;
                            }
                            if (var474 == 5201) {
                                class163.field2769[var6++] = class272.method1941(-114);
                                continue;
                            }
                            if (var474 == 5202) {
                                var6--;
                                class126.method1005(23053, class163.field2769[var6]);
                                continue;
                            }
                            if (var474 == 5203) {
                                var10--;
                                class175.method1293(class249.field4193[var10], false);
                                continue;
                            }
                            if (var474 == 5204) {
                                class249.field4193[var10 - 1] = class268.method1924(-23327, class249.field4193[var10 - 1]);
                                continue;
                            }
                            if (var474 == 5205) {
                                var10--;
                                class190.method1435(class249.field4193[var10], (byte) -84);
                                continue;
                            }
                            if (var474 == 5206) {
                                var6--;
                                int var224 = class163.field2769[var6];
                                class177 var225 = class125.method970(var224 & 0x3FFF, (var224 & 0xFFFD4CE) >> 14, 21014);
                                if (var225 == null) {
                                    class249.field4193[var10++] = class110.field1886;
                                } else {
                                    class249.field4193[var10++] = var225.field2974;
                                }
                                continue;
                            }
                            if (var474 == 5207) {
                                var10--;
                                class177 var226 = class177.method1305(class249.field4193[var10], (byte) 100);
                                if (var226 != null && var226.field2987 != null) {
                                    class249.field4193[var10++] = var226.field2987;
                                    continue;
                                }
                                class249.field4193[var10++] = class110.field1886;
                                continue;
                            }
                        } else if (var474 < 5400) {
                            if (var474 == 5300) {
                                var6 -= 2;
                                int var280 = class163.field2769[var6 + 1];
                                int var281 = class163.field2769[var6];
                                if (class299.field5117 != null) {
                                    class28.method183((byte) 68);
                                }
                                class100.method770(var281, var280, true);
                                class163.field2769[var6++] = class299.field5117 == null ? 0 : 1;
                                continue;
                            }
                            if (var474 == 5301) {
                                if (class299.field5117 != null) {
                                    class28.method183((byte) 88);
                                }
                                continue;
                            }
                            if (var474 == 5302) {
                                class89[] var282 = class26.method171(16551);
                                class163.field2769[var6++] = var282.length;
                                continue;
                            }
                            if (var474 == 5303) {
                                var6--;
                                int var283 = class163.field2769[var6];
                                class89[] var284 = class26.method171(16551);
                                class163.field2769[var6++] = var284[var283].field1474;
                                class163.field2769[var6++] = var284[var283].field1464;
                                continue;
                            }
                            if (var474 == 5305) {
                                int var285 = class177.field2985;
                                int var286 = class285.field4901;
                                int var287 = -1;
                                class89[] var288 = class26.method171(arg1 ^ 0x40A7);
                                for (int var289 = 0; var289 < var288.length; var289++) {
                                    class89 var290 = var288[var289];
                                    if (var290.field1474 == var286 && var290.field1464 == var285) {
                                        var287 = var289;
                                        break;
                                    }
                                }
                                class163.field2769[var6++] = var287;
                                continue;
                            }
                            if (var474 == 5306) {
                                class163.field2769[var6++] = class301.method2071((byte) 59);
                                continue;
                            }
                        } else if (var474 < 5500) {
                            if (var474 == 5400) {
                                var10 -= 2;
                                class75 var258 = class249.field4193[var10];
                                class196.field3297++;
                                class75 var259 = class249.field4193[var10 + 1];
                                var6--;
                                int var260 = class163.field2769[var6];
                                class89.field1470.method87(65280, 47);
                                class89.field1470.method518(arg1 + 108, class199.method1488((byte) -84, var258) + 1 - -class199.method1488((byte) -84, var259));
                                class89.field1470.method516((byte) -20, var258);
                                class89.field1470.method516((byte) -20, var259);
                                class89.field1470.method518(103, var260);
                                continue;
                            }
                            if (var474 == 5401) {
                                var6 -= 2;
                                class11.field146[class163.field2769[var6]] = (short) class97.method748((byte) -76, class163.field2769[var6 + 1]);
                                class306.method2100(26534);
                                class153.method1172(arg1 - 1);
                                class150.method1150(29763);
                                class274.method1952((byte) 122);
                                class258.method1840((byte) -63);
                                continue;
                            }
                            if (var474 == 5405) {
                                var6 -= 2;
                                int var261 = class163.field2769[var6];
                                int var262 = class163.field2769[var6 + 1];
                                if (var261 >= 0 && var261 < 2) {
                                    class274.field4724[var261] = new int[var262 << 1][4];
                                }
                                continue;
                            }
                            if (var474 == 5406) {
                                var6 -= 7;
                                int var263 = class163.field2769[var6];
                                int var264 = class163.field2769[var6 + 1] << 1;
                                int var265 = class163.field2769[var6 + 2];
                                int var266 = class163.field2769[var6 + 5];
                                int var267 = class163.field2769[var6 + 3];
                                int var268 = class163.field2769[var6 + 4];
                                int var269 = class163.field2769[var6 + 6];
                                if (var263 >= 0 && var263 < 2 && class274.field4724[var263] != null && var264 >= 0 && class274.field4724[var263].length > var264) {
                                    class274.field4724[var263][var264] = new int[] { (class235.method1710(268419283, var265) >> 14) * 128, var267, class235.method1710(16383, var265) * 128, var269 };
                                    class274.field4724[var263][var264 + 1] = new int[] { class235.method1710(var268 >> 14, 16383) * 128, var266, class235.method1710(16383, var268) * 128 };
                                }
                                continue;
                            }
                            if (var474 == 5407) {
                                var6--;
                                int var270 = class274.field4724[class163.field2769[var6]].length >> 1;
                                class163.field2769[var6++] = var270;
                                continue;
                            }
                            if (var474 == 5408) {
                                class163.field2769[var6++] = 1;
                                continue;
                            }
                            if (var474 == 5409) {
                                class51.method376((byte) 76);
                                continue;
                            }
                            if (var474 == 5411) {
                                if (class299.field5117 != null) {
                                    class28.method183((byte) 124);
                                }
                                if (class211.field3601 == null) {
                                    class302.method2078(arg1 ^ 0xFFFFFF84, class152.method1164(true), false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var474 == 5419) {
                                class75 var271 = class110.field1886;
                                if (class75.field1306 != null) {
                                    var271 = class168.method1245((byte) 126, class75.field1306.field1326);
                                    try {
                                        if (class75.field1306.field1329 != null) {
                                            byte[] var272 = ((String) class75.field1306.field1329).getBytes("ISO-8859-1");
                                            var271 = class191.method1442(var272.length, (byte) 113, 0, var272);
                                        }
                                    } catch (UnsupportedEncodingException var471) {
                                    }
                                }
                                class249.field4193[var10++] = var271;
                                continue;
                            }
                            if (var474 == 5420) {
                                class163.field2769[var6++] = class177.field2975 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 5421) {
                                if (class299.field5117 != null) {
                                    class28.method183((byte) 96);
                                }
                                var6--;
                                boolean var274 = class163.field2769[var6] == 1;
                                var10--;
                                class75 var275 = class249.field4193[var10];
                                class75 var276 = class66.method562((byte) 116, new class75[] { class152.method1164(true), var275 });
                                if (class211.field3601 != null || var274 && class177.field2975 != 2 && class124.field2070.startsWith("win") && !class87.field1441) {
                                    class187.field3122 = var274;
                                    class298.field5096 = var276;
                                    class151.field2604 = class210.field3585.method952(true, new String(var276.method659(false), "ISO-8859-1"));
                                    continue;
                                }
                                class302.method2078(-108, var276, var274);
                                continue;
                            }
                            if (var474 == 5422) {
                                var10 -= 2;
                                class75 var277 = class249.field4193[var10 + 1];
                                var6--;
                                int var278 = class163.field2769[var6];
                                class75 var279 = class249.field4193[var10];
                                if (var279.method640(arg1 ^ 0x1) > 0) {
                                    if (class175.field2949 == null) {
                                        class175.field2949 = new class75[class182.field3030[class230.field3907]];
                                    }
                                    class175.field2949[var278] = var279;
                                }
                                if (var277.method640(arg1 + 1) > 0) {
                                    if (class195.field3284 == null) {
                                        class195.field3284 = new class75[class182.field3030[class230.field3907]];
                                    }
                                    class195.field3284[var278] = var277;
                                }
                                continue;
                            }
                        } else if (var474 < 5600) {
                            if (var474 == 5500) {
                                var6 -= 4;
                                int var227 = class163.field2769[var6];
                                int var228 = class163.field2769[var6 + 1];
                                int var229 = class163.field2769[var6 + 2];
                                int var230 = class163.field2769[var6 + 3];
                                class100.method766((byte) -29, var230, ((var227 & 0xFFFFC04) >> 14) - class275.field4737, (var227 & 0x3FFF) + -class175.field2939, var229, var228, false);
                                continue;
                            }
                            if (var474 == 5501) {
                                var6 -= 4;
                                int var231 = class163.field2769[var6 + 1];
                                int var232 = class163.field2769[var6];
                                int var233 = class163.field2769[var6 + 2];
                                int var234 = class163.field2769[var6 + 3];
                                class113.method877((var232 >> 14 & 0x3FFF) - class275.field4737, -1, var233, var231, var234, (var232 & 0x3FFF) - class175.field2939);
                                continue;
                            }
                            if (var474 == 5502) {
                                var6 -= 6;
                                int var235 = class163.field2769[var6];
                                if (var235 >= 2) {
                                    throw new RuntimeException();
                                }
                                class272.field4693 = var235;
                                int var236 = class163.field2769[var6 + 1];
                                if ((class274.field4724[class272.field4693].length >> 1) <= (var236 + 1)) {
                                    throw new RuntimeException();
                                }
                                class127.field2203 = var236;
                                class28.field392 = 0;
                                class253.field4257 = class163.field2769[var6 + 2];
                                class9.field119 = class163.field2769[var6 + 3];
                                int var237 = class163.field2769[var6 + 4];
                                if (var237 >= 2) {
                                    throw new RuntimeException();
                                }
                                class188.field3142 = var237;
                                int var238 = class163.field2769[var6 + 5];
                                if ((class274.field4724[class188.field3142].length >> 1) <= (var238 + 1)) {
                                    throw new RuntimeException();
                                }
                                class163.field2777 = 3;
                                class24.field307 = var238;
                                continue;
                            }
                            if (var474 == 5503) {
                                class89.method707(16384);
                                continue;
                            }
                            if (var474 == 5504) {
                                var6 -= 2;
                                class95.field1547 = class163.field2769[var6];
                                class290.field4981 = class163.field2769[var6 + 1];
                                class17.method103((byte) -127);
                                continue;
                            }
                            if (var474 == 5505) {
                                class163.field2769[var6++] = class95.field1547;
                                continue;
                            }
                            if (var474 == 5506) {
                                class163.field2769[var6++] = class290.field4981;
                                continue;
                            }
                        } else if (var474 < 5700) {
                            if (var474 == 5600) {
                                var10 -= 2;
                                class75 var254 = class249.field4193[var10];
                                class75 var255 = class249.field4193[var10 + 1];
                                var6--;
                                int var256 = class163.field2769[var6];
                                if (class118.field2003 == 10 && class207.field3498 == 0 && class252.field4225 == 0) {
                                    class164.method1227(var254, var256, (byte) 120, var255);
                                }
                                continue;
                            }
                            if (var474 == 5601) {
                                class260.method1857(0);
                                continue;
                            }
                            if (var474 == 5602) {
                                if (class207.field3498 == 0) {
                                    class69.field1183 = -2;
                                }
                                continue;
                            }
                            if (var474 == 5603) {
                                var6 -= 4;
                                if (class118.field2003 == 10 && class207.field3498 == 0 && class252.field4225 == 0) {
                                    class262.method1865((byte) 114, class163.field2769[var6 + 2], class163.field2769[var6 + 3], class163.field2769[var6], class163.field2769[var6 + 1]);
                                }
                                continue;
                            }
                            if (var474 == 5604) {
                                var10--;
                                if (class118.field2003 == 10 && class207.field3498 == 0 && class252.field4225 == 0) {
                                    class43.method288(class249.field4193[var10].method630(-124), arg1 ^ 0x0);
                                }
                                continue;
                            }
                            if (var474 == 5605) {
                                var10 -= 2;
                                var6 -= 4;
                                if (class118.field2003 == 10 && class207.field3498 == 0 && class252.field4225 == 0) {
                                    class305.method2098(class163.field2769[var6 + 2], class163.field2769[var6 + 3], class163.field2769[var6], class163.field2769[var6 + 1], class249.field4193[var10 + 1], class249.field4193[var10].method630(-47), 112);
                                }
                                continue;
                            }
                            if (var474 == 5606) {
                                if (class252.field4225 == 0) {
                                    class139.field2377 = -2;
                                }
                                continue;
                            }
                            if (var474 == 5607) {
                                class163.field2769[var6++] = class69.field1183;
                                continue;
                            }
                            if (var474 == 5608) {
                                class163.field2769[var6++] = class296.field5075;
                                continue;
                            }
                            if (var474 == 5609) {
                                class163.field2769[var6++] = class139.field2377;
                                continue;
                            }
                            if (var474 == 5610) {
                                for (int var257 = 0; var257 < 5; var257++) {
                                    class249.field4193[var10++] = class41.field657.length <= var257 ? class110.field1886 : class41.field657[var257].method613(class93.method728(arg1, 122));
                                }
                                class41.field657 = null;
                                continue;
                            }
                            if (var474 == 5611) {
                                class163.field2769[var6++] = class118.field1997;
                                continue;
                            }
                        } else if (var474 < 6100) {
                            if (var474 == 6001) {
                                var6--;
                                int var248 = class163.field2769[var6];
                                if (var248 < 1) {
                                    var248 = 1;
                                }
                                if (var248 > 4) {
                                    var248 = 4;
                                }
                                class253.field4256 = var248;
                                if (!class116.field1970) {
                                    if (class253.field4256 == 1) {
                                        class21.method149(0.9F);
                                    }
                                    if (class253.field4256 == 2) {
                                        class21.method149(0.8F);
                                    }
                                    if (class253.field4256 == 3) {
                                        class21.method149(0.7F);
                                    }
                                    if (class253.field4256 == 4) {
                                        class21.method149(0.6F);
                                    }
                                }
                                class32.method216(true);
                                if (!class116.field1970) {
                                    class242.method1763(17243);
                                }
                                class153.method1172(-1);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6002) {
                                var6--;
                                class182.method1344(class163.field2769[var6] == 1, (byte) 54);
                                class2.method12(-104);
                                class242.method1763(17243);
                                class63.method544(arg1 ^ 0x61);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6003) {
                                var6--;
                                class74.field1239 = class163.field2769[var6] == 1;
                                class63.method544(-89);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6005) {
                                var6--;
                                class161.field2727 = class163.field2769[var6] == 1;
                                class242.method1763(17243);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6006) {
                                var6--;
                                class273.field4709 = class163.field2769[var6] == 1;
                                ((class139) class21.field279).method1062(79, !class273.field4709);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6007) {
                                var6--;
                                class246.field4140 = class163.field2769[var6] == 1;
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6008) {
                                var6--;
                                class125.field2088 = class163.field2769[var6] == 1;
                                class64.method549(arg1, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6009) {
                                var6--;
                                class75.field1293 = class163.field2769[var6] == 1;
                                class64.method549(arg1 ^ 0x0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6010) {
                                var6--;
                                class75.field1286 = class163.field2769[var6] == 1;
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6011) {
                                var6--;
                                int var249 = class163.field2769[var6];
                                if (var249 < 0 || var249 > 2) {
                                    var249 = 0;
                                }
                                class157.field2692 = var249;
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6012) {
                                class140.method1079(0, (byte) 126, 0);
                                var6--;
                                class116.field1970 = class163.field2769[var6] == 1;
                                if (class116.field1970) {
                                    class21.method149(0.7F);
                                } else {
                                    if (class253.field4256 == 1) {
                                        class21.method149(0.9F);
                                    }
                                    if (class253.field4256 == 2) {
                                        class21.method149(0.8F);
                                    }
                                    if (class253.field4256 == 3) {
                                        class21.method149(0.7F);
                                    }
                                    if (class253.field4256 == 4) {
                                        class21.method149(0.6F);
                                    }
                                }
                                class242.method1763(arg1 ^ 0x435B);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6014) {
                                var6--;
                                field2816 = class163.field2769[var6] == 1;
                                class242.method1763(arg1 + 17243);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6015) {
                                var6--;
                                class69.field1193 = class163.field2769[var6] == 1;
                                class32.method216(true);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6016) {
                                var6--;
                                int var250 = class163.field2769[var6];
                                class17.field220 = true;
                                if (var250 < 0 || var250 > 2) {
                                    var250 = 0;
                                }
                                class274.field4727 = var250;
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6017) {
                                var6--;
                                class151.field2599 = class163.field2769[var6] == 1;
                                class246.method1778(-125);
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6018) {
                                var6--;
                                int var251 = class163.field2769[var6];
                                if (var251 < 0) {
                                    var251 = 0;
                                }
                                if (var251 > 127) {
                                    var251 = 127;
                                }
                                class17.field221 = var251;
                                class64.method549(arg1 ^ 0x0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6019) {
                                var6--;
                                int var252 = class163.field2769[var6];
                                if (var252 < 0) {
                                    var252 = 0;
                                }
                                if (var252 > 255) {
                                    var252 = 255;
                                }
                                if (class164.field2783 != var252) {
                                    if (class164.field2783 == 0 && class163.field2780 != -1) {
                                        class61.method539(false, class163.field2780, var252, 0, class302.field5172, false);
                                        class283.field4886 = false;
                                    } else if (var252 == 0) {
                                        class59.method471(arg1 + 1);
                                        class283.field4886 = false;
                                    } else {
                                        class37.method246(false, var252);
                                    }
                                    class164.field2783 = var252;
                                }
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6020) {
                                var6--;
                                int var253 = class163.field2769[var6];
                                if (var253 < 0) {
                                    var253 = 0;
                                }
                                if (var253 > 127) {
                                    var253 = 127;
                                }
                                class285.field4909 = var253;
                                class64.method549(0, class210.field3585);
                                class120.field2014 = false;
                                continue;
                            }
                            if (var474 == 6021) {
                                var6--;
                                class108.field1811 = class163.field2769[var6] == 1;
                                class63.method544(arg1 ^ 0xFFFFFF94);
                                continue;
                            }
                            if (var474 == 6022) {
                                var6--;
                                class279.field4838 = class163.field2769[var6] == 1;
                                class64.method549(0, class210.field3585);
                                class29.method198(0, 765);
                                continue;
                            }
                        } else if (var474 < 6200) {
                            if (var474 == 6101) {
                                class163.field2769[var6++] = class253.field4256;
                                continue;
                            }
                            if (var474 == 6102) {
                                class163.field2769[var6++] = class300.method2067(-12461) ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6103) {
                                class163.field2769[var6++] = class74.field1239 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6105) {
                                class163.field2769[var6++] = class161.field2727 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6106) {
                                class163.field2769[var6++] = class273.field4709 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6107) {
                                class163.field2769[var6++] = class246.field4140 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6108) {
                                class163.field2769[var6++] = class125.field2088 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6109) {
                                class163.field2769[var6++] = class75.field1293 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6110) {
                                class163.field2769[var6++] = class75.field1286 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6111) {
                                class163.field2769[var6++] = class157.field2692;
                                continue;
                            }
                            if (var474 == 6112) {
                                class163.field2769[var6++] = class116.field1970 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6114) {
                                class163.field2769[var6++] = field2816 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6115) {
                                class163.field2769[var6++] = class69.field1193 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6116) {
                                class163.field2769[var6++] = class274.field4727;
                                continue;
                            }
                            if (var474 == 6117) {
                                class163.field2769[var6++] = class151.field2599 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6118) {
                                class163.field2769[var6++] = class17.field221;
                                continue;
                            }
                            if (var474 == 6119) {
                                class163.field2769[var6++] = class164.field2783;
                                continue;
                            }
                            if (var474 == 6120) {
                                class163.field2769[var6++] = class285.field4909;
                                continue;
                            }
                            if (var474 == 6121) {
                                class163.field2769[var6++] = class47.field769 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6122) {
                                class163.field2769[var6++] = class279.field4838 ? 1 : 0;
                                continue;
                            }
                        } else if (var474 < 6300) {
                            if (var474 == 6200) {
                                var6 -= 2;
                                class43.field712 = (short) class163.field2769[var6];
                                if (class43.field712 <= 0) {
                                    class43.field712 = 256;
                                }
                                class169.field2850 = (short) class163.field2769[var6 + 1];
                                if (class169.field2850 <= 0) {
                                    class169.field2850 = 205;
                                }
                                continue;
                            }
                            if (var474 == 6201) {
                                var6 -= 2;
                                class144.field2485 = (short) class163.field2769[var6];
                                if (class144.field2485 <= 0) {
                                    class144.field2485 = 256;
                                }
                                class172.field2903 = (short) class163.field2769[var6 + 1];
                                if (class172.field2903 <= 0) {
                                    class172.field2903 = 320;
                                }
                                continue;
                            }
                            if (var474 == 6202) {
                                var6 -= 4;
                                class12.field159 = (short) class163.field2769[var6];
                                if (class12.field159 <= 0) {
                                    class12.field159 = 1;
                                }
                                class59.field991 = (short) class163.field2769[var6 + 1];
                                if (class59.field991 <= 0) {
                                    class59.field991 = 32767;
                                } else if (class59.field991 < class12.field159) {
                                    class59.field991 = class12.field159;
                                }
                                class3.field32 = (short) class163.field2769[var6 + 2];
                                if (class3.field32 <= 0) {
                                    class3.field32 = 1;
                                }
                                class149.field2564 = (short) class163.field2769[var6 + 3];
                                if (class149.field2564 <= 0) {
                                    class149.field2564 = 32767;
                                } else if (class3.field32 > class149.field2564) {
                                    class149.field2564 = class3.field32;
                                }
                                continue;
                            }
                            if (var474 == 6203) {
                                class93.method726(0, (byte) 111, class176.field2960.field4517, 0, class176.field2960.field4531, false);
                                class163.field2769[var6++] = class104.field1760;
                                class163.field2769[var6++] = class161.field2735;
                                continue;
                            }
                            if (var474 == 6204) {
                                class163.field2769[var6++] = class144.field2485;
                                class163.field2769[var6++] = class172.field2903;
                                continue;
                            }
                            if (var474 == 6205) {
                                class163.field2769[var6++] = class43.field712;
                                class163.field2769[var6++] = class169.field2850;
                                continue;
                            }
                        } else if (var474 < 6400) {
                            if (var474 == 6300) {
                                class163.field2769[var6++] = (int) (class78.method669(2047) / 60000L);
                                continue;
                            }
                            if (var474 == 6301) {
                                class163.field2769[var6++] = (int) (class78.method669(2047) / 86400000L) - 11745;
                                continue;
                            }
                            if (var474 == 6302) {
                                var6 -= 3;
                                int var243 = class163.field2769[var6];
                                int var244 = class163.field2769[var6 + 1];
                                int var245 = class163.field2769[var6 + 2];
                                class123.field2057.clear();
                                class123.field2057.set(11, 12);
                                class123.field2057.set(var245, var244, var243);
                                class163.field2769[var6++] = (int) (class123.field2057.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var474 == 6303) {
                                class123.field2057.clear();
                                class123.field2057.setTime(new Date(class78.method669(arg1 + 2047)));
                                class163.field2769[var6++] = class123.field2057.get(1);
                                continue;
                            }
                            if (var474 == 6304) {
                                var6--;
                                int var246 = class163.field2769[var6];
                                boolean var247 = true;
                                if (var246 < 0) {
                                    var247 = (var246 + 1) % 4 == 0;
                                } else if (var246 < 1582) {
                                    var247 = (var246 % 4) == 0;
                                } else if (var246 % 4 != 0) {
                                    var247 = false;
                                } else if (var246 % 100 != 0) {
                                    var247 = true;
                                } else if ((var246 % 400) != 0) {
                                    var247 = false;
                                }
                                class163.field2769[var6++] = var247 ? 1 : 0;
                                continue;
                            }
                        } else if (var474 < 6500) {
                            if (var474 == 6400) {
                                class163.field2769[var6++] = class301.field5152 ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6401) {
                                var10--;
                                class75 var239 = class249.field4193[var10];
                                var6--;
                                int var240 = class163.field2769[var6];
                                String var241;
                                try {
                                    var241 = new String(var239.method659(false), "ISO-8859-1");
                                } catch (UnsupportedEncodingException var472) {
                                    var241 = new String(var239.method659(false));
                                }
                                if (class301.field5152) {
                                    if (!browsercontrol.iscreated()) {
                                        browsercontrol.create("about:blank");
                                    }
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate(var241);
                                        class240.field4061 = var240;
                                        class29.method198(0, 765);
                                    }
                                }
                                continue;
                            }
                            if (var474 == 6402) {
                                if (browsercontrol.iscreated()) {
                                    browsercontrol.navigate("about:blank");
                                    browsercontrol.hide();
                                    class240.field4061 = 0;
                                    class29.method198(0, 765);
                                }
                                continue;
                            }
                            if (var474 == 6403) {
                                class249.field4193[var10++] = class263.field4559;
                                continue;
                            }
                            if (var474 == 6404) {
                                class249.field4193[var10++] = class219.field3746;
                                continue;
                            }
                            if (var474 == 6405) {
                                class163.field2769[var6++] = class102.method800(-99) ? 1 : 0;
                                continue;
                            }
                            if (var474 == 6406) {
                                class163.field2769[var6++] = class274.method1953(-1) ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var474 == 4400) {
                        var6 -= 2;
                        int var291 = class163.field2769[var6 + 1];
                        int var292 = class163.field2769[var6];
                        class247 var293 = class19.method124((byte) -123, var291);
                        if (var293.method1784(4166)) {
                            class249.field4193[var10++] = class3.method14((byte) 83, var292).method846(var293.field4175, -31922, var291);
                        } else {
                            class163.field2769[var6++] = class3.method14((byte) 83, var292).method839(var293.field4176, -6774, var291);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var473) {
            if (var5.field29 == null) {
                if (class265.field4574 != 0) {
                    class162.method1216((byte) 38, 0, class304.field5195, class110.field1886);
                }
                class17.method100(var473, arg1 ^ 0xFFFFC93C, "CS2 - scr:" + var5.field3488 + " op:" + var11);
            } else {
                class75 var468 = class89.method708(7391, 30);
                var468.method633(-51, class52.field858).method633(-63, var5.field29);
                for (int var469 = class112.field1902 - 1; var469 >= 0; var469--) {
                    var468.method633(-80, class229.field3898).method633(-105, class198.field3311[var469].field4942.field29);
                }
                if (var11 == 40) {
                    int var470 = var9[var8];
                    var468.method633(-92, class111.field1891).method633(arg1 - 62, class67.method565(arg1 + 116, var470));
                }
                if (class265.field4574 != 0) {
                    class162.method1216((byte) 38, 0, class66.method562((byte) -43, new class75[] { class143.field2475, var5.field29 }), class110.field1886);
                }
                class17.method100(var473, -14020, "CS2 - scr:" + var5.field3488 + " op:" + var11 + new String(var468.method659(false)));
            }
        }
    }
}
