import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class116 {

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public static int field1970 = 0;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "Ljg;")
    public static class42 field1969 = new class42(128);

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field1976 = -1;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field1981 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public int field1971;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public int field1975;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "[B")
    public byte[] field1962;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "[B")
    public byte[] field1966;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIBIIIZIII)V")
    public static final void method888(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        field1973++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class228.field3857[var11][var27] = 0;
                class77.field1308[var11][var27] = 99999999;
            }
        }
        class228.field3857[arg0][arg1] = 99;
        class77.field1308[arg0][arg1] = 0;
        int var12 = arg0;
        int var13 = arg1;
        byte var14 = 0;
        int var15 = 0;
        boolean var16 = false;
        class15.field311[var14] = arg0;
        if (arg3 != -35) {
            field1976 = -74;
        }
        int var28 = var14 + 1;
        class69.field1155[var14] = arg1;
        int[][] var17 = class225.field3790[class182.field2898].field5006;
        while (var28 != var15) {
            var13 = class69.field1155[var15];
            var12 = class15.field311[var15];
            var15 = var15 + 1 & 0xFFF;
            if (arg10 == var12 && arg2 == var13) {
                var16 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class225.field3790[class182.field2898].method2094(arg5, arg10, arg2, var13, 1, var12, (byte) -94, arg9 - 1)) {
                    var16 = true;
                    break;
                }
                if (arg9 < 10 && class225.field3790[class182.field2898].method2105(var12, (byte) 120, arg5, arg2, 1, arg10, arg9 - 1, var13)) {
                    var16 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg4 != 0 && class225.field3790[class182.field2898].method2103(var13, arg4, (byte) 17, arg10, arg2, arg6, 1, arg8, var12)) {
                var16 = true;
                break;
            }
            int var26 = class77.field1308[var12][var13] + 1;
            if (var12 > 0 && class228.field3857[var12 - 1][var13] == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0) {
                class15.field311[var28] = var12 - 1;
                class69.field1155[var28] = var13;
                class228.field3857[var12 - 1][var13] = 2;
                var28 = var28 + 1 & 0xFFF;
                class77.field1308[var12 - 1][var13] = var26;
            }
            if (var12 < 103 && class228.field3857[var12 + 1][var13] == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0) {
                class15.field311[var28] = var12 + 1;
                class69.field1155[var28] = var13;
                class228.field3857[var12 + 1][var13] = 8;
                var28 = var28 + 1 & 0xFFF;
                class77.field1308[var12 + 1][var13] = var26;
            }
            if (var13 > 0 && class228.field3857[var12][var13 - 1] == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class15.field311[var28] = var12;
                class69.field1155[var28] = var13 - 1;
                class228.field3857[var12][var13 - 1] = 1;
                class77.field1308[var12][var13 - 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 103 && class228.field3857[var12][var13 + 1] == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class15.field311[var28] = var12;
                class69.field1155[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class228.field3857[var12][var13 + 1] = 4;
                class77.field1308[var12][var13 + 1] = var26;
            }
            if (var12 > 0 && var13 > 0 && class228.field3857[var12 - 1][var13 - 1] == 0 && (var17[var12 - 1][var13 - 1] & 0x2C010E) == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class15.field311[var28] = var12 - 1;
                class69.field1155[var28] = var13 - 1;
                class228.field3857[var12 - 1][var13 - 1] = 3;
                class77.field1308[var12 - 1][var13 - 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 < 103 && var13 > 0 && class228.field3857[var12 + 1][var13 - 1] == 0 && (var17[var12 + 1][var13 - 1] & 0x2C0183) == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class15.field311[var28] = var12 + 1;
                class69.field1155[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class228.field3857[var12 + 1][var13 - 1] = 9;
                class77.field1308[var12 + 1][var13 - 1] = var26;
            }
            if (var12 > 0 && var13 < 103 && class228.field3857[var12 - 1][var13 + 1] == 0 && (var17[var12 - 1][var13 + 1] & 0x2C0138) == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class15.field311[var28] = var12 - 1;
                class69.field1155[var28] = var13 + 1;
                class228.field3857[var12 - 1][var13 + 1] = 6;
                var28 = var28 + 1 & 0xFFF;
                class77.field1308[var12 - 1][var13 + 1] = var26;
            }
            if (var12 < 103 && var13 < 103 && class228.field3857[var12 + 1][var13 + 1] == 0 && (var17[var12 + 1][var13 + 1] & 0x2C01E0) == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class15.field311[var28] = var12 + 1;
                class69.field1155[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class228.field3857[var12 + 1][var13 + 1] = 12;
                class77.field1308[var12 + 1][var13 + 1] = var26;
            }
        }
        if (!var16) {
            if (!arg7) {
                return;
            }
            int var18 = 1000;
            int var19 = 100;
            byte var20 = 10;
            for (int var21 = arg10 - var20; var21 <= (arg10 + var20); var21++) {
                for (int var22 = arg2 - var20; var22 <= (arg2 + var20); var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class77.field1308[var21][var22] < 100) {
                        int var23 = 0;
                        int var24 = 0;
                        if (var21 < arg10) {
                            var23 = arg10 - var21;
                        } else if (arg6 + arg10 - 1 < var21) {
                            var23 = var21 + 1 - arg6 - arg10;
                        }
                        if (arg2 > var22) {
                            var24 = arg2 - var22;
                        } else if (var22 > arg2 + arg4 - 1) {
                            var24 = var22 + 1 - (arg2 - -arg4);
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var25 < var18 || var18 == var25 && var19 > class77.field1308[var21][var22]) {
                            var13 = var22;
                            var12 = var21;
                            var18 = var25;
                            var19 = class77.field1308[var21][var22];
                        }
                    }
                }
            }
            if (var18 == 1000) {
                return;
            }
            if (arg0 == var12 && arg1 == var13) {
                return;
            }
        }
        class163.field2661 = var13;
        class133.field2194 = var12;
        class130.field2149 = false;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ZLaj;)V")
    public static final void method889(boolean arg0, class151 arg1) {
        class174.field2792 = arg1;
        class238.field4013 = class174.field2792.method1132(16777215, 4);
        if (!arg0) {
            field1974++;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method890(int arg0) {
        field1969 = null;
        if (arg0 != 16828) {
            method889(false, (class151) null);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILaj;I)Lbj;")
    public static final class92 method891(int arg0, class151 arg1, int arg2) {
        field1978++;
        int var3 = -128 % ((arg2 - 7) / 33);
        return class313.method2118(arg1, (byte) -125, arg0) ? class136.method1010(-32) : null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
    public static final boolean method892(int arg0, int arg1, int arg2) {
        field1963++;
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg0 != 23419) {
            field1979 = -61;
        }
        class1 var3 = class110.method827(arg1, (byte) -126);
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method9(arg2, true);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLci;)V")
    public static final void method893(byte arg0, class83 arg1) {
        field1972++;
        class305 var2 = null;
        try {
            class191 var3 = arg1.method586("runescape", (byte) -89);
            while (var3.field3091 == 0) {
                class28.method182(1L, true);
            }
            if (var3.field3091 == 1) {
                var2 = (class305) var3.field3089;
                class249 var4 = class268.method1885(true);
                var2.method2069(var4.field4160, var4.field4182, 0, (byte) 41);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method2070((byte) 102);
            }
            if (arg0 != 7) {
                method892(-106, 57, -14);
            }
        } catch (Exception var5) {
        }
    }
}
