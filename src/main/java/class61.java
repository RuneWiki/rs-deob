import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class61 extends class291 {

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "Lwf;")
    public class47 field995;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "[Lrb;")
    public static class134[] field1001 = new class134[4];

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Leg;")
    private static class37 field997 = class174.method1167("Loaded textures", -77);

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Leg;")
    public static class37 field1002 = field997;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "Leg;")
    public static class37 field1006 = class174.method1167("niveau ", -106);

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field1008 = 0;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "Ljl;")
    public static class101 field998;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "Lsc;")
    public static class131 field1000;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "[I")
    public static int[] field1004;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)V")
    public static final void method434(boolean arg0) {
        field1007++;
        class53.field824.method1409(105);
        class173.field2902.method1409(112);
        if (!arg0) {
            method436((byte) -6);
        }
        class72.field1135.method1409(77);
        class126.field2102.method1409(114);
    }

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V")
    public static void method435(int arg0) {
        field1004 = null;
        field1006 = null;
        field1000 = null;
        field997 = null;
        field998 = null;
        field1002 = null;
        field1001 = null;
        if (arg0 != -4612) {
            method436((byte) -38);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)I")
    public static final int method436(byte arg0) {
        int var1 = -56 / ((31 - arg0) / 32);
        field1003++;
        return class62.field1019;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method437(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class172.field2888[var12][var31] = 0;
                class102.field1603[var12][var31] = 99999999;
            }
        }
        field996++;
        class172.field2888[arg10][arg9] = 99;
        int var13 = arg9;
        class102.field1603[arg10][arg9] = 0;
        byte var14 = 0;
        class89.field1428[var14] = arg10;
        int var15 = 0;
        int var32 = var14 + 1;
        class125.field2092[var14] = arg9;
        int var16 = arg10;
        boolean var17 = false;
        int[][] var18 = class215.field3719[class237.field4140].field2738;
        if (arg11 != -12482) {
            return false;
        }
        while (var32 != var15) {
            var16 = class89.field1428[var15];
            var13 = class125.field2092[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg0 == var16 && arg6 == var13) {
                var17 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class215.field3719[class237.field4140].method1104(2, arg6, arg7 - 1, var16, arg8, true, var13, arg0)) {
                    var17 = true;
                    break;
                }
                if (arg7 < 10 && class215.field3719[class237.field4140].method1109(var16, 2, var13, arg8, arg6, arg0, arg7 - 1, 0)) {
                    var17 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg3 != 0 && class215.field3719[class237.field4140].method1111(arg3, var16, arg4, arg6, arg0, 2, (byte) -128, arg1, var13)) {
                var17 = true;
                break;
            }
            int var30 = class102.field1603[var16][var13] + 1;
            if (var16 > 0 && class172.field2888[var16 - 1][var13] == 0 && (var18[var16 - 1][var13] & 0x12C010E) == 0 && (var18[var16 - 1][var13 + 1] & 0x12C0138) == 0) {
                class89.field1428[var32] = var16 - 1;
                class125.field2092[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16 - 1][var13] = 2;
                class102.field1603[var16 - 1][var13] = var30;
            }
            if (var16 < 102 && class172.field2888[var16 + 1][var13] == 0 && (var18[var16 + 2][var13] & 0x12C0183) == 0 && (var18[var16 + 2][var13 + 1] & 0x12C01E0) == 0) {
                class89.field1428[var32] = var16 + 1;
                class125.field2092[var32] = var13;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16 + 1][var13] = 8;
                class102.field1603[var16 + 1][var13] = var30;
            }
            if (var13 > 0 && class172.field2888[var16][var13 - 1] == 0 && (var18[var16][var13 - 1] & 0x12C010E) == 0 && (var18[var16 + 1][var13 - 1] & 0x12C0183) == 0) {
                class89.field1428[var32] = var16;
                class125.field2092[var32] = var13 - 1;
                class172.field2888[var16][var13 - 1] = 1;
                class102.field1603[var16][var13 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class172.field2888[var16][var13 + 1] == 0 && (var18[var16][var13 + 2] & 0x12C0138) == 0 && (var18[var16 + 1][var13 + 2] & 0x12C01E0) == 0) {
                class89.field1428[var32] = var16;
                class125.field2092[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16][var13 + 1] = 4;
                class102.field1603[var16][var13 + 1] = var30;
            }
            if (var16 > 0 && var13 > 0 && class172.field2888[var16 - 1][var13 - 1] == 0 && (var18[var16 - 1][var13] & 0x12C0138) == 0 && (var18[var16 - 1][var13 - 1] & 0x12C010E) == 0 && (var18[var16][var13 - 1] & 0x12C0183) == 0) {
                class89.field1428[var32] = var16 - 1;
                class125.field2092[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16 - 1][var13 - 1] = 3;
                class102.field1603[var16 - 1][var13 - 1] = var30;
            }
            if (var16 < 102 && var13 > 0 && class172.field2888[var16 + 1][var13 - 1] == 0 && (var18[var16 + 1][var13 - 1] & 0x12C010E) == 0 && (var18[var16 + 2][var13 - 1] & 0x12C0183) == 0 && (var18[var16 + 2][var13] & 0x12C01E0) == 0) {
                class89.field1428[var32] = var16 + 1;
                class125.field2092[var32] = var13 - 1;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16 + 1][var13 - 1] = 9;
                class102.field1603[var16 + 1][var13 - 1] = var30;
            }
            if (var16 > 0 && var13 < 102 && class172.field2888[var16 - 1][var13 + 1] == 0 && (var18[var16 - 1][var13 + 1] & 0x12C010E) == 0 && (var18[var16 - 1][var13 + 2] & 0x12C0138) == 0 && (var18[var16][var13 + 2] & 0x12C01E0) == 0) {
                class89.field1428[var32] = var16 - 1;
                class125.field2092[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16 - 1][var13 + 1] = 6;
                class102.field1603[var16 - 1][var13 + 1] = var30;
            }
            if (var16 < 102 && var13 < 102 && class172.field2888[var16 + 1][var13 + 1] == 0 && (var18[var16 + 1][var13 + 2] & 0x12C0138) == 0 && (var18[var16 + 2][var13 + 2] & 0x12C01E0) == 0 && (var18[var16 + 2][var13 + 1] & 0x12C0183) == 0) {
                class89.field1428[var32] = var16 + 1;
                class125.field2092[var32] = var13 + 1;
                var32 = var32 + 1 & 0xFFF;
                class172.field2888[var16 + 1][var13 + 1] = 12;
                class102.field1603[var16 + 1][var13 + 1] = var30;
            }
        }
        class36.field530 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg0 - var21; var22 <= (arg0 + var21); var22++) {
                for (int var23 = arg6 - var21; var23 <= (arg6 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class102.field1603[var22][var23] < 100) {
                        int var24 = 0;
                        if (var22 < arg0) {
                            var24 = arg0 - var22;
                        } else if (var22 > (arg1 + arg0 - 1)) {
                            var24 = var22 - (arg0 + arg1 - 1);
                        }
                        int var25 = 0;
                        if (var23 < arg6) {
                            var25 = arg6 - var23;
                        } else if (var23 > (arg3 + arg6 - 1)) {
                            var25 = -arg3 - arg6 - (-1 - var23);
                        }
                        int var26 = var24 * var24 + (var25 * var25);
                        if (var19 > var26 || var19 == var26 && class102.field1603[var22][var23] < var20) {
                            var19 = var26;
                            var20 = class102.field1603[var22][var23];
                            var13 = var23;
                            var16 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg10 == var16 && arg9 == var13) {
                return false;
            }
            class36.field530 = 1;
        }
        byte var27 = 0;
        class89.field1428[var27] = var16;
        int var33 = var27 + 1;
        class125.field2092[var27] = var13;
        int var28;
        int var29 = var28 = class172.field2888[var16][var13];
        while (arg10 != var16 || arg9 != var13) {
            if (var28 != var29) {
                var28 = var29;
                class89.field1428[var33] = var16;
                class125.field2092[var33++] = var13;
            }
            if ((var29 & 0x2) != 0) {
                var16++;
            } else if ((var29 & 0x8) != 0) {
                var16--;
            }
            if ((var29 & 0x1) != 0) {
                var13++;
            } else if ((var29 & 0x4) != 0) {
                var13--;
            }
            var29 = class172.field2888[var16][var13];
        }
        if (var33 > 0) {
            class93.method608(var33, arg5, (byte) 55);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lwf;)V")
    public class61(class47 arg0) {
        this.field995 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIBII)V")
    public static final void method438(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 <= 93) {
            field997 = null;
        }
        field994++;
        int var7 = arg1 + arg2;
        int var8 = arg1 + arg3;
        int var9 = arg5 - arg1;
        for (int var10 = arg2; var10 < var7; var10++) {
            class145.method1010(arg5, arg3, -25086, arg0, class210.field3617[var10]);
        }
        int var11 = arg6 - arg1;
        for (int var12 = arg6; var12 > var11; var12--) {
            class145.method1010(arg5, arg3, -25086, arg0, class210.field3617[var12]);
        }
        for (int var13 = var7; var13 <= var11; var13++) {
            int[] var14 = class210.field3617[var13];
            class145.method1010(var8, arg3, -25086, arg0, var14);
            class145.method1010(arg5, var9, -25086, arg0, var14);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILq;)V")
    public static final void method439(int arg0, class163 arg1) {
        field1005++;
        if (arg0 != -1) {
            method437(23, -122, true, -101, -76, 121, -29, 5, -97, 70, -113, 36);
        }
        for (class89 var2 = (class89) class175.field2928.method1566(arg0 ^ 0x2); var2 != null; var2 = (class89) class175.field2928.method1570(arg0 ^ 0xFFFFFFFC)) {
            if (var2.field1418 == arg1) {
                if (var2.field1410 != null) {
                    class127.field2127.method1514(var2.field1410);
                    var2.field1410 = null;
                }
                var2.method441(16773377);
                return;
            }
        }
    }
}
