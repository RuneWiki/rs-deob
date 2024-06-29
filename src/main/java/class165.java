import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class165 {

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Z")
    public boolean field2623 = false;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public int field2619 = -1;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field2625 = -1;

    @OriginalMember(owner = "client!q", name = "x", descriptor = "I")
    public int field2640 = 99;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "Z")
    public boolean field2632 = false;

    @OriginalMember(owner = "client!q", name = "z", descriptor = "I")
    public int field2642 = -1;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public int field2643 = -1;

    @OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
    public boolean field2630 = false;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public int field2647 = 2;

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Z")
    public boolean field2641 = false;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public int field2649 = -1;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "I")
    public int field2646 = 5;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "I")
    public static int field2629 = 0;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "I")
    public static int field2633 = -1;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[I")
    public static int[] field2620 = new int[100];

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!q", name = "u", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!q", name = "w", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    private int[] field2617;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "[I")
    public int[] field2624;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
    public int[] field2634;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "[Z")
    public boolean[] field2636;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "[[B")
    public static byte[][] field2645;

    @OriginalMember(owner = "client!q", name = "v", descriptor = "[[I")
    public int[][] field2638;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public final void method1138(byte arg0) {
        if (this.field2649 == -1) {
            if (this.field2636 == null) {
                this.field2649 = 0;
            } else {
                this.field2649 = 2;
            }
        }
        field2621++;
        if (arg0 < 37) {
            this.method1146(-20, (class158) null, -14, (byte) -18, 43, -107);
        }
        if (this.field2619 != -1) {
            return;
        }
        if (this.field2636 == null) {
            this.field2619 = 0;
        } else {
            this.field2619 = 2;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lpd;B)V")
    public static final void method1139(class96 arg0, byte arg1) {
        if (arg1 != 39) {
            return;
        }
        while (true) {
            while (arg0.field1228 < arg0.field1218.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method584(255) == 1) {
                    var2 = true;
                    var3 = arg0.method584(255);
                    var4 = arg0.method584(arg1 ^ 0xD8);
                }
                int var5 = arg0.method584(255);
                int var6 = arg0.method584(255);
                int var7 = var5 * 64 - class105.field1413;
                int var8 = class42.field524 + class7.field88 - (var6 * 64) - 1;
                if (var7 >= 0 && (var8 - 63) >= 0 && class44.field562 > var7 + 63 && class7.field88 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method587(-12);
                                if (var13 != 0) {
                                    if (class166.field2679[var10][var9] == null) {
                                        class166.field2679[var10][var9] = new byte[4096];
                                    }
                                    class166.field2679[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method587(-52);
                                    if (class4.field65[var10][var9] == null) {
                                        class4.field65[var10][var9] = new byte[4096];
                                    }
                                    class4.field65[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method587(-92);
                        if (var16 != 0) {
                            arg0.field1228++;
                        }
                    }
                }
            }
            field2626++;
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static void method1140(byte arg0) {
        field2620 = null;
        if (arg0 != 93) {
            field2645 = null;
        }
        field2645 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILpd;I)V")
    private final void method1141(int arg0, class96 arg1, int arg2) {
        if (arg0 == 1) {
            int var4 = arg1.method549(255);
            this.field2634 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2634[var5] = arg1.method549(255);
            }
            this.field2624 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2624[var6] = arg1.method549(class288.method1939(arg2, 28524));
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2624[var7] = (arg1.method549(255) << 16) + this.field2624[var7];
            }
        } else if (arg0 == 2) {
            this.field2642 = arg1.method549(255);
        } else if (arg0 == 3) {
            this.field2636 = new boolean[256];
            int var8 = arg1.method584(arg2 - 28308);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2636[arg1.method584(class288.method1939(arg2, 28524))] = true;
            }
        } else if (arg0 == 4) {
            this.field2632 = true;
        } else if (arg0 == 5) {
            this.field2646 = arg1.method584(255);
        } else if (arg0 == 6) {
            this.field2625 = arg1.method549(arg2 - 28308);
        } else if (arg0 == 7) {
            this.field2643 = arg1.method549(255);
        } else if (arg0 == 8) {
            this.field2640 = arg1.method584(255);
        } else if (arg0 == 9) {
            this.field2649 = arg1.method584(255);
        } else if (arg0 == 10) {
            this.field2619 = arg1.method584(arg2 - 28308);
        } else if (arg0 == 11) {
            this.field2647 = arg1.method584(255);
        } else if (arg0 == 12) {
            int var10 = arg1.method584(255);
            this.field2617 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field2617[var11] = arg1.method549(255);
            }
            for (int var12 = 0; var12 < var10; var12++) {
                this.field2617[var12] = (arg1.method549(255) << 16) + this.field2617[var12];
            }
        } else if (arg0 == 13) {
            int var13 = arg1.method549(255);
            this.field2638 = new int[var13][];
            for (int var14 = 0; var14 < var13; var14++) {
                int var15 = arg1.method584(255);
                if (var15 > 0) {
                    this.field2638[var14] = new int[var15];
                    this.field2638[var14][0] = arg1.method598(-1235752501);
                    for (int var16 = 1; var16 < var15; var16++) {
                        this.field2638[var14][var16] = arg1.method549(arg2 - 28308);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field2623 = true;
        } else if (arg0 == 15) {
            this.field2630 = true;
        } else if (arg0 == 16) {
            this.field2641 = true;
        }
        if (arg2 != 28563) {
            method1144((byte) -72, 34);
        }
        field2618++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lpd;I)V")
    public final void method1142(class96 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method584(255);
            if (var3 == 0) {
                field2622++;
                int var4 = -14 / ((-arg1 - 11) / 61);
                return;
            }
            this.method1141(var3, arg0, 28563);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static final void method1143(boolean arg0) {
        class116.field1648.method1701((byte) 99);
        class123.field1915.method1701((byte) 83);
        if (arg0) {
            field2633 = 88;
        }
        field2639++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)I")
    public static final int method1144(byte arg0, int arg1) {
        field2631++;
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * var2 >> 12) + 40960;
        int var4 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var5 = -31 % ((arg0 + 65) / 61);
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIILwl;I)Lwl;")
    public final class158 method1145(int arg0, int arg1, int arg2, class158 arg3, int arg4) {
        field2635++;
        int var6 = this.field2634[arg4];
        int var7 = this.field2624[arg4];
        class39 var8 = class19.method105(var7 >> 16, false);
        int var9 = var7 & arg0;
        if (var8 == null) {
            return arg3.method821(true, true, true);
        }
        class39 var10 = null;
        if ((this.field2630 || class204.field3211) && arg1 != -1 && this.field2624.length > arg1) {
            int var11 = this.field2624[arg1];
            var10 = class19.method105(var11 >> 16, false);
            arg1 = var11 & 0xFFFF;
        }
        class158 var12;
        if (var10 == null) {
            var12 = arg3.method821(!var8.method215(var9, -22272), !var8.method213(85, var9), !this.field2623);
        } else {
            var12 = arg3.method821(!var8.method215(var9, -22272) & !var10.method215(arg1, -22272), !var8.method213(126, var9) & !var10.method213(36, arg1), !this.field2623);
        }
        var12.method1106(var8, var9, var10, arg1, arg2 - 1, var6, this.field2623);
        return var12;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILwl;IBII)Lwl;")
    public final class158 method1146(int arg0, class158 arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2637++;
        int var7 = this.field2634[arg0];
        int var8 = this.field2624[arg0];
        class39 var9 = class19.method105(var8 >> 16, false);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg1.method834(true, true, true);
        }
        class39 var11 = null;
        if ((this.field2630 || class204.field3211) && arg5 != -1 && arg5 < this.field2624.length) {
            int var12 = this.field2624[arg5];
            var11 = class19.method105(var12 >> 16, false);
            arg5 = var12 & 0xFFFF;
        }
        int var13 = -106 % ((-arg3 - 1) / 50);
        int var14 = arg2 & 0x3;
        class158 var15;
        if (var11 == null) {
            var15 = arg1.method834(!var9.method215(var10, -22272), !var9.method213(60, var10), !this.field2623);
        } else {
            var15 = arg1.method834(!var9.method215(var10, -22272) & !var11.method215(arg5, -22272), !var9.method213(127, var10) & !var11.method213(107, arg5), !this.field2623);
        }
        if (var14 == 1) {
            var15.method845();
        } else if (var14 == 2) {
            var15.method826();
        } else if (var14 == 3) {
            var15.method824();
        }
        var15.method1106(var9, var10, var11, arg5, arg4 - 1, var7, this.field2623);
        if (var14 == 1) {
            var15.method824();
        } else if (var14 == 2) {
            var15.method826();
        } else if (var14 == 3) {
            var15.method845();
        }
        return var15;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIZLwl;I)Lwl;")
    public final class158 method1147(int arg0, int arg1, boolean arg2, class158 arg3, int arg4) {
        field2648++;
        int var6 = this.field2634[arg4];
        int var7 = this.field2624[arg4];
        class39 var8 = class19.method105(var7 >> 16, arg2);
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg3.method832(true, true, true);
        }
        class39 var10 = null;
        class39 var11 = null;
        if ((this.field2630 || class204.field3211) && arg0 != -1 && arg0 < this.field2624.length) {
            int var12 = this.field2624[arg0];
            var10 = class19.method105(var12 >> 16, arg2);
            arg0 = var12 & 0xFFFF;
        }
        class39 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field2617 != null) {
            if (arg4 < this.field2617.length) {
                var14 = this.field2617[arg4];
                if (var14 != 65535) {
                    var13 = class19.method105(var14 >> 16, false);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field2630 || class204.field3211) && arg0 != -1 && this.field2617.length > arg0) {
                var15 = this.field2617[arg0];
                if (var15 != 65535) {
                    var11 = class19.method105(var15 >> 16, arg2);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method215(var9, -22272);
        boolean var17 = !var8.method213(111, var9);
        if (var13 != null) {
            var16 &= !var13.method215(var14, -22272);
            var17 &= !var13.method213(13, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method215(arg0, -22272);
            var17 &= !var10.method213(24, arg0);
        }
        if (var11 != null) {
            var16 &= !var11.method215(var15, -22272);
            var17 &= !var11.method213(34, var15);
        }
        class158 var18 = arg3.method832(var16, var17, !this.field2623);
        var18.method1106(var8, var9, var10, arg0, arg1 - 1, var6, this.field2623);
        if (var13 != null) {
            var18.method1106(var13, var14, var11, var15, arg1 - 1, var6, this.field2623);
        }
        return var18;
    }
}
