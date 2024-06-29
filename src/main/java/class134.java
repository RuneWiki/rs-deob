import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class134 {

    @OriginalMember(owner = "client!tb", name = "y", descriptor = "I")
    public int field3045 = 0;

    @OriginalMember(owner = "client!tb", name = "x", descriptor = "I")
    public int field3044 = 0;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public static int[] field3023 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "Lhe;")
    private static class54 field3038 = class6.method58("Too many connections from your address)3", false);

    @OriginalMember(owner = "client!tb", name = "w", descriptor = "Lhe;")
    public static class54 field3043 = field3038;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3035 = 0;

    @OriginalMember(owner = "client!tb", name = "t", descriptor = "Lsf;")
    public static class131 field3040 = new class131(30);

    @OriginalMember(owner = "client!tb", name = "B", descriptor = "Lhe;")
    public static class54 field3048 = class6.method58("::errortest", false);

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public int field3025;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public int field3026;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field3030;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field3033;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public int field3034;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public int field3036;

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!tb", name = "s", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!tb", name = "u", descriptor = "I")
    public int field3041;

    @OriginalMember(owner = "client!tb", name = "v", descriptor = "I")
    public int field3042;

    @OriginalMember(owner = "client!tb", name = "A", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!tb", name = "z", descriptor = "Lef;")
    public static class35 field3046;

    @OriginalMember(owner = "client!tb", name = "C", descriptor = "Lhd;")
    public class53 field3049;

    @OriginalMember(owner = "client!tb", name = "D", descriptor = "[I")
    public static int[] field3050;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
    public static final void method1003(boolean arg0, byte arg1) {
        class138.field3167 = arg0;
        if (arg1 <= 4) {
            method1003(false, (byte) -24);
        }
        if (class138.field3167) {
            int var15 = class40.field1044.method657((byte) 126);
            int var16 = class40.field1044.method662(32767);
            int var17 = class40.field1044.method657((byte) 106);
            int var18 = class40.field1044.method657((byte) -50);
            int var19 = class40.field1044.method645(0);
            class40.field1044.method461((byte) -58);
            for (int var20 = 0; var20 < 4; var20++) {
                for (int var35 = 0; var35 < 13; var35++) {
                    for (int var36 = 0; var36 < 13; var36++) {
                        int var37 = class40.field1044.method456(-1432215741, 1);
                        if (var37 == 1) {
                            class155.field3512[var20][var35][var36] = class40.field1044.method456(-1432215741, 26);
                        } else {
                            class155.field3512[var20][var35][var36] = -1;
                        }
                    }
                }
            }
            class40.field1044.method464((byte) 67);
            int var21 = (class128.field2890 - class40.field1044.field2076) / 16;
            class48.field1165 = new int[var21][4];
            for (int var22 = 0; var22 < var21; var22++) {
                for (int var34 = 0; var34 < 4; var34++) {
                    class48.field1165[var22][var34] = class40.field1044.method641((byte) 73);
                }
            }
            class88.field2182 = new int[var21];
            class158.field3612 = new byte[var21][];
            class108.field2627 = new int[var21];
            class40.field1048 = new byte[var21][];
            class123.field2849 = new int[var21];
            int var23 = 0;
            for (int var24 = 0; var24 < 4; var24++) {
                for (int var25 = 0; var25 < 13; var25++) {
                    for (int var26 = 0; var26 < 13; var26++) {
                        int var27 = class155.field3512[var24][var25][var26];
                        if (var27 != -1) {
                            int var28 = var27 >> 14 & 0x3FF;
                            int var29 = var27 >> 3 & 0x7FF;
                            int var30 = (var28 / 8 << 8) + (var29 / 8);
                            for (int var31 = 0; var31 < var23; var31++) {
                                if (class88.field2182[var31] == var30) {
                                    var30 = -1;
                                    break;
                                }
                            }
                            if (var30 != -1) {
                                int var32 = var30 & 0xFF;
                                int var33 = var30 >> 8 & 0xFF;
                                class88.field2182[var23] = var30;
                                class108.field2627[var23] = class52.field1252.method273(class143.method1105(new class54[] { class38.field998, class147.method1117(-109, var33), class2.field26, class147.method1117(-61, var32) }, -842), 1);
                                class123.field2849[var23] = class52.field1252.method273(class143.method1105(new class54[] { class26.field689, class147.method1117(-11, var33), class2.field26, class147.method1117(-77, var32) }, -842), 1);
                                var23++;
                            }
                        }
                    }
                }
            }
            class88.method700(var17, var19, false, var16, var18, var15);
        } else {
            int var2 = class40.field1044.method645(0);
            int var3 = (class128.field2890 - class40.field1044.field2076) / 16;
            class48.field1165 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var14 = 0; var14 < 4; var14++) {
                    class48.field1165[var4][var14] = class40.field1044.method663(4);
                }
            }
            int var5 = class40.field1044.method635((byte) -114);
            int var6 = class40.field1044.method631((byte) -103);
            int var7 = class40.field1044.method638(0);
            boolean var8 = false;
            if ((var5 / 8 == 48 || var5 / 8 == 49) && var2 / 8 == 48) {
                var8 = true;
            }
            if (var5 / 8 == 48 && var2 / 8 == 148) {
                var8 = true;
            }
            int var9 = class40.field1044.method631((byte) -103);
            class40.field1048 = new byte[var3][];
            class88.field2182 = new int[var3];
            class158.field3612 = new byte[var3][];
            class108.field2627 = new int[var3];
            class123.field2849 = new int[var3];
            int var10 = 0;
            for (int var11 = (var5 - 6) / 8; var11 <= (var5 + 6) / 8; var11++) {
                for (int var12 = (var2 - 6) / 8; var12 <= (var2 + 6) / 8; var12++) {
                    int var13 = (var11 << 8) + var12;
                    if (!var8 || var12 != 49 && var12 != 149 && var12 != 147 && var11 != 50 && (var11 != 49 || var12 != 47)) {
                        class88.field2182[var10] = var13;
                        class108.field2627[var10] = class52.field1252.method273(class143.method1105(new class54[] { class38.field998, class147.method1117(-84, var11), class2.field26, class147.method1117(-54, var12) }, -842), 1);
                        class123.field2849[var10] = class52.field1252.method273(class143.method1105(new class54[] { class26.field689, class147.method1117(-125, var11), class2.field26, class147.method1117(-94, var12) }, -842), 1);
                        var10++;
                    }
                }
            }
            class88.method700(var5, var6, false, var7, var9, var2);
        }
        field3027++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
    public static final void method1004(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class16.field476; var5++) {
            if (class49.field1192[var5] + class150.field3390[var5] > arg1 && arg1 + arg2 > class49.field1192[var5] && arg4 < class79.field1943[var5] + class38.field972[var5] && arg4 + arg3 > class79.field1943[var5]) {
                class32.field832[var5] = true;
            }
        }
        if (arg0 != -30024) {
            field3023 = null;
        }
        field3032++;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lnc;I)V")
    public static final void method1005(class93 arg0, int arg1) {
        field3029++;
        if (arg1 != 0) {
            field3048 = null;
        }
        if (class40.field1040 == arg0.field2336) {
            class85.field2114[arg0.field2294] = true;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB[B)Z")
    public static final boolean method1006(int arg0, int arg1, byte arg2, byte[] arg3) {
        if (arg2 != -97) {
            method1008(-15);
        }
        field3031++;
        boolean var4 = true;
        int var5 = -1;
        class83 var6 = new class83(arg3);
        label72: while (true) {
            int var7 = var6.method636((byte) -50);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var12;
                class3 var16;
                do {
                    int var14;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var6.method636((byte) -50);
                                        if (var17 == 0) {
                                            continue label72;
                                        }
                                        var6.method638(0);
                                    }
                                    int var10 = var6.method636((byte) -50);
                                    if (var10 == 0) {
                                        continue label72;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = var8 & 0x3F;
                                    var12 = var6.method638(arg2 ^ 0xFFFFFF9F) >> 2;
                                    int var13 = var8 >> 6 & 0x3F;
                                    var14 = arg1 + var13;
                                    var15 = var11 + arg0;
                                } while (var14 <= 0);
                            } while (var15 <= 0);
                        } while (var14 >= 103);
                    } while (var15 >= 103);
                    var16 = class4.method34(true, var5);
                } while (var12 == 22 && class118.field2768 && var16.field68 == 0 && var16.field83 != 1 && !var16.field72);
                var9 = true;
                if (!var16.method19((byte) 109)) {
                    class150.field3396++;
                    var4 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZI)I")
    public static final int method1007(int arg0, int arg1, boolean arg2, int arg3) {
        field3047++;
        int var4 = arg0 >> 7;
        if (!arg2) {
            field3050 = null;
        }
        int var5 = arg1 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class87.field2152[1][var4][var5] & 0x2) == 2) {
            var6 = arg3 + 1;
        }
        int var7 = arg1 & 0x7F;
        int var8 = arg0 & 0x7F;
        int var9 = (128 - var8) * class141.field3211[var6][var4][var5] + class141.field3211[var6][var4 + 1][var5] * var8 >> 7;
        int var10 = (128 - var8) * class141.field3211[var6][var4][var5 + 1] + class141.field3211[var6][var4 + 1][var5 + 1] * var8 >> 7;
        return (128 - var7) * var9 + var7 * var10 >> 7;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
    public static void method1008(int arg0) {
        field3046 = null;
        field3048 = null;
        if (arg0 != 1) {
            method1004(96, -23, 108, 114, 95);
        }
        field3023 = null;
        field3040 = null;
        field3050 = null;
        field3038 = null;
        field3043 = null;
    }
}
