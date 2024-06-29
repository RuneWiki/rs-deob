import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class17 {

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lpe;")
    private class81 field343 = new class81();

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "Lv;")
    private class57 field356 = new class57();

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "I")
    private int field352;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field355;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "Lka;")
    private class157 field357;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lsg;")
    public static class30 field334 = class167.method1221((byte) 33, "<br>(X");

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Z")
    public static boolean field341 = false;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lsg;")
    public static class30 field335 = class167.method1221((byte) 33, "p11_full");

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[I")
    public static int[] field339 = new int[32];

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "S")
    public static short field353 = 32767;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lsg;")
    public static class30 field344 = class167.method1221((byte) 33, "::rect_debug");

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Z")
    public static boolean field347 = false;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "J")
    public static long field340;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lmc;")
    public static class151 field336;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "[I")
    public static int[] field346;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)Lcb;")
    public final class236 method165(int arg0) {
        field349++;
        int var2 = 101 / ((arg0 + 53) / 52);
        return this.field357.method1176((byte) 22);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)V")
    public final void method166(byte arg0) {
        this.field356.method534(-75);
        this.field357.method1174((byte) 33);
        if (arg0 >= -39) {
            field334 = null;
        }
        this.field343 = new class81();
        this.field355 = this.field352;
        field354++;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLwd;)V")
    public static final void method167(boolean arg0, class63 arg1) {
        field348++;
        arg1.field1343 = arg0;
        if (arg1.field1370 != -1) {
            class138 var2 = class193.method1396(-30590, arg1.field1370);
            if (var2 == null || var2.field2699 == null) {
                arg1.field1370 = -1;
            } else {
                arg1.field1340++;
                if (arg1.field1351 < var2.field2699.length && var2.field2690[arg1.field1351] < arg1.field1340) {
                    arg1.field1340 = 1;
                    arg1.field1351++;
                    class53.method518(arg1.field1360, arg1.field1336, -128, arg1.field1351, var2, class247.field4394 == arg1);
                }
                if (arg1.field1351 >= var2.field2699.length) {
                    arg1.field1351 = 0;
                    arg1.field1340 = 0;
                    class53.method518(arg1.field1360, arg1.field1336, -128, arg1.field1351, var2, class247.field4394 == arg1);
                }
            }
        }
        if (arg1.field1345 != -1 && arg1.field1339 <= class133.field2617) {
            int var3 = class263.method1819(arg1.field1345, -4).field460;
            if (var3 == -1) {
                arg1.field1345 = -1;
            } else {
                class138 var4 = class193.method1396(-30590, var3);
                if (var4 == null || var4.field2699 == null) {
                    arg1.field1345 = -1;
                } else {
                    if (arg1.field1403 < 0) {
                        arg1.field1403 = 0;
                        class53.method518(arg1.field1360, arg1.field1336, -128, 0, var4, class247.field4394 == arg1);
                    }
                    arg1.field1346++;
                    if (var4.field2699.length > arg1.field1403 && var4.field2690[arg1.field1403] < arg1.field1346) {
                        arg1.field1403++;
                        arg1.field1346 = 1;
                        class53.method518(arg1.field1360, arg1.field1336, -128, arg1.field1403, var4, class247.field4394 == arg1);
                    }
                    if (var4.field2699.length <= arg1.field1403) {
                        arg1.field1345 = -1;
                    }
                }
            }
        }
        if (arg1.field1364 != -1 && arg1.field1386 <= 1) {
            class138 var5 = class193.method1396(-30590, arg1.field1364);
            if (var5.field2695 == 1 && arg1.field1368 > 0 && arg1.field1367 <= class133.field2617 && arg1.field1394 < class133.field2617) {
                arg1.field1386 = 1;
                return;
            }
        }
        if (arg1.field1364 != -1 && arg1.field1386 == 0) {
            class138 var6 = class193.method1396(-30590, arg1.field1364);
            if (var6 == null || var6.field2699 == null) {
                arg1.field1364 = -1;
            } else {
                arg1.field1381++;
                if (arg1.field1402 < var6.field2699.length && var6.field2690[arg1.field1402] < arg1.field1381) {
                    arg1.field1381 = 1;
                    arg1.field1402++;
                    class53.method518(arg1.field1360, arg1.field1336, -127, arg1.field1402, var6, class247.field4394 == arg1);
                }
                if (var6.field2699.length <= arg1.field1402) {
                    arg1.field1402 -= var6.field2706;
                    arg1.field1356++;
                    if (arg1.field1356 >= var6.field2710) {
                        arg1.field1364 = -1;
                    } else if (arg1.field1402 >= 0 && arg1.field1402 < var6.field2699.length) {
                        class53.method518(arg1.field1360, arg1.field1336, -128, arg1.field1402, var6, class247.field4394 == arg1);
                    } else {
                        arg1.field1364 = -1;
                    }
                }
                arg1.field1343 = var6.field2694;
            }
        }
        if (arg1.field1386 > 0) {
            arg1.field1386--;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)Lcb;")
    public final class236 method168(byte arg0) {
        field342++;
        int var2 = 22 % ((52 - arg0) / 35);
        return this.field357.method1178(true);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lpe;IJ)V")
    public final void method169(class81 arg0, int arg1, long arg2) {
        if (this.field355 == 0) {
            class81 var5 = this.field356.method541(false);
            var5.method1681(false);
            var5.method701(true);
            if (this.field343 == var5) {
                class81 var6 = this.field356.method541(false);
                var6.method1681(false);
                var6.method701(true);
            }
        } else {
            this.field355--;
        }
        field338++;
        int var7 = 92 / ((arg1 - 54) / 59);
        this.field357.method1164((byte) -100, arg2, arg0);
        this.field356.method535(arg0, (byte) -114);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static void method170(int arg0) {
        field334 = null;
        field344 = null;
        field346 = null;
        field339 = null;
        field335 = null;
        if (arg0 != 1) {
            field335 = null;
        }
        field336 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
    public static final void method171() {
        if (class244.field4365 != null) {
            for (int var0 = 0; var0 < class244.field4365.length; var0++) {
                for (int var1 = 0; var1 < class209.field3759; var1++) {
                    for (int var2 = 0; var2 < class44.field1050; var2++) {
                        class244.field4365[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class147.field2809 != null) {
            for (int var3 = 0; var3 < class147.field2809.length; var3++) {
                for (int var4 = 0; var4 < class209.field3759; var4++) {
                    for (int var5 = 0; var5 < class44.field1050; var5++) {
                        class147.field2809[var3][var4][var5] = null;
                    }
                }
            }
        }
        class160.field3015 = 0;
        if (class107.field2141 != null) {
            for (int var6 = 0; var6 < class160.field3015; var6++) {
                class107.field2141[var6] = null;
            }
        }
        if (class276.field4812 != null) {
            for (int var7 = 0; var7 < class221.field3984; var7++) {
                class276.field4812[var7] = null;
            }
            class221.field3984 = 0;
        }
        if (class36.field869 != null) {
            for (int var8 = 0; var8 < class36.field869.length; var8++) {
                class36.field869[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIIIIII)V")
    public static final void method172(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field351++;
        if (arg1) {
            method167(true, (class63) null);
        }
        if (class1.method9(arg7, (byte) -13)) {
            class244.field4363 = null;
            class14.method148((byte) -96, arg4, arg6, arg0, arg2, class259.field4572[arg7], arg5, arg3, arg8, -1);
            if (class244.field4363 != null) {
                class14.method148((byte) -96, arg4, arg6, arg0, arg2, class244.field4363, class243.field4350, class183.field3376, arg8, -1412584499);
                class244.field4363 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class14.field288[var9] = true;
            }
        } else {
            class14.field288[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public static final void method173(int arg0) {
        class249.field4404 = 0;
        class68.field1498 = -3;
        class110.field2204 = 1;
        class87.field1792 = 0;
        class247.field4392 = false;
        field345++;
        class20.field379 = -1;
        if (arg0 < -52) {
            class275.field4800 = 0;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JB)Lpe;")
    public final class81 method174(long arg0, byte arg1) {
        field350++;
        class81 var4 = (class81) this.field357.method1168(-3, arg0);
        if (var4 != null) {
            this.field356.method535(var4, (byte) -112);
        }
        if (arg1 > -41) {
            this.field357 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field352 = arg0;
        this.field355 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field357 = new class157(var2);
    }
}
