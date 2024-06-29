import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class170 extends class179 {

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "Z")
    public boolean field2529 = true;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2531 = null;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field2541 = 0;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!gn", name = "D", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!gn", name = "F", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field2537;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "[I")
    private int[] field2536;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "[I")
    public int[] field2539;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field2528;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "[[I")
    private int[][] field2526;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIB)I")
    public final int method1293(int arg0, int arg1, byte arg2) {
        if (arg2 > -117) {
            method1307(false);
        }
        field2524++;
        if (this.field2536 == null || arg1 < 0 || this.field2536.length < arg1) {
            return -1;
        } else if (this.field2526[arg1] == null || arg0 < 0 || this.field2526[arg1].length < arg0) {
            return -1;
        } else {
            return this.field2526[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIZ)V")
    public static final void method1294(int arg0, int arg1, boolean arg2) {
        field2535++;
        class221 var3 = class447.method2795(12, (byte) -49, arg0);
        if (!arg2) {
            method1301(-93, -104);
        }
        var3.method1692(0);
        var3.field3297 = arg1;
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V")
    public final void method1295(int arg0) {
        if (this.field2539 != null) {
            for (int var2 = 0; var2 < this.field2539.length; var2++) {
                this.field2539[var2] = class439.method2744(this.field2539[var2], 32768);
            }
        }
        field2543++;
        if (arg0 != 32768) {
            field2531 = null;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lec;Z)Ljava/lang/String;")
    public final String method1296(class37 arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field2527++;
        StringBuffer var3 = new StringBuffer(80);
        if (this.field2536 != null) {
            for (int var4 = 0; var4 < this.field2536.length; var4++) {
                var3.append(this.field2528[var4]);
                var3.append(class150.method1160(arg0.method297(class346.field4879[this.field2536[var4]], 104), this.field2526[var4], 5, this.field2536[var4]));
            }
        }
        var3.append(this.field2528[this.field2528.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(II)V")
    public static final void method1297(int arg0, int arg1) {
        if (arg1 != 0) {
            method1305(-19, -61, -127, 57, 8, -10);
        }
        class319.field4609 = 100;
        class218.field3234 = arg0;
        field2534++;
        class333.field4785 = -1;
        class351.field4992 = 3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[BII)Z")
    public static final boolean method1298(int arg0, byte[] arg1, int arg2, int arg3) {
        field2533++;
        if (arg0 != 1) {
            method1301(117, -117);
        }
        boolean var4 = true;
        class37 var5 = new class37(arg1);
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method309(arg0 ^ 0x72);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method316((byte) 126);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 & 0x3F;
                    int var13 = var8 >> 6 & 0x3F;
                    int var14 = var5.method271((byte) 120) >> 2;
                    int var15 = arg3 + var13;
                    int var16 = arg2 + var12;
                    if (var15 > 0 && var16 > 0 && class183.field2703 - 1 > var15 && (class66.field1056 - 1) > var16) {
                        class45 var17 = class451.method2812(arg0 ^ 0x58, var6);
                        if (var14 != 22 || class310.field4525 || var17.field697 != 0 || var17.field714 == 1 || var17.field735) {
                            if (!var17.method360(arg0 ^ 0x1)) {
                                var4 = false;
                                class176.field2629++;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method316((byte) 111);
                if (var10 == 0) {
                    break;
                }
                var5.method271((byte) 102);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        field2523++;
        if (class419.field6072 == 5) {
            if (arg0 != 63) {
                field2531 = null;
            }
            class419.field6072 = 6;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lec;I[I)V")
    public final void method1300(class37 arg0, int arg1, int[] arg2) {
        field2538++;
        if (this.field2536 == null) {
            return;
        }
        if (arg1 != -184) {
            this.field2539 = null;
        }
        for (int var4 = 0; var4 < this.field2536.length; var4++) {
            if (var4 >= arg2.length) {
                return;
            }
            int var5 = class137.field2197[this.method1304(var4, -1)];
            if (var5 > 0) {
                arg0.method290(-128, var5, (long) arg2[var4]);
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)I")
    public static final int method1301(int arg0, int arg1) {
        if (arg1 != -21216) {
            field2541 = -64;
        }
        if (class124.field2028 != null) {
            class124.field2028.method1654(-21013);
            class124.field2028 = null;
        }
        field2537++;
        class5.field42++;
        if (class5.field42 > 4) {
            class5.field42 = 0;
            class394.field5749 = 0;
            return arg0;
        }
        if (class285.field4266 == class115.field1827) {
            class285.field4266 = class50.field801;
        } else {
            class285.field4266 = class115.field1827;
        }
        class394.field5749 = 0;
        return -1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILec;)V")
    public final void method1302(int arg0, class37 arg1) {
        if (arg0 != -1) {
            field2541 = -36;
        }
        while (true) {
            int var3 = arg1.method271((byte) 102);
            if (var3 == 0) {
                field2525++;
                return;
            }
            this.method1308(arg1, -24, var3);
        }
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(B)I")
    public final int method1303(byte arg0) {
        field2530++;
        int var2 = -50 / ((-arg0 - 22) / 45);
        return this.field2536 == null ? 0 : this.field2536.length;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(II)I")
    public final int method1304(int arg0, int arg1) {
        field2522++;
        if (arg1 != -1) {
            this.method1296((class37) null, true);
        }
        return this.field2536 == null || arg0 < 0 || this.field2536.length < arg0 ? -1 : this.field2536[arg0];
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIII)V")
    public static final void method1305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5;
        if (arg1 != -24140) {
            method1307(true);
        }
        while (var6 < (arg5 + arg2)) {
            for (int var9 = arg0; var9 < arg0 + arg4; var9++) {
                if (var9 >= 0 && class183.field2703 > var9 && var6 >= 0 && class66.field1056 > var6) {
                    class275.field4146[arg3][var9][var6] = arg3 > 0 ? class275.field4146[arg3 - 1][var9][var6] - 240 : 0;
                }
            }
            var6++;
        }
        field2540++;
        if (arg0 > 0 && class183.field2703 > arg0) {
            for (int var7 = arg5 + 1; var7 < arg2 + arg5; var7++) {
                if (var7 >= 0 && var7 < class66.field1056) {
                    class275.field4146[arg3][arg0][var7] = class275.field4146[arg3][arg0 - 1][var7];
                }
            }
        }
        if (arg5 > 0 && class66.field1056 > arg5) {
            for (int var8 = arg0 + 1; var8 < arg0 + arg4; var8++) {
                if (var8 >= 0 && class183.field2703 > var8) {
                    class275.field4146[arg3][var8][arg5] = class275.field4146[arg3][var8][arg5 - 1];
                }
            }
        }
        if (arg0 < 0 || arg5 < 0 || arg0 >= class183.field2703 || arg5 >= class66.field1056) {
            return;
        }
        if (arg3 == 0) {
            if (arg0 <= 0 || class275.field4146[arg3][arg0 - 1][arg5] == 0) {
                if (arg5 > 0 && class275.field4146[arg3][arg0][arg5 - 1] != 0) {
                    class275.field4146[arg3][arg0][arg5] = class275.field4146[arg3][arg0][arg5 - 1];
                    return;
                }
                if (arg0 > 0 && arg5 > 0 && class275.field4146[arg3][arg0 - 1][arg5 - 1] != 0) {
                    class275.field4146[arg3][arg0][arg5] = class275.field4146[arg3][arg0 - 1][arg5 - 1];
                    return;
                }
                return;
            }
            class275.field4146[arg3][arg0][arg5] = class275.field4146[arg3][arg0 - 1][arg5];
        } else if (arg0 <= 0 || class275.field4146[arg3 - 1][arg0 - 1][arg5] == class275.field4146[arg3][arg0 - 1][arg5]) {
            if (arg5 > 0 && class275.field4146[arg3 - 1][arg0][arg5 - 1] != class275.field4146[arg3][arg0][arg5 - 1]) {
                class275.field4146[arg3][arg0][arg5] = class275.field4146[arg3][arg0][arg5 - 1];
                return;
            }
            if (arg0 > 0 && arg5 > 0 && class275.field4146[arg3][arg0 - 1][arg5 - 1] != class275.field4146[arg3 - 1][arg0 - 1][arg5 - 1]) {
                class275.field4146[arg3][arg0][arg5] = class275.field4146[arg3][arg0 - 1][arg5 - 1];
                return;
            }
        } else {
            class275.field4146[arg3][arg0][arg5] = class275.field4146[arg3][arg0 - 1][arg5];
            return;
        }
    }

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method1306(int arg0) {
        field2532++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field2528 == null) {
            return "";
        }
        var2.append(this.field2528[0]);
        if (arg0 <= 82) {
            method1307(false);
        }
        for (int var3 = 1; var3 < this.field2528.length; var3++) {
            var2.append("...");
            var2.append(this.field2528[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V")
    public static void method1307(boolean arg0) {
        field2531 = null;
        if (!arg0) {
            method1305(104, 38, 57, -96, -34, 103);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lec;II)V")
    private final void method1308(class37 arg0, int arg1, int arg2) {
        field2542++;
        int var4 = 71 / ((12 - arg1) / 33);
        if (arg2 == 1) {
            this.field2528 = class169.method1289(arg0.method322((byte) -34), '<', 26329);
        } else if (arg2 == 2) {
            int var5 = arg0.method271((byte) 116);
            this.field2539 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2539[var6] = arg0.method320((byte) -87);
            }
            return;
        } else if (arg2 == 3) {
            int var7 = arg0.method271((byte) 107);
            this.field2536 = new int[var7];
            this.field2526 = new int[var7][];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = arg0.method320((byte) -87);
                this.field2536[var8] = var9;
                this.field2526[var8] = new int[class56.field899[var9]];
                for (int var10 = 0; var10 < class56.field899[var9]; var10++) {
                    this.field2526[var8][var10] = arg0.method320((byte) -87);
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field2529 = false;
            return;
        }
    }
}
