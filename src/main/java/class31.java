import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class31 implements Runnable {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Lvd;")
    public static class222 field648 = class212.method1357("loc)3dat", 10731);

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field653 = 0;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Lvd;")
    public static class222 field650 = class212.method1357("Hierhin gehen", 10731);

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "[Lvd;")
    public static class222[] field657 = new class222[200];

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Z")
    public static boolean field659 = false;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field658 = 0;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Z")
    public static boolean field661 = false;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Lle;")
    public static class123 field656;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "[I")
    public static int[] field655;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lka;I)Lgj;")
    public static final class75 method253(class109 arg0, int arg1) {
        if (arg1 != 404) {
            method254((byte) 56, 112);
        }
        field652++;
        return new class75(arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method700((byte) 64), arg0.method701(869322848), arg0.method701(869322848), arg0.method662((byte) -86));
    }

    @OriginalMember(owner = "client!ci", name = "run", descriptor = "()V")
    public final void run() {
        field654++;
        try {
            while (true) {
                class28 var1 = class185.field3420;
                class174 var2;
                synchronized (class185.field3420) {
                    var2 = (class174) class185.field3420.method236(0);
                }
                if (var2 == null) {
                    class225.method1471(100L, -23364);
                    Object var6 = class52.field989;
                    synchronized (class52.field989) {
                        if (class162.field3086 <= 1) {
                            class162.field3086 = 0;
                            class52.field989.notifyAll();
                            return;
                        }
                        class162.field3086--;
                    }
                } else {
                    if (var2.field3267 == 0) {
                        var2.field3268.method1183(112, var2.field3274, (int) var2.field2555, var2.field3274.length);
                        class28 var4 = class185.field3420;
                        synchronized (class185.field3420) {
                            var2.method826(-22101);
                        }
                    } else if (var2.field3267 == 1) {
                        var2.field3274 = var2.field3268.method1182((int) var2.field2555, -1786);
                        class28 var3 = class185.field3420;
                        synchronized (class185.field3420) {
                            class111.field2080.method235(var2, true);
                        }
                    }
                    Object var5 = class52.field989;
                    synchronized (class52.field989) {
                        if (class162.field3086 <= 1) {
                            class162.field3086 = 0;
                            class52.field989.notifyAll();
                            return;
                        }
                        class162.field3086 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class68.method464(var17, 128, null);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)Lkf;")
    public static final class114 method254(byte arg0, int arg1) {
        int var2 = 28 % ((arg0 + 40) / 60);
        field662++;
        class114 var3 = (class114) class135.field2612.method601((long) arg1, 62);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class98.field1835.method33(-29616, class231.method1514(arg1, 25565), class161.method1010(arg1, (byte) -120));
        class114 var5 = new class114();
        var5.field2174 = arg1;
        if (var4 != null) {
            var5.method737((byte) 19, new class109(var4));
        }
        var5.method738((byte) -111);
        class135.field2612.method593((long) arg1, var5, (byte) -12);
        return var5;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method255(byte arg0) {
        if (arg0 != 30) {
            field650 = null;
        }
        field649++;
        if (!class226.field4236) {
            return;
        }
        class128.field2504 = null;
        class114.field2158 = null;
        class37.field796 = null;
        class134.field2591 = null;
        class160.field3054 = null;
        class223.field4180 = null;
        class200.field3652 = null;
        class157.field3016 = null;
        class135.field2611 = null;
        class98.field1829 = null;
        class39.field866 = null;
        class73.field1444 = null;
        class58.field1077 = null;
        class186.field3434 = null;
        class143.field2764 = null;
        class151.field2928 = null;
        class220.field4080 = null;
        class47.field957 = null;
        class228.field4299 = null;
        class172.field3237 = null;
        class196.field3572 = null;
        class5.field81 = null;
        class84.method548(19725, 2);
        class151.method976(true, (byte) 110);
        class226.field4236 = false;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V")
    public static void method256(byte arg0) {
        field656 = null;
        int var1 = 111 % ((arg0 + 4) / 32);
        field650 = null;
        field655 = null;
        field648 = null;
        field657 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILsc;)V")
    public static final void method257(int arg0, int arg1, class191 arg2) {
        field660++;
        Object[] var3 = arg2.field3510;
        int var4 = (Integer) var3[0];
        class216 var5 = class157.method1001(var4, -12601);
        if (var5 == null) {
            return;
        }
        class140.field2709 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field4006;
        int[] var10 = var5.field4007;
        byte var11 = -1;
        try {
            class62.field1144 = new int[var5.field4012];
            class201.field3676 = new class222[var5.field4016];
            int var12 = 0;
            int var13 = 0;
            if (arg1 != -1308) {
                method255((byte) -92);
            }
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field3526;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field3517;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field3521 == null ? -1 : arg2.field3521.field269;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field3522;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field3521 == null ? -1 : arg2.field3521.field264;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field3515 == null ? -1 : arg2.field3515.field269;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field3515 == null ? -1 : arg2.field3515.field264;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field3520;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field3523;
                    }
                    class62.field1144[var12++] = var15;
                } else if (var3[var14] instanceof class222) {
                    class222 var16 = (class222) var3[var14];
                    if (var16.method1454(class50.field972, true)) {
                        var16 = arg2.field3516;
                    }
                    class201.field3676[var13++] = var16;
                }
            }
            int var17 = 0;
            label2408: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var365 = var9[var8];
                if (var365 < 100) {
                    if (var365 == 0) {
                        class51.field979[var6++] = var10[var8];
                        continue;
                    }
                    if (var365 == 1) {
                        int var18 = var10[var8];
                        class51.field979[var6++] = class93.field1751[var18];
                        continue;
                    }
                    if (var365 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class93.field1751[var19] = class51.field979[var6];
                        continue;
                    }
                    if (var365 == 3) {
                        class214.field3969[var7++] = var5.field3997[var8];
                        continue;
                    }
                    if (var365 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var365 == 7) {
                        var6 -= 2;
                        if (class51.field979[var6 + 1] != class51.field979[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 8) {
                        var6 -= 2;
                        if (class51.field979[var6 + 1] == class51.field979[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 9) {
                        var6 -= 2;
                        if (class51.field979[var6 + 1] > class51.field979[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 10) {
                        var6 -= 2;
                        if (class51.field979[var6] > class51.field979[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 21) {
                        if (class140.field2709 == 0) {
                            return;
                        }
                        class29 var20 = class155.field2961[--class140.field2709];
                        var8 = var20.field633;
                        class62.field1144 = var20.field643;
                        var5 = var20.field636;
                        class201.field3676 = var20.field641;
                        var10 = var5.field4007;
                        var9 = var5.field4006;
                        continue;
                    }
                    if (var365 == 25) {
                        int var21 = var10[var8];
                        class51.field979[var6++] = class92.method587(var21, -15134);
                        continue;
                    }
                    if (var365 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class222.method1447(0, class51.field979[var6], var22);
                        continue;
                    }
                    if (var365 == 31) {
                        var6 -= 2;
                        if (class51.field979[var6] <= class51.field979[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 32) {
                        var6 -= 2;
                        if (class51.field979[var6 + 1] <= class51.field979[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var365 == 33) {
                        class51.field979[var6++] = class62.field1144[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var365 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class62.field1144[var10001] = class51.field979[var6];
                        continue;
                    }
                    if (var365 == 35) {
                        class214.field3969[var7++] = class201.field3676[var10[var8]];
                        continue;
                    }
                    if (var365 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class201.field3676[var10001] = class214.field3969[var7];
                        continue;
                    }
                    if (var365 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class222 var24 = class204.method1308(var23, (byte) -120, class214.field3969, var7);
                        class214.field3969[var7++] = var24;
                        continue;
                    }
                    if (var365 == 38) {
                        var6--;
                        continue;
                    }
                    if (var365 == 39) {
                        var7--;
                        continue;
                    }
                    if (var365 == 40) {
                        int var25 = var10[var8];
                        class216 var26 = class157.method1001(var25, -12601);
                        int[] var27 = new int[var26.field4012];
                        class222[] var28 = new class222[var26.field4016];
                        for (int var29 = 0; var29 < var26.field4005; var29++) {
                            var27[var29] = class51.field979[var6 + var29 - var26.field4005];
                        }
                        for (int var30 = 0; var30 < var26.field4002; var30++) {
                            var28[var30] = class214.field3969[var7 + var30 - var26.field4002];
                        }
                        var6 -= var26.field4005;
                        var7 -= var26.field4002;
                        class29 var31 = new class29();
                        var31.field641 = class201.field3676;
                        var31.field636 = var5;
                        var31.field643 = class62.field1144;
                        var31.field633 = var8;
                        if (class155.field2961.length <= class140.field2709) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class155.field2961[class140.field2709++] = var31;
                        class62.field1144 = var27;
                        var5 = var26;
                        var9 = var26.field4006;
                        var10 = var26.field4007;
                        class201.field3676 = var28;
                        continue;
                    }
                    if (var365 == 42) {
                        class51.field979[var6++] = class124.field2377[var10[var8]];
                        continue;
                    }
                    if (var365 == 43) {
                        var10001 = var10[var8];
                        var6--;
                        class124.field2377[var10001] = class51.field979[var6];
                        continue;
                    }
                    if (var365 == 44) {
                        int var32 = var10[var8] & 0xFFFF;
                        var6--;
                        int var33 = class51.field979[var6];
                        int var34 = var10[var8] >> 16;
                        if (var33 >= 0 && var33 <= 5000) {
                            byte var35 = -1;
                            if (var32 == 105) {
                                var35 = 0;
                            }
                            class165.field3153[var34] = var33;
                            int var36 = 0;
                            while (true) {
                                if (var36 >= var33) {
                                    continue label2408;
                                }
                                class91.field1715[var34][var36] = var35;
                                var36++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 45) {
                        int var37 = var10[var8];
                        var6--;
                        int var38 = class51.field979[var6];
                        if (var38 >= 0 && class165.field3153[var37] > var38) {
                            class51.field979[var6++] = class91.field1715[var37][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 46) {
                        var6 -= 2;
                        int var39 = var10[var8];
                        int var40 = class51.field979[var6];
                        if (var40 >= 0 && var40 < class165.field3153[var39]) {
                            class91.field1715[var39][var40] = class51.field979[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var365 == 47) {
                        class222 var41 = class69.field1303[var10[var8]];
                        if (var41 == null) {
                            var41 = class54.field1016;
                        }
                        class214.field3969[var7++] = var41;
                        continue;
                    }
                    if (var365 == 48) {
                        var10001 = var10[var8];
                        var7--;
                        class69.field1303[var10001] = class214.field3969[var7];
                        continue;
                    }
                    if (var365 == 51) {
                        class232 var42 = var5.field3999[var10[var8]];
                        var6--;
                        class139 var43 = (class139) var42.method1520((long) class51.field979[var6], 53);
                        if (var43 != null) {
                            var8 += var43.field2687;
                        }
                        continue;
                    }
                }
                boolean var44;
                if (var10[var8] == 1) {
                    var44 = true;
                } else {
                    var44 = false;
                }
                if (var365 < 300) {
                    if (var365 == 100) {
                        var6 -= 3;
                        int var345 = class51.field979[var6];
                        int var346 = class51.field979[var6 + 1];
                        int var347 = class51.field979[var6 + 2];
                        if (var346 == 0) {
                            throw new RuntimeException();
                        }
                        class13 var348 = class10.method92(923, var345);
                        if (var348.field307 == null) {
                            var348.field307 = new class13[var347 + 1];
                        }
                        if (var347 >= var348.field307.length) {
                            class13[] var349 = new class13[var347 + 1];
                            for (int var350 = 0; var350 < var348.field307.length; var350++) {
                                var349[var350] = var348.field307[var350];
                            }
                            var348.field307 = var349;
                        }
                        if (var347 > 0 && var348.field307[var347 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var347 - 1));
                        }
                        class13 var351 = new class13();
                        var351.field365 = var346;
                        var351.field323 = true;
                        var351.field238 = var351.field269 = var348.field269;
                        var351.field264 = var347;
                        var348.field307[var347] = var351;
                        if (var44) {
                            class86.field1622 = var351;
                        } else {
                            class102.field1902 = var351;
                        }
                        class80.method527(var348, 31702);
                        continue;
                    }
                    if (var365 == 101) {
                        class13 var352 = var44 ? class86.field1622 : class102.field1902;
                        if (var352.field264 == -1) {
                            if (var44) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class13 var353 = class10.method92(923, var352.field269);
                        var353.field307[var352.field264] = null;
                        class80.method527(var353, arg1 + 33010);
                        continue;
                    }
                    if (var365 == 102) {
                        var6--;
                        class13 var354 = class10.method92(923, class51.field979[var6]);
                        var354.field307 = null;
                        class80.method527(var354, 31702);
                        continue;
                    }
                    if (var365 == 200) {
                        var6 -= 2;
                        int var355 = class51.field979[var6 + 1];
                        int var356 = class51.field979[var6];
                        class13 var357 = class197.method1215(var356, var355, -120);
                        if (var357 != null && var355 != -1) {
                            class51.field979[var6++] = 1;
                            if (var44) {
                                class86.field1622 = var357;
                            } else {
                                class102.field1902 = var357;
                            }
                            continue;
                        }
                        class51.field979[var6++] = 0;
                        continue;
                    }
                    if (var365 == 201) {
                        var6--;
                        int var358 = class51.field979[var6];
                        class13 var359 = class10.method92(923, var358);
                        if (var359 == null) {
                            class51.field979[var6++] = 0;
                        } else {
                            class51.field979[var6++] = 1;
                            if (var44) {
                                class86.field1622 = var359;
                            } else {
                                class102.field1902 = var359;
                            }
                        }
                        continue;
                    }
                } else if (var365 < 500) {
                    if (var365 == 403) {
                        var6 -= 2;
                        int var45 = class51.field979[var6 + 1];
                        int var46 = class51.field979[var6];
                        if (var46 >= 7) {
                            var46 -= 7;
                        }
                        class17.field432.field850.method1484(var45, var46, (byte) -128);
                        continue;
                    }
                    if (var365 == 404) {
                        var6 -= 2;
                        int var47 = class51.field979[var6];
                        int var48 = class51.field979[var6 + 1];
                        class17.field432.field850.method1478(var48, (byte) -73, var47);
                        continue;
                    }
                    if (var365 == 410) {
                        var6--;
                        boolean var49 = class51.field979[var6] != 0;
                        class17.field432.field850.method1476(var49, 64);
                        continue;
                    }
                } else if (var365 >= 1000 && var365 < 1100 || var365 >= 2000 && var365 < 2100) {
                    class13 var50;
                    if (var365 < 2000) {
                        var50 = var44 ? class86.field1622 : class102.field1902;
                    } else {
                        var365 -= 1000;
                        var6--;
                        var50 = class10.method92(923, class51.field979[var6]);
                    }
                    if (var365 == 1000) {
                        var6 -= 2;
                        var50.field297 = 0;
                        var50.field236 = var50.field319 = class51.field979[var6];
                        var50.field300 = 0;
                        var50.field295 = var50.field328 = class51.field979[var6 + 1];
                        class80.method527(var50, 31702);
                        continue;
                    }
                    if (var365 == 1001) {
                        var50.field351 = 0;
                        var6 -= 2;
                        var50.field341 = var50.field333 = class51.field979[var6];
                        var50.field287 = 0;
                        var50.field303 = 0;
                        var50.field245 = var50.field312 = class51.field979[var6 + 1];
                        var50.field283 = 0;
                        class80.method527(var50, 31702);
                        if (var50.field365 == 0) {
                            class78.method516(var50, 229);
                        }
                        continue;
                    }
                    if (var365 == 1003) {
                        var6--;
                        boolean var51 = class51.field979[var6] == 1;
                        if (var50.field305 != var51) {
                            var50.field305 = var51;
                            class80.method527(var50, arg1 ^ 0xFFFF8132);
                        }
                        continue;
                    }
                } else {
                    int var10000;
                    if (var365 >= 1100 && var365 < 1200 || !(var365 < 2100 || var365 >= 2200)) {
                        class13 var342;
                        if (var365 >= 2000) {
                            var365 -= 1000;
                            var10000 = arg1 + 2231;
                            var6--;
                            var342 = class10.method92(var10000, class51.field979[var6]);
                        } else {
                            var342 = var44 ? class86.field1622 : class102.field1902;
                        }
                        if (var365 == 1100) {
                            var6 -= 2;
                            var342.field316 = class51.field979[var6];
                            if (var342.field254 - var342.field341 < var342.field316) {
                                var342.field316 = var342.field254 - var342.field341;
                            }
                            if (var342.field316 < 0) {
                                var342.field316 = 0;
                            }
                            var342.field314 = class51.field979[var6 + 1];
                            if (var342.field354 - var342.field245 < var342.field314) {
                                var342.field314 = var342.field354 - var342.field245;
                            }
                            if (var342.field314 < 0) {
                                var342.field314 = 0;
                            }
                            class80.method527(var342, arg1 ^ 0xFFFF8132);
                            continue;
                        }
                        if (var365 == 1101) {
                            var6--;
                            var342.field358 = class51.field979[var6];
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1102) {
                            var6--;
                            var342.field253 = class51.field979[var6] == 1;
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1103) {
                            var6--;
                            var342.field228 = class51.field979[var6];
                            class80.method527(var342, arg1 + 33010);
                            continue;
                        }
                        if (var365 == 1104) {
                            var6--;
                            var342.field311 = class51.field979[var6];
                            class80.method527(var342, arg1 + 33010);
                            continue;
                        }
                        if (var365 == 1105) {
                            var6--;
                            var342.field251 = class51.field979[var6];
                            class80.method527(var342, arg1 ^ 0xFFFF8132);
                            continue;
                        }
                        if (var365 == 1106) {
                            var6--;
                            var342.field286 = class51.field979[var6];
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1107) {
                            var6--;
                            var342.field321 = class51.field979[var6] == 1;
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1108) {
                            var342.field325 = 1;
                            var6--;
                            var342.field224 = class51.field979[var6];
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1109) {
                            var6 -= 6;
                            var342.field279 = class51.field979[var6];
                            var342.field372 = class51.field979[var6 + 1];
                            var342.field240 = class51.field979[var6 + 2];
                            var342.field353 = class51.field979[var6 + 3];
                            var342.field361 = class51.field979[var6 + 4];
                            var342.field334 = class51.field979[var6 + 5];
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1110) {
                            var6--;
                            int var343 = class51.field979[var6];
                            if (var342.field340 != var343) {
                                var342.field262 = 0;
                                var342.field340 = var343;
                                var342.field270 = 0;
                                class80.method527(var342, arg1 + 33010);
                            }
                            continue;
                        }
                        if (var365 == 1111) {
                            var6--;
                            var342.field291 = class51.field979[var6] == 1;
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1112) {
                            var7--;
                            class222 var344 = class214.field3969[var7];
                            if (!var344.method1454(var342.field374, true)) {
                                var342.field374 = var344;
                                class80.method527(var342, 31702);
                            }
                            continue;
                        }
                        if (var365 == 1113) {
                            var6--;
                            var342.field299 = class51.field979[var6];
                            class80.method527(var342, arg1 + 33010);
                            continue;
                        }
                        if (var365 == 1114) {
                            var6 -= 3;
                            var342.field281 = class51.field979[var6];
                            var342.field327 = class51.field979[var6 + 1];
                            var342.field356 = class51.field979[var6 + 2];
                            class80.method527(var342, arg1 ^ 0xFFFF8132);
                            continue;
                        }
                        if (var365 == 1115) {
                            var6--;
                            var342.field324 = class51.field979[var6] == 1;
                            class80.method527(var342, arg1 + 33010);
                            continue;
                        }
                        if (var365 == 1116) {
                            var6--;
                            var342.field239 = class51.field979[var6];
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1117) {
                            var6--;
                            var342.field315 = class51.field979[var6];
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1118) {
                            var6--;
                            var342.field318 = class51.field979[var6] == 1;
                            class80.method527(var342, 31702);
                            continue;
                        }
                        if (var365 == 1119) {
                            var6--;
                            var342.field332 = class51.field979[var6] == 1;
                            class80.method527(var342, arg1 + 33010);
                            continue;
                        }
                        if (var365 == 1120) {
                            var6 -= 2;
                            var342.field254 = class51.field979[var6];
                            var342.field354 = class51.field979[var6 + 1];
                            class80.method527(var342, 31702);
                            if (var342.field365 == 0) {
                                class78.method516(var342, 229);
                            }
                            continue;
                        }
                    } else if (var365 >= 1200 && var365 < 1300 || var365 >= 2200 && var365 < 2300) {
                        class13 var338;
                        if (var365 < 2000) {
                            var338 = var44 ? class86.field1622 : class102.field1902;
                        } else {
                            var365 -= 1000;
                            var6--;
                            var338 = class10.method92(923, class51.field979[var6]);
                        }
                        class80.method527(var338, 31702);
                        if (var365 == 1200 || var365 == 1205) {
                            var6 -= 2;
                            int var339 = class51.field979[var6];
                            int var340 = class51.field979[var6 + 1];
                            if (var339 == -1) {
                                var338.field325 = 1;
                                var338.field335 = -1;
                                var338.field224 = -1;
                            } else {
                                var338.field347 = var340;
                                var338.field335 = var339;
                                class204 var341 = class112.method728(var339, (byte) -120);
                                var338.field279 = var341.field3735;
                                var338.field240 = var341.field3757;
                                var338.field372 = var341.field3786;
                                if (var365 == 1205) {
                                    var338.field338 = false;
                                } else {
                                    var338.field338 = true;
                                }
                                var338.field353 = var341.field3774;
                                var338.field361 = var341.field3763;
                                var338.field334 = var341.field3761;
                                if (var338.field287 > 0) {
                                    var338.field334 = var338.field334 * 32 / var338.field287;
                                } else if (var338.field333 > 0) {
                                    var338.field334 = var338.field334 * 32 / var338.field333;
                                }
                            }
                            continue;
                        }
                        if (var365 == 1201) {
                            var338.field325 = 2;
                            var6--;
                            var338.field224 = class51.field979[var6];
                            continue;
                        }
                        if (var365 == 1202) {
                            var338.field325 = 3;
                            var338.field224 = class17.field432.field850.method1481((byte) 39);
                            continue;
                        }
                        if (var365 == 1203) {
                            var338.field325 = 6;
                            var6--;
                            var338.field224 = class51.field979[var6];
                            continue;
                        }
                        if (var365 == 1204) {
                            var338.field325 = 5;
                            var6--;
                            var338.field224 = class51.field979[var6];
                            continue;
                        }
                    } else if ((var365 < 1300 || var365 >= 1400) && (var365 < 2300 || var365 >= 2400)) {
                        if (var365 >= 1400 && var365 < 1500 || var365 >= 2400 && var365 < 2500) {
                            class13 var327;
                            if (var365 >= 2000) {
                                var365 -= 1000;
                                var6--;
                                var327 = class10.method92(923, class51.field979[var6]);
                            } else {
                                var327 = var44 ? class86.field1622 : class102.field1902;
                            }
                            int[] var328 = null;
                            var7--;
                            class222 var329 = class214.field3969[var7];
                            if (var329.method1444(-86) > 0 && var329.method1442(var329.method1444(-17) - 1, -115) == 89) {
                                var6--;
                                int var330 = class51.field979[var6];
                                if (var330 > 0) {
                                    var328 = new int[var330];
                                    while (var330-- > 0) {
                                        var6--;
                                        var328[var330] = class51.field979[var6];
                                    }
                                }
                                var329 = var329.method1419(var329.method1444(-84) - 1, arg1 + 1310, 0);
                            }
                            Object[] var331 = new Object[var329.method1444(-52) + 1];
                            for (int var332 = var331.length - 1; var332 >= 1; var332--) {
                                if (var329.method1442(var332 - 1, arg1 + 1226) == 115) {
                                    var7--;
                                    var331[var332] = class214.field3969[var7];
                                } else {
                                    var6--;
                                    var331[var332] = Integer.valueOf(class51.field979[var6]);
                                }
                            }
                            var6--;
                            int var333 = class51.field979[var6];
                            if (var333 == -1) {
                                var331 = null;
                            } else {
                                var331[0] = Integer.valueOf(var333);
                            }
                            if (var365 == 1422) {
                                var327.field263 = var331;
                            }
                            if (var365 == 1411) {
                                var327.field339 = var331;
                            }
                            if (var365 == 1409) {
                                var327.field366 = var331;
                            }
                            if (var365 == 1412) {
                                var327.field320 = var331;
                            }
                            if (var365 == 1405) {
                                var327.field225 = var331;
                            }
                            if (var365 == 1420) {
                                var327.field329 = var331;
                            }
                            if (var365 == 1417) {
                                var327.field267 = var331;
                            }
                            if (var365 == 1408) {
                                var327.field233 = var331;
                            }
                            if (var365 == 1423) {
                                var327.field296 = var331;
                            }
                            if (var365 == 1404) {
                                var327.field265 = var331;
                            }
                            if (var365 == 1407) {
                                var327.field298 = var331;
                                var327.field227 = var328;
                            }
                            if (var365 == 1410) {
                                var327.field368 = var331;
                            }
                            if (var365 == 1418) {
                                var327.field362 = var331;
                            }
                            if (var365 == 1415) {
                                var327.field370 = var328;
                                var327.field306 = var331;
                            }
                            if (var365 == 1424) {
                                var327.field237 = var331;
                            }
                            if (var365 == 1421) {
                                var327.field343 = var331;
                            }
                            if (var365 == 1402) {
                                var327.field345 = var331;
                            }
                            if (var365 == 1419) {
                                var327.field260 = var331;
                            }
                            if (var365 == 1414) {
                                var327.field349 = var331;
                                var327.field231 = var328;
                            }
                            var327.field249 = true;
                            if (var365 == 1403) {
                                var327.field274 = var331;
                            }
                            if (var365 == 1416) {
                                var327.field357 = var331;
                            }
                            if (var365 == 1406) {
                                var327.field304 = var331;
                            }
                            if (var365 == 1401) {
                                var327.field247 = var331;
                            }
                            if (var365 == 1400) {
                                var327.field255 = var331;
                            }
                            if (var365 == 1425) {
                                var327.field252 = var331;
                            }
                            continue;
                        }
                        if (var365 < 1600) {
                            class13 var326 = var44 ? class86.field1622 : class102.field1902;
                            if (var365 == 1500) {
                                class51.field979[var6++] = var326.field236;
                                continue;
                            }
                            if (var365 == 1501) {
                                class51.field979[var6++] = var326.field295;
                                continue;
                            }
                            if (var365 == 1502) {
                                class51.field979[var6++] = var326.field341;
                                continue;
                            }
                            if (var365 == 1503) {
                                class51.field979[var6++] = var326.field245;
                                continue;
                            }
                            if (var365 == 1504) {
                                class51.field979[var6++] = var326.field305 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 1505) {
                                class51.field979[var6++] = var326.field238;
                                continue;
                            }
                        } else if (var365 < 1700) {
                            class13 var52 = var44 ? class86.field1622 : class102.field1902;
                            if (var365 == 1600) {
                                class51.field979[var6++] = var52.field316;
                                continue;
                            }
                            if (var365 == 1601) {
                                class51.field979[var6++] = var52.field314;
                                continue;
                            }
                            if (var365 == 1602) {
                                class214.field3969[var7++] = var52.field374;
                                continue;
                            }
                            if (var365 == 1603) {
                                class51.field979[var6++] = var52.field254;
                                continue;
                            }
                            if (var365 == 1604) {
                                class51.field979[var6++] = var52.field354;
                                continue;
                            }
                            if (var365 == 1605) {
                                class51.field979[var6++] = var52.field334;
                                continue;
                            }
                            if (var365 == 1606) {
                                class51.field979[var6++] = var52.field240;
                                continue;
                            }
                            if (var365 == 1607) {
                                class51.field979[var6++] = var52.field361;
                                continue;
                            }
                            if (var365 == 1608) {
                                class51.field979[var6++] = var52.field353;
                                continue;
                            }
                            if (var365 == 1609) {
                                class51.field979[var6++] = var52.field228;
                                continue;
                            }
                        } else if (var365 < 1800) {
                            class13 var325 = var44 ? class86.field1622 : class102.field1902;
                            if (var365 == 1700) {
                                class51.field979[var6++] = var325.field335;
                                continue;
                            }
                            if (var365 == 1701) {
                                if (var325.field335 == -1) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = var325.field347;
                                }
                                continue;
                            }
                            if (var365 == 1702) {
                                class51.field979[var6++] = var325.field264;
                                continue;
                            }
                        } else if (var365 < 1900) {
                            class13 var53 = var44 ? class86.field1622 : class102.field1902;
                            if (var365 == 1800) {
                                class51.field979[var6++] = class153.method981(true, class221.method1405(var53, (byte) -70));
                                continue;
                            }
                            if (var365 == 1801) {
                                var6--;
                                int var54 = class51.field979[var6];
                                int var366 = var54 - 1;
                                if (var53.field258 != null && var366 < var53.field258.length && var53.field258[var366] != null) {
                                    class214.field3969[var7++] = var53.field258[var366];
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 1802) {
                                if (var53.field360 == null) {
                                    class214.field3969[var7++] = class62.field1149;
                                } else {
                                    class214.field3969[var7++] = var53.field360;
                                }
                                continue;
                            }
                        } else if (var365 < 2600) {
                            var10000 = arg1 + 2231;
                            var6--;
                            class13 var55 = class10.method92(var10000, class51.field979[var6]);
                            if (var365 == 2500) {
                                class51.field979[var6++] = var55.field236;
                                continue;
                            }
                            if (var365 == 2501) {
                                class51.field979[var6++] = var55.field295;
                                continue;
                            }
                            if (var365 == 2502) {
                                class51.field979[var6++] = var55.field341;
                                continue;
                            }
                            if (var365 == 2503) {
                                class51.field979[var6++] = var55.field245;
                                continue;
                            }
                            if (var365 == 2504) {
                                class51.field979[var6++] = var55.field305 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 2505) {
                                class51.field979[var6++] = var55.field238;
                                continue;
                            }
                        } else if (var365 < 2700) {
                            var6--;
                            class13 var324 = class10.method92(923, class51.field979[var6]);
                            if (var365 == 2600) {
                                class51.field979[var6++] = var324.field316;
                                continue;
                            }
                            if (var365 == 2601) {
                                class51.field979[var6++] = var324.field314;
                                continue;
                            }
                            if (var365 == 2602) {
                                class214.field3969[var7++] = var324.field374;
                                continue;
                            }
                            if (var365 == 2603) {
                                class51.field979[var6++] = var324.field254;
                                continue;
                            }
                            if (var365 == 2604) {
                                class51.field979[var6++] = var324.field354;
                                continue;
                            }
                            if (var365 == 2605) {
                                class51.field979[var6++] = var324.field334;
                                continue;
                            }
                            if (var365 == 2606) {
                                class51.field979[var6++] = var324.field240;
                                continue;
                            }
                            if (var365 == 2607) {
                                class51.field979[var6++] = var324.field361;
                                continue;
                            }
                            if (var365 == 2608) {
                                class51.field979[var6++] = var324.field353;
                                continue;
                            }
                            if (var365 == 2609) {
                                class51.field979[var6++] = var324.field228;
                                continue;
                            }
                        } else if (var365 < 2800) {
                            if (var365 == 2700) {
                                var6--;
                                class13 var56 = class10.method92(923, class51.field979[var6]);
                                class51.field979[var6++] = var56.field335;
                                continue;
                            }
                            if (var365 == 2701) {
                                var10000 = arg1 ^ 0xFFFFF97F;
                                var6--;
                                class13 var57 = class10.method92(var10000, class51.field979[var6]);
                                if (var57.field335 == -1) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = var57.field347;
                                }
                                continue;
                            }
                            if (var365 == 2702) {
                                var6--;
                                int var58 = class51.field979[var6];
                                class21 var59 = (class21) class208.field3863.method1520((long) var58, arg1 ^ 0xFFFFFA88);
                                if (var59 == null) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = 1;
                                }
                                continue;
                            }
                            if (var365 == 2703) {
                                var6--;
                                class13 var60 = class10.method92(923, class51.field979[var6]);
                                if (var60.field307 == null) {
                                    class51.field979[var6++] = 0;
                                    continue;
                                }
                                int var61 = var60.field307.length;
                                for (int var62 = 0; var62 < var60.field307.length; var62++) {
                                    if (var60.field307[var62] == null) {
                                        var61 = var62;
                                        break;
                                    }
                                }
                                class51.field979[var6++] = var61;
                                continue;
                            }
                            if (var365 == 2704 || var365 == 2705) {
                                var6 -= 2;
                                int var63 = class51.field979[var6 + 1];
                                int var64 = class51.field979[var6];
                                class21 var65 = (class21) class208.field3863.method1520((long) var64, arg1 ^ 0xFFFFFAC7);
                                if (var65 != null && var65.field493 == var63) {
                                    class51.field979[var6++] = 1;
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                        } else if (var365 < 2900) {
                            var10000 = arg1 + 2231;
                            var6--;
                            class13 var66 = class10.method92(var10000, class51.field979[var6]);
                            if (var365 == 2800) {
                                class51.field979[var6++] = class153.method981(true, class221.method1405(var66, (byte) -96));
                                continue;
                            }
                            if (var365 == 2801) {
                                var6--;
                                int var67 = class51.field979[var6];
                                int var367 = var67 - 1;
                                if (var66.field258 != null && var66.field258.length > var367 && var66.field258[var367] != null) {
                                    class214.field3969[var7++] = var66.field258[var367];
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 2802) {
                                if (var66.field360 == null) {
                                    class214.field3969[var7++] = class62.field1149;
                                } else {
                                    class214.field3969[var7++] = var66.field360;
                                }
                                continue;
                            }
                        } else if (var365 < 3200) {
                            if (var365 == 3100) {
                                var7--;
                                class222 var68 = class214.field3969[var7];
                                class160.method1007(false, var68, class62.field1149, 0);
                                continue;
                            }
                            if (var365 == 3101) {
                                var6 -= 2;
                                class234.method1532((byte) 111, class17.field432, class51.field979[var6 + 1], class51.field979[var6]);
                                continue;
                            }
                            if (var365 == 3103) {
                                class92.method590((byte) -114);
                                continue;
                            }
                            if (var365 == 3104) {
                                class36.field777++;
                                var7--;
                                class222 var69 = class214.field3969[var7];
                                int var70 = 0;
                                if (var69.method1450(arg1 + 1193)) {
                                    var70 = var69.method1446(arg1 + 1405);
                                }
                                class42.field895.method1347((byte) -112, 58);
                                class42.field895.method684(var70, arg1 + 1435);
                                continue;
                            }
                            if (var365 == 3105) {
                                class220.field4071++;
                                var7--;
                                class222 var71 = class214.field3969[var7];
                                class42.field895.method1347((byte) -40, 23);
                                class42.field895.method668(var71.method1428(15109), 8);
                                continue;
                            }
                            if (var365 == 3106) {
                                class143.field2776++;
                                var7--;
                                class222 var72 = class214.field3969[var7];
                                class42.field895.method1347((byte) -118, 237);
                                class42.field895.method676(var72.method1444(-83) + 1, (byte) -3);
                                class42.field895.method670(var72, (byte) -113);
                                continue;
                            }
                            if (var365 == 3107) {
                                var6--;
                                int var73 = class51.field979[var6];
                                var7--;
                                class222 var74 = class214.field3969[var7];
                                class172.method1091(var74, (byte) -106, var73);
                                continue;
                            }
                            if (var365 == 3108) {
                                var6 -= 3;
                                int var75 = class51.field979[var6];
                                int var76 = class51.field979[var6 + 1];
                                int var77 = class51.field979[var6 + 2];
                                class13 var78 = class10.method92(arg1 + 2231, var77);
                                class180.method1129(var78, var76, var75, 0);
                                continue;
                            }
                            if (var365 == 3109) {
                                var6 -= 2;
                                int var79 = class51.field979[var6 + 1];
                                int var80 = class51.field979[var6];
                                class13 var81 = var44 ? class86.field1622 : class102.field1902;
                                class180.method1129(var81, var79, var80, 0);
                                continue;
                            }
                            if (var365 == 3110) {
                                class152.field2936++;
                                var6--;
                                int var82 = class51.field979[var6];
                                class42.field895.method1347((byte) -95, 115);
                                class42.field895.method672(arg1 - 279703068, var82);
                                continue;
                            }
                        } else if (var365 < 3300) {
                            if (var365 == 3200) {
                                var6 -= 3;
                                class197.method1211(class51.field979[var6 + 2], class51.field979[var6 + 1], (byte) 65, class51.field979[var6]);
                                continue;
                            }
                            if (var365 == 3201) {
                                var6--;
                                class47.method341(-104, class51.field979[var6]);
                                continue;
                            }
                            if (var365 == 3202) {
                                var6 -= 2;
                                class137.method866(class51.field979[var6], 0, class51.field979[var6 + 1]);
                                continue;
                            }
                        } else if (var365 < 3400) {
                            if (var365 == 3300) {
                                class51.field979[var6++] = class175.field3280;
                                continue;
                            }
                            if (var365 == 3301) {
                                var6 -= 2;
                                int var83 = class51.field979[var6 + 1];
                                int var84 = class51.field979[var6];
                                class51.field979[var6++] = class71.method483((byte) -35, var83, var84);
                                continue;
                            }
                            if (var365 == 3302) {
                                var6 -= 2;
                                int var85 = class51.field979[var6 + 1];
                                int var86 = class51.field979[var6];
                                class51.field979[var6++] = class226.method1486(var85, -122, var86);
                                continue;
                            }
                            if (var365 == 3303) {
                                var6 -= 2;
                                int var87 = class51.field979[var6];
                                int var88 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class119.method758(0, var87, var88);
                                continue;
                            }
                            if (var365 == 3304) {
                                var6--;
                                int var89 = class51.field979[var6];
                                class51.field979[var6++] = class165.method1051(var89, class168.method1082(arg1, 641)).field2388;
                                continue;
                            }
                            if (var365 == 3305) {
                                var6--;
                                int var90 = class51.field979[var6];
                                class51.field979[var6++] = class42.field899[var90];
                                continue;
                            }
                            if (var365 == 3306) {
                                var6--;
                                int var91 = class51.field979[var6];
                                class51.field979[var6++] = class24.field555[var91];
                                continue;
                            }
                            if (var365 == 3307) {
                                var6--;
                                int var92 = class51.field979[var6];
                                class51.field979[var6++] = class106.field1964[var92];
                                continue;
                            }
                            if (var365 == 3308) {
                                int var93 = class217.field4036;
                                int var94 = (class17.field432.field1353 >> 7) + class110.field2064;
                                int var95 = (class17.field432.field1360 >> 7) + class151.field2931;
                                class51.field979[var6++] = (var93 << 28) + (var94 << 14) + var95;
                                continue;
                            }
                            if (var365 == 3309) {
                                var6--;
                                int var96 = class51.field979[var6];
                                class51.field979[var6++] = class139.method876(var96 >> 14, 16383);
                                continue;
                            }
                            if (var365 == 3310) {
                                var6--;
                                int var97 = class51.field979[var6];
                                class51.field979[var6++] = var97 >> 28;
                                continue;
                            }
                            if (var365 == 3311) {
                                var6--;
                                int var98 = class51.field979[var6];
                                class51.field979[var6++] = class139.method876(16383, var98);
                                continue;
                            }
                            if (var365 == 3312) {
                                class51.field979[var6++] = class206.field3835 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 3313) {
                                var6 -= 2;
                                int var99 = class51.field979[var6] + 32768;
                                int var100 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class71.method483((byte) -35, var100, var99);
                                continue;
                            }
                            if (var365 == 3314) {
                                var6 -= 2;
                                int var101 = class51.field979[var6 + 1];
                                int var102 = class51.field979[var6] + 32768;
                                class51.field979[var6++] = class226.method1486(var101, -122, var102);
                                continue;
                            }
                            if (var365 == 3315) {
                                var6 -= 2;
                                int var103 = class51.field979[var6 + 1];
                                int var104 = class51.field979[var6] + 32768;
                                class51.field979[var6++] = class119.method758(0, var104, var103);
                                continue;
                            }
                            if (var365 == 3316) {
                                if (class5.field87 >= 2) {
                                    class51.field979[var6++] = class5.field87;
                                } else {
                                    class51.field979[var6++] = 0;
                                }
                                continue;
                            }
                            if (var365 == 3317) {
                                class51.field979[var6++] = class202.field3690;
                                continue;
                            }
                            if (var365 == 3318) {
                                class51.field979[var6++] = class208.field3875;
                                continue;
                            }
                            if (var365 == 3321) {
                                class51.field979[var6++] = class140.field2700;
                                continue;
                            }
                            if (var365 == 3322) {
                                class51.field979[var6++] = class47.field962;
                                continue;
                            }
                            if (var365 == 3323) {
                                if (class113.field2132 >= 5 && class113.field2132 <= 9) {
                                    class51.field979[var6++] = 1;
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3324) {
                                if (class113.field2132 >= 5 && class113.field2132 <= 9) {
                                    class51.field979[var6++] = class113.field2132;
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3325) {
                                if (class105.field1947 > 0) {
                                    class51.field979[var6++] = 1;
                                } else {
                                    class51.field979[var6++] = 0;
                                }
                                continue;
                            }
                            if (var365 == 3326) {
                                class51.field979[var6++] = class17.field432.field835;
                                continue;
                            }
                            if (var365 == 3327) {
                                class51.field979[var6++] = class17.field432.field850.field4228 ? 1 : 0;
                                continue;
                            }
                        } else if (var365 < 3500) {
                            if (var365 == 3400) {
                                var6 -= 2;
                                int var105 = class51.field979[var6];
                                int var106 = class51.field979[var6 + 1];
                                class119 var107 = class205.method1320(false, var105);
                                class214.field3969[var7++] = var107.method764(5056, var106);
                                continue;
                            }
                            if (var365 == 3408) {
                                var6 -= 4;
                                int var108 = class51.field979[var6];
                                int var109 = class51.field979[var6 + 1];
                                int var110 = class51.field979[var6 + 2];
                                int var111 = class51.field979[var6 + 3];
                                class119 var112 = class205.method1320(false, var110);
                                if (var112.field2255 == var108 && var112.field2261 == var109) {
                                    if (var109 == 115) {
                                        class214.field3969[var7++] = var112.method764(5056, var111);
                                    } else {
                                        class51.field979[var6++] = var112.method759(false, var111);
                                    }
                                    continue;
                                }
                                if (var109 == 115) {
                                    class214.field3969[var7++] = class54.field1016;
                                } else {
                                    class51.field979[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var365 < 3700) {
                            if (var365 == 3600) {
                                if (class39.field865 == 0) {
                                    class51.field979[var6++] = -2;
                                } else if (class39.field865 == 1) {
                                    class51.field979[var6++] = -1;
                                } else {
                                    class51.field979[var6++] = class86.field1630;
                                }
                                continue;
                            }
                            if (var365 == 3601) {
                                var6--;
                                int var113 = class51.field979[var6];
                                if (class39.field865 == 2 && class86.field1630 > var113) {
                                    class214.field3969[var7++] = field657[var113];
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 3602) {
                                var6--;
                                int var114 = class51.field979[var6];
                                if (class39.field865 == 2 && class86.field1630 > var114) {
                                    class51.field979[var6++] = class36.field784[var114];
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3603) {
                                var6--;
                                int var115 = class51.field979[var6];
                                if (class39.field865 == 2 && var115 < class86.field1630) {
                                    class51.field979[var6++] = class190.field3504[var115];
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3604) {
                                var7--;
                                class222 var116 = class214.field3969[var7];
                                var6--;
                                int var117 = class51.field979[var6];
                                class176.method1117(var117, var116, 122);
                                continue;
                            }
                            if (var365 == 3605) {
                                var7--;
                                class222 var118 = class214.field3969[var7];
                                class14.method121((byte) 102, var118.method1428(15109));
                                continue;
                            }
                            if (var365 == 3606) {
                                var7--;
                                class222 var119 = class214.field3969[var7];
                                class66.method452(-96, var119.method1428(arg1 + 16417));
                                continue;
                            }
                            if (var365 == 3607) {
                                var7--;
                                class222 var120 = class214.field3969[var7];
                                class153.method983(arg1 + 1192, var120.method1428(15109));
                                continue;
                            }
                            if (var365 == 3608) {
                                var7--;
                                class222 var121 = class214.field3969[var7];
                                class161.method1011((byte) 96, var121.method1428(15109));
                                continue;
                            }
                            if (var365 == 3609) {
                                var7--;
                                class222 var122 = class214.field3969[var7];
                                if (var122.method1416(-6354, class109.field2026) || var122.method1416(-6354, class99.field1866)) {
                                    var122 = var122.method1443(arg1 ^ 0xFFFFA864, 7);
                                }
                                class51.field979[var6++] = class227.method1493(-28311, var122) ? 1 : 0;
                                continue;
                            }
                            if (var365 == 3610) {
                                var6--;
                                int var123 = class51.field979[var6];
                                if (class39.field865 == 2 && var123 < class86.field1630) {
                                    class214.field3969[var7++] = class120.field2270[var123];
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 3611) {
                                if (class28.field611 == null) {
                                    class214.field3969[var7++] = class62.field1149;
                                } else {
                                    class214.field3969[var7++] = class28.field611.method1409(class168.method1082(arg1, 7105));
                                }
                                continue;
                            }
                            if (var365 == 3612) {
                                if (class28.field611 == null) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = class75.field1472;
                                }
                                continue;
                            }
                            if (var365 == 3613) {
                                var6--;
                                int var124 = class51.field979[var6];
                                if (class28.field611 != null && class75.field1472 > var124) {
                                    class214.field3969[var7++] = class9.field165[var124].field1529.method1409(arg1 - 6591);
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 3614) {
                                var6--;
                                int var125 = class51.field979[var6];
                                if (class28.field611 != null && class75.field1472 > var125) {
                                    class51.field979[var6++] = class9.field165[var125].field1537;
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3615) {
                                var6--;
                                int var126 = class51.field979[var6];
                                if (class28.field611 != null && class75.field1472 > var126) {
                                    class51.field979[var6++] = class9.field165[var126].field1536;
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3616) {
                                class51.field979[var6++] = class202.field3692;
                                continue;
                            }
                            if (var365 == 3617) {
                                var7--;
                                class222 var127 = class214.field3969[var7];
                                class73.method499(var127, (byte) -92);
                                continue;
                            }
                            if (var365 == 3618) {
                                class51.field979[var6++] = class139.field2682;
                                continue;
                            }
                            if (var365 == 3619) {
                                var7--;
                                class222 var128 = class214.field3969[var7];
                                class106.method651(0, var128.method1428(15109));
                                continue;
                            }
                            if (var365 == 3620) {
                                class87.method560((byte) 99);
                                continue;
                            }
                            if (var365 == 3621) {
                                if (class39.field865 == 0) {
                                    class51.field979[var6++] = -1;
                                } else {
                                    class51.field979[var6++] = class113.field2131;
                                }
                                continue;
                            }
                            if (var365 == 3622) {
                                var6--;
                                int var129 = class51.field979[var6];
                                if (class39.field865 != 0 && var129 < class113.field2131) {
                                    class214.field3969[var7++] = class204.method1317((byte) -54, class64.field1173[var129]).method1409(arg1 - 6591);
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 3623) {
                                var7--;
                                class222 var130 = class214.field3969[var7];
                                if (var130.method1416(-6354, class109.field2026) || var130.method1416(-6354, class99.field1866)) {
                                    var130 = var130.method1443(21120, 7);
                                }
                                class51.field979[var6++] = class7.method58((byte) -100, var130) ? 1 : 0;
                                continue;
                            }
                            if (var365 == 3624) {
                                var6--;
                                int var131 = class51.field979[var6];
                                if (class9.field165 != null && class75.field1472 > var131 && class9.field165[var131].field1529.method1452(class17.field432.field853, (byte) -127)) {
                                    class51.field979[var6++] = 1;
                                    continue;
                                }
                                class51.field979[var6++] = 0;
                                continue;
                            }
                            if (var365 == 3625) {
                                if (class151.field2925 == null) {
                                    class214.field3969[var7++] = class62.field1149;
                                } else {
                                    class214.field3969[var7++] = class151.field2925.method1409(arg1 - 6591);
                                }
                                continue;
                            }
                            if (var365 == 3626) {
                                var6--;
                                int var132 = class51.field979[var6];
                                if (class28.field611 != null && var132 < class75.field1472) {
                                    class214.field3969[var7++] = class9.field165[var132].field1534;
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                        } else if (var365 < 4000) {
                            if (var365 == 3903) {
                                var6--;
                                int var133 = class51.field979[var6];
                                class51.field979[var6++] = class232.field4351[var133].method1401(false);
                                continue;
                            }
                            if (var365 == 3904) {
                                var6--;
                                int var134 = class51.field979[var6];
                                class51.field979[var6++] = class232.field4351[var134].field4092;
                                continue;
                            }
                            if (var365 == 3905) {
                                var6--;
                                int var135 = class51.field979[var6];
                                class51.field979[var6++] = class232.field4351[var135].field4090;
                                continue;
                            }
                            if (var365 == 3906) {
                                var6--;
                                int var136 = class51.field979[var6];
                                class51.field979[var6++] = class232.field4351[var136].field4086;
                                continue;
                            }
                            if (var365 == 3907) {
                                var6--;
                                int var137 = class51.field979[var6];
                                class51.field979[var6++] = class232.field4351[var137].field4082;
                                continue;
                            }
                            if (var365 == 3908) {
                                var6--;
                                int var138 = class51.field979[var6];
                                class51.field979[var6++] = class232.field4351[var138].field4081;
                                continue;
                            }
                            if (var365 == 3910) {
                                var6--;
                                int var139 = class51.field979[var6];
                                int var140 = class232.field4351[var139].method1399((byte) 80);
                                class51.field979[var6++] = var140 == 0 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 3911) {
                                var6--;
                                int var141 = class51.field979[var6];
                                int var142 = class232.field4351[var141].method1399((byte) 80);
                                class51.field979[var6++] = var142 == 2 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 3912) {
                                var6--;
                                int var143 = class51.field979[var6];
                                int var144 = class232.field4351[var143].method1399((byte) 80);
                                class51.field979[var6++] = var144 == 5 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 3913) {
                                var6--;
                                int var145 = class51.field979[var6];
                                int var146 = class232.field4351[var145].method1399((byte) 80);
                                class51.field979[var6++] = var146 == 1 ? 1 : 0;
                                continue;
                            }
                        } else if (var365 < 4100) {
                            if (var365 == 4000) {
                                var6 -= 2;
                                int var147 = class51.field979[var6];
                                int var148 = class51.field979[var6 + 1];
                                class51.field979[var6++] = var147 + var148;
                                continue;
                            }
                            if (var365 == 4001) {
                                var6 -= 2;
                                int var149 = class51.field979[var6];
                                int var150 = class51.field979[var6 + 1];
                                class51.field979[var6++] = var149 - var150;
                                continue;
                            }
                            if (var365 == 4002) {
                                var6 -= 2;
                                int var151 = class51.field979[var6 + 1];
                                int var152 = class51.field979[var6];
                                class51.field979[var6++] = var151 * var152;
                                continue;
                            }
                            if (var365 == 4003) {
                                var6 -= 2;
                                int var153 = class51.field979[var6 + 1];
                                int var154 = class51.field979[var6];
                                class51.field979[var6++] = var154 / var153;
                                continue;
                            }
                            if (var365 == 4004) {
                                var6--;
                                int var155 = class51.field979[var6];
                                class51.field979[var6++] = (int) (Math.random() * (double) var155);
                                continue;
                            }
                            if (var365 == 4005) {
                                var6--;
                                int var156 = class51.field979[var6];
                                class51.field979[var6++] = (int) (Math.random() * (double) (var156 + 1));
                                continue;
                            }
                            if (var365 == 4006) {
                                var6 -= 5;
                                int var157 = class51.field979[var6 + 3];
                                int var158 = class51.field979[var6 + 4];
                                int var159 = class51.field979[var6 + 2];
                                int var160 = class51.field979[var6];
                                int var161 = class51.field979[var6 + 1];
                                class51.field979[var6++] = (var161 - var160) * (-var159 + var158) / (var157 - var159) + var160;
                                continue;
                            }
                            if (var365 == 4007) {
                                var6 -= 2;
                                long var162 = (long) class51.field979[var6 + 1];
                                long var164 = (long) class51.field979[var6];
                                class51.field979[var6++] = (int) (var164 + var162 * var164 / 100L);
                                continue;
                            }
                            if (var365 == 4008) {
                                var6 -= 2;
                                int var166 = class51.field979[var6];
                                int var167 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class213.method1361(var166, 0x1 << var167);
                                continue;
                            }
                            if (var365 == 4009) {
                                var6 -= 2;
                                int var168 = class51.field979[var6 + 1];
                                int var169 = class51.field979[var6];
                                class51.field979[var6++] = class139.method876(-(0x1 << var168) - 1, var169);
                                continue;
                            }
                            if (var365 == 4010) {
                                var6 -= 2;
                                int var170 = class51.field979[var6 + 1];
                                int var171 = class51.field979[var6];
                                class51.field979[var6++] = class139.method876(0x1 << var170, var171) == 0 ? 0 : 1;
                                continue;
                            }
                            if (var365 == 4011) {
                                var6 -= 2;
                                int var172 = class51.field979[var6 + 1];
                                int var173 = class51.field979[var6];
                                class51.field979[var6++] = var173 % var172;
                                continue;
                            }
                            if (var365 == 4012) {
                                var6 -= 2;
                                int var174 = class51.field979[var6];
                                int var175 = class51.field979[var6 + 1];
                                if (var174 == 0) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = (int) Math.pow((double) var174, (double) var175);
                                }
                                continue;
                            }
                            if (var365 == 4013) {
                                var6 -= 2;
                                int var176 = class51.field979[var6];
                                int var177 = class51.field979[var6 + 1];
                                if (var176 == 0) {
                                    class51.field979[var6++] = 0;
                                } else if (var177 == 0) {
                                    class51.field979[var6++] = Integer.MAX_VALUE;
                                } else {
                                    class51.field979[var6++] = (int) Math.pow((double) var176, 1.0D / (double) var177);
                                }
                                continue;
                            }
                            if (var365 == 4014) {
                                var6 -= 2;
                                int var178 = class51.field979[var6];
                                int var179 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class139.method876(var178, var179);
                                continue;
                            }
                            if (var365 == 4015) {
                                var6 -= 2;
                                int var180 = class51.field979[var6 + 1];
                                int var181 = class51.field979[var6];
                                class51.field979[var6++] = class213.method1361(var181, var180);
                                continue;
                            }
                            if (var365 == 4016) {
                                var6 -= 2;
                                int var182 = class51.field979[var6];
                                int var183 = class51.field979[var6 + 1];
                                class51.field979[var6++] = var183 <= var182 ? var183 : var182;
                                continue;
                            }
                            if (var365 == 4017) {
                                var6 -= 2;
                                int var184 = class51.field979[var6];
                                int var185 = class51.field979[var6 + 1];
                                class51.field979[var6++] = var185 >= var184 ? var185 : var184;
                                continue;
                            }
                            if (var365 == 4018) {
                                var6 -= 3;
                                long var186 = (long) class51.field979[var6];
                                long var188 = (long) class51.field979[var6 + 1];
                                long var190 = (long) class51.field979[var6 + 2];
                                class51.field979[var6++] = (int) (var186 * var190 / var188);
                                continue;
                            }
                        } else if (var365 < 4200) {
                            if (var365 == 4100) {
                                var7--;
                                class222 var272 = class214.field3969[var7];
                                var6--;
                                int var273 = class51.field979[var6];
                                class214.field3969[var7++] = class234.method1531(new class222[] { var272, class56.method414(-124, var273) }, -10949);
                                continue;
                            }
                            if (var365 == 4101) {
                                var7 -= 2;
                                class222 var274 = class214.field3969[var7 + 1];
                                class222 var275 = class214.field3969[var7];
                                class214.field3969[var7++] = class234.method1531(new class222[] { var275, var274 }, arg1 - 9641);
                                continue;
                            }
                            if (var365 == 4102) {
                                var7--;
                                class222 var276 = class214.field3969[var7];
                                var6--;
                                int var277 = class51.field979[var6];
                                class214.field3969[var7++] = class234.method1531(new class222[] { var276, class124.method788(var277, true, true) }, arg1 - 9641);
                                continue;
                            }
                            if (var365 == 4103) {
                                var7--;
                                class222 var278 = class214.field3969[var7];
                                class214.field3969[var7++] = var278.method1431(class168.method1082(arg1, -1308));
                                continue;
                            }
                            if (var365 == 4104) {
                                var6--;
                                int var279 = class51.field979[var6];
                                long var280 = ((long) var279 + 11745L) * 86400000L;
                                class87.field1650.setTime(new Date(var280));
                                int var282 = class87.field1650.get(5);
                                int var283 = class87.field1650.get(2);
                                int var284 = class87.field1650.get(1);
                                class214.field3969[var7++] = class234.method1531(new class222[] { class56.method414(-106, var282), class116.field2223, class25.field583[var283], class116.field2223, class56.method414(-112, var284) }, -10949);
                                continue;
                            }
                            if (var365 == 4105) {
                                var7 -= 2;
                                class222 var285 = class214.field3969[var7];
                                class222 var286 = class214.field3969[var7 + 1];
                                if (class17.field432.field850 != null && class17.field432.field850.field4228) {
                                    class214.field3969[var7++] = var286;
                                    continue;
                                }
                                class214.field3969[var7++] = var285;
                                continue;
                            }
                            if (var365 == 4106) {
                                var6--;
                                int var287 = class51.field979[var6];
                                class214.field3969[var7++] = class56.method414(-126, var287);
                                continue;
                            }
                            if (var365 == 4107) {
                                var7 -= 2;
                                class51.field979[var6++] = class214.field3969[var7].method1417(class214.field3969[var7 + 1], -37);
                                continue;
                            }
                            if (var365 == 4108) {
                                var7--;
                                class222 var288 = class214.field3969[var7];
                                var6 -= 2;
                                int var289 = class51.field979[var6];
                                int var290 = class51.field979[var6 + 1];
                                byte[] var291 = class8.field126.method33(-29616, var290, 0);
                                class178 var292 = new class178(var291);
                                var292.method894(class24.field552, null);
                                class51.field979[var6++] = var292.method890(var288, var289);
                                continue;
                            }
                            if (var365 == 4109) {
                                var6 -= 2;
                                var7--;
                                class222 var293 = class214.field3969[var7];
                                int var294 = class51.field979[var6];
                                int var295 = class51.field979[var6 + 1];
                                byte[] var296 = class8.field126.method33(-29616, var295, 0);
                                class178 var297 = new class178(var296);
                                var297.method894(class24.field552, null);
                                class51.field979[var6++] = var297.method893(var293, var294);
                                continue;
                            }
                            if (var365 == 4110) {
                                var7 -= 2;
                                class222 var298 = class214.field3969[var7 + 1];
                                class222 var299 = class214.field3969[var7];
                                var6--;
                                if (class51.field979[var6] == 1) {
                                    class214.field3969[var7++] = var299;
                                } else {
                                    class214.field3969[var7++] = var298;
                                }
                                continue;
                            }
                            if (var365 == 4111) {
                                var7--;
                                class222 var300 = class214.field3969[var7];
                                class214.field3969[var7++] = class142.method906(var300);
                                continue;
                            }
                            if (var365 == 4112) {
                                var6--;
                                int var301 = class51.field979[var6];
                                var7--;
                                class222 var302 = class214.field3969[var7];
                                if (var301 == -1) {
                                    throw new RuntimeException("null char");
                                }
                                class214.field3969[var7++] = var302.method1453(false, var301);
                                continue;
                            }
                            if (var365 == 4113) {
                                var6--;
                                int var303 = class51.field979[var6];
                                class51.field979[var6++] = class201.method1283(var303, (byte) 4) ? 1 : 0;
                                continue;
                            }
                            if (var365 == 4114) {
                                var6--;
                                int var304 = class51.field979[var6];
                                class51.field979[var6++] = class187.method1177(90, var304) ? 1 : 0;
                                continue;
                            }
                            if (var365 == 4115) {
                                var6--;
                                int var305 = class51.field979[var6];
                                class51.field979[var6++] = class11.method102(var305, -66) ? 1 : 0;
                                continue;
                            }
                            if (var365 == 4116) {
                                var6--;
                                int var306 = class51.field979[var6];
                                class51.field979[var6++] = class122.method779(5015, var306) ? 1 : 0;
                                continue;
                            }
                            if (var365 == 4117) {
                                var7--;
                                class222 var307 = class214.field3969[var7];
                                if (var307 == null) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = var307.method1444(class168.method1082(arg1, 1326));
                                }
                                continue;
                            }
                            if (var365 == 4118) {
                                var6 -= 2;
                                var7--;
                                class222 var308 = class214.field3969[var7];
                                int var309 = class51.field979[var6 + 1];
                                int var310 = class51.field979[var6];
                                class214.field3969[var7++] = var308.method1419(var309, 2, var310);
                                continue;
                            }
                            if (var365 == 4119) {
                                var7--;
                                class222 var311 = class214.field3969[var7];
                                boolean var312 = false;
                                class222 var313 = class218.method1386(192, var311.method1444(-126));
                                for (int var314 = 0; var314 < var311.method1444(-41); var314++) {
                                    int var315 = var311.method1442(var314, 88);
                                    if (var315 == 60) {
                                        var312 = true;
                                    } else if (var315 == 62) {
                                        var312 = false;
                                    } else if (!var312) {
                                        var313.method1415(var315, 255);
                                    }
                                }
                                var313.method1430((byte) 118);
                                class214.field3969[var7++] = var313;
                                continue;
                            }
                            if (var365 == 4120) {
                                var6 -= 2;
                                var7--;
                                class222 var316 = class214.field3969[var7];
                                int var317 = class51.field979[var6];
                                int var318 = class51.field979[var6 + 1];
                                class51.field979[var6++] = var316.method1438(var318, true, var317);
                                continue;
                            }
                            if (var365 == 4121) {
                                var7 -= 2;
                                class222 var319 = class214.field3969[var7];
                                class222 var320 = class214.field3969[var7 + 1];
                                var6--;
                                int var321 = class51.field979[var6];
                                class51.field979[var6++] = var319.method1449(var320, var321, (byte) 87);
                                continue;
                            }
                            if (var365 == 4122) {
                                var6--;
                                int var322 = class51.field979[var6];
                                class51.field979[var6++] = class145.method917(0, var322);
                                continue;
                            }
                            if (var365 == 4123) {
                                var6--;
                                int var323 = class51.field979[var6];
                                class51.field979[var6++] = class232.method1516(var323, 1275158561);
                                continue;
                            }
                        } else if (var365 < 4300) {
                            if (var365 == 4200) {
                                var6--;
                                int var256 = class51.field979[var6];
                                class214.field3969[var7++] = class112.method728(var256, (byte) -98).field3777;
                                continue;
                            }
                            if (var365 == 4201) {
                                var6 -= 2;
                                int var257 = class51.field979[var6 + 1];
                                int var258 = class51.field979[var6];
                                class204 var259 = class112.method728(var258, (byte) -120);
                                if (var257 >= 1 && var257 <= 5 && var259.field3736[var257 - 1] != null) {
                                    class214.field3969[var7++] = var259.field3736[var257 - 1];
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 4202) {
                                var6 -= 2;
                                int var260 = class51.field979[var6];
                                int var261 = class51.field979[var6 + 1];
                                class204 var262 = class112.method728(var260, (byte) 64);
                                if (var261 >= 1 && var261 <= 5 && var262.field3767[var261 - 1] != null) {
                                    class214.field3969[var7++] = var262.field3767[var261 - 1];
                                    continue;
                                }
                                class214.field3969[var7++] = class62.field1149;
                                continue;
                            }
                            if (var365 == 4203) {
                                var6--;
                                int var263 = class51.field979[var6];
                                class51.field979[var6++] = class112.method728(var263, (byte) 40).field3768;
                                continue;
                            }
                            if (var365 == 4204) {
                                var6--;
                                int var264 = class51.field979[var6];
                                class51.field979[var6++] = class112.method728(var264, (byte) -94).field3740 == 1 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 4205) {
                                var6--;
                                int var265 = class51.field979[var6];
                                class204 var266 = class112.method728(var265, (byte) -100);
                                if (var266.field3749 == -1 && var266.field3752 >= 0) {
                                    class51.field979[var6++] = var266.field3752;
                                    continue;
                                }
                                class51.field979[var6++] = var265;
                                continue;
                            }
                            if (var365 == 4206) {
                                var6--;
                                int var267 = class51.field979[var6];
                                class204 var268 = class112.method728(var267, (byte) -100);
                                if (var268.field3749 >= 0 && var268.field3752 >= 0) {
                                    class51.field979[var6++] = var268.field3752;
                                    continue;
                                }
                                class51.field979[var6++] = var267;
                                continue;
                            }
                            if (var365 == 4207) {
                                var6--;
                                int var269 = class51.field979[var6];
                                class51.field979[var6++] = class112.method728(var269, (byte) -100).field3788 ? 1 : 0;
                                continue;
                            }
                            if (var365 == 4210) {
                                var7--;
                                class222 var270 = class214.field3969[var7];
                                var6--;
                                int var271 = class51.field979[var6];
                                class215.method1369(var271 == 1, 100, var270);
                                class51.field979[var6++] = class14.field393;
                                continue;
                            }
                            if (var365 == 4211) {
                                if (class192.field3535 != null && field651 < class14.field393) {
                                    class51.field979[var6++] = class139.method876(class192.field3535[field651++], 65535);
                                    continue;
                                }
                                class51.field979[var6++] = -1;
                                continue;
                            }
                            if (var365 == 4212) {
                                field651 = 0;
                                continue;
                            }
                        } else if (var365 < 5100) {
                            if (var365 == 5000) {
                                class51.field979[var6++] = class191.field3518;
                                continue;
                            }
                            if (var365 == 5001) {
                                class183.field3379++;
                                var6 -= 3;
                                class191.field3518 = class51.field979[var6];
                                class222.field4164 = class51.field979[var6 + 1];
                                client.field697 = class51.field979[var6 + 2];
                                class42.field895.method1347((byte) -117, 239);
                                class42.field895.method676(class191.field3518, (byte) -3);
                                class42.field895.method676(class222.field4164, (byte) -3);
                                class42.field895.method676(client.field697, (byte) -3);
                                continue;
                            }
                            if (var365 == 5002) {
                                var7--;
                                class222 var195 = class214.field3969[var7];
                                class108.field1996++;
                                var6 -= 2;
                                int var196 = class51.field979[var6];
                                int var197 = class51.field979[var6 + 1];
                                class42.field895.method1347((byte) -93, 63);
                                class42.field895.method668(var195.method1428(15109), 8);
                                class42.field895.method676(var196 - 1, (byte) -3);
                                class42.field895.method676(var197, (byte) -3);
                                continue;
                            }
                            if (var365 == 5003) {
                                class222 var198 = null;
                                var6--;
                                int var199 = class51.field979[var6];
                                if (var199 < 100) {
                                    var198 = class122.field2326[var199];
                                }
                                if (var198 == null) {
                                    var198 = class62.field1149;
                                }
                                class214.field3969[var7++] = var198;
                                continue;
                            }
                            if (var365 == 5004) {
                                var6--;
                                int var200 = class51.field979[var6];
                                int var201 = -1;
                                if (var200 < 100 && class122.field2326[var200] != null) {
                                    var201 = class78.field1501[var200];
                                }
                                class51.field979[var6++] = var201;
                                continue;
                            }
                            if (var365 == 5005) {
                                class51.field979[var6++] = class222.field4164;
                                continue;
                            }
                            if (var365 == 5008) {
                                var7--;
                                class222 var202 = class214.field3969[var7];
                                if (var202.method1416(-6354, class215.field3990)) {
                                    class39.method314(false, var202);
                                } else {
                                    byte var203 = 0;
                                    byte var204 = 0;
                                    class3.field41++;
                                    class222 var205 = var202.method1431(0);
                                    if (var205.method1416(-6354, class121.field2318)) {
                                        var204 = 0;
                                        var202 = var202.method1443(21120, class121.field2318.method1444(arg1 ^ 0x551));
                                    } else if (var205.method1416(-6354, class173.field3254)) {
                                        var204 = 1;
                                        var202 = var202.method1443(21120, class173.field3254.method1444(-8));
                                    } else if (var205.method1416(-6354, class11.field202)) {
                                        var202 = var202.method1443(21120, class11.field202.method1444(-73));
                                        var204 = 2;
                                    } else if (var205.method1416(-6354, class216.field4009)) {
                                        var202 = var202.method1443(21120, class216.field4009.method1444(-82));
                                        var204 = 3;
                                    } else if (var205.method1416(arg1 ^ 0x1DCA, class203.field3716)) {
                                        var204 = 4;
                                        var202 = var202.method1443(21120, class203.field3716.method1444(-103));
                                    } else if (var205.method1416(arg1 ^ 0x1DCA, class14.field392)) {
                                        var202 = var202.method1443(21120, class14.field392.method1444(-48));
                                        var204 = 5;
                                    } else if (var205.method1416(-6354, class185.field3426)) {
                                        var204 = 6;
                                        var202 = var202.method1443(21120, class185.field3426.method1444(-32));
                                    } else if (var205.method1416(-6354, class149.field2843)) {
                                        var202 = var202.method1443(arg1 ^ 0xFFFFA864, class149.field2843.method1444(-120));
                                        var204 = 7;
                                    } else if (var205.method1416(arg1 - 5046, class197.field3596)) {
                                        var202 = var202.method1443(arg1 ^ 0xFFFFA864, class197.field3596.method1444(-32));
                                        var204 = 8;
                                    } else if (var205.method1416(arg1 - 5046, class108.field1982)) {
                                        var204 = 9;
                                        var202 = var202.method1443(arg1 ^ 0xFFFFA864, class108.field1982.method1444(-15));
                                    } else if (var205.method1416(-6354, class10.field190)) {
                                        var202 = var202.method1443(21120, class10.field190.method1444(-52));
                                        var204 = 10;
                                    } else if (var205.method1416(arg1 - 5046, class106.field1955)) {
                                        var204 = 11;
                                        var202 = var202.method1443(21120, class106.field1955.method1444(-62));
                                    } else if (class103.field1915 != 0) {
                                        if (var205.method1416(arg1 ^ 0x1DCA, class121.field2316)) {
                                            var202 = var202.method1443(21120, class121.field2316.method1444(-106));
                                            var204 = 0;
                                        } else if (var205.method1416(-6354, class173.field3259)) {
                                            var204 = 1;
                                            var202 = var202.method1443(21120, class173.field3259.method1444(-84));
                                        } else if (var205.method1416(-6354, class11.field215)) {
                                            var202 = var202.method1443(arg1 ^ 0xFFFFA864, class11.field215.method1444(arg1 + 1270));
                                            var204 = 2;
                                        } else if (var205.method1416(-6354, class216.field4017)) {
                                            var204 = 3;
                                            var202 = var202.method1443(21120, class216.field4017.method1444(arg1 ^ 0x55A));
                                        } else if (var205.method1416(arg1 ^ 0x1DCA, class203.field3730)) {
                                            var204 = 4;
                                            var202 = var202.method1443(21120, class203.field3730.method1444(-101));
                                        } else if (var205.method1416(arg1 - 5046, class14.field399)) {
                                            var204 = 5;
                                            var202 = var202.method1443(21120, class14.field399.method1444(-11));
                                        } else if (var205.method1416(-6354, class185.field3424)) {
                                            var204 = 6;
                                            var202 = var202.method1443(21120, class185.field3424.method1444(arg1 ^ 0x53C));
                                        } else if (var205.method1416(-6354, class149.field2846)) {
                                            var204 = 7;
                                            var202 = var202.method1443(21120, class149.field2846.method1444(-24));
                                        } else if (var205.method1416(-6354, class197.field3603)) {
                                            var202 = var202.method1443(arg1 + 22428, class197.field3603.method1444(-43));
                                            var204 = 8;
                                        } else if (var205.method1416(-6354, class108.field1990)) {
                                            var204 = 9;
                                            var202 = var202.method1443(arg1 ^ 0xFFFFA864, class108.field1990.method1444(-50));
                                        } else if (var205.method1416(-6354, class10.field179)) {
                                            var202 = var202.method1443(arg1 + 22428, class10.field179.method1444(arg1 ^ 0x538));
                                            var204 = 10;
                                        } else if (var205.method1416(-6354, class106.field1961)) {
                                            var204 = 11;
                                            var202 = var202.method1443(21120, class106.field1961.method1444(-106));
                                        }
                                    }
                                    class222 var206 = var202.method1431(0);
                                    if (var206.method1416(-6354, class84.field1615)) {
                                        var203 = 1;
                                        var202 = var202.method1443(21120, class84.field1615.method1444(-83));
                                    } else if (var206.method1416(-6354, class81.field1553)) {
                                        var203 = 2;
                                        var202 = var202.method1443(21120, class81.field1553.method1444(-68));
                                    } else if (var206.method1416(-6354, class25.field570)) {
                                        var202 = var202.method1443(21120, class25.field570.method1444(arg1 + 1253));
                                        var203 = 3;
                                    } else if (var206.method1416(-6354, class102.field1900)) {
                                        var203 = 4;
                                        var202 = var202.method1443(21120, class102.field1900.method1444(-127));
                                    } else if (var206.method1416(-6354, class181.field3353)) {
                                        var203 = 5;
                                        var202 = var202.method1443(arg1 + 22428, class181.field3353.method1444(-51));
                                    } else if (class103.field1915 != 0) {
                                        if (var206.method1416(-6354, class84.field1611)) {
                                            var203 = 1;
                                            var202 = var202.method1443(21120, class84.field1611.method1444(-127));
                                        } else if (var206.method1416(-6354, class81.field1558)) {
                                            var203 = 2;
                                            var202 = var202.method1443(21120, class81.field1558.method1444(-88));
                                        } else if (var206.method1416(-6354, class25.field565)) {
                                            var203 = 3;
                                            var202 = var202.method1443(arg1 + 22428, class25.field565.method1444(arg1 ^ 0x57D));
                                        } else if (var206.method1416(-6354, class102.field1895)) {
                                            var203 = 4;
                                            var202 = var202.method1443(21120, class102.field1895.method1444(arg1 ^ 0x517));
                                        } else if (var206.method1416(-6354, class181.field3366)) {
                                            var202 = var202.method1443(21120, class181.field3366.method1444(arg1 + 1194));
                                            var203 = 5;
                                        }
                                    }
                                    class42.field895.method1347((byte) -81, 157);
                                    class42.field895.method676(0, (byte) -3);
                                    int var207 = class42.field895.field2053;
                                    class42.field895.method676(var204, (byte) -3);
                                    class42.field895.method676(var203, (byte) -3);
                                    class105.method644(var202, class42.field895, arg1 + 1308);
                                    class42.field895.method694(class42.field895.field2053 - var207, 32);
                                }
                                continue;
                            }
                            if (var365 == 5009) {
                                class168.field3202++;
                                var7 -= 2;
                                class222 var208 = class214.field3969[var7];
                                class222 var209 = class214.field3969[var7 + 1];
                                class42.field895.method1347((byte) -67, 4);
                                class42.field895.method676(0, (byte) -3);
                                int var210 = class42.field895.field2053;
                                class42.field895.method668(var208.method1428(arg1 + 16417), arg1 ^ 0xFFFFFAEC);
                                class105.method644(var209, class42.field895, 0);
                                class42.field895.method694(class42.field895.field2053 - var210, 32);
                                continue;
                            }
                            if (var365 == 5010) {
                                var6--;
                                int var211 = class51.field979[var6];
                                class222 var212 = null;
                                if (var211 < 100) {
                                    var212 = class214.field3966[var211];
                                }
                                if (var212 == null) {
                                    var212 = class62.field1149;
                                }
                                class214.field3969[var7++] = var212;
                                continue;
                            }
                            if (var365 == 5011) {
                                var6--;
                                int var213 = class51.field979[var6];
                                class222 var214 = null;
                                if (var213 < 100) {
                                    var214 = class91.field1710[var213];
                                }
                                if (var214 == null) {
                                    var214 = class62.field1149;
                                }
                                class214.field3969[var7++] = var214;
                                continue;
                            }
                            if (var365 == 5012) {
                                var6--;
                                int var215 = class51.field979[var6];
                                int var216 = -1;
                                if (var215 < 100) {
                                    var216 = class196.field3574[var215];
                                }
                                class51.field979[var6++] = var216;
                                continue;
                            }
                            if (var365 == 5015) {
                                class222 var217;
                                if (class17.field432 == null || class17.field432.field853 == null) {
                                    var217 = class97.field1819;
                                } else {
                                    var217 = class17.field432.field853;
                                }
                                class214.field3969[var7++] = var217;
                                continue;
                            }
                            if (var365 == 5016) {
                                class51.field979[var6++] = client.field697;
                                continue;
                            }
                            if (var365 == 5017) {
                                class51.field979[var6++] = class10.field177;
                                continue;
                            }
                            if (var365 == 5050) {
                                var6--;
                                int var218 = class51.field979[var6];
                                class214.field3969[var7++] = class54.method405(var218, (byte) -102).field684;
                                continue;
                            }
                            if (var365 == 5051) {
                                var6--;
                                int var219 = class51.field979[var6];
                                class32 var220 = class54.method405(var219, (byte) 108);
                                if (var220.field671 == null) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = var220.field671.length;
                                }
                                continue;
                            }
                            if (var365 == 5052) {
                                var6 -= 2;
                                int var221 = class51.field979[var6];
                                int var222 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class54.method405(var221, (byte) 63).field671[var222];
                                continue;
                            }
                            if (var365 == 5053) {
                                var6--;
                                int var223 = class51.field979[var6];
                                class32 var224 = class54.method405(var223, (byte) 50);
                                if (var224.field679 == null) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = var224.field679.length;
                                }
                                continue;
                            }
                            if (var365 == 5054) {
                                var6 -= 2;
                                int var225 = class51.field979[var6];
                                int var226 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class54.method405(var225, (byte) -118).field679[var226];
                                continue;
                            }
                            if (var365 == 5055) {
                                var6--;
                                int var227 = class51.field979[var6];
                                class214.field3969[var7++] = class75.method504(true, var227).method1116(-107);
                                continue;
                            }
                            if (var365 == 5056) {
                                var6--;
                                int var228 = class51.field979[var6];
                                class176 var229 = class75.method504(true, var228);
                                if (var229.field3297 == null) {
                                    class51.field979[var6++] = 0;
                                } else {
                                    class51.field979[var6++] = var229.field3297.length;
                                }
                                continue;
                            }
                            if (var365 == 5057) {
                                var6 -= 2;
                                int var230 = class51.field979[var6 + 1];
                                int var231 = class51.field979[var6];
                                class51.field979[var6++] = class75.method504(true, var231).field3297[var230];
                                continue;
                            }
                            if (var365 == 5058) {
                                class191.field3524 = new class220();
                                var6--;
                                class191.field3524.field4064 = class51.field979[var6];
                                class191.field3524.field4072 = class75.method504(true, class191.field3524.field4064);
                                class191.field3524.field4079 = new int[class191.field3524.field4072.method1115(0)];
                                continue;
                            }
                            if (var365 == 5059) {
                                class77.field1489++;
                                class42.field895.method1347((byte) -121, 110);
                                class42.field895.method676(0, (byte) -3);
                                int var232 = class42.field895.field2053;
                                class42.field895.method676(0, (byte) -3);
                                class42.field895.method672(arg1 - 279703068, class191.field3524.field4064);
                                class191.field3524.field4072.method1118(class42.field895, -121, class191.field3524.field4079);
                                class42.field895.method694(class42.field895.field2053 - var232, 32);
                                continue;
                            }
                            if (var365 == 5060) {
                                class201.field3678++;
                                var7--;
                                class222 var233 = class214.field3969[var7];
                                class42.field895.method1347((byte) -71, 182);
                                class42.field895.method676(0, (byte) -3);
                                int var234 = class42.field895.field2053;
                                class42.field895.method668(var233.method1428(arg1 ^ 0xFFFFC1E1), 8);
                                class42.field895.method672(arg1 - 279703068, class191.field3524.field4064);
                                class191.field3524.field4072.method1118(class42.field895, 76, class191.field3524.field4079);
                                class42.field895.method694(class42.field895.field2053 - var234, 32);
                                continue;
                            }
                            if (var365 == 5061) {
                                class42.field895.method1347((byte) -50, 110);
                                class42.field895.method676(0, (byte) -3);
                                class77.field1489++;
                                int var235 = class42.field895.field2053;
                                class42.field895.method676(1, (byte) -3);
                                class42.field895.method672(-279704376, class191.field3524.field4064);
                                class191.field3524.field4072.method1118(class42.field895, -128, class191.field3524.field4079);
                                class42.field895.method694(class42.field895.field2053 - var235, 32);
                                continue;
                            }
                            if (var365 == 5062) {
                                var6 -= 2;
                                int var236 = class51.field979[var6];
                                int var237 = class51.field979[var6 + 1];
                                class51.field979[var6++] = class54.method405(var236, (byte) -127).field675[var237];
                                continue;
                            }
                            if (var365 == 5063) {
                                var6 -= 2;
                                int var238 = class51.field979[var6 + 1];
                                int var239 = class51.field979[var6];
                                class51.field979[var6++] = class54.method405(var239, (byte) -100).field685[var238];
                                continue;
                            }
                            if (var365 == 5064) {
                                var6 -= 2;
                                int var240 = class51.field979[var6];
                                int var241 = class51.field979[var6 + 1];
                                if (var241 == -1) {
                                    class51.field979[var6++] = -1;
                                } else {
                                    class51.field979[var6++] = class54.method405(var240, (byte) 56).method258(-1, var241);
                                }
                                continue;
                            }
                            if (var365 == 5065) {
                                var6 -= 2;
                                int var242 = class51.field979[var6];
                                int var243 = class51.field979[var6 + 1];
                                if (var243 == -1) {
                                    class51.field979[var6++] = -1;
                                } else {
                                    class51.field979[var6++] = class54.method405(var242, (byte) 79).method262(true, var243);
                                }
                                continue;
                            }
                            if (var365 == 5066) {
                                var6--;
                                int var244 = class51.field979[var6];
                                class51.field979[var6++] = class75.method504(true, var244).method1115(0);
                                continue;
                            }
                            if (var365 == 5067) {
                                var6 -= 2;
                                int var245 = class51.field979[var6];
                                int var246 = class51.field979[var6 + 1];
                                int var247 = class75.method504(true, var245).method1112(var246, (byte) 122);
                                System.out.println("chatphrase_getdynamiccommand=" + var247);
                                class51.field979[var6++] = var247;
                                continue;
                            }
                            if (var365 == 5068) {
                                var6 -= 2;
                                int var248 = class51.field979[var6 + 1];
                                int var249 = class51.field979[var6];
                                class191.field3524.field4079[var249] = var248;
                                continue;
                            }
                            if (var365 == 5069) {
                                var6 -= 2;
                                int var250 = class51.field979[var6];
                                int var251 = class51.field979[var6 + 1];
                                class191.field3524.field4079[var250] = var251;
                                continue;
                            }
                            if (var365 == 5070) {
                                var6 -= 3;
                                int var252 = class51.field979[var6];
                                int var253 = class51.field979[var6 + 1];
                                int var254 = class51.field979[var6 + 2];
                                class176 var255 = class75.method504(true, var252);
                                if (var255.method1112(var253, (byte) 122) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class51.field979[var6++] = var255.method1113(var253, (byte) 91, var254);
                                continue;
                            }
                        } else if (var365 < 5200) {
                            if (var365 == 5100) {
                                if (class6.field98[86]) {
                                    class51.field979[var6++] = 1;
                                } else {
                                    class51.field979[var6++] = 0;
                                }
                                continue;
                            }
                            if (var365 == 5101) {
                                if (class6.field98[82]) {
                                    class51.field979[var6++] = 1;
                                } else {
                                    class51.field979[var6++] = 0;
                                }
                                continue;
                            }
                            if (var365 == 5102) {
                                if (class6.field98[81]) {
                                    class51.field979[var6++] = 1;
                                } else {
                                    class51.field979[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var365 < 5300) {
                            if (var365 == 5200) {
                                var6--;
                                class32.method265(class51.field979[var6], (byte) -84);
                                continue;
                            }
                            if (var365 == 5201) {
                                class51.field979[var6++] = class179.method1121(-46);
                                continue;
                            }
                            if (var365 == 5202) {
                                var6--;
                                class58.method420(56, class51.field979[var6]);
                                continue;
                            }
                            if (var365 == 5203) {
                                var7--;
                                class139.method873((byte) -39, class214.field3969[var7]);
                                continue;
                            }
                            if (var365 == 5204) {
                                class214.field3969[var7 - 1] = class38.method307(-1781, class214.field3969[var7 - 1]);
                                continue;
                            }
                            if (var365 == 5205) {
                                var7--;
                                class37.method303(class214.field3969[var7], 3);
                                continue;
                            }
                        } else if (var365 >= 5400 && var365 < 5500 && var365 == 5400) {
                            class215.field3989++;
                            var7 -= 2;
                            class222 var192 = class214.field3969[var7];
                            class222 var193 = class214.field3969[var7 + 1];
                            var6--;
                            int var194 = class51.field979[var6];
                            class42.field895.method1347((byte) -96, 223);
                            class42.field895.method676(class125.method791(var192, 1) + class125.method791(var193, 1) + 1, (byte) -3);
                            class42.field895.method670(var192, (byte) -113);
                            class42.field895.method670(var193, (byte) -113);
                            class42.field895.method676(var194, (byte) -3);
                            continue;
                        }
                    } else {
                        class13 var334;
                        if (var365 >= 2000) {
                            var6--;
                            var334 = class10.method92(923, class51.field979[var6]);
                            var365 -= 1000;
                        } else {
                            var334 = var44 ? class86.field1622 : class102.field1902;
                        }
                        if (var365 == 1300) {
                            var6--;
                            int var335 = class51.field979[var6] - 1;
                            if (var335 >= 0 && var335 <= 9) {
                                var7--;
                                var334.method109(class214.field3969[var7], var335, arg1 + 10179);
                                continue;
                            }
                            var7--;
                            continue;
                        }
                        if (var365 == 1301) {
                            var6 -= 2;
                            int var336 = class51.field979[var6];
                            int var337 = class51.field979[var6 + 1];
                            var334.field330 = class197.method1215(var336, var337, -120);
                            continue;
                        }
                        if (var365 == 1302) {
                            var6--;
                            var334.field308 = class51.field979[var6] == 1;
                            continue;
                        }
                        if (var365 == 1303) {
                            var6--;
                            var334.field278 = class51.field979[var6];
                            continue;
                        }
                        if (var365 == 1304) {
                            var6--;
                            var334.field229 = class51.field979[var6];
                            continue;
                        }
                        if (var365 == 1305) {
                            var7--;
                            var334.field360 = class214.field3969[var7];
                            continue;
                        }
                        if (var365 == 1306) {
                            var7--;
                            var334.field371 = class214.field3969[var7];
                            continue;
                        }
                        if (var365 == 1307) {
                            var334.field258 = null;
                            continue;
                        }
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var364) {
            if (var5.field4011 == null) {
                if (class95.field1781 != 0) {
                    class160.method1007(false, class135.field2610, class62.field1149, 0);
                }
                class68.method464(var364, 128, "CS2 - scr:" + var5.field2555 + " op:" + var11);
            } else {
                class222 var361 = class218.method1386(arg1 + 1500, 30);
                var361.method1448(class59.field1091, arg1 ^ 0xFFFFFAE3).method1448(var5.field4011, arg1 + 1315);
                for (int var362 = class140.field2709 - 1; var362 >= 0; var362--) {
                    var361.method1448(class10.field188, 7).method1448(class155.field2961[var362].field636.field4011, arg1 + 1315);
                }
                if (var11 == 40) {
                    int var363 = var10[var8];
                    var361.method1448(class28.field621, 7).method1448(class56.method414(-122, var363), arg1 ^ 0xFFFFFAE3);
                }
                if (class95.field1781 != 0) {
                    class160.method1007(false, class234.method1531(new class222[] { class185.field3427, var5.field4011 }, -10949), class62.field1149, 0);
                }
                class68.method464(var364, arg1 ^ 0xFFFFFA64, "CS2 - scr:" + var5.field2555 + " op:" + var11 + new String(var361.method1439(0)));
            }
        }
    }
}
