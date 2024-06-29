import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class185 {

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[I")
    public static int[] field2960 = new int[1000];

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Lmh;")
    public static class62 field2962 = class201.method1405(true, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Lmh;")
    public static class62 field2959 = class201.method1405(true, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ZI)V", line = 5)
    public static final void method1294(boolean arg0, int arg1) {
        field2961++;
        if (arg1 != 2386) {
            method1296(true);
        }
        byte[][] var2;
        if (arg0) {
            var2 = class244.field4140;
        } else {
            var2 = class85.field1382;
        }
        int var3 = class196.field3328.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class39.field608[var4] >> 8) * 64 - class120.field2006;
                int var7 = (class39.field608[var4] & 0xFF) * 64 - class290.field4936;
                class209.method1460(111);
                class281.method1920(var6, var7, class250.field4244, arg0, var5, (byte) 84);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 45)
    public static final void method1295(int arg0) {
        int var1 = -14 / ((-arg0 - 32) / 52);
        class46.field688.method1392(0);
        class183.field2916.method1392(0);
        field2963++;
        class36.field498.method1392(0);
        class71.field1078.method1392(0);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Z)V", line = 65)
    public static void method1296(boolean arg0) {
        field2962 = null;
        if (!arg0) {
            field2964 = -115;
        }
        field2960 = null;
        field2959 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 81)
    public static final void method1297(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class114.field1900 * 128) {
            arg0 = class114.field1900 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class252.field4273 * 128) {
            arg2 = class252.field4273 * 128 - 1;
        }
        class77.field1275 = class23.field245[arg3];
        class55.field805 = class23.field254[arg3];
        class37.field566 = class23.field245[arg4];
        class200.field3388 = class23.field254[arg4];
        class144.field2300 = arg0;
        class293.field4981 = arg1;
        class270.field4579 = arg2;
        class36.field480 = arg0 / 128;
        class24.field264 = arg2 / 128;
        class49.field715 = class36.field480 - class1.field9;
        if (class49.field715 < 0) {
            class49.field715 = 0;
        }
        class127.field2104 = class24.field264 - class1.field9;
        if (class127.field2104 < 0) {
            class127.field2104 = 0;
        }
        class108.field1752 = class36.field480 + class1.field9;
        if (class108.field1752 > class114.field1900) {
            class108.field1752 = class114.field1900;
        }
        class164.field2671 = class24.field264 + class1.field9;
        if (class164.field2671 > class252.field4273) {
            class164.field2671 = class252.field4273;
        }
        short var15 = 3584;
        for (int var16 = 0; var16 < class1.field9 + class1.field9 + 2; var16++) {
            for (int var17 = 0; var17 < class1.field9 + class1.field9 + 2; var17++) {
                int var18 = (var16 - class1.field9 << 7) - (class144.field2300 & 0x7F);
                int var19 = (var17 - class1.field9 << 7) - (class270.field4579 & 0x7F);
                int var20 = class36.field480 + var16 - class1.field9;
                int var21 = class24.field264 + var17 - class1.field9;
                if (var20 >= 0 && var21 >= 0 && var20 < class114.field1900 && var21 < class252.field4273) {
                    int var22;
                    if (class41.field632 == null) {
                        var22 = class72.field1106[0][var20][var21] + 128 - class293.field4981;
                    } else {
                        var22 = class41.field632[0][var20][var21] + 128 - class293.field4981;
                    }
                    int var23 = class72.field1106[3][var20][var21] - class293.field4981 - 1000;
                    class228.field3966[var16][var17] = class152.method1093(var18, var23, var22, var19, var15);
                } else {
                    class228.field3966[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class1.field9 + class1.field9 + 1; var24++) {
            for (int var25 = 0; var25 < class1.field9 + class1.field9 + 1; var25++) {
                class308.field5290[var24][var25] = class228.field3966[var24][var25] || class228.field3966[var24 + 1][var25] || class228.field3966[var24][var25 + 1] || class228.field3966[var24 + 1][var25 + 1];
            }
        }
        class163.field2644 = arg6;
        class124.field2053 = arg7;
        client.field5167 = arg8;
        class75.field1211 = arg9;
        class293.field4979 = arg10;
        class100.method799();
        if (class84.field1378 != null) {
            class250.method1743(true);
            class49.method313(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class195.field3304 = false;
            class135.method1024(0, 76, 0);
            class179.method1253((float[]) null);
            class117.method906();
            class250.method1743(false);
        }
        class49.method313(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIBII)V", line = 209)
    public static final void method1298(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2958++;
        int var6 = (arg1 - 32) * arg1 / arg0;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg2 / (arg0 - arg1);
        class284.field4859[0].method124(arg5, arg4);
        class284.field4859[1].method124(arg5, arg4 - (16 - arg1));
        class311.method2117(arg5, arg4 + 16, 16, arg1 - 32, class277.field4755);
        class311.method2117(arg5, arg4 + var7 + 16, 16, var6, class125.field2094);
        class311.method2111(arg5, var7 + arg4 + 16, var6, class136.field2215);
        class311.method2111(arg5 + 1, arg4 - -var7 + 16, var6, class136.field2215);
        class311.method2112(arg5, arg4 + var7 + 16, 16, class136.field2215);
        class311.method2112(arg5, arg4 + var7 + 17, 16, class136.field2215);
        class311.method2111(arg5 + 15, arg4 - (-16 - var7), var6, class55.field807);
        class311.method2111(arg5 + 14, arg4 - -var7 + 17, var6 - 1, class55.field807);
        class311.method2112(arg5, arg4 + var7 + var6 + 15, 16, class55.field807);
        class311.method2112(arg5 + 1, var7 + 14 + arg4 - -var6, 15, class55.field807);
        if (arg3 > -103) {
            method1297(105, 31, 61, 36, 90, (byte[][][]) ((byte[][][]) null), (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -94, (byte) 92, 119, 51);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIIIIIZII)Z", line = 249)
    public static final boolean method1299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field2957++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class278.field4767[var12][var13] = 0;
                class159.field2566[var12][var13] = 99999999;
            }
        }
        int var14 = arg7;
        class278.field4767[arg7][arg8] = 99;
        byte var15 = 0;
        int var16 = arg8;
        class159.field2566[arg7][arg8] = 0;
        if (arg1 != -20374) {
            return false;
        }
        class92.field1468[var15] = arg7;
        int var17 = 0;
        boolean var18 = false;
        int var32 = var15 + 1;
        class182.field2900[var15] = arg8;
        int[][] var19 = class250.field4244[class7.field85].field3756;
        while (var32 != var17) {
            var16 = class182.field2900[var17];
            var14 = class92.field1468[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg2 == var14 && arg0 == var16) {
                var18 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class250.field4244[class7.field85].method1553(arg3 - 1, 1, (byte) -119, arg6, arg0, arg2, var16, var14)) {
                    var18 = true;
                    break;
                }
                if (arg3 < 10 && class250.field4244[class7.field85].method1556(arg0, 1, var14, arg3 - 1, arg6, arg2, var16, -1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg11 != 0 && class250.field4244[class7.field85].method1549(arg2, 1, arg11, 0, arg4, var14, arg10, var16, arg0)) {
                var18 = true;
                break;
            }
            int var20 = class159.field2566[var14][var16] + 1;
            if (var14 > 0 && class278.field4767[var14 - 1][var16] == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0) {
                class92.field1468[var32] = var14 - 1;
                class182.field2900[var32] = var16;
                class278.field4767[var14 - 1][var16] = 2;
                class159.field2566[var14 - 1][var16] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class278.field4767[var14 + 1][var16] == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0) {
                class92.field1468[var32] = var14 + 1;
                class182.field2900[var32] = var16;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14 + 1][var16] = 8;
                class159.field2566[var14 + 1][var16] = var20;
            }
            if (var16 > 0 && class278.field4767[var14][var16 - 1] == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class92.field1468[var32] = var14;
                class182.field2900[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14][var16 - 1] = 1;
                class159.field2566[var14][var16 - 1] = var20;
            }
            if (var16 < 103 && class278.field4767[var14][var16 + 1] == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class92.field1468[var32] = var14;
                class182.field2900[var32] = var16 + 1;
                class278.field4767[var14][var16 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class159.field2566[var14][var16 + 1] = var20;
            }
            if (var14 > 0 && var16 > 0 && class278.field4767[var14 - 1][var16 - 1] == 0 && (var19[var14 - 1][var16 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class92.field1468[var32] = var14 - 1;
                class182.field2900[var32] = var16 - 1;
                class278.field4767[var14 - 1][var16 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class159.field2566[var14 - 1][var16 - 1] = var20;
            }
            if (var14 < 103 && var16 > 0 && class278.field4767[var14 + 1][var16 - 1] == 0 && (var19[var14 + 1][var16 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 - 1] & 0x12C0102) == 0) {
                class92.field1468[var32] = var14 + 1;
                class182.field2900[var32] = var16 - 1;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14 + 1][var16 - 1] = 9;
                class159.field2566[var14 + 1][var16 - 1] = var20;
            }
            if (var14 > 0 && var16 < 103 && class278.field4767[var14 - 1][var16 + 1] == 0 && (var19[var14 - 1][var16 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var16] & 0x12C0108) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class92.field1468[var32] = var14 - 1;
                class182.field2900[var32] = var16 + 1;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14 - 1][var16 + 1] = 6;
                class159.field2566[var14 - 1][var16 + 1] = var20;
            }
            if (var14 < 103 && var16 < 103 && class278.field4767[var14 + 1][var16 + 1] == 0 && (var19[var14 + 1][var16 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var16] & 0x12C0180) == 0 && (var19[var14][var16 + 1] & 0x12C0120) == 0) {
                class92.field1468[var32] = var14 + 1;
                class182.field2900[var32] = var16 + 1;
                class278.field4767[var14 + 1][var16 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class159.field2566[var14 + 1][var16 + 1] = var20;
            }
        }
        class69.field1059 = 0;
        if (!var18) {
            if (!arg9) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg2 - var22; var24 <= arg2 + var22; var24++) {
                for (int var25 = arg0 - var22; var25 <= (arg0 + var22); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class159.field2566[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg2 > var24) {
                            var26 = arg2 - var24;
                        } else if (arg2 + arg4 - 1 < var24) {
                            var26 = var24 + 1 - arg2 - arg4;
                        }
                        int var27 = 0;
                        if (var25 < arg0) {
                            var27 = arg0 - var25;
                        } else if (arg0 + arg11 - 1 < var25) {
                            var27 = var25 + 1 - arg11 - arg0;
                        }
                        int var28 = var26 * var26 + (var27 * var27);
                        if (var28 < var21 || var21 == var28 && class159.field2566[var24][var25] < var23) {
                            var23 = class159.field2566[var24][var25];
                            var21 = var28;
                            var16 = var25;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg7 == var14 && arg8 == var16) {
                return false;
            }
            class69.field1059 = 1;
        }
        byte var29 = 0;
        class92.field1468[var29] = var14;
        int var33 = var29 + 1;
        class182.field2900[var29] = var16;
        int var30;
        int var31 = var30 = class278.field4767[var14][var16];
        while (arg7 != var14 || arg8 != var16) {
            if (var30 != var31) {
                class92.field1468[var33] = var14;
                class182.field2900[var33++] = var16;
                var30 = var31;
            }
            if ((var31 & 0x1) != 0) {
                var16++;
            } else if ((var31 & 0x4) != 0) {
                var16--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class278.field4767[var14][var16];
        }
        if (var33 > 0) {
            class304.method2082(arg5, (byte) -31, var33);
            return true;
        } else if (arg5 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
