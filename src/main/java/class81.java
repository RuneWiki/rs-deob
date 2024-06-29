import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class81 extends class99 {

    @OriginalMember(owner = "client!le", name = "y", descriptor = "Lr;")
    public static class118 field1956 = class153.method1136(100, "::gc");

    @OriginalMember(owner = "client!le", name = "H", descriptor = "[[I")
    private static int[][] field1964 = new int[104][104];

    @OriginalMember(owner = "client!le", name = "E", descriptor = "[I")
    public static int[] field1962 = new int[32];

    @OriginalMember(owner = "client!le", name = "J", descriptor = "[[B")
    public static byte[][] field1966 = new byte[250][];

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Lr;")
    private static class118 field1954 = class153.method1136(103, "No reply from loginserver)3");

    @OriginalMember(owner = "client!le", name = "v", descriptor = "Lr;")
    public static class118 field1953 = field1954;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public static int field1968 = -1;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Lr;")
    public static class118 field1963 = class153.method1136(111, ":");

    @OriginalMember(owner = "client!le", name = "A", descriptor = "Lr;")
    public static class118 field1958 = class153.method1136(104, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!le", name = "B", descriptor = "B")
    public byte field1959;

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Lr;")
    public class118 field1965;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "Lff;")
    public static class42 field1961;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
    public static void method673(int arg0) {
        field1961 = null;
        field1963 = null;
        field1956 = null;
        field1954 = null;
        field1958 = null;
        field1964 = null;
        field1966 = null;
        if (arg0 <= 56) {
            field1961 = null;
        }
        field1953 = null;
        field1962 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIBIIIIZIIII)Z")
    public static final boolean method674(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class29.field674[var12][var36] = 0;
                field1964[var12][var36] = 99999999;
            }
        }
        class29.field674[arg1][arg5] = 99;
        int var13 = arg1;
        field1964[arg1][arg5] = 0;
        byte var14 = 0;
        int var15 = 0;
        boolean var16 = false;
        class69.field1615[var14] = arg1;
        int var17 = arg5;
        field1955++;
        int var37 = var14 + 1;
        class65.field1480[var14] = arg5;
        int[][] var18 = class121.field2790[class106.field2468].field2958;
        int var19 = class69.field1615.length;
        while (var37 != var15) {
            var17 = class65.field1480[var15];
            var13 = class69.field1615[var15];
            var15 = (var15 + 1) % var19;
            if (arg3 == var13 && arg4 == var17) {
                var16 = true;
                break;
            }
            if (arg11 != 0) {
                if ((arg11 < 5 || arg11 == 10) && class121.field2790[class106.field2468].method993(var13, arg3, -114, arg11 - 1, arg4, arg9, var17)) {
                    var16 = true;
                    break;
                }
                if (arg11 < 10 && class121.field2790[class106.field2468].method1004(-7, var17, arg9, arg3, arg4, var13, arg11 - 1)) {
                    var16 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg10 != 0 && class121.field2790[class106.field2468].method995(var13, arg8, var17, arg0, arg10, arg4, 0, arg3)) {
                var16 = true;
                break;
            }
            int var35 = field1964[var13][var17] + 1;
            if (var13 > 0 && class29.field674[var13 - 1][var17] == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0) {
                class69.field1615[var37] = var13 - 1;
                class65.field1480[var37] = var17;
                var37 = (var37 + 1) % var19;
                class29.field674[var13 - 1][var17] = 2;
                field1964[var13 - 1][var17] = var35;
            }
            if (var13 < 103 && class29.field674[var13 + 1][var17] == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0) {
                class69.field1615[var37] = var13 + 1;
                class65.field1480[var37] = var17;
                class29.field674[var13 + 1][var17] = 8;
                var37 = (var37 + 1) % var19;
                field1964[var13 + 1][var17] = var35;
            }
            if (var17 > 0 && class29.field674[var13][var17 - 1] == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class69.field1615[var37] = var13;
                class65.field1480[var37] = var17 - 1;
                class29.field674[var13][var17 - 1] = 1;
                field1964[var13][var17 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var17 < 103 && class29.field674[var13][var17 + 1] == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class69.field1615[var37] = var13;
                class65.field1480[var37] = var17 + 1;
                class29.field674[var13][var17 + 1] = 4;
                var37 = (var37 + 1) % var19;
                field1964[var13][var17 + 1] = var35;
            }
            if (var13 > 0 && var17 > 0 && class29.field674[var13 - 1][var17 - 1] == 0 && (var18[var13 - 1][var17 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class69.field1615[var37] = var13 - 1;
                class65.field1480[var37] = var17 - 1;
                class29.field674[var13 - 1][var17 - 1] = 3;
                var37 = (var37 + 1) % var19;
                field1964[var13 - 1][var17 - 1] = var35;
            }
            if (var13 < 103 && var17 > 0 && class29.field674[var13 + 1][var17 - 1] == 0 && (var18[var13 + 1][var17 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0 && (var18[var13][var17 - 1] & 0x12C0102) == 0) {
                class69.field1615[var37] = var13 + 1;
                class65.field1480[var37] = var17 - 1;
                class29.field674[var13 + 1][var17 - 1] = 9;
                var37 = (var37 + 1) % var19;
                field1964[var13 + 1][var17 - 1] = var35;
            }
            if (var13 > 0 && var17 < 103 && class29.field674[var13 - 1][var17 + 1] == 0 && (var18[var13 - 1][var17 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var17] & 0x12C0108) == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class69.field1615[var37] = var13 - 1;
                class65.field1480[var37] = var17 + 1;
                var37 = (var37 + 1) % var19;
                class29.field674[var13 - 1][var17 + 1] = 6;
                field1964[var13 - 1][var17 + 1] = var35;
            }
            if (var13 < 103 && var17 < 103 && class29.field674[var13 + 1][var17 + 1] == 0 && (var18[var13 + 1][var17 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var17] & 0x12C0180) == 0 && (var18[var13][var17 + 1] & 0x12C0120) == 0) {
                class69.field1615[var37] = var13 + 1;
                class65.field1480[var37] = var17 + 1;
                class29.field674[var13 + 1][var17 + 1] = 12;
                field1964[var13 + 1][var17 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
        }
        class101.field2347 = 0;
        if (!var16) {
            if (!arg7) {
                return false;
            }
            int var20 = 1000;
            byte var21 = 10;
            int var22 = 100;
            for (int var23 = arg3 - var21; var23 <= arg3 + var21; var23++) {
                for (int var24 = arg4 - var21; var24 <= arg4 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && field1964[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var23 < arg3) {
                            var26 = arg3 - var23;
                        } else if (var23 > arg3 + arg8 - 1) {
                            var26 = var23 + 1 - arg8 - arg3;
                        }
                        if (var24 < arg4) {
                            var25 = arg4 - var24;
                        } else if (var24 > arg4 + arg10 - 1) {
                            var25 = var24 + 1 - arg10 - arg4;
                        }
                        int var27 = var26 * var26 + var25 * var25;
                        if (var27 < var20 || var20 == var27 && var22 > field1964[var23][var24]) {
                            var17 = var24;
                            var22 = field1964[var23][var24];
                            var20 = var27;
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg5 == var17) {
                return false;
            }
            class101.field2347 = 1;
        }
        byte var28 = 0;
        class69.field1615[var28] = var13;
        if (arg2 > -31) {
            return false;
        }
        int var38 = var28 + 1;
        class65.field1480[var28] = var17;
        int var29;
        int var30 = var29 = class29.field674[var13][var17];
        while (arg1 != var13 || arg5 != var17) {
            if (var29 != var30) {
                var29 = var30;
                class69.field1615[var38] = var13;
                class65.field1480[var38++] = var17;
            }
            if ((var30 & 0x1) != 0) {
                var17++;
            } else if ((var30 & 0x4) != 0) {
                var17--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class29.field674[var13][var17];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class65.field1480[var38];
            int var33 = class69.field1615[var38];
            if (arg6 == 0) {
                class1.field22.method722(3, (byte) -127);
                class118.field2747++;
                class1.field22.method800(126, var31 + var31 + 3);
            }
            if (arg6 == 1) {
                class105.field2437++;
                class1.field22.method722(154, (byte) 42);
                class1.field22.method800(-118, var31 + var31 + 3 + 14);
            }
            if (arg6 == 2) {
                class1.field22.method722(89, (byte) 58);
                class1.field22.method800(-98, var31 + var31 + 3);
                class67.field1522++;
            }
            class122.field2823 = class65.field1480[0];
            class110.field2561 = class69.field1615[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class1.field22.method836(class69.field1615[var38] - var33, (byte) -107);
                class1.field22.method800(-105, class65.field1480[var38] - var32);
            }
            class1.field22.method828(client.field524 + var33, (byte) -54);
            class1.field22.method808(1624265448, var32 + class27.field646);
            class1.field22.method800(87, class130.field2964[82] ? 1 : 0);
            return true;
        } else if (arg6 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIZI)V")
    public static final void method675(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field1957++;
        if (class124.field2831 == 1) {
            class140.field3187[class9.field195 / 100].method1109(class70.field1623 - 8, class35.field893 + -8);
        }
        if (class124.field2831 == 2) {
            class140.field3187[class9.field195 / 100 + 4].method1109(class70.field1623 - 8, class35.field893 + -8);
        }
        if (!arg3) {
            method673(-66);
        }
        class99.method771((byte) -110);
        if (!class120.field2786) {
            return;
        }
        int var5 = arg0 + 512 - 5;
        int var6 = arg4 + 20;
        class10.field228.method57(class144.method1066(true, new class118[] { class79.field1925, class43.method359(class1.field23, (byte) -122) }), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class68.field1582) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class68.field1582) {
            var9 = 16711680;
        }
        class10.field228.method57(class144.method1066(arg3, new class118[] { class2.field47, class43.method359(var8, (byte) -122), class26.field638 }), var5, var10, var9, -1);
        var6 = var10 + 15;
    }
}
