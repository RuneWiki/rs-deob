import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class290 {

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public int field4922 = -1;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field4911 = 0;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lbe;")
    private static class283 field4913 = class153.method941(125, "World");

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lbe;")
    private static class283 field4921 = class153.method941(-17, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field4917 = 2;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lbe;")
    public static class283 field4909 = field4913;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lbe;")
    public static class283 field4920 = class153.method941(-126, "Stufe)2");

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Lbe;")
    public static class283 field4923 = field4921;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public int field4908;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1978(int arg0, int arg1) {
        field4912++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 != -101) {
                method1979(-72);
            }
            return class256.method1734(false, arg1);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 27)
    public static void method1979(int arg0) {
        int var1 = -10 / ((arg0 - 20) / 63);
        field4923 = null;
        field4920 = null;
        field4909 = null;
        field4913 = null;
        field4921 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIIIIIZII)Z", line = 42)
    public static final boolean method1980(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11) {
        field4926++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class36.field528[var12][var13] = 0;
                class202.field3446[var12][var13] = 99999999;
            }
        }
        class36.field528[arg0][arg1] = 99;
        int var14 = arg0;
        int var15 = arg1;
        class202.field3446[arg0][arg1] = 0;
        int var16 = 0;
        byte var17 = 0;
        class126.field2082[var17] = arg0;
        boolean var18 = false;
        int var32 = var17 + 1;
        class298.field5046[var17] = arg1;
        int[][] var19 = class180.field3102[class61.field850].field1765;
        while (var16 != var32) {
            var14 = class126.field2082[var16];
            var15 = class298.field5046[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg11 == var14 && arg8 == var15) {
                var18 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && class180.field3102[class61.field850].method699(var14, arg5 - 1, (byte) 25, arg11, var15, arg3, 2, arg8)) {
                    var18 = true;
                    break;
                }
                if (arg5 < 10 && class180.field3102[class61.field850].method687(arg5 - 1, 2, var15, var14, arg11, 1, arg3, arg8)) {
                    var18 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg10 != 0 && class180.field3102[class61.field850].method681(arg8, arg4, (byte) -121, arg10, arg11, arg6, var14, 2, var15)) {
                var18 = true;
                break;
            }
            int var20 = class202.field3446[var14][var15] + 1;
            if (var14 > 0 && class36.field528[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class126.field2082[var32] = var14 - 1;
                class298.field5046[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var14 - 1][var15] = 2;
                class202.field3446[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class36.field528[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class126.field2082[var32] = var14 + 1;
                class298.field5046[var32] = var15;
                class36.field528[var14 + 1][var15] = 8;
                var32 = var32 + 1 & 0xFFF;
                class202.field3446[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class36.field528[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class126.field2082[var32] = var14;
                class298.field5046[var32] = var15 - 1;
                class36.field528[var14][var15 - 1] = 1;
                class202.field3446[var14][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 < 102 && class36.field528[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class126.field2082[var32] = var14;
                class298.field5046[var32] = var15 + 1;
                class36.field528[var14][var15 + 1] = 4;
                var32 = var32 + 1 & 0xFFF;
                class202.field3446[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class36.field528[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class126.field2082[var32] = var14 - 1;
                class298.field5046[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var14 - 1][var15 - 1] = 3;
                class202.field3446[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class36.field528[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class126.field2082[var32] = var14 + 1;
                class298.field5046[var32] = var15 - 1;
                class36.field528[var14 + 1][var15 - 1] = 9;
                class202.field3446[var14 + 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 < 102 && class36.field528[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class126.field2082[var32] = var14 - 1;
                class298.field5046[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var14 - 1][var15 + 1] = 6;
                class202.field3446[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class36.field528[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class126.field2082[var32] = var14 + 1;
                class298.field5046[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class36.field528[var14 + 1][var15 + 1] = 12;
                class202.field3446[var14 + 1][var15 + 1] = var20;
            }
        }
        class216.field3658 = 0;
        if (!var18) {
            if (!arg9) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg11 - var23; var24 <= arg11 + var23; var24++) {
                for (int var25 = arg8 - var23; var25 <= (arg8 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class202.field3446[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg11 > var24) {
                            var26 = arg11 - var24;
                        } else if (var24 > (arg11 + arg6 - 1)) {
                            var26 = var24 - (arg6 + arg11 - 1);
                        }
                        int var27 = 0;
                        if (arg8 > var25) {
                            var27 = arg8 - var25;
                        } else if ((arg10 + arg8 - 1) < var25) {
                            var27 = var25 + 1 - arg8 - arg10;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class202.field3446[var24][var25] < var22) {
                            var15 = var25;
                            var21 = var28;
                            var22 = class202.field3446[var24][var25];
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg0 == var14 && arg1 == var15) {
                return false;
            }
            class216.field3658 = 1;
        }
        byte var29 = 0;
        class126.field2082[var29] = var14;
        int var33 = var29 + 1;
        class298.field5046[var29] = var15;
        int var30;
        int var31 = var30 = class36.field528[var14][var15];
        if (arg2 > -22) {
            method1978(-63, 45);
        }
        while (arg0 != var14 || arg1 != var15) {
            if (var30 != var31) {
                class126.field2082[var33] = var14;
                var30 = var31;
                class298.field5046[var33++] = var15;
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
            var31 = class36.field528[var14][var15];
        }
        if (var33 > 0) {
            class203.method1297(var33, (byte) -62, arg7);
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V", line = 465)
    public static final void method1981(int arg0) {
        for (class159 var1 = (class159) class58.field805.method1607(0); var1 != null; var1 = (class159) class58.field805.method1604((byte) 126)) {
            int var2 = var1.field2600;
            if (class92.method588(var2, -51)) {
                boolean var3 = true;
                class69[] var4 = class122.field2036[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1121;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field1445;
                    class69 var7 = class65.method418(-8429, var6);
                    if (var7 != null) {
                        class272.method1834(var7, 0);
                    }
                }
            }
        }
        int var8 = -45 % ((-arg0 - 51) / 61);
        field4918++;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(II)I", line = 518)
    public static final int method1982(int arg0, int arg1) {
        field4924++;
        return arg1 == 127 ? arg0 & 0x7F : 107;
    }
}
