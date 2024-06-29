import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class261 implements Runnable {

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Z")
    public boolean field4230 = true;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Ljava/lang/Object;")
    public Object field4228 = new Object();

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "I")
    public int field4232 = 0;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "[I")
    public int[] field4234 = new int[500];

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "[I")
    public int[] field4233 = new int[500];

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lnk;")
    public static class286 field4223 = new class286(5000);

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field4227 = 0;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4226 = "skill: ";

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4231 = "glow2:";

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILbl;Lv;Llh;IBI)V")
    public static final void method1773(int arg0, int arg1, class259 arg2, class228 arg3, class200 arg4, int arg5, byte arg6, int arg7) {
        field4222++;
        class210 var8 = new class210();
        var8.field3362 = arg1 * 128;
        var8.field3364 = arg7;
        var8.field3366 = arg5 * 128;
        if (arg6 <= 82) {
            return;
        }
        if (arg3 != null) {
            var8.field3367 = arg3.field3709;
            var8.field3370 = arg3.field3657;
            var8.field3352 = arg3.field3664;
            var8.field3368 = arg3;
            var8.field3363 = arg3.field3702;
            var8.field3376 = arg3.field3707;
            int var9 = arg3.field3655;
            var8.field3369 = arg3.field3672 * 128;
            int var10 = arg3.field3714;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg3.field3655;
                var9 = arg3.field3714;
            }
            var8.field3371 = (arg1 + var10) * 128;
            var8.field3379 = (arg5 + var9) * 128;
            if (arg3.field3641 != null) {
                var8.field3360 = true;
                var8.method1480((byte) -79);
            }
            if (var8.field3370 != null) {
                var8.field3357 = (int) (Math.random() * (double) (var8.field3367 - var8.field3363)) + var8.field3363;
            }
            class224.field3608.method1803(var8, -1);
        } else if (arg4 != null) {
            class188 var11 = arg4.field3166;
            var8.field3372 = arg4;
            if (var11.field3004 != null) {
                var8.field3360 = true;
                var11 = var11.method1314(-1);
            }
            if (var11 != null) {
                var8.field3379 = (var11.field3034 + arg5) * 128;
                var8.field3371 = (var11.field3034 + arg1) * 128;
                var8.field3376 = class98.method608((byte) 70, arg4);
                var8.field3352 = var11.field3036;
                var8.field3369 = var11.field3009 * 128;
            }
            class21.field280.method1803(var8, -1);
        } else if (arg2 != null) {
            var8.field3358 = arg2;
            var8.field3379 = (arg2.method1638(-6377) + arg5) * 128;
            var8.field3371 = (arg2.method1638(-6377) + arg1) * 128;
            var8.field3376 = class30.method174(19058, arg2);
            var8.field3369 = arg2.field4194 * 128;
            var8.field3352 = arg2.field4192;
            class200.field3160.method707(class185.method1296((byte) -103, arg2.field4208), var8, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static final void method1774(int arg0) {
        class101.field1338.method1699(0);
        field4224++;
        if (arg0 > -100) {
            method1777((byte) -2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method1775(int arg0, int arg1) {
        field4221++;
        int var2 = class77.field970;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (arg0 != -23483) {
            field4231 = null;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class259 var20;
            if (arg1 == 0) {
                var20 = class286.field4571;
            } else {
                var20 = class89.field1113[class27.field385[var3]];
            }
            if (var20 != null && var20.method1400(118)) {
                int var21 = var20.method1638(arg0 ^ 0x4352);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field3818 & 0x7F) == 64 && (var20.field3820 & 0x7F) == 64) {
                            int var22 = var20.field3820 >> 7;
                            int var23 = var20.field3818 >> 7;
                            if (var23 >= 0 && var23 < 104 && var22 >= 0 && var22 < 104) {
                                var10002 = class239.field3943[var23][var22]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field3818 & 0x7F) == 0 && (var20.field3820 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field3818 & 0x7F) == 64 && (var20.field3820 & 0x7F) == 64)) {
                        int var24 = var20.field3820 - (var21 * 64) >> 7;
                        int var25 = var20.field3818 - (var21 * 64) >> 7;
                        int var26 = var25 + var20.method1638(-6377);
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        int var27 = var24 + var20.method1638(arg0 ^ 0x4352);
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        for (int var28 = var25; var28 < var26; var28++) {
                            for (int var29 = var24; var29 < var27; var29++) {
                                var10002 = class239.field3943[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            class259 var5;
            long var6;
            if (arg1 == 0) {
                var5 = class286.field4571;
                var6 = 8791798054912L;
            } else {
                var5 = class89.field1113[class27.field385[var4]];
                var6 = (long) class27.field385[var4] << 32;
            }
            if (var5 != null && var5.method1400(87)) {
                int var8 = var5.method1638(-6377);
                if (arg1 == 0 || arg1 == var8) {
                    var5.field4218 = false;
                    var5.field3825 = true;
                    if ((class259.field4204 && class77.field970 > 200 || class77.field970 > 50) && arg1 != 0 && var5.field3793 == var5.method1636(0).field2405) {
                        var5.field4218 = true;
                    }
                    if (var8 == 1) {
                        if ((var5.field3818 & 0x7F) == 64 && (var5.field3820 & 0x7F) == 64) {
                            int var18 = var5.field3818 >> 7;
                            int var19 = var5.field3820 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class239.field3943[var18][var19] > 1) {
                                var10002 = class239.field3943[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var5.field3818 & 0x7F) == 0 && (var5.field3820 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var5.field3818 & 0x7F) == 64 && (var5.field3820 & 0x7F) == 0) {
                        int var9 = var5.field3818 - (var8 * 64) >> 7;
                        int var10 = var5.field3820 - (var8 * 64) >> 7;
                        int var11 = var8 + var10;
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        int var12 = var8 + var9;
                        if (var12 > 104) {
                            var12 = 104;
                        }
                        boolean var13 = true;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        for (int var14 = var9; var14 < var12; var14++) {
                            for (int var17 = var10; var17 < var11; var17++) {
                                if (class239.field3943[var14][var17] <= 1) {
                                    var13 = false;
                                    break;
                                }
                            }
                        }
                        if (var13) {
                            int var15 = var9;
                            while (true) {
                                if (var15 >= var12) {
                                    continue label217;
                                }
                                for (int var16 = var10; var16 < var11; var16++) {
                                    var10002 = class239.field3943[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var5.field3760 == null || class73.field924 < var5.field3780 || class73.field924 >= var5.field3838) {
                        var5.field3825 = false;
                        var5.field3753 = class166.method1148(class244.field4011, var5.field3818, var5.field3820, (byte) -78);
                        class28.method165(class244.field4011, var5.field3818, var5.field3820, var5.field3753, (var8 - 1) * 64 + 60, var5, var5.field3751, var6, var5.field3758);
                    } else {
                        var5.field3825 = false;
                        var5.field4218 = false;
                        var5.field3753 = class166.method1148(class244.field4011, var5.field3818, var5.field3820, (byte) 67);
                        class178.method1239(class244.field4011, var5.field3818, var5.field3820, var5.field3753, var5, var5.field3751, var6, var5.field3754, var5.field3834, var5.field3815, var5.field3796);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "run", descriptor = "()V")
    public final void run() {
        field4229++;
        while (this.field4230) {
            Object var1 = this.field4228;
            synchronized (this.field4228) {
                if (this.field4232 < 500) {
                    this.field4234[this.field4232] = class113.field1623;
                    this.field4233[this.field4232] = class92.field1156;
                    this.field4232++;
                }
            }
            class115.method752((byte) -62, 50L);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIII)V")
    public static final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class210 var5 = (class210) class224.field3608.method1802(43); var5 != null; var5 = (class210) class224.field3608.method1815(0)) {
            class129.method884(arg2 ^ 0xFFFFE336, arg1, arg3, var5, arg4, arg0);
        }
        if (arg2 != -7358) {
            method1773(-125, 15, (class259) null, (class228) null, (class200) null, -59, (byte) -110, -27);
        }
        for (class210 var6 = (class210) class21.field280.method1802(43); var6 != null; var6 = (class210) class21.field280.method1815(0)) {
            byte var11 = 1;
            class154 var12 = var6.field3372.method1636(arg2 ^ 0xFFFFE342);
            if (var6.field3372.field3793 == var12.field2405) {
                var11 = 0;
            } else if (var6.field3372.field3793 == var12.field2385 || var6.field3372.field3793 == var12.field2382 || var6.field3372.field3793 == var12.field2397 || var6.field3372.field3793 == var12.field2389) {
                var11 = 2;
            } else if (var6.field3372.field3793 == var12.field2390 || var6.field3372.field3793 == var12.field2416 || var6.field3372.field3793 == var12.field2421 || var6.field3372.field3793 == var12.field2400) {
                var11 = 3;
            }
            if (var6.field3373 != var11) {
                int var13 = class98.method608((byte) 119, var6.field3372);
                if (var6.field3376 != var13) {
                    if (var6.field3353 != null) {
                        class191.field3082.method1951(var6.field3353);
                        var6.field3353 = null;
                    }
                    var6.field3376 = var13;
                }
                var6.field3373 = var11;
            }
            var6.field3366 = var6.field3372.field3818;
            var6.field3379 = var6.field3372.field3818 + (var6.field3372.method1638(arg2 ^ 0x455) * 64);
            var6.field3362 = var6.field3372.field3820;
            var6.field3371 = var6.field3372.field3820 + (var6.field3372.method1638(-6377) * 64);
            class129.method884(108, arg1, arg3, var6, arg4, arg0);
        }
        field4225++;
        for (class210 var7 = (class210) class200.field3160.method710((byte) -17); var7 != null; var7 = (class210) class200.field3160.method709(false)) {
            byte var8 = 1;
            class154 var9 = var7.field3358.method1636(0);
            if (var7.field3358.field3793 == var9.field2405) {
                var8 = 0;
            } else if (var7.field3358.field3793 == var9.field2385 || var7.field3358.field3793 == var9.field2382 || var7.field3358.field3793 == var9.field2397 || var7.field3358.field3793 == var9.field2389) {
                var8 = 2;
            } else if (var7.field3358.field3793 == var9.field2390 || var7.field3358.field3793 == var9.field2416 || var7.field3358.field3793 == var9.field2421 || var7.field3358.field3793 == var9.field2400) {
                var8 = 3;
            }
            if (var7.field3373 != var8) {
                int var10 = class30.method174(19058, var7.field3358);
                if (var7.field3376 != var10) {
                    if (var7.field3353 != null) {
                        class191.field3082.method1951(var7.field3353);
                        var7.field3353 = null;
                    }
                    var7.field3376 = var10;
                }
                var7.field3373 = var8;
            }
            var7.field3366 = var7.field3358.field3818;
            var7.field3379 = var7.field3358.field3818 + (var7.field3358.method1638(-6377) * 64);
            var7.field3362 = var7.field3358.field3820;
            var7.field3371 = var7.field3358.field3820 + (var7.field3358.method1638(-6377) * 64);
            class129.method884(119, arg1, arg3, var7, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public static void method1777(byte arg0) {
        field4231 = null;
        field4226 = null;
        if (arg0 == -38) {
            field4223 = null;
        }
    }
}
