import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class105 extends class43 {

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    private int field1745 = -32768;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field1748 = 50;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Z")
    public static boolean field1751 = false;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "B")
    public static byte field1752;

    @OriginalMember(owner = "client!mk", name = "o", descriptor = "I")
    public int field1741;

    @OriginalMember(owner = "client!mk", name = "p", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!mk", name = "q", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lai;I)Lmf;")
    public static final class10 method754(class88 arg0, int arg1) {
        if (arg1 != 0) {
            field1751 = false;
        }
        field1753++;
        return new class10(arg0.method649(-2), arg0.method649(-2), arg0.method649(-2), arg0.method649(arg1 ^ 0xFFFFFFFE), arg0.method671(114), arg0.method671(99), arg0.method633(76));
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BILre;IIIII)V")
    public static final void method755(byte arg0, int arg1, class228 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1742++;
        int var8 = arg3 * arg3 + arg5 * arg5;
        if (arg7 < var8) {
            return;
        }
        int var9 = Math.min(arg2.field3574 / 2, arg2.field3625 / 2);
        int var10 = 46 / ((-arg0 - 52) / 54);
        if (var8 <= (var9 * var9)) {
            class177.method1200((byte) -122, arg6, arg3, arg2, arg5, arg4, class277.field4405[arg1]);
            return;
        }
        int var11 = (int) class16.field244 + class103.field1732 & 0x7FF;
        var9 -= 10;
        int var12 = class195.field3091[var11];
        int var13 = var12 * 256 / (class77.field1265 + 256);
        int var14 = class195.field3089[var11];
        int var15 = var14 * 256 / (class77.field1265 + 256);
        int var16 = arg3 * var13 + (arg5 * var15) >> 16;
        int var17 = arg3 * var15 - arg5 * var13 >> 16;
        double var18 = Math.atan2((double) var16, (double) var17);
        int var20 = (int) (Math.sin(var18) * (double) var9);
        int var21 = (int) (Math.cos(var18) * (double) var9);
        ((class276) class244.field3967[arg1]).method859(arg4 + var20 + (arg2.field3574 / 2) - 10, arg2.field3625 / 2 + (arg6 - var21) + -10, 20, 20, 15, 15, var18, 256);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIIIIIIJILri;)V")
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class67 arg10) {
        field1750++;
        class9 var13 = class85.method602(false, this.field1746).method525(106, (class30) null, this.field1741, -1, 0, 0, (class49) null);
        if (var13 != null) {
            var13.method100(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1745 = var13.method102();
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIIII)V")
    public final void method82(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1749++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILhc;)V")
    public static final void method756(int arg0, class235 arg1) {
        if (arg0 > 7) {
            field1743++;
            class186.field2872 = arg1;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BI)V")
    public static final void method757(byte arg0, int arg1) {
        field1744++;
        int var2 = class137.field2110;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 != -110) {
            return;
        }
        int var10002;
        while (var3 < var2) {
            class236 var20;
            if (arg1 == 0) {
                var20 = class283.field4473;
            } else {
                var20 = class210.field3267[class99.field1660[var3]];
            }
            if (var20 != null && var20.method328(0)) {
                int var21 = var20.method971(65535);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field2240 & 0x7F) == 64 && (var20.field2278 & 0x7F) == 64) {
                            int var22 = var20.field2240 >> 7;
                            int var23 = var20.field2278 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class245.field3985[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field2240 & 0x7F) == 0 && (var20.field2278 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field2240 & 0x7F) == 64 && (var20.field2278 & 0x7F) == 64)) {
                        int var24 = var20.field2278 - (var21 * 64) >> 7;
                        int var25 = var20.field2240 - (var21 * 64) >> 7;
                        int var26 = var20.method971(65535) + var25;
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        int var27 = var24 + var20.method971(65535);
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        for (int var28 = var25; var28 < var26; var28++) {
                            for (int var29 = var24; var29 < var27; var29++) {
                                var10002 = class245.field3985[var28][var29]++;
                            }
                        }
                    }
                }
            }
            var3++;
        }
        label215: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class236 var7;
            if (arg1 == 0) {
                var5 = 8791798054912L;
                var7 = class283.field4473;
            } else {
                var7 = class210.field3267[class99.field1660[var4]];
                var5 = (long) class99.field1660[var4] << 32;
            }
            if (var7 != null && var7.method328(0)) {
                int var8 = var7.method971(arg0 ^ 0xFFFF006D);
                if (arg1 == 0 || arg1 == var8) {
                    var7.field3806 = false;
                    var7.field2222 = true;
                    if ((class77.field1260 && class137.field2110 > 200 || class137.field2110 > 50) && arg1 != 0 && var7.field2250 == var7.method972((byte) -71).field4496) {
                        var7.field3806 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field2240 & 0x7F) == 64 && (var7.field2278 & 0x7F) == 64) {
                            int var9 = var7.field2240 >> 7;
                            int var10 = var7.field2278 >> 7;
                            if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (class245.field3985[var9][var10] > 1) {
                                var10002 = class245.field3985[var9][var10]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field2240 & 0x7F) == 0 && (var7.field2278 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field2240 & 0x7F) == 64 && (var7.field2278 & 0x7F) == 0) {
                        int var11 = var7.field2240 - var8 * 64 >> 7;
                        int var12 = var7.field2278 - (var8 * 64) >> 7;
                        int var13 = var8 + var12;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        boolean var14 = true;
                        int var15 = var8 + var11;
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        if (var15 > 104) {
                            var15 = 104;
                        }
                        for (int var16 = var11; var16 < var15; var16++) {
                            for (int var19 = var12; var19 < var13; var19++) {
                                if (class245.field3985[var16][var19] <= 1) {
                                    var14 = false;
                                    break;
                                }
                            }
                        }
                        if (var14) {
                            int var17 = var11;
                            while (true) {
                                if (var17 >= var15) {
                                    continue label215;
                                }
                                for (int var18 = var12; var18 < var13; var18++) {
                                    var10002 = class245.field3985[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var7.field2290 == null || class192.field2978 < var7.field2224 || var7.field2235 <= class192.field2978) {
                        var7.field2222 = false;
                        var7.field2234 = class34.method269(class240.field3892, var7.field2278, var7.field2240, 103);
                        class70.method506(class240.field3892, var7.field2240, var7.field2278, var7.field2234, (var8 - 1) * 64 + 60, var7, var7.field2275, var5, var7.field2200);
                    } else {
                        var7.field3806 = false;
                        var7.field2222 = false;
                        var7.field2234 = class34.method269(class240.field3892, var7.field2278, var7.field2240, 103);
                        class219.method1474(class240.field3892, var7.field2240, var7.field2278, var7.field2234, var7, var7.field2275, var5, var7.field2264, var7.field2233, var7.field2251, var7.field2262);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "()I")
    public final int method102() {
        field1747++;
        return this.field1745;
    }
}
