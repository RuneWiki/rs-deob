import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class128 extends class134 {

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "Ljava/lang/String;")
    public String field1979;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field1971 = -1;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1973 = "Drop";

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "[S")
    public static short[] field1982 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[[[B")
    public static byte[][][] field1972;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;II)I")
    public static final int method848(String arg0, int arg1, int arg2) {
        field1980++;
        if (arg2 != 2884088) {
            field1982 = null;
        }
        return class107.method694(arg0, true, 48, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII)V")
    public static final void method849(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1975++;
        if (arg5 != 19114) {
            field1973 = null;
        }
        for (int var6 = arg3; var6 <= arg1; var6++) {
            class71.method451(arg0, true, arg4, arg2, class130.field2005[var6]);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method850(String arg0, int arg1) {
        if (arg1 < 120) {
            return;
        }
        class275.field4552 = arg0;
        field1977++;
        if (class259.field4254.field4211 == null) {
            return;
        }
        try {
            String var2 = class259.field4254.field4211.getParameter("cookieprefix");
            String var3 = class259.field4254.field4211.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class152.method1005(class267.method1841((byte) 117) + 94608000000L, (byte) -56) + "; Max-Age=" + 94608000L;
            }
            class291.method2037((byte) -95, class259.field4254.field4211, "document.cookie=\"" + var5 + "\"");
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method851(int arg0) {
        field1972 = null;
        if (arg0 <= 24) {
            method854(true);
        }
        field1982 = null;
        field1973 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)V")
    public static final void method852(int arg0, byte arg1) {
        int var2 = 103 / ((arg1 + 7) / 39);
        field1976++;
        class235.field3728.method147(arg0, (byte) -116);
        class120.field1843.method147(arg0, (byte) -123);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIZIIIIIBI)V")
    public static final void method853(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10) {
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var28 = 0; var28 < 104; var28++) {
                class171.field2647[var11][var28] = 0;
                class304.field4963[var11][var28] = 99999999;
            }
        }
        field1978++;
        int var12 = arg10;
        class171.field2647[arg2][arg10] = 99;
        byte var13 = 0;
        int var14 = arg2;
        class304.field4963[arg2][arg10] = 0;
        int var15 = -13 / ((-arg9 - 2) / 61);
        int var16 = 0;
        class11.field140[var13] = arg2;
        int var29 = var13 + 1;
        class171.field2652[var13] = arg10;
        int[][] var17 = class183.field2841[class165.field2600].field2211;
        boolean var18 = false;
        while (var29 != var16) {
            var14 = class11.field140[var16];
            var12 = class171.field2652[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg4 == var14 && arg7 == var12) {
                var18 = true;
                break;
            }
            if (arg6 != 0) {
                if ((arg6 < 5 || arg6 == 10) && class183.field2841[class165.field2600].method960(arg6 - 1, arg8, 9270, arg7, 2, arg4, var12, var14)) {
                    var18 = true;
                    break;
                }
                if (arg6 < 10 && class183.field2841[class165.field2600].method962(arg7, var12, arg6 - 1, 2, arg8, (byte) -47, var14, arg4)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg5 != 0 && class183.field2841[class165.field2600].method958(arg4, 2, arg7, arg5, (byte) 105, var12, var14, arg1, arg0)) {
                var18 = true;
                break;
            }
            int var27 = class304.field4963[var14][var12] + 1;
            if (var14 > 0 && class171.field2647[var14 - 1][var12] == 0 && (var17[var14 - 1][var12] & 0x2C010E) == 0 && (var17[var14 - 1][var12 + 1] & 0x2C0138) == 0) {
                class11.field140[var29] = var14 - 1;
                class171.field2652[var29] = var12;
                class171.field2647[var14 - 1][var12] = 2;
                var29 = var29 + 1 & 0xFFF;
                class304.field4963[var14 - 1][var12] = var27;
            }
            if (var14 < 102 && class171.field2647[var14 + 1][var12] == 0 && (var17[var14 + 2][var12] & 0x2C0183) == 0 && (var17[var14 + 2][var12 + 1] & 0x2C01E0) == 0) {
                class11.field140[var29] = var14 + 1;
                class171.field2652[var29] = var12;
                var29 = var29 + 1 & 0xFFF;
                class171.field2647[var14 + 1][var12] = 8;
                class304.field4963[var14 + 1][var12] = var27;
            }
            if (var12 > 0 && class171.field2647[var14][var12 - 1] == 0 && (var17[var14][var12 - 1] & 0x2C010E) == 0 && (var17[var14 + 1][var12 - 1] & 0x2C0183) == 0) {
                class11.field140[var29] = var14;
                class171.field2652[var29] = var12 - 1;
                var29 = var29 + 1 & 0xFFF;
                class171.field2647[var14][var12 - 1] = 1;
                class304.field4963[var14][var12 - 1] = var27;
            }
            if (var12 < 102 && class171.field2647[var14][var12 + 1] == 0 && (var17[var14][var12 + 2] & 0x2C0138) == 0 && (var17[var14 + 1][var12 + 2] & 0x2C01E0) == 0) {
                class11.field140[var29] = var14;
                class171.field2652[var29] = var12 + 1;
                var29 = var29 + 1 & 0xFFF;
                class171.field2647[var14][var12 + 1] = 4;
                class304.field4963[var14][var12 + 1] = var27;
            }
            if (var14 > 0 && var12 > 0 && class171.field2647[var14 - 1][var12 - 1] == 0 && (var17[var14 - 1][var12] & 0x2C013E) == 0 && (var17[var14 - 1][var12 - 1] & 0x2C010E) == 0 && (var17[var14][var12 - 1] & 0x2C018F) == 0) {
                class11.field140[var29] = var14 - 1;
                class171.field2652[var29] = var12 - 1;
                var29 = var29 + 1 & 0xFFF;
                class171.field2647[var14 - 1][var12 - 1] = 3;
                class304.field4963[var14 - 1][var12 - 1] = var27;
            }
            if (var14 < 102 && var12 > 0 && class171.field2647[var14 + 1][var12 - 1] == 0 && (var17[var14 + 1][var12 - 1] & 0x2C018F) == 0 && (var17[var14 + 2][var12 - 1] & 0x2C0183) == 0 && (var17[var14 + 2][var12] & 0x2C01E3) == 0) {
                class11.field140[var29] = var14 + 1;
                class171.field2652[var29] = var12 - 1;
                class171.field2647[var14 + 1][var12 - 1] = 9;
                var29 = var29 + 1 & 0xFFF;
                class304.field4963[var14 + 1][var12 - 1] = var27;
            }
            if (var14 > 0 && var12 < 102 && class171.field2647[var14 - 1][var12 + 1] == 0 && (var17[var14 - 1][var12 + 1] & 0x2C013E) == 0 && (var17[var14 - 1][var12 + 2] & 0x2C0138) == 0 && (var17[var14][var12 + 2] & 0x2C01F8) == 0) {
                class11.field140[var29] = var14 - 1;
                class171.field2652[var29] = var12 + 1;
                var29 = var29 + 1 & 0xFFF;
                class171.field2647[var14 - 1][var12 + 1] = 6;
                class304.field4963[var14 - 1][var12 + 1] = var27;
            }
            if (var14 < 102 && var12 < 102 && class171.field2647[var14 + 1][var12 + 1] == 0 && (var17[var14 + 1][var12 + 2] & 0x2C01F8) == 0 && (var17[var14 + 2][var12 + 2] & 0x2C01E0) == 0 && (var17[var14 + 2][var12 + 1] & 0x2C01E3) == 0) {
                class11.field140[var29] = var14 + 1;
                class171.field2652[var29] = var12 + 1;
                class171.field2647[var14 + 1][var12 + 1] = 12;
                class304.field4963[var14 + 1][var12 + 1] = var27;
                var29 = var29 + 1 & 0xFFF;
            }
        }
        if (!var18) {
            if (!arg3) {
                return;
            }
            int var19 = 100;
            int var20 = 1000;
            byte var21 = 10;
            for (int var22 = arg4 - var21; var22 <= (arg4 + var21); var22++) {
                for (int var23 = arg7 - var21; var23 <= (arg7 + var21); var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class304.field4963[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (arg4 > var22) {
                            var24 = arg4 - var22;
                        } else if (var22 > (arg0 + arg4 - 1)) {
                            var24 = -arg4 - (-var22 - 1) - arg0;
                        }
                        if (var23 < arg7) {
                            var25 = arg7 - var23;
                        } else if ((arg5 + arg7 - 1) < var23) {
                            var25 = var23 + 1 - (arg5 + arg7);
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var20 || var20 == var26 && class304.field4963[var22][var23] < var19) {
                            var12 = var23;
                            var19 = class304.field4963[var22][var23];
                            var20 = var26;
                            var14 = var22;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg2 == var14 && arg10 == var12) {
                return;
            }
        }
        client.field2582 = false;
        class281.field4649 = var14;
        class271.field4443 = var12;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Z)Ljj;")
    public static final class110 method854(boolean arg0) {
        field1981++;
        class5 var1 = new class5(class196.field3118, class268.field4396, class239.field3781[0], class272.field4457[0], class184.field2854[0], class263.field4341[0], class56.field758[0], class12.field157);
        class270.method1856(-123);
        if (arg0) {
            field1971 = 99;
        }
        return var1;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V")
    public class128() {
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class128(String arg0) {
        this.field1979 = arg0;
    }
}
