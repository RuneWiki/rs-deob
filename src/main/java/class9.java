import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class9 {

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public int field137 = -1;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Lda;")
    public static class275 field139 = class255.method1672(126, "Ablegen");

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field149 = 0;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "Lda;")
    public static class275 field148 = class255.method1672(92, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Lne;")
    public static class137 field146 = new class137(64);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public int field140;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public int field141;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public int field144;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public int field145;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Lma;")
    public static class105 field134;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method32(int arg0) {
        field139 = null;
        field134 = null;
        int var1 = 23 % ((5 - arg0) / 48);
        field148 = null;
        field146 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIIIBIIIIZ)Z")
    public static final boolean method33(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class74.field1215[var12][var31] = 0;
                class19.field278[var12][var31] = 99999999;
            }
        }
        field147++;
        class74.field1215[arg0][arg5] = 99;
        class19.field278[arg0][arg5] = 0;
        int var13 = arg0;
        if (arg6 > -80) {
            method35(34);
        }
        int var14 = arg5;
        byte var15 = 0;
        class150.field2617[var15] = arg0;
        int var32 = var15 + 1;
        class8.field123[var15] = arg5;
        boolean var16 = false;
        int var17 = 0;
        int[][] var18 = class173.field3003[class159.field2790].field2094;
        while (var32 != var17) {
            var13 = class150.field2617[var17];
            var14 = class8.field123[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg2 == var13 && arg1 == var14) {
                var16 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class173.field3003[class159.field2790].method856((byte) 121, arg10, arg2, arg1, arg9 - 1, 1, var13, var14)) {
                    var16 = true;
                    break;
                }
                if (arg9 < 10 && class173.field3003[class159.field2790].method866(var14, arg1, arg9 - 1, arg2, arg10, (byte) -46, var13, 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg8 != 0 && class173.field3003[class159.field2790].method863(arg7, arg8, 1, var14, arg4, var13, arg2, arg1, -1)) {
                var16 = true;
                break;
            }
            int var30 = class19.field278[var13][var14] + 1;
            if (var13 > 0 && class74.field1215[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class150.field2617[var32] = var13 - 1;
                class8.field123[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 - 1][var14] = 2;
                class19.field278[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class74.field1215[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class150.field2617[var32] = var13 + 1;
                class8.field123[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 + 1][var14] = 8;
                class19.field278[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class74.field1215[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class150.field2617[var32] = var13;
                class8.field123[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13][var14 - 1] = 1;
                class19.field278[var13][var14 - 1] = var30;
            }
            if (var14 < 103 && class74.field1215[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class150.field2617[var32] = var13;
                class8.field123[var32] = var14 + 1;
                class74.field1215[var13][var14 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class19.field278[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class74.field1215[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class150.field2617[var32] = var13 - 1;
                class8.field123[var32] = var14 - 1;
                class74.field1215[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class19.field278[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class74.field1215[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class150.field2617[var32] = var13 + 1;
                class8.field123[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 + 1][var14 - 1] = 9;
                class19.field278[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class74.field1215[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class150.field2617[var32] = var13 - 1;
                class8.field123[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class74.field1215[var13 - 1][var14 + 1] = 6;
                class19.field278[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 103 && var14 < 103 && class74.field1215[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class150.field2617[var32] = var13 + 1;
                class8.field123[var32] = var14 + 1;
                class74.field1215[var13 + 1][var14 + 1] = 12;
                class19.field278[var13 + 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class129.field2273 = 0;
        if (!var16) {
            if (!arg11) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg2 - var21; var22 <= (arg2 + var21); var22++) {
                for (int var23 = arg1 - var21; var23 <= arg1 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class19.field278[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg1 > var23) {
                            var24 = arg1 - var23;
                        } else if ((arg1 + arg8 - 1) < var23) {
                            var24 = 1 - arg1 - (arg8 - var23);
                        }
                        int var25 = 0;
                        if (var22 < arg2) {
                            var25 = arg2 - var22;
                        } else if (var22 > arg2 + arg4 - 1) {
                            var25 = var22 + 1 - arg2 - arg4;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && class19.field278[var22][var23] < var20) {
                            var19 = var26;
                            var14 = var23;
                            var20 = class19.field278[var22][var23];
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg5 == var14) {
                return false;
            }
            class129.field2273 = 1;
        }
        byte var27 = 0;
        class150.field2617[var27] = var13;
        int var33 = var27 + 1;
        class8.field123[var27] = var14;
        int var28;
        int var29 = var28 = class74.field1215[var13][var14];
        while (arg0 != var13 || arg5 != var14) {
            if (var28 != var29) {
                class150.field2617[var33] = var13;
                class8.field123[var33++] = var14;
                var28 = var29;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            var29 = class74.field1215[var13][var14];
        }
        if (var33 > 0) {
            class167.method1147(var33, (byte) -119, arg3);
            return true;
        } else if (arg3 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public static final void method34(int arg0, int arg1) {
        class258.field4521 = arg0;
        class51.field842 = -1;
        class51.field842 = -1;
        field143++;
        if (arg1 > 60) {
            class138.method994((byte) 72);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V")
    public static final void method35(int arg0) {
        class168.field2917 = arg0;
        for (int var1 = 0; var1 < class247.field4359; var1++) {
            for (int var2 = 0; var2 < class172.field2997; var2++) {
                if (class235.field4101[arg0][var1][var2] == null) {
                    class235.field4101[arg0][var1][var2] = new class3(arg0, var1, var2);
                }
            }
        }
    }
}
