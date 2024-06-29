import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public abstract class class206 {

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lsb;")
    public static class98 field3520 = class47.method368("(Z", 0);

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lsb;")
    private static class98 field3522 = class47.method368("Members only world", 0);

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "Lsb;")
    private static class98 field3524 = class47.method368("Players", 0);

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lsb;")
    public static class98 field3525 = class47.method368("Versteckt", 0);

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field3517 = 0;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "Lsb;")
    public static class98 field3523 = class47.method368("::fps ", 0);

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "Lsb;")
    public static class98 field3515 = field3522;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field3528 = -1;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lsb;")
    public static class98 field3527 = field3524;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field3526 = new Random();

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[[[S")
    public static short[][][] field3516;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= class229.field3933 && class106.field1899 >= arg3 && arg5 >= class229.field3933 && arg5 <= class106.field1899 && class229.field3933 <= arg7 && arg7 <= class106.field1899 && arg2 >= class229.field3933 && class106.field1899 >= arg2 && class116.field2077 <= arg9 && class215.field3666 >= arg9 && class116.field2077 <= arg4 && class215.field3666 >= arg4 && class116.field2077 <= arg8 && arg8 <= class215.field3666 && class116.field2077 <= arg1 && arg1 <= class215.field3666) {
            class186.method1284(arg1, arg6 ^ 0x27BD, arg4, arg3, arg5, arg9, arg8, arg0, arg2, arg7);
        } else {
            class184.method1269(arg2, arg0, arg1, arg7, arg9, arg4, arg6 ^ 0xFFFFD823, arg8, arg3, arg5);
        }
        if (arg6 == 10180) {
            field3514++;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public abstract void method13(byte arg0);

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
    public static final void method1389(byte arg0) {
        class131.field2330.method66(false);
        class116.field2072 = null;
        if (arg0 != -46) {
            field3528 = 71;
        }
        class216.field3685 = 1;
        field3521++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIB)I")
    public abstract int method12(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)V")
    public static final void method1390(int arg0, byte arg1) {
        class144.field2528.method1561(-66, arg0);
        field3518++;
        if (arg1 != 70) {
            method1388(93, 116, -107, 14, 100, 30, 58, 46, -2, 2);
        }
        class224.field3862.method1561(-85, arg0);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Ltg;Ltg;Ltg;ILtg;)V")
    public static final void method1391(class75 arg0, class75 arg1, class75 arg2, int arg3, class75 arg4) {
        class74.field1266 = arg0;
        field3529++;
        class82.field1443 = arg1;
        class60.field990 = arg2;
        class252.field4414 = arg4;
        class33.field585 = new class148[class252.field4414.method579(-127)][];
        if (arg3 > -103) {
            field3528 = -3;
        }
        class248.field4361 = new boolean[class252.field4414.method579(-126)];
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILq;I)I")
    public static final int method1392(int arg0, class148 arg1, int arg2) {
        field3513++;
        if (arg1.field2659 == null || arg0 >= arg1.field2659.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field2659[arg0];
            int var4 = 0;
            if (arg2 != 31546) {
                field3515 = null;
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 1) {
                    var8 = class222.field3817[var3[var5++]];
                }
                if (var7 == 2) {
                    var8 = class167.field2980[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class23.field476[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class148 var12 = class62.method455(arg2 ^ 0xCD179BAA, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class235.method1605(-93, var13).field4309 || class119.field2139)) {
                        for (int var14 = 0; var14 < var12.field2632.length; var14++) {
                            if (var13 + 1 == var12.field2632[var14]) {
                                var8 += var12.field2612[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class118.field2117[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class125.field2256[class167.field2980[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class118.field2117[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class163.field2943.field3324;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class211.field3615[var15]) {
                            var8 += class167.field2980[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class148 var18 = class62.method455(arg2 ^ 0xCD179BAA, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class235.method1605(-71, var19).field4309 || class119.field2139)) {
                        for (int var20 = 0; var20 < var18.field2632.length; var20++) {
                            if ((var19 + 1) == var18.field2632[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class114.field2025;
                }
                if (var7 == 12) {
                    var8 = class113.field2016;
                }
                if (var7 == 13) {
                    int var21 = class118.field2117[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class105.method807(var23, 128);
                }
                if (var7 == 18) {
                    var8 = (class163.field2943.field4492 >> 7) + class189.field3277;
                }
                if (var7 == 19) {
                    var8 = (class163.field2943.field4466 >> 7) + class182.field3143;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Lsb;")
    public static final class98 method1393(int arg0, int arg1) {
        class98 var2 = class125.method930(25904, arg1);
        for (int var3 = var2.method724((byte) 25) - 3; var3 > 0; var3 -= 3) {
            var2 = class186.method1288(new class98[] { var2.method742(74, 0, var3), class62.field1044, var2.method740(var3, true) }, 31618);
        }
        field3519++;
        if (var2.method724((byte) 25) > 9) {
            return class186.method1288(new class98[] { class111.field1968, var2.method742(-80, 0, var2.method724((byte) 25) - 8), class232.field3994, class108.field1938, var2, class232.field3998 }, 31618);
        } else if (var2.method724((byte) 25) > 6) {
            return class186.method1288(new class98[] { class88.field1566, var2.method742(-99, 0, var2.method724((byte) 25) - 4), class142.field2503, class108.field1938, var2, class232.field3998 }, 31618);
        } else {
            int var4 = -84 / ((arg0 + 57) / 58);
            return class186.method1288(new class98[] { class249.field4376, var2, class78.field1378 }, 31618);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method1394(int arg0) {
        field3522 = null;
        field3525 = null;
        field3520 = null;
        int var1 = 94 % ((arg0 + 49) / 52);
        field3516 = null;
        field3523 = null;
        field3526 = null;
        field3524 = null;
        field3515 = null;
        field3527 = null;
    }
}
