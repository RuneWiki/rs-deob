import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field242;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public int field251;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field241;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public int field249;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "[[I")
    public static int[][] field250 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[[[B")
    public static byte[][][] field246 = new byte[4][104][104];

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lhj;")
    public static class69 field247 = class181.method1318("", (byte) -122);

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field252 = 0;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field244;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Lqb;")
    public static class56 field243;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIIIIIIIZII)Z")
    public static final boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11, int arg12) {
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var40 = 0; var40 < 104; var40++) {
                class41.field580[var13][var40] = 0;
                class98.field1862[var13][var40] = 99999999;
            }
        }
        field245++;
        int var14 = arg12;
        class41.field580[arg12][arg8] = 99;
        int var15 = arg8;
        class98.field1862[arg12][arg8] = 0;
        byte var16 = 0;
        int var17 = 0;
        class157.field2923[var16] = arg12;
        int var41 = var16 + 1;
        class230.field4216[var16] = arg8;
        boolean var18 = false;
        int[][] var19 = class79.field1518[class52.field927].field4672;
        label368: while (var41 != var17) {
            var15 = class230.field4216[var17];
            var14 = class157.field2923[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg6 == var14 && arg4 == var15) {
                var18 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class79.field1518[class52.field927].method1810(arg6, -4724, arg3, arg11 - 1, var15, var14, arg4, arg5)) {
                    var18 = true;
                    break;
                }
                if (arg11 < 10 && class79.field1518[class52.field927].method1812(arg4, var15, arg11 - 1, arg6, arg2, arg3, var14, arg5)) {
                    var18 = true;
                    break;
                }
            }
            if (arg9 != 0 && arg0 != 0 && class79.field1518[class52.field927].method1811(arg3, arg7, arg0, arg6, -15578, var14, arg4, arg9, var15)) {
                var18 = true;
                break;
            }
            int var31 = class98.field1862[var14][var15] + 1;
            if (var14 > 0 && class41.field580[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][arg3 + var15 - 1] & 0x12C0138) == 0) {
                int var32 = 1;
                while (true) {
                    if (arg3 - 1 <= var32) {
                        class157.field2923[var41] = var14 - 1;
                        class230.field4216[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class41.field580[var14 - 1][var15] = 2;
                        class98.field1862[var14 - 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var32] & 0x12C013E) != 0) {
                        break;
                    }
                    var32++;
                }
            }
            if (var14 < 102 && class41.field580[var14 + 1][var15] == 0 && (var19[var14 + arg3][var15] & 0x12C0183) == 0 && (var19[var14 + arg3][arg3 + var15 - 1] & 0x12C01E0) == 0) {
                int var33 = 1;
                while (true) {
                    if (var33 >= arg3 - 1) {
                        class157.field2923[var41] = var14 + 1;
                        class230.field4216[var41] = var15;
                        var41 = var41 + 1 & 0xFFF;
                        class41.field580[var14 + 1][var15] = 8;
                        class98.field1862[var14 + 1][var15] = var31;
                        break;
                    }
                    if ((var19[var14 + arg3][var15 + var33] & 0x12C01E3) != 0) {
                        break;
                    }
                    var33++;
                }
            }
            if (var15 > 0 && class41.field580[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg3 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var34 = 1;
                while (true) {
                    if (var34 >= arg3 - 1) {
                        class157.field2923[var41] = var14;
                        class230.field4216[var41] = var15 - 1;
                        class41.field580[var14][var15 - 1] = 1;
                        class98.field1862[var14][var15 - 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var34][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var34++;
                }
            }
            if (var15 < 102 && class41.field580[var14][var15 + 1] == 0 && (var19[var14][arg3 + var15] & 0x12C0138) == 0 && (var19[var14 + arg3 - 1][arg3 + var15] & 0x12C01E0) == 0) {
                int var35 = 1;
                while (true) {
                    if (var35 >= (arg3 - 1)) {
                        class157.field2923[var41] = var14;
                        class230.field4216[var41] = var15 + 1;
                        class41.field580[var14][var15 + 1] = 4;
                        class98.field1862[var14][var15 + 1] = var31;
                        var41 = var41 + 1 & 0xFFF;
                        break;
                    }
                    if ((var19[var14 + var35][arg3 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var35++;
                }
            }
            if (var14 > 0 && var15 > 0 && class41.field580[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 + arg3 - 1 - 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + arg3 - 1 - 1][var15 - 1] & 0x12C0183) == 0) {
                int var36 = 1;
                while (true) {
                    if (var36 >= (arg3 - 1)) {
                        class157.field2923[var41] = var14 - 1;
                        class230.field4216[var41] = var15 - 1;
                        var41 = var41 + 1 & 0xFFF;
                        class41.field580[var14 - 1][var15 - 1] = 3;
                        class98.field1862[var14 - 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var36 - 1] & 0x12C013E) != 0 || (var19[var14 + var36 - 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var36++;
                }
            }
            if (var14 < 102 && var15 > 0 && class41.field580[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[arg3 + var14][var15 - 1] & 0x12C0183) == 0 && (var19[arg3 + var14][var15 - (-arg3 - -1) - 1] & 0x12C01E0) == 0) {
                int var37 = 1;
                while (true) {
                    if (var37 >= (arg3 - 1)) {
                        class157.field2923[var41] = var14 + 1;
                        class230.field4216[var41] = var15 - 1;
                        class41.field580[var14 + 1][var15 - 1] = 9;
                        var41 = var41 + 1 & 0xFFF;
                        class98.field1862[var14 + 1][var15 - 1] = var31;
                        break;
                    }
                    if ((var19[var14 + arg3][var15 + var37 - 1] & 0x12C01E3) != 0 || (var19[var14 + var37 + 1][var15 - 1] & 0x12C018F) != 0) {
                        break;
                    }
                    var37++;
                }
            }
            if (var14 > 0 && var15 < 102 && class41.field580[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][arg3 + var15] & 0x12C0138) == 0 && (var19[var14][arg3 + var15] & 0x12C01E0) == 0) {
                int var38 = 1;
                while (true) {
                    if (var38 >= arg3 - 1) {
                        class157.field2923[var41] = var14 - 1;
                        class230.field4216[var41] = var15 + 1;
                        var41 = var41 + 1 & 0xFFF;
                        class41.field580[var14 - 1][var15 + 1] = 6;
                        class98.field1862[var14 - 1][var15 + 1] = var31;
                        break;
                    }
                    if ((var19[var14 - 1][var15 + var38 + 1] & 0x12C013E) != 0 || (var19[var38 + var14 - 1][arg3 + var15] & 0x12C01F8) != 0) {
                        break;
                    }
                    var38++;
                }
            }
            if (var14 < 102 && var15 < 102 && class41.field580[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][arg3 + var15] & 0x12C0138) == 0 && (var19[arg3 + var14][arg3 + var15] & 0x12C01E0) == 0 && (var19[arg3 + var14][var15 + 1] & 0x12C0183) == 0) {
                for (int var39 = 1; var39 < arg3 - 1; var39++) {
                    if ((var19[var39 + var14 + 1][var15 + arg3] & 0x12C01F8) != 0 || (var19[arg3 + var14][var15 + var39 + 1] & 0x12C01E3) != 0) {
                        continue label368;
                    }
                }
                class157.field2923[var41] = var14 + 1;
                class230.field4216[var41] = var15 + 1;
                class41.field580[var14 + 1][var15 + 1] = 12;
                var41 = var41 + 1 & 0xFFF;
                class98.field1862[var14 + 1][var15 + 1] = var31;
            }
        }
        class230.field4209 = 0;
        if (!var18) {
            if (!arg10) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg6 - var22; var23 <= (arg6 + var22); var23++) {
                for (int var24 = arg4 - var22; var24 <= (arg4 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class98.field1862[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg6 > var23) {
                            var25 = arg6 - var23;
                        } else if (var23 > arg6 + arg9 - 1) {
                            var25 = var23 + 1 - arg6 - arg9;
                        }
                        int var26 = 0;
                        if (var24 < arg4) {
                            var26 = arg4 - var24;
                        } else if (var24 > (arg4 + arg0 - 1)) {
                            var26 = var24 + 1 - arg0 - arg4;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class98.field1862[var23][var24] < var21) {
                            var15 = var24;
                            var21 = class98.field1862[var23][var24];
                            var20 = var27;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg12 == var14 && arg8 == var15) {
                return false;
            }
            class230.field4209 = 1;
        }
        byte var28 = 0;
        class157.field2923[var28] = var14;
        int var42 = var28 + 1;
        class230.field4216[var28] = var15;
        int var29;
        int var30 = var29 = class41.field580[var14][var15];
        while (arg12 != var14 || arg8 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class157.field2923[var42] = var14;
                class230.field4216[var42++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var14++;
            } else if ((var30 & 0x8) != 0) {
                var14--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class41.field580[var14][var15];
        }
        if (var42 > 0) {
            class122.method878(arg1, var42, (byte) 28);
            return true;
        } else if (arg1 == arg2) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field247 = null;
        field243 = null;
        field246 = null;
        field250 = null;
        if (arg0 != 104) {
            method113(54);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)Lfc;")
    public static final class118 method114(int arg0, int arg1, int arg2) {
        class217 var3 = class158.field2935[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3932;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lhe;)V")
    public class19(class19 arg0) {
        this.field242 = arg0.field242;
        this.field251 = arg0.field251;
        this.field241 = arg0.field241;
        this.field249 = arg0.field249;
    }
}
