import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class103 extends class137 {

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field1627;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lad;")
    public static class275 field1626 = new class275(16);

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public static int field1631 = 3353893;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZIIIIIIIIII)V")
    public static final void method736(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field1630++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var27 = 0; var27 < 104; var27++) {
                class28.field499[var11][var27] = 0;
                class101.field1582[var11][var27] = 99999999;
            }
        }
        int var12 = arg9;
        int var13 = arg1;
        byte var14 = 0;
        class28.field499[arg9][arg1] = 99;
        class101.field1582[arg9][arg1] = 0;
        class284.field4606[var14] = arg9;
        int var28 = var14 + 1;
        class246.field3879[var14] = arg1;
        boolean var15 = false;
        int var16 = 0;
        int[][] var17 = class310.field5021[class214.field3389].field811;
        while (var28 != var16) {
            var12 = class284.field4606[var16];
            var13 = class246.field3879[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg6 == var12 && arg5 == var13) {
                var15 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class310.field5021[class214.field3389].method352(arg10, var13, arg8 - 1, var12, arg5, 1, arg6, 1)) {
                    var15 = true;
                    break;
                }
                if (arg8 < 10 && class310.field5021[class214.field3389].method349(1, 32, var13, var12, arg5, arg6, arg8 - 1, arg10)) {
                    var15 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg4 != 0 && class310.field5021[class214.field3389].method357((byte) 126, arg6, var13, arg7, arg5, 1, arg4, var12, arg2)) {
                var15 = true;
                break;
            }
            int var26 = class101.field1582[var12][var13] + 1;
            if (var12 > 0 && class28.field499[var12 - 1][var13] == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0) {
                class284.field4606[var28] = var12 - 1;
                class246.field3879[var28] = var13;
                var28 = var28 + 1 & 0xFFF;
                class28.field499[var12 - 1][var13] = 2;
                class101.field1582[var12 - 1][var13] = var26;
            }
            if (var12 < 103 && class28.field499[var12 + 1][var13] == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0) {
                class284.field4606[var28] = var12 + 1;
                class246.field3879[var28] = var13;
                class28.field499[var12 + 1][var13] = 8;
                var28 = var28 + 1 & 0xFFF;
                class101.field1582[var12 + 1][var13] = var26;
            }
            if (var13 > 0 && class28.field499[var12][var13 - 1] == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class284.field4606[var28] = var12;
                class246.field3879[var28] = var13 - 1;
                class28.field499[var12][var13 - 1] = 1;
                class101.field1582[var12][var13 - 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var13 < 103 && class28.field499[var12][var13 + 1] == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class284.field4606[var28] = var12;
                class246.field3879[var28] = var13 + 1;
                class28.field499[var12][var13 + 1] = 4;
                class101.field1582[var12][var13 + 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var13 > 0 && class28.field499[var12 - 1][var13 - 1] == 0 && (var17[var12 - 1][var13 - 1] & 0x2C010E) == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class284.field4606[var28] = var12 - 1;
                class246.field3879[var28] = var13 - 1;
                var28 = var28 + 1 & 0xFFF;
                class28.field499[var12 - 1][var13 - 1] = 3;
                class101.field1582[var12 - 1][var13 - 1] = var26;
            }
            if (var12 < 103 && var13 > 0 && class28.field499[var12 + 1][var13 - 1] == 0 && (var17[var12 + 1][var13 - 1] & 0x2C0183) == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0 && (var17[var12][var13 - 1] & 0x2C0102) == 0) {
                class284.field4606[var28] = var12 + 1;
                class246.field3879[var28] = var13 - 1;
                class28.field499[var12 + 1][var13 - 1] = 9;
                class101.field1582[var12 + 1][var13 - 1] = var26;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var12 > 0 && var13 < 103 && class28.field499[var12 - 1][var13 + 1] == 0 && (var17[var12 - 1][var13 + 1] & 0x2C0138) == 0 && (var17[var12 - 1][var13] & 0x2C0108) == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class284.field4606[var28] = var12 - 1;
                class246.field3879[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class28.field499[var12 - 1][var13 + 1] = 6;
                class101.field1582[var12 - 1][var13 + 1] = var26;
            }
            if (var12 < 103 && var13 < 103 && class28.field499[var12 + 1][var13 + 1] == 0 && (var17[var12 + 1][var13 + 1] & 0x2C01E0) == 0 && (var17[var12 + 1][var13] & 0x2C0180) == 0 && (var17[var12][var13 + 1] & 0x2C0120) == 0) {
                class284.field4606[var28] = var12 + 1;
                class246.field3879[var28] = var13 + 1;
                var28 = var28 + 1 & 0xFFF;
                class28.field499[var12 + 1][var13 + 1] = 12;
                class101.field1582[var12 + 1][var13 + 1] = var26;
            }
        }
        if (!var15) {
            if (!arg0) {
                return;
            }
            int var18 = 1000;
            byte var19 = 10;
            int var20 = 100;
            for (int var21 = arg6 - var19; var21 <= (arg6 + var19); var21++) {
                for (int var22 = arg5 - var19; var22 <= (arg5 + var19); var22++) {
                    if (var21 >= 0 && var22 >= 0 && var21 < 104 && var22 < 104 && class101.field1582[var21][var22] < 100) {
                        int var23 = 0;
                        if (arg5 > var22) {
                            var23 = arg5 - var22;
                        } else if (var22 > (arg4 + arg5 - 1)) {
                            var23 = var22 + 1 - arg4 - arg5;
                        }
                        int var24 = 0;
                        if (var21 < arg6) {
                            var24 = arg6 - var21;
                        } else if ((arg6 - (1 - arg7)) < var21) {
                            var24 = 1 - (arg7 + arg6 - var21);
                        }
                        int var25 = var23 * var23 + var24 * var24;
                        if (var18 > var25 || var18 == var25 && var20 > class101.field1582[var21][var22]) {
                            var18 = var25;
                            var12 = var21;
                            var13 = var22;
                            var20 = class101.field1582[var21][var22];
                        }
                    }
                }
            }
            if (var18 == 1000) {
                return;
            }
            if (arg9 == var12 && arg1 == var13) {
                return;
            }
        }
        class46.field691 = false;
        class164.field2690 = var13;
        class35.field569 = var12;
        if (arg3 != 29) {
            method737((byte) -93);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method737(byte arg0) {
        field1626 = null;
        if (arg0 != 84) {
            field1626 = null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static final void method738(int arg0) {
        field1628++;
        if (class202.field3270 != null || class218.field3430 != null || class154.field2459 > 0) {
            return;
        }
        int var1 = class295.field4805;
        if (class41.field633) {
            if (var1 != 1) {
                int var2 = class287.field4640;
                int var3 = class55.field797;
                if (class128.field2059 - 10 > var2 || class159.field2596 + class128.field2059 + 10 < var2 || var3 < (class229.field3597 - 10) || (class229.field3597 + class120.field1904 + 10) < var3) {
                    class41.field633 = false;
                    class110.method773(true, class229.field3597, class128.field2059, class159.field2596, class120.field1904);
                }
            }
            if (var1 == 1) {
                int var4 = class128.field2059;
                int var5 = class229.field3597;
                int var6 = class159.field2596;
                int var7 = class16.field302;
                int var8 = -1;
                int var9 = class295.field4806;
                for (int var10 = 0; var10 < class291.field4776; var10++) {
                    if (class248.field3903) {
                        int var12 = (class291.field4776 - var10 - 1) * 15 + var5 + 33;
                        if (var4 < var9 && (var4 + var6) > var9 && var7 > var12 - 13 && (var12 + 3) > var7) {
                            var8 = var10;
                        }
                    } else {
                        int var11 = (class291.field4776 - var10 - 1) * 15 + var5 + 31;
                        if (var4 < var9 && var9 < (var4 + var6) && var7 > var11 - 13 && var11 + 3 > var7) {
                            var8 = var10;
                        }
                    }
                }
                if (var8 != -1) {
                    class92.method642((byte) -121, var8);
                }
                class41.field633 = false;
                class110.method773(true, class229.field3597, class128.field2059, class159.field2596, class120.field1904);
            }
        } else {
            if (var1 == 1 && class291.field4776 > 0) {
                short var13 = class26.field478[class291.field4776 - 1];
                if (var13 == 32 || var13 == 29 || var13 == 1 || var13 == 17 || var13 == 2 || var13 == 40 || var13 == 41 || var13 == 18 || var13 == 57 || var13 == 6 || var13 == 10 || var13 == 1010) {
                    int var14 = class242.field3840[class291.field4776 - 1];
                    int var15 = class144.field2320[class291.field4776 - 1];
                    class248 var16 = class281.method1913(var15, (byte) -69);
                    class22 var17 = client.method1126(var16);
                    if (var17.method174((byte) 123) || var17.method178(arg0 ^ 0xFFFFD948)) {
                        class17.field310 = false;
                        class266.field4321 = 0;
                        if (class202.field3270 != null) {
                            class111.method776(class202.field3270, (byte) 25);
                        }
                        class202.field3270 = class281.method1913(var15, (byte) 45);
                        class57.field828 = class295.field4806;
                        class156.field2494 = class16.field302;
                        class34.field557 = var14;
                        class111.method776(class202.field3270, (byte) 25);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class298.field4867 == 1 && class291.field4776 > 2 || class206.method1424((byte) 74, class291.field4776 - 1))) {
                var1 = 2;
            }
            if (var1 == 2 && class291.field4776 > 0 || class269.field4346 == 1) {
                class118.method809(true);
            }
            if (var1 == 1 && class291.field4776 > 0 || class269.field4346 == 2) {
                class110.method770(false);
            }
        }
        if (arg0 != -11661) {
            method738(73);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
    public class103(int arg0, int arg1) {
        this.field1629 = arg1;
        this.field1627 = arg0;
    }
}
