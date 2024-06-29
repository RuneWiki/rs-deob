import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
    public static int field334 = 0;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "[I")
    public static int[] field327 = new int[1000];

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field324 = -1;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "Ltk;")
    public static class50 field328 = null;

    @OriginalMember(owner = "client!ec", name = "z", descriptor = "Lhj;")
    public static class69 field336 = class181.method1318("Verbindung abgebrochen)3", (byte) -127);

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "Lhj;")
    public static class69 field340 = class181.method1318("l", (byte) -116);

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "Lhj;")
    private static class69 field339 = class181.method1318("Please wait)3)3)3", (byte) -114);

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lhj;")
    public static class69 field326 = field339;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public int field322;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!ec", name = "A", descriptor = "Laa;")
    public class164 field337;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "Ltc;")
    public static class173 field331;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "Lue;")
    public static class86 field317;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[I")
    public int[] field312;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    public int[] field315;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public int[] field316;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    public int[] field319;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "[I")
    public int[] field321;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "[I")
    public int[] field332;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[Laa;")
    public class164[] field325;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "[[I")
    public int[][] field333;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "[[I")
    public int[][] field338;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)I")
    public static final int method129(int arg0, byte arg1) {
        field323++;
        if (arg1 > -31) {
            method132(-98, -27, true, false);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method130(int arg0) {
        field326 = null;
        field317 = null;
        if (arg0 != 15378) {
            method130(-42);
        }
        field327 = null;
        field340 = null;
        field339 = null;
        field331 = null;
        field328 = null;
        field336 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[B)V")
    private final void method131(int arg0, byte[] arg1) {
        field329++;
        class128 var3 = new class128(class192.method1387(-1, arg1));
        int var4 = var3.method937(false);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field314 = var3.method923(true);
        } else {
            this.field314 = 0;
        }
        int var5 = var3.method937(false);
        int var6 = 0;
        this.field335 = var3.method912(arg0 + 25599);
        this.field321 = new int[this.field335];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field335; var8++) {
            this.field321[var8] = var6 += var3.method912(arg0 + 25397);
            if (this.field321[var8] > var7) {
                var7 = this.field321[var8];
            }
        }
        this.field322 = var7 + 1;
        this.field312 = new int[this.field322];
        this.field333 = new int[this.field322][];
        this.field315 = new int[this.field322];
        this.field316 = new int[this.field322];
        this.field319 = new int[this.field322];
        if (var5 != 0) {
            this.field332 = new int[this.field322];
            for (int var9 = 0; var9 < this.field322; var9++) {
                this.field332[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field335; var10++) {
                this.field332[this.field321[var10]] = var3.method923(true);
            }
            this.field337 = new class164(this.field332);
        }
        for (int var11 = 0; var11 < this.field335; var11++) {
            this.field319[this.field321[var11]] = var3.method923(true);
        }
        if (arg0 != -25492) {
            field334 = 6;
        }
        for (int var12 = 0; var12 < this.field335; var12++) {
            this.field316[this.field321[var12]] = var3.method923(true);
        }
        for (int var13 = 0; var13 < this.field335; var13++) {
            this.field312[this.field321[var13]] = var3.method912(-122);
        }
        for (int var14 = 0; var14 < this.field335; var14++) {
            int var21 = this.field321[var14];
            int var22 = -1;
            int var23 = this.field312[var21];
            int var24 = 0;
            this.field333[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field333[var21][var25] = var24 += var3.method912(-115);
                if (var22 < var26) {
                    var22 = var26;
                }
            }
            this.field315[var21] = var22 + 1;
            if ((var22 + 1) == var23) {
                this.field333[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field325 = new class164[var7 + 1];
        this.field338 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field335; var15++) {
            int var16 = this.field321[var15];
            int var17 = this.field312[var16];
            this.field338[var16] = new int[this.field315[var16]];
            for (int var18 = 0; var18 < this.field315[var16]; var18++) {
                this.field338[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field333[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field333[var16][var19];
                }
                this.field338[var16][var20] = var3.method923(true);
            }
            this.field325[var16] = new class164(this.field338[var16]);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZZ)V")
    public static final void method132(int arg0, int arg1, boolean arg2, boolean arg3) {
        field313++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        class119.field2247 = arg0;
        if (!arg2) {
            field339 = null;
        }
        class133.field2473 = arg1;
        class256.field4597 = arg3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIZIIIIII)Z")
    public static final boolean method133(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field320++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class41.field580[var12][var31] = 0;
                class98.field1862[var12][var31] = 99999999;
            }
        }
        class41.field580[arg3][arg6] = 99;
        class98.field1862[arg3][arg6] = 0;
        int var13 = arg3;
        byte var14 = 0;
        class157.field2923[var14] = arg3;
        int var15 = arg6;
        int var16 = 0;
        int var32 = var14 + 1;
        class230.field4216[var14] = arg6;
        boolean var17 = false;
        int[][] var18 = class79.field1518[class52.field927].field4672;
        while (var32 != var16) {
            var13 = class157.field2923[var16];
            var15 = class230.field4216[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg10 == var13 && arg4 == var15) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class79.field1518[class52.field927].method1810(arg10, -4724, 2, arg8 - 1, var15, var13, arg4, arg1)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class79.field1518[class52.field927].method1812(arg4, var15, arg8 - 1, arg10, 1, 2, var13, arg1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg2 != 0 && class79.field1518[class52.field927].method1811(2, arg7, arg2, arg10, -15578, var13, arg4, arg9, var15)) {
                var17 = true;
                break;
            }
            int var30 = class98.field1862[var13][var15] + 1;
            if (var13 > 0 && class41.field580[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x12C010E) == 0 && (var18[var13 - 1][var15 + 1] & 0x12C0138) == 0) {
                class157.field2923[var32] = var13 - 1;
                class230.field4216[var32] = var15;
                class41.field580[var13 - 1][var15] = 2;
                class98.field1862[var13 - 1][var15] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class41.field580[var13 + 1][var15] == 0 && (var18[var13 + 2][var15] & 0x12C0183) == 0 && (var18[var13 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class157.field2923[var32] = var13 + 1;
                class230.field4216[var32] = var15;
                class41.field580[var13 + 1][var15] = 8;
                var32 = var32 + 1 & 0xFFF;
                class98.field1862[var13 + 1][var15] = var30;
            }
            if (var15 > 0 && class41.field580[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x12C010E) == 0 && (var18[var13 + 1][var15 - 1] & 0x12C0183) == 0) {
                class157.field2923[var32] = var13;
                class230.field4216[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field580[var13][var15 - 1] = 1;
                class98.field1862[var13][var15 - 1] = var30;
            }
            if (var15 < 102 && class41.field580[var13][var15 + 1] == 0 && (var18[var13][var15 + 2] & 0x12C0138) == 0 && (var18[var13 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class157.field2923[var32] = var13;
                class230.field4216[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field580[var13][var15 + 1] = 4;
                class98.field1862[var13][var15 + 1] = var30;
            }
            if (var13 > 0 && var15 > 0 && class41.field580[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15] & 0x12C0138) == 0 && (var18[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13][var15 - 1] & 0x12C0183) == 0) {
                class157.field2923[var32] = var13 - 1;
                class230.field4216[var32] = var15 - 1;
                class41.field580[var13 - 1][var15 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class98.field1862[var13 - 1][var15 - 1] = var30;
            }
            if (var13 < 102 && var15 > 0 && class41.field580[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[var13 + 2][var15 - 1] & 0x12C0183) == 0 && (var18[var13 + 2][var15] & 0x12C01E0) == 0) {
                class157.field2923[var32] = var13 + 1;
                class230.field4216[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field580[var13 + 1][var15 - 1] = 9;
                class98.field1862[var13 + 1][var15 - 1] = var30;
            }
            if (var13 > 0 && var15 < 102 && class41.field580[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var13 - 1][var15 + 2] & 0x12C0138) == 0 && (var18[var13][var15 + 2] & 0x12C01E0) == 0) {
                class157.field2923[var32] = var13 - 1;
                class230.field4216[var32] = var15 + 1;
                class41.field580[var13 - 1][var15 + 1] = 6;
                class98.field1862[var13 - 1][var15 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && var15 < 102 && class41.field580[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 2] & 0x12C0138) == 0 && (var18[var13 + 2][var15 + 2] & 0x12C01E0) == 0 && (var18[var13 + 2][var15 + 1] & 0x12C0183) == 0) {
                class157.field2923[var32] = var13 + 1;
                class230.field4216[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class41.field580[var13 + 1][var15 + 1] = 12;
                class98.field1862[var13 + 1][var15 + 1] = var30;
            }
        }
        class230.field4209 = 0;
        if (!var17) {
            if (!arg5) {
                return false;
            }
            int var19 = 1000;
            byte var20 = 10;
            int var21 = 100;
            for (int var22 = arg10 - var20; var22 <= arg10 + var20; var22++) {
                for (int var23 = arg4 - var20; var23 <= (arg4 + var20); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class98.field1862[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var23 < arg4) {
                            var25 = arg4 - var23;
                        } else if ((arg2 + arg4 - 1) < var23) {
                            var25 = 1 - arg2 - (arg4 - var23);
                        }
                        if (var22 < arg10) {
                            var24 = arg10 - var22;
                        } else if (var22 > (arg9 + arg10 - 1)) {
                            var24 = var22 - arg10 - (arg9 - 1);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var19 > var26 || var19 == var26 && var21 > class98.field1862[var22][var23]) {
                            var13 = var22;
                            var15 = var23;
                            var21 = class98.field1862[var22][var23];
                            var19 = var26;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg3 == var13 && arg6 == var15) {
                return false;
            }
            class230.field4209 = 1;
        }
        if (arg11 <= 103) {
            return false;
        }
        byte var27 = 0;
        class157.field2923[var27] = var13;
        int var33 = var27 + 1;
        class230.field4216[var27] = var15;
        int var28;
        int var29 = var28 = class41.field580[var13][var15];
        while (arg3 != var13 || arg6 != var15) {
            if (var28 != var29) {
                class157.field2923[var33] = var13;
                class230.field4216[var33++] = var15;
                var28 = var29;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var15++;
            } else if ((var29 & 0x4) != 0) {
                var15--;
            }
            var29 = class41.field580[var13][var15];
        }
        if (var33 > 0) {
            class122.method878(arg0, var33, (byte) 27);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([BI)V")
    public class23(byte[] arg0, int arg1) {
        this.field330 = class39.method220(105, arg0.length, arg0);
        if (this.field330 != arg1) {
            throw new RuntimeException();
        }
        this.method131(-25492, arg0);
    }
}
