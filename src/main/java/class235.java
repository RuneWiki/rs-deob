import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class235 {

    @OriginalMember(owner = "client!ck", name = "e", descriptor = "J")
    public long field4095 = 0L;

    @OriginalMember(owner = "client!ck", name = "f", descriptor = "Lud;")
    public static class279 field4096 = class130.method1024("Shift)2click disabled)3", 255);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "Lsf;")
    public class108 field4091;

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "Lsf;")
    public class108 field4099;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Lig;")
    public static class175 field4094;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIZIIIIIIZII)Z", line = 9)
    public static final boolean method1692(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class125.field2309[var12][var13] = 0;
                class15.field480[var12][var13] = 99999999;
            }
        }
        field4105++;
        class125.field2309[arg4][arg11] = 99;
        class15.field480[arg4][arg11] = 0;
        int var14 = arg4;
        int var15 = arg11;
        boolean var16 = false;
        int var17 = 0;
        byte var18 = 0;
        class105.field1986[var18] = arg4;
        int var32 = var18 + 1;
        class211.field3709[var18] = arg11;
        int[][] var19 = class90.field1702[class287.field5134].field2215;
        while (var17 != var32) {
            var15 = class211.field3709[var17];
            var14 = class105.field1986[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg5 == var14 && arg10 == var15) {
                var16 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class90.field1702[class287.field5134].method978(var14, arg10, 2, arg5, arg3 - 1, var15, arg7, -128)) {
                    var16 = true;
                    break;
                }
                if (arg3 < 10 && class90.field1702[class287.field5134].method968(arg7, var15, arg10, -1, arg5, var14, arg3 - 1, 2)) {
                    var16 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg6 != 0 && class90.field1702[class287.field5134].method983(arg10, arg6, 2, arg8, var14, -1, arg5, arg1, var15)) {
                var16 = true;
                break;
            }
            int var20 = class15.field480[var14][var15] + 1;
            if (var14 > 0 && class125.field2309[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class105.field1986[var32] = var14 - 1;
                class211.field3709[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class125.field2309[var14 - 1][var15] = 2;
                class15.field480[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class125.field2309[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class105.field1986[var32] = var14 + 1;
                class211.field3709[var32] = var15;
                class125.field2309[var14 + 1][var15] = 8;
                var32 = var32 + 1 & 0xFFF;
                class15.field480[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class125.field2309[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class105.field1986[var32] = var14;
                class211.field3709[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field2309[var14][var15 - 1] = 1;
                class15.field480[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class125.field2309[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class105.field1986[var32] = var14;
                class211.field3709[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field2309[var14][var15 + 1] = 4;
                class15.field480[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class125.field2309[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class105.field1986[var32] = var14 - 1;
                class211.field3709[var32] = var15 - 1;
                class125.field2309[var14 - 1][var15 - 1] = 3;
                class15.field480[var14 - 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var15 > 0 && class125.field2309[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class105.field1986[var32] = var14 + 1;
                class211.field3709[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class125.field2309[var14 + 1][var15 - 1] = 9;
                class15.field480[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class125.field2309[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class105.field1986[var32] = var14 - 1;
                class211.field3709[var32] = var15 + 1;
                class125.field2309[var14 - 1][var15 + 1] = 6;
                var32 = var32 + 1 & 0xFFF;
                class15.field480[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class125.field2309[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class105.field1986[var32] = var14 + 1;
                class211.field3709[var32] = var15 + 1;
                class125.field2309[var14 + 1][var15 + 1] = 12;
                class15.field480[var14 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class100.field1872 = 0;
        if (!var16) {
            if (!arg9) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg5 - var23; var24 <= arg5 + var23; var24++) {
                for (int var25 = arg10 - var23; var25 <= arg10 + var23; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class15.field480[var24][var25] < 100) {
                        int var26 = 0;
                        int var27 = 0;
                        if (arg5 > var24) {
                            var26 = arg5 - var24;
                        } else if ((arg5 - (1 - arg8)) < var24) {
                            var26 = var24 + 1 - arg5 - arg8;
                        }
                        if (arg10 > var25) {
                            var27 = arg10 - var25;
                        } else if (var25 > (arg6 + arg10 - 1)) {
                            var27 = 1 - arg10 - (arg6 - var25);
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var21 || var21 == var28 && class15.field480[var24][var25] < var22) {
                            var22 = class15.field480[var24][var25];
                            var14 = var24;
                            var15 = var25;
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg11 == var15) {
                return false;
            }
            class100.field1872 = 1;
        }
        byte var29 = 0;
        class105.field1986[var29] = var14;
        int var33 = var29 + 1;
        class211.field3709[var29] = var15;
        int var30;
        int var31 = var30 = class125.field2309[var14][var15];
        while (arg4 != var14 || arg11 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class105.field1986[var33] = var14;
                class211.field3709[var33++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class125.field2309[var14][var15];
        }
        if (!arg2) {
            return false;
        } else if (var33 > 0) {
            class322.method2268(-28, var33, arg0);
            return true;
        } else if (arg0 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V", line = 403)
    public static void method1693(byte arg0) {
        field4096 = null;
        if (arg0 != 126) {
            field4096 = (class279) null;
        }
        field4094 = null;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)V", line = 419)
    public static final void method1694(int arg0) {
        class1.field83.method1338((byte) -111);
        field4097++;
        if (arg0 < 104) {
            field4094 = (class175) null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V", line = 446)
    public static final void method1695(int arg0, int arg1, int arg2, Object[] arg3, int[] arg4) {
        if (arg0 > arg2) {
            int var5 = (arg2 + arg0) / 2;
            int var6 = arg2;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var8;
            for (int var9 = arg2; var9 < arg0; var9++) {
                if (arg4[var9] < var7 + (var9 & 0x1)) {
                    int var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    Object var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var8;
            method1695(var6 - 1, arg1 ^ 0x0, arg2, arg3, arg4);
            method1695(arg0, -105, var6 + 1, arg3, arg4);
        }
        field4098++;
        if (arg1 != -105) {
            field4094 = (class175) null;
        }
    }
}
