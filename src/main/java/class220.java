import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class220 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public int field3403 = -1;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field3406 = 2;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public int field3421 = -1;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Z")
    public boolean field3408 = false;

    @OriginalMember(owner = "client!wg", name = "B", descriptor = "Z")
    public boolean field3429 = false;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field3402 = -1;

    @OriginalMember(owner = "client!wg", name = "z", descriptor = "I")
    public int field3427 = 5;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Z")
    public boolean field3415 = false;

    @OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
    public int field3428 = 99;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "Z")
    public boolean field3423 = false;

    @OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
    public int field3426 = -1;

    @OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
    public int field3434 = -1;

    @OriginalMember(owner = "client!wg", name = "w", descriptor = "[I")
    public static int[] field3424 = new int[100];

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field3435 = 0;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
    public int field3432;

    @OriginalMember(owner = "client!wg", name = "F", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "Lpk;")
    public static class237 field3404;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "[I")
    private int[] field3409;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
    public int[] field3413;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "[I")
    public static int[] field3417;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[I")
    public int[] field3422;

    @OriginalMember(owner = "client!wg", name = "x", descriptor = "[Z")
    public boolean[] field3425;

    @OriginalMember(owner = "client!wg", name = "D", descriptor = "[[I")
    public int[][] field3431;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1503(int arg0) {
        field3424 = null;
        if (arg0 > 29) {
            field3417 = null;
            field3404 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)[Lbk;")
    public static final class46[] method1504(byte arg0) {
        int var1 = 71 / ((arg0 - 26) / 51);
        field3418++;
        class46[] var2 = new class46[class246.field3823];
        for (int var3 = 0; var3 < class246.field3823; var3++) {
            var2[var3] = new class46(client.field729, class126.field1857, class135.field1973[var3], class5.field69[var3], class27.field525[var3], class173.field2530[var3], class209.field3125[var3], class15.field221);
        }
        class293.method1936(-108);
        return var2;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)V")
    public static final void method1505(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3411++;
        if (class102.field1501 == 1) {
            class55.field916[class55.field925 / 100].method1230(class14.field209 - 8, class54.field901 + -8);
        }
        if (arg3 != 8) {
            field3424 = null;
        }
        if (class102.field1501 == 2) {
            class55.field916[class55.field925 / 100 + 4].method1230(class14.field209 - 8, class54.field901 - 8);
        }
        class295.method1946(6863);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lca;I)V")
    public final void method1506(class54 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method407(255);
            if (var3 == 0) {
                field3407++;
                if (arg1 <= 35) {
                    this.field3409 = null;
                    return;
                }
                return;
            }
            this.method1508(arg0, 25170, var3);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILpb;IIB)Lpb;")
    public final class2 method1507(int arg0, class2 arg1, int arg2, int arg3, byte arg4) {
        field3414++;
        int var6 = this.field3422[arg2];
        int var7 = this.field3413[arg2];
        class152 var8 = class126.method880(1023, var7 >> 16);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method35(true, true, true);
        }
        class152 var10 = null;
        class152 var11 = null;
        class152 var12 = null;
        int var13 = 0;
        int var14 = 0;
        if ((this.field3423 || class253.field3900) && arg3 != -1 && this.field3413.length > arg3) {
            int var15 = this.field3413[arg3];
            var10 = class126.method880(1023, var15 >> 16);
            arg3 = var15 & 0xFFFF;
        }
        if (this.field3409 != null) {
            if (this.field3409.length > arg2) {
                var13 = this.field3409[arg2];
                if (var13 != 65535) {
                    var12 = class126.method880(1023, var13 >> 16);
                    var13 &= 0xFFFF;
                }
            }
            if ((this.field3423 || class253.field3900) && arg3 != -1 && this.field3409.length > arg3) {
                var14 = this.field3409[arg3];
                if (var14 != 65535) {
                    var11 = class126.method880(1023, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method1033(var9, arg4 - 77);
        boolean var17 = !var8.method1032(var9, 94);
        if (var12 != null) {
            var16 &= !var12.method1033(var13, -1);
            var17 &= !var12.method1032(var13, 100);
        }
        if (var10 != null) {
            var16 &= !var10.method1033(arg3, -1);
            var17 &= !var10.method1032(arg3, -38);
        }
        if (var11 != null) {
            var16 &= !var11.method1033(var14, arg4 - 77);
            var17 &= !var11.method1032(var14, 124);
        }
        class2 var18 = arg1.method35(var16, var17, !this.field3429);
        var18.method37(var8, var9, var10, arg3, arg0 - 1, var6, this.field3429);
        if (var12 != null) {
            var18.method37(var12, var13, var11, var14, arg0 - 1, var6, this.field3429);
        }
        return arg4 == 76 ? var18 : null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lca;II)V")
    private final void method1508(class54 arg0, int arg1, int arg2) {
        if (arg1 != 25170) {
            method1513(false, -112);
        }
        field3430++;
        if (arg2 == 1) {
            int var4 = arg0.method423(82);
            this.field3422 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3422[var5] = arg0.method423(class226.method1551(arg1, -25121));
            }
            this.field3413 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field3413[var6] = arg0.method423(-83);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field3413[var7] += arg0.method423(arg1 - 25276) << 16;
            }
        } else if (arg2 == 2) {
            this.field3434 = arg0.method423(112);
        } else if (arg2 == 3) {
            this.field3425 = new boolean[256];
            int var8 = arg0.method407(255);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3425[arg0.method407(class226.method1551(arg1, 25261))] = true;
            }
        } else if (arg2 == 4) {
            this.field3408 = true;
        } else if (arg2 == 5) {
            this.field3427 = arg0.method407(arg1 ^ 0x62AD);
        } else if (arg2 == 6) {
            this.field3403 = arg0.method423(-114);
        } else if (arg2 == 7) {
            this.field3421 = arg0.method423(94);
        } else if (arg2 == 8) {
            this.field3428 = arg0.method407(255);
        } else if (arg2 == 9) {
            this.field3402 = arg0.method407(arg1 - 24915);
        } else if (arg2 == 10) {
            this.field3426 = arg0.method407(arg1 ^ 0x62AD);
        } else if (arg2 == 11) {
            this.field3406 = arg0.method407(arg1 ^ 0x62AD);
        } else if (arg2 == 12) {
            int var14 = arg0.method407(arg1 ^ 0x62AD);
            this.field3409 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field3409[var15] = arg0.method423(78);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field3409[var16] = (arg0.method423(class226.method1551(arg1, -25126)) << 16) + this.field3409[var16];
            }
        } else if (arg2 == 13) {
            int var10 = arg0.method423(arg1 ^ 0xFFFF9DE1);
            this.field3431 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method407(arg1 ^ 0x62AD);
                if (var12 > 0) {
                    this.field3431[var11] = new int[var12];
                    this.field3431[var11][0] = arg0.method408(arg1 - 25162);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field3431[var11][var13] = arg0.method423(79);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field3429 = true;
        } else if (arg2 == 15) {
            this.field3423 = true;
        } else if (arg2 == 16) {
            this.field3415 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
    public final void method1509(boolean arg0) {
        if (this.field3426 == -1) {
            if (this.field3425 == null) {
                this.field3426 = 0;
            } else {
                this.field3426 = 2;
            }
        }
        if (!arg0) {
            this.field3425 = null;
        }
        if (this.field3402 == -1) {
            if (this.field3425 == null) {
                this.field3402 = 0;
            } else {
                this.field3402 = 2;
            }
        }
        field3410++;
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static final void method1510(int arg0) {
        class286.field4383.method940(114);
        field3419++;
        if (arg0 == -1) {
            class12.field183.method940(85);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILpb;IIBI)Lpb;")
    public final class2 method1511(int arg0, class2 arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = this.field3422[arg2];
        int var8 = this.field3413[arg2];
        if (arg4 != -4) {
            return null;
        }
        field3416++;
        class152 var9 = class126.method880(1023, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method14(true, true, true);
        }
        int var11 = arg0 & 0x3;
        class152 var12 = null;
        if ((this.field3423 || class253.field3900) && arg5 != -1 && arg5 < this.field3413.length) {
            int var13 = this.field3413[arg5];
            var12 = class126.method880(arg4 + 1027, var13 >> 16);
            arg5 = var13 & 0xFFFF;
        }
        class2 var14;
        if (var12 == null) {
            var14 = arg1.method14(!var9.method1033(var10, arg4 ^ 0x3), !var9.method1032(var10, 121), !this.field3429);
        } else {
            var14 = arg1.method14(!var9.method1033(var10, -1) & !var12.method1033(arg5, -1), !var9.method1032(var10, 104) & !var12.method1032(arg5, arg4 ^ 0xFFFFFF8E), !this.field3429);
        }
        if (var11 == 1) {
            var14.method25();
        } else if (var11 == 2) {
            var14.method38();
        } else if (var11 == 3) {
            var14.method13();
        }
        var14.method37(var9, var10, var12, arg5, arg3 - 1, var7, this.field3429);
        if (var11 == 1) {
            var14.method13();
        } else if (var11 == 2) {
            var14.method38();
        } else if (var11 == 3) {
            var14.method25();
        }
        return var14;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IILpb;II)Lpb;")
    public final class2 method1512(int arg0, int arg1, class2 arg2, int arg3, int arg4) {
        field3412++;
        int var6 = this.field3422[arg0];
        int var7 = this.field3413[arg0];
        class152 var8 = class126.method880(1023, var7 >> 16);
        int var9 = var7 & arg4;
        if (var8 == null) {
            return arg2.method26(true, true, true);
        }
        class152 var10 = null;
        if ((this.field3423 || class253.field3900) && arg3 != -1 && this.field3413.length > arg3) {
            int var11 = this.field3413[arg3];
            var10 = class126.method880(arg4 ^ 0xFC00, var11 >> 16);
            arg3 = var11 & 0xFFFF;
        }
        class2 var12;
        if (var10 == null) {
            var12 = arg2.method26(!var8.method1033(var9, -1), !var8.method1032(var9, 115), !this.field3429);
        } else {
            var12 = arg2.method26(!var8.method1033(var9, -1) & !var10.method1033(arg3, -1), !var8.method1032(var9, 113) & !var10.method1032(arg3, -66), !this.field3429);
        }
        var12.method37(var8, var9, var10, arg3, arg1 - 1, var6, this.field3429);
        return var12;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZI)V")
    public static final void method1513(boolean arg0, int arg1) {
        int var2 = class266.field4155;
        field3405++;
        if (arg1 == 0) {
            var2 = 1;
        }
        if (arg0) {
            field3433 = 13;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class224 var20;
            if (arg1 == 0) {
                var20 = class185.field2687;
            } else {
                var20 = class166.field2438[class205.field3068[var3]];
            }
            if (var20 != null && var20.method173((byte) 109)) {
                int var21 = var20.method168(-109);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field425 & 0x7F) == 64 && (var20.field455 & 0x7F) == 64) {
                            int var28 = var20.field455 >> 7;
                            int var29 = var20.field425 >> 7;
                            if (var29 >= 0 && var29 < 104 && var28 >= 0 && var28 < 104) {
                                var10002 = class273.field4231[var29][var28]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field425 & 0x7F) == 0 && (var20.field455 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field425 & 0x7F) == 64 && (var20.field455 & 0x7F) == 64)) {
                        int var22 = var20.field425 - (var21 * 64) >> 7;
                        int var23 = var20.field455 - var21 * 64 >> 7;
                        int var24 = var22 + var20.method168(-99);
                        if (var24 > 104) {
                            var24 = 104;
                        }
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        int var25 = var23 + var20.method168(-119);
                        if (var25 > 104) {
                            var25 = 104;
                        }
                        if (var23 < 0) {
                            var23 = 0;
                        }
                        for (int var26 = var22; var26 < var24; var26++) {
                            for (int var27 = var23; var27 < var25; var27++) {
                                var10002 = class273.field4231[var26][var27]++;
                            }
                        }
                    }
                }
            }
        }
        label216: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class224 var7;
            if (arg1 == 0) {
                var5 = 8791798054912L;
                var7 = class185.field2687;
            } else {
                var7 = class166.field2438[class205.field3068[var4]];
                var5 = (long) class205.field3068[var4] << 32;
            }
            if (var7 != null && var7.method173((byte) 109)) {
                int var8 = var7.method168(-100);
                if (arg1 == 0 || arg1 == var8) {
                    var7.field3475 = false;
                    var7.field454 = true;
                    if ((class126.field1856 && class266.field4155 > 200 || class266.field4155 > 50) && arg1 != 0 && var7.field399 == var7.method165((byte) -58).field1651) {
                        var7.field3475 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field425 & 0x7F) == 64 && (var7.field455 & 0x7F) == 64) {
                            int var9 = var7.field455 >> 7;
                            int var10 = var7.field425 >> 7;
                            if (var10 < 0 || var10 >= 104 || var9 < 0 || var9 >= 104) {
                                continue;
                            }
                            if (class273.field4231[var10][var9] > 1) {
                                var10002 = class273.field4231[var10][var9]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field425 & 0x7F) == 0 && (var7.field455 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field425 & 0x7F) == 64 && (var7.field455 & 0x7F) == 0) {
                        int var11 = var7.field425 - var8 * 64 >> 7;
                        int var12 = var7.field455 - var8 * 64 >> 7;
                        int var13 = var8 + var11;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        int var14 = var12 + var8;
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        boolean var15 = true;
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        for (int var16 = var11; var16 < var13; var16++) {
                            for (int var19 = var12; var19 < var14; var19++) {
                                if (class273.field4231[var16][var19] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var17 = var11;
                            while (true) {
                                if (var13 <= var17) {
                                    continue label216;
                                }
                                for (int var18 = var12; var18 < var14; var18++) {
                                    var10002 = class273.field4231[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var7.field397 == null || var7.field467 > class120.field1794 || class120.field1794 >= var7.field433) {
                        var7.field454 = false;
                        var7.field411 = class268.method1810(class260.field3986, var7.field425, (byte) 118, var7.field455);
                        class232.method1579(class260.field3986, var7.field425, var7.field455, var7.field411, var8 * 64 + 60 - 64, var7, var7.field471, var5, var7.field398);
                    } else {
                        var7.field3475 = false;
                        var7.field454 = false;
                        var7.field411 = class268.method1810(class260.field3986, var7.field425, (byte) 118, var7.field455);
                        class97.method728(class260.field3986, var7.field425, var7.field455, var7.field411, var7, var7.field471, var5, var7.field403, var7.field408, var7.field419, var7.field469);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "([BZI)Ljava/lang/Object;")
    public static final Object method1514(byte[] arg0, boolean arg1, int arg2) {
        field3420++;
        if (arg0 == null) {
            return null;
        } else if (arg2 == 10581) {
            if (arg0.length > 136 && !class1.field24) {
                try {
                    class86 var3 = (class86) Class.forName("mg").getDeclaredConstructor().newInstance();
                    var3.method660(arg0, (byte) -46);
                    return var3;
                } catch (Throwable var4) {
                    class1.field24 = true;
                }
            }
            return arg1 ? class216.method1453(arg0, (byte) 45) : arg0;
        } else {
            return null;
        }
    }
}
