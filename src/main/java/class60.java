import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class60 extends class79 {

    @OriginalMember(owner = "client!k", name = "D", descriptor = "[J")
    private long[] field1518 = new long[10];

    @OriginalMember(owner = "client!k", name = "y", descriptor = "La;")
    private static class1 field1514 = class113.method934(-11538, " has logged out)3");

    @OriginalMember(owner = "client!k", name = "C", descriptor = "[I")
    public static int[] field1517 = new int[99];

    @OriginalMember(owner = "client!k", name = "x", descriptor = "La;")
    public static class1 field1513 = field1514;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "[I")
    public static int[] field1524;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "La;")
    public static class1 field1526;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "La;")
    private static class1 field1532;

    @OriginalMember(owner = "client!k", name = "N", descriptor = "La;")
    private static class1 field1528;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "La;")
    public static class1 field1525;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "La;")
    public static class1 field1529;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!k", name = "P", descriptor = "La;")
    public static class1 field1530;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    private int field1511;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "I")
    public static int field1519;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    private int field1520;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "I")
    private int field1523;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "J")
    private long field1522;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "Le;")
    public static class25 field1527;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1517[var1] = var0 / 4;
        }
        field1524 = new int[50];
        field1526 = null;
        field1532 = class113.method934(-11538, "Attack");
        field1528 = class113.method934(-11538, "Loaded sprites");
        field1525 = field1532;
        field1529 = class113.method934(-11538, "b12_full");
        field1531 = 0;
        field1530 = field1528;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V", line = 10)
    public final void method573(int arg0) {
        field1519++;
        int var2 = 36 / ((arg0 + 76) / 48);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field1518[var3] = 0L;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 33)
    public final void method574(int arg0) {
        this.field1523 = 256;
        this.field1511 = 0;
        field1515++;
        this.field1520 = 1;
        this.field1522 = class103.method872(1);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1518[var2] = this.field1522;
        }
        if (arg0 != -10115) {
            field1529 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V", line = 56)
    public static final void method575(int arg0) {
        field1516++;
        if (class5.field217 == 0) {
            return;
        }
        int var1 = 0;
        if (class114.field2816 != 0) {
            var1 = 1;
        }
        for (int var2 = 0; var2 < 100; var2++) {
            if (class80.field2037[var2] != null) {
                int var3 = class132.field3239[var2];
                class1 var4 = class128.field3133[var2];
                if (var4 != null && var4.method26((byte) 116, class103.field2615)) {
                    var4 = var4.method1((byte) 95, 5);
                }
                if (var4 != null && var4.method26((byte) 116, class100.field2538)) {
                    var4 = var4.method1((byte) 95, 5);
                }
                if ((var3 == 3 || var3 == 7) && (var3 == 7 || class6.field237 == 0 || class6.field237 == 1 && class12.method243(var4, arg0 - 42391))) {
                    int var5 = 329 - var1 * 13;
                    var1++;
                    if (class24.field742 > 4 && var5 - 10 < class102.field2571 + -4 && class102.field2571 - 4 <= var5 + 3) {
                        int var6 = class106.field2687.method209(class116.method959(arg0 - 9666, new class1[] { class46.field1217, class23.field714, var4, class80.field2037[var2] })) + 25;
                        if (var6 > 450) {
                            var6 = 450;
                        }
                        if (class24.field742 < var6 + 4) {
                            class118.field2935++;
                            if (class37.field1005 >= 1) {
                                class34.method399(0, class38.field1039, 0, -501, 0, 2028, class116.method959(-97, new class1[] { class53.field1396, var4 }));
                                class5.field210++;
                            }
                            class34.method399(0, class79.field1936, 0, -501, 0, 2051, class116.method959(arg0 ^ 0x2613, new class1[] { class53.field1396, var4 }));
                            class34.method399(0, class52.field1367, 0, arg0 ^ 0xFFFFD82C, 0, 2045, class116.method959(arg0 ^ 0xFFFFD99F, new class1[] { class53.field1396, var4 }));
                            class46.field1212++;
                        }
                    }
                    if (var1 >= 5) {
                        return;
                    }
                }
                if ((var3 == 5 || var3 == 6) && class6.field237 < 2) {
                    var1++;
                    if (var1 >= 5) {
                        return;
                    }
                }
            }
        }
        if (arg0 != 9767) {
            field1531 = 48;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)I", line = 165)
    public final int method576(int arg0, int arg1, int arg2) {
        field1509++;
        int var4 = this.field1520;
        this.field1520 = 1;
        int var5 = this.field1523;
        this.field1523 = 300;
        this.field1522 = class103.method872(arg2 ^ 0x2646);
        if (this.field1518[this.field1508] == 0L) {
            this.field1523 = var5;
            this.field1520 = var4;
        } else if (this.field1518[this.field1508] < this.field1522) {
            this.field1523 = (int) ((long) (arg0 * 2560) / (this.field1522 - this.field1518[this.field1508]));
        }
        if (this.field1523 < 25) {
            this.field1523 = 25;
        }
        if (this.field1523 > 256) {
            this.field1523 = 256;
            this.field1520 = (int) ((long) arg0 - (this.field1522 - this.field1518[this.field1508]) / 10L);
        }
        if (this.field1520 > arg0) {
            this.field1520 = arg0;
        }
        this.field1518[this.field1508] = this.field1522;
        this.field1508 = (this.field1508 + 1) % 10;
        if (this.field1520 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1518[var6] != 0L) {
                    this.field1518[var6] += this.field1520;
                }
            }
        }
        if (this.field1520 < arg1) {
            this.field1520 = arg1;
        }
        class86.method756((long) this.field1520, arg2 ^ 0xFFFFD9EC);
        int var7 = 0;
        if (arg2 != 9799) {
            field1528 = null;
        }
        while (this.field1511 < 256) {
            var7++;
            this.field1511 += this.field1523;
        }
        this.field1511 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Llc;IZB)Z", line = 240)
    public static final boolean method577(class69 arg0, int arg1, boolean arg2, byte arg3) {
        field1521++;
        if (arg3 != 30) {
            method579(47, -7, 96, -97, (byte) -6, -111, true, -110, 57, -36, -84, -42);
        }
        if (class81.method737(arg0, (byte) 121, arg2)) {
            if (arg1 > 0) {
                class1.field30 = new class15(arg1);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V", line = 265)
    public static final void method578(byte arg0) {
        if (arg0 != 29) {
            method579(79, 61, 50, -68, (byte) 53, -121, false, 1, 18, -15, 29, 27);
        }
        field1507++;
        if (class122.field3053 != 1) {
            return;
        }
        if (class112.field2765 >= 539 && class112.field2765 <= 573 && class1.field14 >= 169 && class1.field14 < 205 && class97.field2400[0] != -1) {
            class95.field2367 = true;
            class39.field1056 = true;
            class9.field331 = 0;
        }
        if (class112.field2765 >= 569 && class112.field2765 <= 599 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2400[1] != -1) {
            class9.field331 = 1;
            class39.field1056 = true;
            class95.field2367 = true;
        }
        if (class112.field2765 >= 597 && class112.field2765 <= 627 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2400[2] != -1) {
            class95.field2367 = true;
            class9.field331 = 2;
            class39.field1056 = true;
        }
        if (class112.field2765 >= 625 && class112.field2765 <= 669 && class1.field14 >= 168 && class1.field14 < 203 && class97.field2400[3] != -1) {
            class95.field2367 = true;
            class39.field1056 = true;
            class9.field331 = 3;
        }
        if (class112.field2765 >= 666 && class112.field2765 <= 696 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2400[4] != -1) {
            class9.field331 = 4;
            class39.field1056 = true;
            class95.field2367 = true;
        }
        if (class112.field2765 >= 694 && class112.field2765 <= 724 && class1.field14 >= 168 && class1.field14 < 205 && class97.field2400[5] != -1) {
            class95.field2367 = true;
            class39.field1056 = true;
            class9.field331 = 5;
        }
        if (class112.field2765 >= 722 && class112.field2765 <= 756 && class1.field14 >= 169 && class1.field14 < 205 && class97.field2400[6] != -1) {
            class39.field1056 = true;
            class9.field331 = 6;
            class95.field2367 = true;
        }
        if (class112.field2765 >= 540 && class112.field2765 <= 574 && class1.field14 >= 466 && class1.field14 < 502 && class97.field2400[7] != -1) {
            class9.field331 = 7;
            class95.field2367 = true;
            class39.field1056 = true;
        }
        if (class112.field2765 >= 572 && class112.field2765 <= 602 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2400[8] != -1) {
            class39.field1056 = true;
            class95.field2367 = true;
            class9.field331 = 8;
        }
        if (class112.field2765 >= 599 && class112.field2765 <= 629 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2400[9] != -1) {
            class95.field2367 = true;
            class9.field331 = 9;
            class39.field1056 = true;
        }
        if (class112.field2765 >= 627 && class112.field2765 <= 671 && class1.field14 >= 467 && class1.field14 < 502 && class97.field2400[10] != -1) {
            class9.field331 = 10;
            class95.field2367 = true;
            class39.field1056 = true;
        }
        if (class112.field2765 >= 669 && class112.field2765 <= 699 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2400[11] != -1) {
            class9.field331 = 11;
            class39.field1056 = true;
            class95.field2367 = true;
        }
        if (class112.field2765 >= 696 && class112.field2765 <= 726 && class1.field14 >= 466 && class1.field14 < 503 && class97.field2400[12] != -1) {
            class39.field1056 = true;
            class95.field2367 = true;
            class9.field331 = 12;
        }
        if (class112.field2765 >= 724 && class112.field2765 <= 758 && class1.field14 >= 466 && class1.field14 < 502 && class97.field2400[13] != -1) {
            class9.field331 = 13;
            class39.field1056 = true;
            class95.field2367 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIBIZIIIII)Z", line = 385)
    public static final boolean method579(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1510++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class112.field2762[var12][var36] = 0;
                class102.field2580[var12][var36] = 99999999;
            }
        }
        class112.field2762[arg2][arg9] = 99;
        byte var13 = 0;
        int var14 = arg9;
        boolean var15 = false;
        int var16 = 0;
        class102.field2580[arg2][arg9] = 0;
        int var17 = arg2;
        class50.field1353[var13] = arg2;
        if (arg4 < 91) {
            return false;
        }
        int var37 = var13 + 1;
        class17.field547[var13] = arg9;
        int var18 = class50.field1353.length;
        int[][] var19 = class102.field2572[class2.field76].field202;
        while (var37 != var16) {
            var14 = class17.field547[var16];
            var17 = class50.field1353[var16];
            var16 = (var16 + 1) % var18;
            if (arg3 == var17 && arg10 == var14) {
                var15 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class102.field2572[class2.field76].method120(var17, false, arg5 - 1, arg10, var14, arg7, arg3)) {
                    var15 = true;
                    break;
                }
                if (arg5 < 10 && class102.field2572[class2.field76].method123(arg10, arg7, var14, arg3, var17, (byte) 122, arg5 - 1)) {
                    var15 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg8 != 0 && class102.field2572[class2.field76].method118(-24, arg8, arg3, arg0, arg10, arg1, var14, var17)) {
                var15 = true;
                break;
            }
            int var35 = class102.field2580[var17][var14] + 1;
            if (var17 > 0 && class112.field2762[var17 - 1][var14] == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0) {
                class50.field1353[var37] = var17 - 1;
                class17.field547[var37] = var14;
                var37 = (var37 + 1) % var18;
                class112.field2762[var17 - 1][var14] = 2;
                class102.field2580[var17 - 1][var14] = var35;
            }
            if (var17 < 103 && class112.field2762[var17 + 1][var14] == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0) {
                class50.field1353[var37] = var17 + 1;
                class17.field547[var37] = var14;
                var37 = (var37 + 1) % var18;
                class112.field2762[var17 + 1][var14] = 8;
                class102.field2580[var17 + 1][var14] = var35;
            }
            if (var14 > 0 && class112.field2762[var17][var14 - 1] == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
                class50.field1353[var37] = var17;
                class17.field547[var37] = var14 - 1;
                class112.field2762[var17][var14 - 1] = 1;
                var37 = (var37 + 1) % var18;
                class102.field2580[var17][var14 - 1] = var35;
            }
            if (var14 < 103 && class112.field2762[var17][var14 + 1] == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
                class50.field1353[var37] = var17;
                class17.field547[var37] = var14 + 1;
                class112.field2762[var17][var14 + 1] = 4;
                class102.field2580[var17][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var17 > 0 && var14 > 0 && class112.field2762[var17 - 1][var14 - 1] == 0 && (var19[var17 - 1][var14 - 1] & 0x128010E) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
                class50.field1353[var37] = var17 - 1;
                class17.field547[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class112.field2762[var17 - 1][var14 - 1] = 3;
                class102.field2580[var17 - 1][var14 - 1] = var35;
            }
            if (var17 < 103 && var14 > 0 && class112.field2762[var17 + 1][var14 - 1] == 0 && (var19[var17 + 1][var14 - 1] & 0x1280183) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 - 1] & 0x1280102) == 0) {
                class50.field1353[var37] = var17 + 1;
                class17.field547[var37] = var14 - 1;
                var37 = (var37 + 1) % var18;
                class112.field2762[var17 + 1][var14 - 1] = 9;
                class102.field2580[var17 + 1][var14 - 1] = var35;
            }
            if (var17 > 0 && var14 < 103 && class112.field2762[var17 - 1][var14 + 1] == 0 && (var19[var17 - 1][var14 + 1] & 0x1280138) == 0 && (var19[var17 - 1][var14] & 0x1280108) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
                class50.field1353[var37] = var17 - 1;
                class17.field547[var37] = var14 + 1;
                class112.field2762[var17 - 1][var14 + 1] = 6;
                class102.field2580[var17 - 1][var14 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var17 < 103 && var14 < 103 && class112.field2762[var17 + 1][var14 + 1] == 0 && (var19[var17 + 1][var14 + 1] & 0x12801E0) == 0 && (var19[var17 + 1][var14] & 0x1280180) == 0 && (var19[var17][var14 + 1] & 0x1280120) == 0) {
                class50.field1353[var37] = var17 + 1;
                class17.field547[var37] = var14 + 1;
                var37 = (var37 + 1) % var18;
                class112.field2762[var17 + 1][var14 + 1] = 12;
                class102.field2580[var17 + 1][var14 + 1] = var35;
            }
        }
        class114.field2812 = 0;
        if (!var15) {
            if (!arg6) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg3 - var21; var23 <= arg3 + var21; var23++) {
                for (int var24 = arg10 - var21; var24 <= arg10 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class102.field2580[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg10) {
                            var25 = arg10 - var24;
                        } else if (var24 > arg10 + arg8 - 1) {
                            var25 = var24 + 1 - arg8 - arg10;
                        }
                        if (var23 < arg3) {
                            var26 = arg3 - var23;
                        } else if (arg0 + arg3 - 1 < var23) {
                            var26 = var23 + 1 - arg0 - arg3;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && class102.field2580[var23][var24] < var22) {
                            var14 = var24;
                            var20 = var27;
                            var17 = var23;
                            var22 = class102.field2580[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg2 == var17 && arg9 == var14) {
                return false;
            }
            class114.field2812 = 1;
        }
        byte var28 = 0;
        class50.field1353[var28] = var17;
        int var38 = var28 + 1;
        class17.field547[var28] = var14;
        int var29;
        int var30 = var29 = class112.field2762[var17][var14];
        while (arg2 != var17 || arg9 != var14) {
            if (var29 != var30) {
                var29 = var30;
                class50.field1353[var38] = var17;
                class17.field547[var38++] = var14;
            }
            if ((var30 & 0x1) != 0) {
                var14++;
            } else if ((var30 & 0x4) != 0) {
                var14--;
            }
            if ((var30 & 0x2) != 0) {
                var17++;
            } else if ((var30 & 0x8) != 0) {
                var17--;
            }
            var30 = class112.field2762[var17][var14];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class17.field547[var38];
            int var33 = class50.field1353[var38];
            if (arg11 == 0) {
                class74.field1831++;
                class70.field1729.method416(11453, 73);
                class70.field1729.method142(var31 + var31 + 3, (byte) -128);
            }
            if (arg11 == 1) {
                class70.field1729.method416(11453, 236);
                class44.field1174++;
                class70.field1729.method142(var31 + var31 + 14 + 3, (byte) -128);
            }
            if (arg11 == 2) {
                class93.field2329++;
                class70.field1729.method416(11453, 89);
                class70.field1729.method142(var31 + var31 + 3, (byte) -128);
            }
            class70.field1729.method163(14912, var32 + class53.field1411);
            class70.field1729.method173(255, class59.field1491[82] ? 1 : 0);
            class70.field1729.method163(14912, class28.field807 + var33);
            class35.field942 = class50.field1353[0];
            class108.field2723 = class17.field547[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class70.field1729.method166(128, class50.field1353[var38] - var33);
                class70.field1729.method173(255, class17.field547[var38] - var32);
            }
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V", line = 742)
    public static void method580(int arg0) {
        field1514 = null;
        field1524 = null;
        field1528 = null;
        field1526 = null;
        field1525 = null;
        field1517 = null;
        field1527 = null;
        field1513 = null;
        field1530 = null;
        field1532 = null;
        if (arg0 == -22783) {
            field1529 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V", line = 815)
    public class60() {
        this.method574(-10115);
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V", line = 770)
    public static final void method581(byte arg0) {
        field1512++;
        if (class2.field97 != 2) {
            return;
        }
        if (arg0 >= -28) {
            method575(-128);
        }
        class38.method424(class42.field1115 * 2, (class6.field227 - class53.field1411 << 7) + class75.field1860, (-class28.field807 + class134.field3307 << 7) - -class102.field2575, 4976905);
        if (class39.field1073 > -1 && class82.field2066 % 20 < 10) {
            class76.field1889[0].method554(class39.field1073 - 12, class89.field2191 + -28);
        }
    }
}
