import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class108 extends class305 {

    @OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
    public int field1477 = -1;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
    public int field1470 = -1;

    @OriginalMember(owner = "client!hq", name = "z", descriptor = "Luf;")
    public static class310 field1474 = new class310(90, 6);

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public int field1467;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
    public int field1471;

    @OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
    public int field1472;

    @OriginalMember(owner = "client!hq", name = "y", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!hq", name = "A", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!hq", name = "D", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!hq", name = "E", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        ++field1475;
        class415 var5 = arg0.method539();
        if (arg2 != 24130) {
            return false;
        } else {
            var5.method340(super.field4184, super.field4178, super.field4185);
            class121 var6 = class75.field1097.method823(false, this.field1472).method1786(this.field1469, 0, false, -1, (class467) null, (class109) null, 131072, arg0, 0);
            if (var6 != null && var6.method777(arg1, arg3, var5, true)) {
                return true;
            } else {
                if (~this.field1477 != 0) {
                    class121 var7 = class75.field1097.method823(false, this.field1477).method1786(this.field1467, 0, false, -1, (class467) null, (class109) null, 131072, arg0, 0);
                    if (var7 != null && var7.method777(arg1, arg3, var5, true)) {
                        return true;
                    }
                }
                if (this.field1470 != -1) {
                    class121 var8 = class75.field1097.method823(false, this.field1470).method1786(this.field1471, 0, false, -1, (class467) null, (class109) null, 131072, arg0, 0);
                    if (var8 != null && var8.method777(arg1, arg3, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        int var3 = -85 / ((arg0 - -29) / 33);
        ++field1468;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field1473;
        class415 var3 = arg0.method539();
        var3.method340(super.field4184, super.field4178, super.field4185);
        class498 var4 = class227.method1338(0, 3);
        if (this.field1470 != -1) {
            class121 var5 = class75.field1097.method823(false, this.field1470).method1786(this.field1471, 0, false, -1, (class467) null, (class109) null, 2048, arg0, 0);
            if (var5 != null) {
                var5.method781(var3, var4.field7332[2], 0);
            }
        }
        if (~this.field1477 != 0) {
            class121 var6 = class75.field1097.method823(false, this.field1477).method1786(this.field1467, 0, false, -1, (class467) null, (class109) null, 2048, arg0, 0);
            if (var6 != null) {
                var6.method781(var3, var4.field7332[1], 0);
            }
        }
        class121 var7 = class75.field1097.method823(false, this.field1472).method1786(this.field1469, 0, false, -1, (class467) null, (class109) null, 2048, arg0, 0);
        if (arg1 != 16562) {
            method696(false);
        }
        if (var7 != null) {
            var7.method781(var3, var4.field7332[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([IZ[ILuo;[I)V")
    public static final void method694(int[] arg0, boolean arg1, int[] arg2, class405 arg3, int[] arg4) {
        for (int var5 = 0; arg0.length > var5; ++var5) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg4[var5];
            int var9 = 0;
            while (var7 != 0 && ~arg3.field330.length < ~var9) {
                if ((var7 & 1) != 0) {
                    if (var6 != -1) {
                        class467 var10 = class275.field3740.method1484(0, var6);
                        int var11 = var10.field6826;
                        class13 var12 = arg3.field330[var9];
                        if (var12 != null) {
                            if (~var12.field149 == ~var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field330[var9] = null;
                                } else if (~var11 != -2) {
                                    if (~var11 == -3) {
                                        var12.field156 = 0;
                                    }
                                } else {
                                    var12.field155 = 0;
                                    var12.field157 = 1;
                                    var12.field160 = 0;
                                    var12.field150 = var8;
                                    var12.field156 = 0;
                                    class284.method1624(arg3.field461, false, arg3.field466, var10, 0, 124, arg3.field464);
                                }
                            } else if (~var10.field6810 <= ~class275.field3740.method1484(0, var12.field149).field6810) {
                                var12 = arg3.field330[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class13 var13 = arg3.field330[var9] = new class13();
                            var13.field149 = var6;
                            var13.field155 = 0;
                            var13.field156 = 0;
                            var13.field157 = 1;
                            var13.field150 = var8;
                            var13.field160 = 0;
                            class284.method1624(arg3.field461, false, arg3.field466, var10, 0, -44, arg3.field464);
                        }
                    } else {
                        arg3.field330[var9] = null;
                    }
                }
                ++var9;
                var7 >>>= 1;
            }
        }
        if (arg1) {
            field1474 = null;
        }
        ++field1479;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILqa;)V")
    public static final void method695(int arg0, class162 arg1) {
        ++field1478;
        int var2 = class267.field3662;
        int var3 = class217.field3071;
        int var4 = class312.field4293;
        int var5 = class224.field3155 + -3;
        byte var6 = 20;
        if (class157.field2237 == null || class323.field4452 == null) {
            if (class192.field2735.method1412(class141.field2004, 1) && class192.field2735.method1412(class466.field6799, arg0)) {
                class157.field2237 = arg1.method482(class531.method3134(class192.field2735, class141.field2004, 0), true);
                class531 var7 = class531.method3134(class192.field2735, class466.field6799, 0);
                class323.field4452 = arg1.method482(var7, true);
                var7.method3121();
                class473.field6914 = arg1.method482(var7, true);
            } else {
                arg1.method459(var2, var3, var4, var6, class474.field6925 | -class362.field5019 + 255 << 24, 1);
            }
        }
        if (class157.field2237 != null && class323.field4452 != null) {
            int var8 = (var4 - 2 * class323.field4452.method125()) / class157.field2237.method125();
            for (int var9 = 0; ~var8 < ~var9; ++var9) {
                class157.field2237.method3111(var2 - (-class323.field4452.method125() - class157.field2237.method125() * var9), var3);
            }
            class323.field4452.method3111(var2, var3);
            class473.field6914.method3111(var4 + var2 + -class473.field6914.method125(), var3);
        }
        class34.field487.method2881(class56.field767.method590(class105.field1434, -22602), (byte) -120, class85.field1174 | -16777216, var2 + 3, -1, var3 + 14);
        arg1.method459(var2, var3 - -var6, var4, -var6 + var5, class474.field6925 | -class362.field5019 + 255 << 24, arg0);
        int var10 = class332.field4528.method54(103);
        int var11 = class332.field4528.method55((byte) -118);
        int var12 = 0;
        for (class149 var13 = (class149) class260.field3585.method3072((byte) 56); var13 != null; var13 = (class149) class260.field3585.method3066(2)) {
            int var30 = var3 + 13 - (-var6 - (class370.field5198 - 1 + -var12) * 16);
            ++var12;
            if (~var10 < ~var2 && var10 < var2 + var4 && var11 > var30 + -13 && var30 + 4 > var11 && var13.field2100) {
                arg1.method459(var2, var30 + -12, var4, 16, -class300.field4117 + 255 << 24 | class251.field3484, 1);
            }
        }
        if ((class482.field7076 == null || class472.field6901 == null || class461.field6703 == null) && class192.field2735.method1412(class131.field1801, 1) && class192.field2735.method1412(class337.field4651, 1) && class192.field2735.method1412(class241.field3330, 1)) {
            class531 var14 = class531.method3134(class192.field2735, class337.field4651, 0);
            class472.field6901 = arg1.method482(var14, true);
            var14.method3121();
            class125.field1724 = arg1.method482(var14, true);
            class482.field7076 = arg1.method482(class531.method3134(class192.field2735, class131.field1801, 0), true);
            class531 var15 = class531.method3134(class192.field2735, class241.field3330, 0);
            class461.field6703 = arg1.method482(var15, true);
            var15.method3121();
            class321.field4442 = arg1.method482(var15, true);
        }
        int var16 = 0;
        if (class482.field7076 != null && class472.field6901 != null && class461.field6703 != null) {
            int var17 = (var4 + -(2 * class461.field6703.method125())) / class482.field7076.method125();
            for (int var18 = 0; var17 > var18; ++var18) {
                class482.field7076.method3111(var2 - -class461.field6703.method125() - -(class482.field7076.method125() * var18), var3 + var5 + -class482.field7076.method129());
            }
            int var19 = (var5 - var6 + -class461.field6703.method129()) / class472.field6901.method129();
            for (int var20 = 0; var20 < var19; ++var20) {
                class472.field6901.method3111(var2, class472.field6901.method129() * var20 + var6 + var3);
                class125.field1724.method3111(-class125.field1724.method125() + var2 - -var4, var20 * class472.field6901.method129() + var3 + var6);
            }
            class461.field6703.method3111(var2, var3 - (-var5 + class461.field6703.method129()));
            class321.field4442.method3111(var4 + (var2 - class461.field6703.method125()), var3 + var5 - class461.field6703.method129());
        }
        for (class149 var21 = (class149) class260.field3585.method3072((byte) 40); var21 != null; var21 = (class149) class260.field3585.method3066(2)) {
            int var22 = (class370.field5198 + -1 + -var16) * 16 + (var3 - (-var6 - 13));
            int var23 = class85.field1174 | -16777216;
            if (~var2 > ~var10 && var2 - -var4 > var10 && ~var11 < ~(var22 + -13) && ~var11 > ~(var22 - -4) && var21.field2100) {
                var23 = class127.field1738 | -16777216;
            }
            int[] var24 = null;
            if (class230.method1346(var21.field2102, -83)) {
                var24 = class75.field1097.method823(false, (int) var21.field2105).field4381;
            } else if (var21.field2101 == -1) {
                if (class411.method2447((byte) 106, var21.field2102)) {
                    class405 var25 = class179.field2534[(int) var21.field2105];
                    if (var25 != null) {
                        class336 var26 = var25.field5623;
                        if (var26.field4612 != null) {
                            var26 = var26.method1860(class453.field6623, (byte) -27);
                        }
                        if (var26 != null) {
                            var24 = var26.field4603;
                        }
                    }
                } else if (class67.method418(var21.field2102, -127)) {
                    Object var27 = null;
                    class132 var28;
                    if (~var21.field2102 != -1004) {
                        var28 = class82.field1154.method2121((int) (var21.field2105 >>> 32 & 2147483647L), true);
                    } else {
                        var28 = class82.field1154.method2121((int) var21.field2105, true);
                    }
                    if (var28.field1814 != null) {
                        var28 = var28.method870(0, class453.field6623);
                    }
                    if (var28 != null) {
                        var24 = var28.field1888;
                    }
                }
            } else {
                var24 = class75.field1097.method823(false, var21.field2101).field4381;
            }
            String var29 = class224.method1327(var21, arg0 ^ 6644);
            if (var24 != null) {
                var29 = var29 + class334.method1851(var24, 0);
            }
            class34.field487.method2882(0, class119.field1615, var22, var29, -103, class272.field3713, var2 + 3, var23);
            if (var21.field2099) {
                class106.field1442.method3111(class105.field1430.method362(var29, (byte) 87) + (var2 - -5), var22 + -12);
            }
            ++var16;
        }
        class170.method1056(class312.field4293, class224.field3155, class217.field3071, class267.field3662, (byte) 49);
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(Z)V")
    public static void method696(boolean arg0) {
        if (!arg0) {
            field1474 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)I")
    public static final int method697(int arg0, boolean arg1) {
        ++field1476;
        if (!arg1) {
            field1474 = null;
        }
        int var2 = 0;
        if (~arg0 > -1 || ~arg0 <= -65537) {
            var2 += 16;
            arg0 >>>= 16;
        }
        if (~arg0 <= -257) {
            var2 += 8;
            arg0 >>>= 8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 4;
        }
        if (~arg0 <= -5) {
            var2 += 2;
            arg0 >>>= 2;
        }
        if (~arg0 <= -2) {
            arg0 >>>= 1;
            ++var2;
        }
        return arg0 + var2;
    }
}
