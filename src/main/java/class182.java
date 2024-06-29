import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class182 extends class147 {

    @OriginalMember(owner = "client!o", name = "E", descriptor = "Ls;")
    public static class227 field3209 = new class227(64);

    @OriginalMember(owner = "client!o", name = "G", descriptor = "B")
    public byte field3210;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public int field3215;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "Lnb;")
    public class95 field3213;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIBIIIIIIIZI)Z")
    public static final boolean method1190(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, int arg11) {
        field3212++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class30.field380[var12][var31] = 0;
                class109.field1555[var12][var31] = 99999999;
            }
        }
        class30.field380[arg4][arg11] = 99;
        class109.field1555[arg4][arg11] = 0;
        if (arg2 != -66) {
            return false;
        }
        int var13 = arg4;
        int var14 = arg11;
        byte var15 = 0;
        class30.field375[var15] = arg4;
        boolean var16 = false;
        int var32 = var15 + 1;
        class172.field2892[var15] = arg11;
        int[][] var17 = class188.field3298[class27.field335].field2462;
        int var18 = 0;
        while (var32 != var18) {
            var14 = class172.field2892[var18];
            var13 = class30.field375[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg7 == var13 && arg0 == var14) {
                var16 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class188.field3298[class27.field335].method969(arg9 - 1, arg7, (byte) -108, var14, var13, arg3, arg0, 2)) {
                    var16 = true;
                    break;
                }
                if (arg9 < 10 && class188.field3298[class27.field335].method971(var14, arg2 + 177, arg0, arg9 - 1, var13, arg3, arg7, 2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg1 != 0 && arg6 != 0 && class188.field3298[class27.field335].method961(arg1, arg5, arg7, var14, arg6, var13, -1, arg0, 2)) {
                var16 = true;
                break;
            }
            int var30 = class109.field1555[var13][var14] + 1;
            if (var13 > 0 && class30.field380[var13 - 1][var14] == 0 && (var17[var13 - 1][var14] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 1] & 0x12C0138) == 0) {
                class30.field375[var32] = var13 - 1;
                class172.field2892[var32] = var14;
                class30.field380[var13 - 1][var14] = 2;
                class109.field1555[var13 - 1][var14] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 102 && class30.field380[var13 + 1][var14] == 0 && (var17[var13 + 2][var14] & 0x12C0183) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C01E0) == 0) {
                class30.field375[var32] = var13 + 1;
                class172.field2892[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class30.field380[var13 + 1][var14] = 8;
                class109.field1555[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class30.field380[var13][var14 - 1] == 0 && (var17[var13][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 1][var14 - 1] & 0x12C0183) == 0) {
                class30.field375[var32] = var13;
                class172.field2892[var32] = var14 - 1;
                var32 = var32 + 1 & 0xFFF;
                class30.field380[var13][var14 - 1] = 1;
                class109.field1555[var13][var14 - 1] = var30;
            }
            if (var14 < 102 && class30.field380[var13][var14 + 1] == 0 && (var17[var13][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 1][var14 + 2] & 0x12C01E0) == 0) {
                class30.field375[var32] = var13;
                class172.field2892[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class30.field380[var13][var14 + 1] = 4;
                class109.field1555[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class30.field380[var13 - 1][var14 - 1] == 0 && (var17[var13 - 1][var14] & 0x12C0138) == 0 && (var17[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13][var14 - 1] & 0x12C0183) == 0) {
                class30.field375[var32] = var13 - 1;
                class172.field2892[var32] = var14 - 1;
                class30.field380[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class109.field1555[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 102 && var14 > 0 && class30.field380[var13 + 1][var14 - 1] == 0 && (var17[var13 + 1][var14 - 1] & 0x12C010E) == 0 && (var17[var13 + 2][var14 - 1] & 0x12C0183) == 0 && (var17[var13 + 2][var14] & 0x12C01E0) == 0) {
                class30.field375[var32] = var13 + 1;
                class172.field2892[var32] = var14 - 1;
                class30.field380[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class109.field1555[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 102 && class30.field380[var13 - 1][var14 + 1] == 0 && (var17[var13 - 1][var14 + 1] & 0x12C010E) == 0 && (var17[var13 - 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13][var14 + 2] & 0x12C01E0) == 0) {
                class30.field375[var32] = var13 - 1;
                class172.field2892[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class30.field380[var13 - 1][var14 + 1] = 6;
                class109.field1555[var13 - 1][var14 + 1] = var30;
            }
            if (var13 < 102 && var14 < 102 && class30.field380[var13 + 1][var14 + 1] == 0 && (var17[var13 + 1][var14 + 2] & 0x12C0138) == 0 && (var17[var13 + 2][var14 + 2] & 0x12C01E0) == 0 && (var17[var13 + 2][var14 + 1] & 0x12C0183) == 0) {
                class30.field375[var32] = var13 + 1;
                class172.field2892[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class30.field380[var13 + 1][var14 + 1] = 12;
                class109.field1555[var13 + 1][var14 + 1] = var30;
            }
        }
        class195.field3427 = 0;
        if (!var16) {
            if (!arg10) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg7 - var21; var22 <= arg7 + var21; var22++) {
                for (int var23 = arg0 - var21; var23 <= arg0 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class109.field1555[var22][var23] < 100) {
                        int var24 = 0;
                        if (arg7 > var22) {
                            var24 = arg7 - var22;
                        } else if (var22 > arg7 + arg1 - 1) {
                            var24 = var22 + 1 - arg1 - arg7;
                        }
                        int var25 = 0;
                        if (var23 < arg0) {
                            var25 = arg0 - var23;
                        } else if (arg6 + arg0 - 1 < var23) {
                            var25 = var23 + 1 - arg6 - arg0;
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && var20 > class109.field1555[var22][var23]) {
                            var19 = var26;
                            var14 = var23;
                            var20 = class109.field1555[var22][var23];
                            var13 = var22;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg4 == var13 && arg11 == var14) {
                return false;
            }
            class195.field3427 = 1;
        }
        byte var27 = 0;
        class30.field375[var27] = var13;
        int var33 = var27 + 1;
        class172.field2892[var27] = var14;
        int var28;
        int var29 = var28 = class30.field380[var13][var14];
        while (arg4 != var13 || arg11 != var14) {
            if (var28 != var29) {
                var28 = var29;
                class30.field375[var33] = var13;
                class172.field2892[var33++] = var14;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class30.field380[var13][var14];
        }
        if (var33 > 0) {
            class33.method175(var33, arg2 + 40, arg8);
            return true;
        } else if (arg8 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1191(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = -47 / ((57 - arg4) / 52);
        field3211++;
        if (arg1 == arg5) {
            class241.method1642(arg3, arg1, arg2, arg0, 114);
        } else if (class188.field3296 <= arg2 - arg1 && arg1 + arg2 <= class95.field1388 && class93.field1361 <= arg3 - arg5 && arg3 + arg5 <= class23.field291) {
            class143.method883(arg2, arg5, arg0, arg3, (byte) -92, arg1);
        } else {
            class147.method917(arg1, arg3, 1454204322, arg2, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public static void method1192(int arg0) {
        field3209 = null;
        if (arg0 != -1) {
            field3209 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V")
    public static final void method1193(int arg0) {
        field3214++;
        for (class63 var1 = (class63) class101.field1445.method1554(6539); var1 != null; var1 = (class63) class101.field1445.method1547(342)) {
            int var3 = var1.field864;
            if (class35.method182(var3, (byte) -48)) {
                class178[] var4 = class91.field1335[var3];
                boolean var5 = true;
                for (int var6 = 0; var6 < var4.length; var6++) {
                    if (var4[var6] != null) {
                        var5 = var4[var6].field3030;
                        break;
                    }
                }
                if (!var5) {
                    int var7 = (int) var1.field1850;
                    class178 var8 = class201.method1356(var7, (byte) -76);
                    if (var8 != null) {
                        class214.method1472(74, var8);
                    }
                }
            }
        }
        int var2 = 75 / ((53 - arg0) / 38);
    }
}
