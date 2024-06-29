import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class213 {

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lsf;")
    public static class108 field3795 = class140.method973(255, ")1a2)1m");

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lcf;")
    public static class131 field3793;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lpi;")
    public static class314 field3789;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILik;Lik;ZLf;)V", line = 8)
    public static final void method1468(int arg0, class262 arg1, class262 arg2, boolean arg3, class250 arg4) {
        class149.field2709 = arg1;
        field3794++;
        class83.field1299 = arg3;
        class269.field4722 = arg2;
        int var5 = class149.field2709.method1879(0) - 1;
        class197.field3553 = arg0 * var5 + class149.field2709.method1876(var5, (byte) -124);
        class330.field5631 = arg4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BLsf;)Lsf;", line = 24)
    private static final class108 method1469(byte arg0, class108 arg1) {
        if (arg0 != -9) {
            field3793 = (class131) null;
        }
        field3792++;
        int var2 = class163.method1126(arg1, arg0 ^ 0xFFFFA869);
        return var2 == -1 ? class145.field2576 : class42.field559.field5064[var2].method763(class9.field103, class240.field4195, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILcb;)V", line = 52)
    public static final void method1470(int arg0, int arg1, class286 arg2) {
        field3791++;
        Object[] var3 = arg2.field4993;
        int var4 = (Integer) var3[0];
        class79 var5 = class162.method1122((byte) -81, var4);
        if (var5 == null) {
            return;
        }
        class122.field2087 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int[] var9 = var5.field1208;
        int[] var10 = var5.field1207;
        if (arg1 != -26586) {
            field3789 = (class314) null;
        }
        byte var11 = -1;
        try {
            class202.field3648 = new int[var5.field1204];
            class207.field3712 = new class108[var5.field1211];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field4994;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field4996;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field5006 == null ? -1 : arg2.field5006.field1649;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field5005;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field5006 == null ? -1 : arg2.field5006.field1583;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field4999 == null ? -1 : arg2.field4999.field1649;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field4999 == null ? -1 : arg2.field4999.field1583;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field5002;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field5008;
                    }
                    class202.field3648[var12++] = var15;
                } else if (var3[var14] instanceof class108) {
                    class108 var16 = (class108) var3[var14];
                    if (var16.method779(class307.field5341, arg1 ^ 0xFFFF9851)) {
                        var16 = arg2.field4991;
                    }
                    class207.field3712[var13++] = var16;
                }
            }
            int var17 = 0;
            label4171: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var505 = var9[var8];
                if (var505 < 100) {
                    if (var505 == 0) {
                        class253.field4418[var6++] = var10[var8];
                        continue;
                    }
                    if (var505 == 1) {
                        int var18 = var10[var8];
                        class253.field4418[var6++] = class261.field4594[var18];
                        continue;
                    }
                    if (var505 == 2) {
                        int var19 = var10[var8];
                        var6--;
                        class93.method633(var19, class253.field4418[var6], (byte) -97);
                        continue;
                    }
                    if (var505 == 3) {
                        class55.field808[var7++] = var5.field1200[var8];
                        continue;
                    }
                    if (var505 == 6) {
                        var8 += var10[var8];
                        continue;
                    }
                    if (var505 == 7) {
                        var6 -= 2;
                        if (class253.field4418[var6 + 1] != class253.field4418[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var505 == 8) {
                        var6 -= 2;
                        if (class253.field4418[var6 + 1] == class253.field4418[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var505 == 9) {
                        var6 -= 2;
                        if (class253.field4418[var6] < class253.field4418[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var505 == 10) {
                        var6 -= 2;
                        if (class253.field4418[var6] > class253.field4418[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var505 == 21) {
                        if (class122.field2087 == 0) {
                            return;
                        }
                        class201 var20 = class303.field5256[--class122.field2087];
                        class207.field3712 = var20.field3635;
                        var5 = var20.field3636;
                        class202.field3648 = var20.field3637;
                        var9 = var5.field1208;
                        var10 = var5.field1207;
                        var8 = var20.field3634;
                        continue;
                    }
                    if (var505 == 25) {
                        int var21 = var10[var8];
                        class253.field4418[var6++] = class304.method2135(var21, 427495308);
                        continue;
                    }
                    if (var505 == 27) {
                        int var22 = var10[var8];
                        var6--;
                        class229.method1533(class253.field4418[var6], var22, 111);
                        continue;
                    }
                    if (var505 == 31) {
                        var6 -= 2;
                        if (class253.field4418[var6] <= class253.field4418[var6 + 1]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var505 == 32) {
                        var6 -= 2;
                        if (class253.field4418[var6 + 1] <= class253.field4418[var6]) {
                            var8 += var10[var8];
                        }
                        continue;
                    }
                    if (var505 == 33) {
                        class253.field4418[var6++] = class202.field3648[var10[var8]];
                        continue;
                    }
                    int var10001;
                    if (var505 == 34) {
                        var10001 = var10[var8];
                        var6--;
                        class202.field3648[var10001] = class253.field4418[var6];
                        continue;
                    }
                    if (var505 == 35) {
                        class55.field808[var7++] = class207.field3712[var10[var8]];
                        continue;
                    }
                    if (var505 == 36) {
                        var10001 = var10[var8];
                        var7--;
                        class207.field3712[var10001] = class55.field808[var7];
                        continue;
                    }
                    if (var505 == 37) {
                        int var23 = var10[var8];
                        var7 -= var23;
                        class108 var24 = class1.method4(var7, var23, class55.field808, (byte) 118);
                        class55.field808[var7++] = var24;
                        continue;
                    }
                    if (var505 == 38) {
                        var6--;
                        continue;
                    }
                    if (var505 == 39) {
                        var7--;
                        continue;
                    }
                    if (var505 == 40) {
                        int var25 = var10[var8];
                        class79 var26 = class162.method1122((byte) 90, var25);
                        int[] var27 = new int[var26.field1204];
                        class108[] var28 = new class108[var26.field1211];
                        for (int var29 = 0; var29 < var26.field1206; var29++) {
                            var27[var29] = class253.field4418[var6 + var29 - var26.field1206];
                        }
                        for (int var30 = 0; var30 < var26.field1196; var30++) {
                            var28[var30] = class55.field808[var7 + var30 - var26.field1196];
                        }
                        var7 -= var26.field1196;
                        var6 -= var26.field1206;
                        class201 var31 = new class201();
                        var31.field3637 = class202.field3648;
                        var31.field3634 = var8;
                        var31.field3636 = var5;
                        var31.field3635 = class207.field3712;
                        if (class303.field5256.length <= class122.field2087) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        var8 = -1;
                        class303.field5256[class122.field2087++] = var31;
                        var9 = var26.field1208;
                        class207.field3712 = var28;
                        class202.field3648 = var27;
                        var10 = var26.field1207;
                        continue;
                    }
                    if (var505 == 42) {
                        class253.field4418[var6++] = class151.field2740[var10[var8]];
                        continue;
                    }
                    if (var505 == 43) {
                        int var32 = var10[var8];
                        var6--;
                        class151.field2740[var32] = class253.field4418[var6];
                        class184.method1324(var32, 0);
                        continue;
                    }
                    if (var505 == 44) {
                        int var33 = var10[var8] >> 16;
                        int var34 = var10[var8] & 0xFFFF;
                        var6--;
                        int var35 = class253.field4418[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            class227.field3984[var33] = var35;
                            int var37 = 0;
                            while (true) {
                                if (var37 >= var35) {
                                    continue label4171;
                                }
                                class177.field3227[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 45) {
                        int var38 = var10[var8];
                        var6--;
                        int var39 = class253.field4418[var6];
                        if (var39 >= 0 && class227.field3984[var38] > var39) {
                            class253.field4418[var6++] = class177.field3227[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 46) {
                        int var40 = var10[var8];
                        var6 -= 2;
                        int var41 = class253.field4418[var6];
                        if (var41 >= 0 && class227.field3984[var40] > var41) {
                            class177.field3227[var40][var41] = class253.field4418[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var505 == 47) {
                        class108 var42 = class283.field4958[var10[var8]];
                        if (var42 == null) {
                            var42 = class324.field5524;
                        }
                        class55.field808[var7++] = var42;
                        continue;
                    }
                    if (var505 == 48) {
                        int var43 = var10[var8];
                        var7--;
                        class283.field4958[var43] = class55.field808[var7];
                        class42.method279(var43, -12514);
                        continue;
                    }
                    if (var505 == 51) {
                        class242 var44 = var5.field1209[var10[var8]];
                        var6--;
                        class236 var45 = (class236) var44.method1676((long) class253.field4418[var6], (byte) -65);
                        if (var45 != null) {
                            var8 += var45.field4144;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var505 < 300) {
                    if (var505 == 100) {
                        var6 -= 3;
                        int var484 = class253.field4418[var6];
                        int var485 = class253.field4418[var6 + 1];
                        int var486 = class253.field4418[var6 + 2];
                        if (var485 == 0) {
                            throw new RuntimeException();
                        }
                        class98 var487 = class168.method1173(var484, arg1 - 1456921462);
                        if (var487.field1636 == null) {
                            var487.field1636 = new class98[var486 + 1];
                        }
                        if (var486 >= var487.field1636.length) {
                            class98[] var488 = new class98[var486 + 1];
                            for (int var489 = 0; var489 < var487.field1636.length; var489++) {
                                var488[var489] = var487.field1636[var489];
                            }
                            var487.field1636 = var488;
                        }
                        if (var486 > 0 && var487.field1636[var486 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var486 - 1));
                        }
                        class98 var490 = new class98();
                        var490.field1583 = var486;
                        var490.field1611 = var490.field1649 = var487.field1649;
                        var490.field1677 = var485;
                        var490.field1640 = true;
                        var487.field1636[var486] = var490;
                        if (var46) {
                            class242.field4219 = var490;
                        } else {
                            class296.field5162 = var490;
                        }
                        class195.method1388(-82, var487);
                        continue;
                    }
                    if (var505 == 101) {
                        class98 var491 = var46 ? class242.field4219 : class296.field5162;
                        if (var491.field1583 == -1) {
                            if (!var46) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class98 var492 = class168.method1173(var491.field1649, -1456948048);
                        var492.field1636[var491.field1583] = null;
                        class195.method1388(-82, var492);
                        continue;
                    }
                    if (var505 == 102) {
                        var6--;
                        class98 var493 = class168.method1173(class253.field4418[var6], -1456948048);
                        var493.field1636 = null;
                        class195.method1388(-82, var493);
                        continue;
                    }
                    if (var505 == 200) {
                        var6 -= 2;
                        int var494 = class253.field4418[var6];
                        int var495 = class253.field4418[var6 + 1];
                        class98 var496 = class45.method324(var495, var494, (byte) 77);
                        if (var496 != null && var495 != -1) {
                            class253.field4418[var6++] = 1;
                            if (var46) {
                                class242.field4219 = var496;
                            } else {
                                class296.field5162 = var496;
                            }
                            continue;
                        }
                        class253.field4418[var6++] = 0;
                        continue;
                    }
                    if (var505 == 201) {
                        var6--;
                        int var497 = class253.field4418[var6];
                        class98 var498 = class168.method1173(var497, -1456948048);
                        if (var498 == null) {
                            class253.field4418[var6++] = 0;
                        } else {
                            class253.field4418[var6++] = 1;
                            if (var46) {
                                class242.field4219 = var498;
                            } else {
                                class296.field5162 = var498;
                            }
                        }
                        continue;
                    }
                } else if (var505 < 500) {
                    if (var505 == 403) {
                        var6 -= 2;
                        int var479 = class253.field4418[var6];
                        if (var479 >= 7) {
                            var479 -= 7;
                        }
                        int var480 = class253.field4418[var6 + 1];
                        class95.field1513.field721.method1667(var479, 27183, var480);
                        continue;
                    }
                    if (var505 == 404) {
                        var6 -= 2;
                        int var481 = class253.field4418[var6];
                        int var482 = class253.field4418[var6 + 1];
                        class95.field1513.field721.method1665((byte) 71, var481, var482);
                        continue;
                    }
                    if (var505 == 410) {
                        var6--;
                        boolean var483 = class253.field4418[var6] != 0;
                        class95.field1513.field721.method1662(305419896, var483);
                        continue;
                    }
                } else if (!(var505 < 1000 || var505 >= 1100) || !(var505 < 2000 || var505 >= 2100)) {
                    class98 var473;
                    if (var505 < 2000) {
                        var473 = var46 ? class242.field4219 : class296.field5162;
                    } else {
                        var6--;
                        var473 = class168.method1173(class253.field4418[var6], -1456948048);
                        var505 -= 1000;
                    }
                    if (var505 == 1000) {
                        var6 -= 4;
                        var473.field1727 = class253.field4418[var6];
                        var473.field1710 = class253.field4418[var6 + 1];
                        int var474 = class253.field4418[var6 + 2];
                        int var475 = class253.field4418[var6 + 3];
                        if (var474 < 0) {
                            var474 = 0;
                        } else if (var474 > 5) {
                            var474 = 5;
                        }
                        if (var475 < 0) {
                            var475 = 0;
                        } else if (var475 > 5) {
                            var475 = 5;
                        }
                        var473.field1651 = (byte) var475;
                        var473.field1563 = (byte) var474;
                        class195.method1388(-82, var473);
                        class5.method35(4096, var473);
                        if (var473.field1583 == -1) {
                            class271.method1955((byte) 61, var473.field1649);
                        }
                        continue;
                    }
                    if (var505 == 1001) {
                        var6 -= 4;
                        var473.field1733 = class253.field4418[var6];
                        var473.field1648 = class253.field4418[var6 + 1];
                        var473.field1609 = 0;
                        var473.field1722 = 0;
                        int var476 = class253.field4418[var6 + 3];
                        int var477 = class253.field4418[var6 + 2];
                        if (var477 < 0) {
                            var477 = 0;
                        } else if (var477 > 4) {
                            var477 = 4;
                        }
                        var473.field1567 = (byte) var477;
                        if (var476 < 0) {
                            var476 = 0;
                        } else if (var476 > 4) {
                            var476 = 4;
                        }
                        var473.field1621 = (byte) var476;
                        class195.method1388(arg1 ^ 0x6788, var473);
                        class5.method35(arg1 ^ 0xFFFF8826, var473);
                        if (var473.field1677 == 0) {
                            class146.method1020((byte) -120, var473, false);
                        }
                        continue;
                    }
                    if (var505 == 1003) {
                        var6--;
                        boolean var478 = class253.field4418[var6] == 1;
                        if (var478 != var473.field1595) {
                            var473.field1595 = var478;
                            class195.method1388(-82, var473);
                        }
                        if (var473.field1583 == -1) {
                            class262.method1874(var473.field1649, -16093);
                        }
                        continue;
                    }
                    if (var505 == 1004) {
                        var6 -= 2;
                        var473.field1717 = class253.field4418[var6];
                        var473.field1715 = class253.field4418[var6 + 1];
                        class195.method1388(arg1 ^ 0x6788, var473);
                        class5.method35(4096, var473);
                        if (var473.field1677 == 0) {
                            class146.method1020((byte) -120, var473, false);
                        }
                        continue;
                    }
                } else if (var505 >= 1100 && var505 < 1200 || var505 >= 2100 && var505 < 2200) {
                    class98 var47;
                    if (var505 >= 2000) {
                        var6--;
                        var47 = class168.method1173(class253.field4418[var6], -1456948048);
                        var505 -= 1000;
                    } else {
                        var47 = var46 ? class242.field4219 : class296.field5162;
                    }
                    if (var505 == 1100) {
                        var6 -= 2;
                        var47.field1597 = class253.field4418[var6];
                        if ((var47.field1691 - var47.field1673) < var47.field1597) {
                            var47.field1597 = var47.field1691 - var47.field1673;
                        }
                        if (var47.field1597 < 0) {
                            var47.field1597 = 0;
                        }
                        var47.field1701 = class253.field4418[var6 + 1];
                        if (var47.field1703 - var47.field1688 < var47.field1701) {
                            var47.field1701 = var47.field1703 - var47.field1688;
                        }
                        if (var47.field1701 < 0) {
                            var47.field1701 = 0;
                        }
                        class195.method1388(-82, var47);
                        if (var47.field1583 == -1) {
                            class327.method2230(12, var47.field1649);
                        }
                        continue;
                    }
                    if (var505 == 1101) {
                        var6--;
                        var47.field1573 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        if (var47.field1583 == -1) {
                            class45.method322(var47.field1649, (byte) 34);
                        }
                        continue;
                    }
                    if (var505 == 1102) {
                        var6--;
                        var47.field1610 = class253.field4418[var6] == 1;
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1103) {
                        var6--;
                        var47.field1655 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1104) {
                        var6--;
                        var47.field1608 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1105) {
                        var6--;
                        var47.field1566 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1106) {
                        var6--;
                        var47.field1586 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1107) {
                        var6--;
                        var47.field1705 = class253.field4418[var6] == 1;
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1108) {
                        var47.field1577 = 1;
                        var6--;
                        var47.field1664 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        if (var47.field1583 == -1) {
                            class101.method704(var47.field1649, true);
                        }
                        continue;
                    }
                    if (var505 == 1109) {
                        var6 -= 6;
                        var47.field1666 = class253.field4418[var6];
                        var47.field1711 = class253.field4418[var6 + 1];
                        var47.field1672 = class253.field4418[var6 + 2];
                        var47.field1708 = class253.field4418[var6 + 3];
                        var47.field1646 = class253.field4418[var6 + 4];
                        var47.field1712 = class253.field4418[var6 + 5];
                        class195.method1388(-82, var47);
                        if (var47.field1583 == -1) {
                            class21.method142(-16313, var47.field1649);
                            class61.method425(var47.field1649, arg1 ^ 0xFFFF982C);
                        }
                        continue;
                    }
                    if (var505 == 1110) {
                        var6--;
                        int var48 = class253.field4418[var6];
                        if (var47.field1580 != var48) {
                            var47.field1675 = 0;
                            var47.field1580 = var48;
                            var47.field1713 = 0;
                            class195.method1388(-82, var47);
                        }
                        if (var47.field1583 == -1) {
                            class10.method56(arg1 ^ 0xFFFF9823, var47.field1649);
                        }
                        continue;
                    }
                    if (var505 == 1111) {
                        var6--;
                        var47.field1602 = class253.field4418[var6] == 1;
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1112) {
                        var7--;
                        class108 var49 = class55.field808[var7];
                        if (!var49.method779(var47.field1604, 118)) {
                            var47.field1604 = var49;
                            class195.method1388(-82, var47);
                        }
                        if (var47.field1583 == -1) {
                            class157.method1096((byte) -62, var47.field1649);
                        }
                        continue;
                    }
                    if (var505 == 1113) {
                        var6--;
                        var47.field1625 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1114) {
                        var6 -= 3;
                        var47.field1568 = class253.field4418[var6];
                        var47.field1592 = class253.field4418[var6 + 1];
                        var47.field1599 = class253.field4418[var6 + 2];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1115) {
                        var6--;
                        var47.field1663 = class253.field4418[var6] == 1;
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1116) {
                        var6--;
                        var47.field1700 = class253.field4418[var6];
                        class195.method1388(arg1 + 26504, var47);
                        continue;
                    }
                    if (var505 == 1117) {
                        var6--;
                        var47.field1687 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1118) {
                        var6--;
                        var47.field1685 = class253.field4418[var6] == 1;
                        class195.method1388(arg1 ^ 0x6788, var47);
                        continue;
                    }
                    if (var505 == 1119) {
                        var6--;
                        var47.field1714 = class253.field4418[var6] == 1;
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1120) {
                        var6 -= 2;
                        var47.field1691 = class253.field4418[var6];
                        var47.field1703 = class253.field4418[var6 + 1];
                        class195.method1388(-82, var47);
                        if (var47.field1677 == 0) {
                            class146.method1020((byte) -120, var47, false);
                        }
                        continue;
                    }
                    if (var505 == 1121) {
                        var6 -= 2;
                        var47.field1601 = (short) class253.field4418[var6];
                        var47.field1589 = (short) class253.field4418[var6 + 1];
                        class195.method1388(arg1 + 26504, var47);
                        continue;
                    }
                    if (var505 == 1122) {
                        var6--;
                        var47.field1565 = class253.field4418[var6] == 1;
                        class195.method1388(-82, var47);
                        continue;
                    }
                    if (var505 == 1123) {
                        var6--;
                        var47.field1712 = class253.field4418[var6];
                        class195.method1388(-82, var47);
                        if (var47.field1583 == -1) {
                            class21.method142(-16313, var47.field1649);
                        }
                        continue;
                    }
                } else if (var505 >= 1200 && var505 < 1300 || var505 >= 2200 && var505 < 2300) {
                    class98 var469;
                    if (var505 < 2000) {
                        var469 = var46 ? class242.field4219 : class296.field5162;
                    } else {
                        var6--;
                        var469 = class168.method1173(class253.field4418[var6], -1456948048);
                        var505 -= 1000;
                    }
                    class195.method1388(-82, var469);
                    if (var505 == 1200 || var505 == 1205) {
                        var6 -= 2;
                        int var470 = class253.field4418[var6];
                        int var471 = class253.field4418[var6 + 1];
                        if (var469.field1583 == -1) {
                            class100.method697(var469.field1649, (byte) 125);
                            class21.method142(arg1 ^ 0x5861, var469.field1649);
                            class61.method425(var469.field1649, 10);
                        }
                        if (var470 == -1) {
                            var469.field1577 = 1;
                            var469.field1614 = -1;
                            var469.field1664 = -1;
                        } else {
                            var469.field1682 = var471;
                            var469.field1614 = var470;
                            class145 var472 = class144.method994(true, var470);
                            if (var505 == 1205) {
                                var469.field1734 = false;
                            } else {
                                var469.field1734 = true;
                            }
                            var469.field1646 = var472.field2593;
                            var469.field1672 = var472.field2582;
                            var469.field1708 = var472.field2579;
                            var469.field1666 = var472.field2588;
                            var469.field1711 = var472.field2577;
                            var469.field1712 = var472.field2572;
                            if (var469.field1609 > 0) {
                                var469.field1712 = var469.field1712 * 32 / var469.field1609;
                            } else if (var469.field1733 > 0) {
                                var469.field1712 = var469.field1712 * 32 / var469.field1733;
                            }
                        }
                        continue;
                    }
                    if (var505 == 1201) {
                        var469.field1577 = 2;
                        var6--;
                        var469.field1664 = class253.field4418[var6];
                        if (var469.field1583 == -1) {
                            class101.method704(var469.field1649, true);
                        }
                        continue;
                    }
                    if (var505 == 1202) {
                        var469.field1577 = 3;
                        var469.field1664 = class95.field1513.field721.method1660(121);
                        if (var469.field1583 == -1) {
                            class101.method704(var469.field1649, true);
                        }
                        continue;
                    }
                    if (var505 == 1203) {
                        var469.field1577 = 6;
                        var6--;
                        var469.field1664 = class253.field4418[var6];
                        if (var469.field1583 == -1) {
                            class101.method704(var469.field1649, true);
                        }
                        continue;
                    }
                    if (var505 == 1204) {
                        var469.field1577 = 5;
                        var6--;
                        var469.field1664 = class253.field4418[var6];
                        if (var469.field1583 == -1) {
                            class101.method704(var469.field1649, true);
                        }
                        continue;
                    }
                } else if ((var505 < 1300 || var505 >= 1400) && (var505 < 2300 || var505 >= 2400)) {
                    if (var505 >= 1400 && var505 < 1500 || var505 >= 2400 && var505 < 2500) {
                        class98 var50;
                        if (var505 >= 2000) {
                            var6--;
                            var50 = class168.method1173(class253.field4418[var6], arg1 ^ 0x56D72496);
                            var505 -= 1000;
                        } else {
                            var50 = var46 ? class242.field4219 : class296.field5162;
                        }
                        int[] var51 = null;
                        var7--;
                        class108 var52 = class55.field808[var7];
                        if (var52.method776(0) > 0 && var52.method784(var52.method776(arg1 + 26586) - 1, -88) == 89) {
                            var6--;
                            int var53 = class253.field4418[var6];
                            if (var53 > 0) {
                                var51 = new int[var53];
                                while ((var53--) > 0) {
                                    var6--;
                                    var51[var53] = class253.field4418[var6];
                                }
                            }
                            var52 = var52.method750(false, 0, var52.method776(0) - 1);
                        }
                        Object[] var54 = new Object[var52.method776(0) + 1];
                        for (int var55 = var54.length - 1; var55 >= 1; var55--) {
                            if (var52.method784(var55 - 1, 122) == 115) {
                                var7--;
                                var54[var55] = class55.field808[var7];
                            } else {
                                var6--;
                                var54[var55] = Integer.valueOf(class253.field4418[var6]);
                            }
                        }
                        var6--;
                        int var56 = class253.field4418[var6];
                        if (var56 == -1) {
                            var54 = null;
                        } else {
                            var54[0] = Integer.valueOf(var56);
                        }
                        if (var505 == 1400) {
                            var50.field1679 = var54;
                        } else if (var505 == 1401) {
                            var50.field1612 = var54;
                        } else if (var505 == 1402) {
                            var50.field1622 = var54;
                        } else if (var505 == 1403) {
                            var50.field1576 = var54;
                        } else if (var505 == 1404) {
                            var50.field1681 = var54;
                        } else if (var505 == 1405) {
                            var50.field1719 = var54;
                        } else if (var505 == 1406) {
                            var50.field1562 = var54;
                        } else if (var505 == 1407) {
                            var50.field1574 = var54;
                            var50.field1647 = var51;
                        } else if (var505 == 1408) {
                            var50.field1690 = var54;
                        } else if (var505 == 1409) {
                            var50.field1657 = var54;
                        } else if (var505 == 1410) {
                            var50.field1658 = var54;
                        } else if (var505 == 1411) {
                            var50.field1631 = var54;
                        } else if (var505 == 1412) {
                            var50.field1693 = var54;
                        } else if (var505 == 1414) {
                            var50.field1680 = var51;
                            var50.field1643 = var54;
                        } else if (var505 == 1415) {
                            var50.field1650 = var51;
                            var50.field1676 = var54;
                        } else if (var505 == 1416) {
                            var50.field1594 = var54;
                        } else if (var505 == 1417) {
                            var50.field1721 = var54;
                        } else if (var505 == 1418) {
                            var50.field1593 = var54;
                        } else if (var505 == 1419) {
                            var50.field1613 = var54;
                        } else if (var505 == 1420) {
                            var50.field1644 = var54;
                        } else if (var505 == 1421) {
                            var50.field1668 = var54;
                        } else if (var505 == 1422) {
                            var50.field1654 = var54;
                        } else if (var505 == 1423) {
                            var50.field1665 = var54;
                        } else if (var505 == 1424) {
                            var50.field1635 = var54;
                        } else if (var505 == 1425) {
                            var50.field1732 = var54;
                        } else if (var505 == 1426) {
                            var50.field1627 = var54;
                        } else if (var505 == 1427) {
                            var50.field1581 = var54;
                        } else if (var505 == 1428) {
                            var50.field1605 = var51;
                            var50.field1684 = var54;
                        } else if (var505 == 1429) {
                            var50.field1582 = var51;
                            var50.field1587 = var54;
                        }
                        var50.field1579 = true;
                        continue;
                    }
                    if (var505 < 1600) {
                        class98 var464 = var46 ? class242.field4219 : class296.field5162;
                        if (var505 == 1500) {
                            class253.field4418[var6++] = var464.field1730;
                            continue;
                        }
                        if (var505 == 1501) {
                            class253.field4418[var6++] = var464.field1590;
                            continue;
                        }
                        if (var505 == 1502) {
                            class253.field4418[var6++] = var464.field1673;
                            continue;
                        }
                        if (var505 == 1503) {
                            class253.field4418[var6++] = var464.field1688;
                            continue;
                        }
                        if (var505 == 1504) {
                            class253.field4418[var6++] = var464.field1595 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 1505) {
                            class253.field4418[var6++] = var464.field1611;
                            continue;
                        }
                    } else if (var505 < 1700) {
                        class98 var463 = var46 ? class242.field4219 : class296.field5162;
                        if (var505 == 1600) {
                            class253.field4418[var6++] = var463.field1597;
                            continue;
                        }
                        if (var505 == 1601) {
                            class253.field4418[var6++] = var463.field1701;
                            continue;
                        }
                        if (var505 == 1602) {
                            class55.field808[var7++] = var463.field1604;
                            continue;
                        }
                        if (var505 == 1603) {
                            class253.field4418[var6++] = var463.field1691;
                            continue;
                        }
                        if (var505 == 1604) {
                            class253.field4418[var6++] = var463.field1703;
                            continue;
                        }
                        if (var505 == 1605) {
                            class253.field4418[var6++] = var463.field1712;
                            continue;
                        }
                        if (var505 == 1606) {
                            class253.field4418[var6++] = var463.field1672;
                            continue;
                        }
                        if (var505 == 1607) {
                            class253.field4418[var6++] = var463.field1646;
                            continue;
                        }
                        if (var505 == 1608) {
                            class253.field4418[var6++] = var463.field1708;
                            continue;
                        }
                        if (var505 == 1609) {
                            class253.field4418[var6++] = var463.field1655;
                            continue;
                        }
                        if (var505 == 1610) {
                            class253.field4418[var6++] = var463.field1666;
                            continue;
                        }
                        if (var505 == 1611) {
                            class253.field4418[var6++] = var463.field1711;
                            continue;
                        }
                    } else if (var505 < 1800) {
                        class98 var462 = var46 ? class242.field4219 : class296.field5162;
                        if (var505 == 1700) {
                            class253.field4418[var6++] = var462.field1614;
                            continue;
                        }
                        if (var505 == 1701) {
                            if (var462.field1614 == -1) {
                                class253.field4418[var6++] = 0;
                            } else {
                                class253.field4418[var6++] = var462.field1682;
                            }
                            continue;
                        }
                        if (var505 == 1702) {
                            class253.field4418[var6++] = var462.field1583;
                            continue;
                        }
                    } else if (var505 < 1900) {
                        class98 var57 = var46 ? class242.field4219 : class296.field5162;
                        if (var505 == 1800) {
                            class253.field4418[var6++] = class134.method917((byte) -94, client.method1815(var57));
                            continue;
                        }
                        if (var505 == 1801) {
                            var6--;
                            int var58 = class253.field4418[var6];
                            int var506 = var58 - 1;
                            if (var57.field1585 != null && var57.field1585.length > var506 && var57.field1585[var506] != null) {
                                class55.field808[var7++] = var57.field1585[var506];
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 1802) {
                            if (var57.field1669 == null) {
                                class55.field808[var7++] = class134.field2311;
                            } else {
                                class55.field808[var7++] = var57.field1669;
                            }
                            continue;
                        }
                    } else if (var505 < 2600) {
                        var6--;
                        class98 var59 = class168.method1173(class253.field4418[var6], -1456948048);
                        if (var505 == 2500) {
                            class253.field4418[var6++] = var59.field1730;
                            continue;
                        }
                        if (var505 == 2501) {
                            class253.field4418[var6++] = var59.field1590;
                            continue;
                        }
                        if (var505 == 2502) {
                            class253.field4418[var6++] = var59.field1673;
                            continue;
                        }
                        if (var505 == 2503) {
                            class253.field4418[var6++] = var59.field1688;
                            continue;
                        }
                        if (var505 == 2504) {
                            class253.field4418[var6++] = var59.field1595 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 2505) {
                            class253.field4418[var6++] = var59.field1611;
                            continue;
                        }
                    } else if (var505 < 2700) {
                        var6--;
                        class98 var60 = class168.method1173(class253.field4418[var6], arg1 ^ 0x56D72496);
                        if (var505 == 2600) {
                            class253.field4418[var6++] = var60.field1597;
                            continue;
                        }
                        if (var505 == 2601) {
                            class253.field4418[var6++] = var60.field1701;
                            continue;
                        }
                        if (var505 == 2602) {
                            class55.field808[var7++] = var60.field1604;
                            continue;
                        }
                        if (var505 == 2603) {
                            class253.field4418[var6++] = var60.field1691;
                            continue;
                        }
                        if (var505 == 2604) {
                            class253.field4418[var6++] = var60.field1703;
                            continue;
                        }
                        if (var505 == 2605) {
                            class253.field4418[var6++] = var60.field1712;
                            continue;
                        }
                        if (var505 == 2606) {
                            class253.field4418[var6++] = var60.field1672;
                            continue;
                        }
                        if (var505 == 2607) {
                            class253.field4418[var6++] = var60.field1646;
                            continue;
                        }
                        if (var505 == 2608) {
                            class253.field4418[var6++] = var60.field1708;
                            continue;
                        }
                        if (var505 == 2609) {
                            class253.field4418[var6++] = var60.field1655;
                            continue;
                        }
                        if (var505 == 2610) {
                            class253.field4418[var6++] = var60.field1666;
                            continue;
                        }
                        if (var505 == 2611) {
                            class253.field4418[var6++] = var60.field1711;
                            continue;
                        }
                    } else if (var505 < 2800) {
                        if (var505 == 2700) {
                            var6--;
                            class98 var452 = class168.method1173(class253.field4418[var6], arg1 ^ 0x56D72496);
                            class253.field4418[var6++] = var452.field1614;
                            continue;
                        }
                        if (var505 != 2701) {
                            if (var505 == 2702) {
                                var6--;
                                int var454 = class253.field4418[var6];
                                class158 var455 = (class158) class191.field3456.method1676((long) var454, (byte) -121);
                                if (var455 == null) {
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = 1;
                                }
                                continue;
                            }
                            if (var505 == 2703) {
                                var6--;
                                class98 var456 = class168.method1173(class253.field4418[var6], -1456948048);
                                if (var456.field1636 == null) {
                                    class253.field4418[var6++] = 0;
                                    continue;
                                }
                                int var457 = var456.field1636.length;
                                for (int var458 = 0; var458 < var456.field1636.length; var458++) {
                                    if (var456.field1636[var458] == null) {
                                        var457 = var458;
                                        break;
                                    }
                                }
                                class253.field4418[var6++] = var457;
                                continue;
                            }
                            if (var505 != 2704 && var505 != 2705) {
                                throw new IllegalStateException();
                            }
                            var6 -= 2;
                            int var459 = class253.field4418[var6 + 1];
                            int var460 = class253.field4418[var6];
                            class158 var461 = (class158) class191.field3456.method1676((long) var460, (byte) -123);
                            if (var461 != null && var461.field2845 == var459) {
                                class253.field4418[var6++] = 1;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        var6--;
                        class98 var453 = class168.method1173(class253.field4418[var6], arg1 - 1456921462);
                        if (var453.field1614 == -1) {
                            class253.field4418[var6++] = 0;
                        } else {
                            class253.field4418[var6++] = var453.field1682;
                        }
                        continue;
                    } else if (var505 < 2900) {
                        var6--;
                        class98 var61 = class168.method1173(class253.field4418[var6], arg1 ^ 0x56D72496);
                        if (var505 == 2800) {
                            class253.field4418[var6++] = class134.method917((byte) -48, client.method1815(var61));
                            continue;
                        }
                        if (var505 == 2801) {
                            var6--;
                            int var62 = class253.field4418[var6];
                            int var507 = var62 - 1;
                            if (var61.field1585 != null && var507 < var61.field1585.length && var61.field1585[var507] != null) {
                                class55.field808[var7++] = var61.field1585[var507];
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 2802) {
                            if (var61.field1669 == null) {
                                class55.field808[var7++] = class134.field2311;
                            } else {
                                class55.field808[var7++] = var61.field1669;
                            }
                            continue;
                        }
                    } else if (var505 < 3200) {
                        if (var505 == 3100) {
                            var7--;
                            class108 var63 = class55.field808[var7];
                            class210.method1456(var63, 0, -91, class134.field2311);
                            continue;
                        }
                        if (var505 == 3101) {
                            var6 -= 2;
                            class72.method484(class253.field4418[var6], class95.field1513, (byte) -126, class253.field4418[var6 + 1]);
                            continue;
                        }
                        if (var505 == 3103) {
                            class156.method1091(arg1 ^ 0xFFFF9826);
                            continue;
                        }
                        if (var505 == 3104) {
                            var7--;
                            class108 var64 = class55.field808[var7];
                            int var65 = 0;
                            if (var64.method751(false)) {
                                var65 = var64.method771((byte) -128);
                            }
                            class256.field4471.method1427(131, arg1 ^ 0xFFFF9826);
                            class5.field64++;
                            class256.field4471.method1741(var65, arg1 - 1580250486);
                            continue;
                        }
                        if (var505 == 3105) {
                            class220.field3911++;
                            var7--;
                            class108 var66 = class55.field808[var7];
                            class256.field4471.method1427(239, 0);
                            class256.field4471.method1735((byte) -116, var66.method743(false));
                            continue;
                        }
                        if (var505 == 3106) {
                            class25.field386++;
                            var7--;
                            class108 var67 = class55.field808[var7];
                            class256.field4471.method1427(181, 0);
                            class256.field4471.method1759(arg1 ^ 0x1826, var67.method776(0) + 1);
                            class256.field4471.method1708(var67, 7733);
                            continue;
                        }
                        if (var505 == 3107) {
                            var6--;
                            int var68 = class253.field4418[var6];
                            var7--;
                            class108 var69 = class55.field808[var7];
                            class2.method22(false, var68, var69);
                            continue;
                        }
                        if (var505 == 3108) {
                            var6 -= 3;
                            int var70 = class253.field4418[var6];
                            int var71 = class253.field4418[var6 + 1];
                            int var72 = class253.field4418[var6 + 2];
                            class98 var73 = class168.method1173(var72, -1456948048);
                            class72.method482(var71, var73, var70, 118);
                            continue;
                        }
                        if (var505 == 3109) {
                            var6 -= 2;
                            int var74 = class253.field4418[var6];
                            int var75 = class253.field4418[var6 + 1];
                            class98 var76 = var46 ? class242.field4219 : class296.field5162;
                            class72.method482(var75, var76, var74, arg1 ^ 0xFFFF985A);
                            continue;
                        }
                        if (var505 == 3110) {
                            class304.field5284++;
                            var6--;
                            int var77 = class253.field4418[var6];
                            class256.field4471.method1427(142, 0);
                            class256.field4471.method1724(false, var77);
                            continue;
                        }
                    } else if (var505 < 3300) {
                        if (var505 == 3200) {
                            var6 -= 3;
                            class224.method1522(class253.field4418[var6], class253.field4418[var6 + 2], class253.field4418[var6 + 1], arg1 + 26585);
                            continue;
                        }
                        if (var505 == 3201) {
                            var6--;
                            class104.method714((byte) -82, class253.field4418[var6]);
                            continue;
                        }
                        if (var505 == 3202) {
                            var6 -= 2;
                            class288.method2060(class253.field4418[var6], class253.field4418[var6 + 1], true);
                            continue;
                        }
                    } else if (var505 < 3400) {
                        if (var505 == 3300) {
                            class253.field4418[var6++] = class116.field2000;
                            continue;
                        }
                        if (var505 == 3301) {
                            var6 -= 2;
                            int var78 = class253.field4418[var6];
                            int var79 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class247.method1696(var79, var78, (byte) 126);
                            continue;
                        }
                        if (var505 == 3302) {
                            var6 -= 2;
                            int var80 = class253.field4418[var6 + 1];
                            int var81 = class253.field4418[var6];
                            class253.field4418[var6++] = class329.method2254(arg1 + 26556, var80, var81);
                            continue;
                        }
                        if (var505 == 3303) {
                            var6 -= 2;
                            int var82 = class253.field4418[var6];
                            int var83 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class3.method29(2, var82, var83);
                            continue;
                        }
                        if (var505 == 3304) {
                            var6--;
                            int var84 = class253.field4418[var6];
                            class253.field4418[var6++] = class313.method2181(var84, -116).field3555;
                            continue;
                        }
                        if (var505 == 3305) {
                            var6--;
                            int var85 = class253.field4418[var6];
                            class253.field4418[var6++] = class329.field5627[var85];
                            continue;
                        }
                        if (var505 == 3306) {
                            var6--;
                            int var86 = class253.field4418[var6];
                            class253.field4418[var6++] = class307.field5345[var86];
                            continue;
                        }
                        if (var505 == 3307) {
                            var6--;
                            int var87 = class253.field4418[var6];
                            class253.field4418[var6++] = class299.field5199[var87];
                            continue;
                        }
                        if (var505 == 3308) {
                            int var88 = class295.field5159;
                            int var89 = (class95.field1513.field4452 >> 7) + class305.field5295;
                            int var90 = (class95.field1513.field4457 >> 7) + class137.field2421;
                            class253.field4418[var6++] = (var88 << 28) + ((var89 << 14) + var90);
                            continue;
                        }
                        if (var505 == 3309) {
                            var6--;
                            int var91 = class253.field4418[var6];
                            class253.field4418[var6++] = class162.method1118(var91, 268435045) >> 14;
                            continue;
                        }
                        if (var505 == 3310) {
                            var6--;
                            int var92 = class253.field4418[var6];
                            class253.field4418[var6++] = var92 >> 28;
                            continue;
                        }
                        if (var505 == 3311) {
                            var6--;
                            int var93 = class253.field4418[var6];
                            class253.field4418[var6++] = class162.method1118(16383, var93);
                            continue;
                        }
                        if (var505 == 3312) {
                            class253.field4418[var6++] = class293.field5130 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3313) {
                            var6 -= 2;
                            int var94 = class253.field4418[var6 + 1];
                            int var95 = class253.field4418[var6] + 32768;
                            class253.field4418[var6++] = class247.method1696(var94, var95, (byte) 111);
                            continue;
                        }
                        if (var505 == 3314) {
                            var6 -= 2;
                            int var96 = class253.field4418[var6] + 32768;
                            int var97 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class329.method2254(-63, var97, var96);
                            continue;
                        }
                        if (var505 == 3315) {
                            var6 -= 2;
                            int var98 = class253.field4418[var6] + 32768;
                            int var99 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class3.method29(2, var98, var99);
                            continue;
                        }
                        if (var505 == 3316) {
                            if (class299.field5191 >= 2) {
                                class253.field4418[var6++] = class299.field5191;
                            } else {
                                class253.field4418[var6++] = 0;
                            }
                            continue;
                        }
                        if (var505 == 3317) {
                            class253.field4418[var6++] = class156.field2805;
                            continue;
                        }
                        if (var505 == 3318) {
                            class253.field4418[var6++] = class182.field3334;
                            continue;
                        }
                        if (var505 == 3321) {
                            class253.field4418[var6++] = class126.field2143;
                            continue;
                        }
                        if (var505 == 3322) {
                            class253.field4418[var6++] = class239.field4167;
                            continue;
                        }
                        if (var505 == 3323) {
                            if (class310.field5356 >= 5 && class310.field5356 <= 9) {
                                class253.field4418[var6++] = 1;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3324) {
                            if (class310.field5356 >= 5 && class310.field5356 <= 9) {
                                class253.field4418[var6++] = class310.field5356;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3325) {
                            class253.field4418[var6++] = class304.field5290 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3326) {
                            class253.field4418[var6++] = class95.field1513.field720;
                            continue;
                        }
                        if (var505 == 3327) {
                            class253.field4418[var6++] = class95.field1513.field721.field4178 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3328) {
                            class253.field4418[var6++] = class106.field1832 && !class318.field5457 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3329) {
                            class253.field4418[var6++] = class151.field2737 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3330) {
                            var6--;
                            int var100 = class253.field4418[var6];
                            class253.field4418[var6++] = class163.method1127(121, var100);
                            continue;
                        }
                        if (var505 == 3331) {
                            var6 -= 2;
                            int var101 = class253.field4418[var6];
                            int var102 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class289.method2067(var101, var102, (byte) 118, false);
                            continue;
                        }
                        if (var505 == 3332) {
                            var6 -= 2;
                            int var103 = class253.field4418[var6 + 1];
                            int var104 = class253.field4418[var6];
                            class253.field4418[var6++] = class289.method2067(var104, var103, (byte) 108, true);
                            continue;
                        }
                        if (var505 == 3333) {
                            class253.field4418[var6++] = class303.field5255;
                            continue;
                        }
                        if (var505 == 3335) {
                            class253.field4418[var6++] = class88.field1393;
                            continue;
                        }
                    } else if (var505 < 3500) {
                        if (var505 == 3400) {
                            var6 -= 2;
                            int var105 = class253.field4418[var6];
                            int var106 = class253.field4418[var6 + 1];
                            class99 var107 = class16.method106(-120, var105);
                            if (var107.field1746 == 115) {
                            }
                            class55.field808[var7++] = var107.method688(-71, var106);
                            continue;
                        }
                        if (var505 == 3408) {
                            var6 -= 4;
                            int var108 = class253.field4418[var6];
                            int var109 = class253.field4418[var6 + 1];
                            int var110 = class253.field4418[var6 + 3];
                            int var111 = class253.field4418[var6 + 2];
                            class99 var112 = class16.method106(41, var111);
                            if (var112.field1737 == var108 && var112.field1746 == var109) {
                                if (var109 == 115) {
                                    class55.field808[var7++] = var112.method688(-23, var110);
                                } else {
                                    class253.field4418[var6++] = var112.method683(var110, 0);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var505 == 3409) {
                            var6 -= 3;
                            int var113 = class253.field4418[var6 + 1];
                            int var114 = class253.field4418[var6 + 2];
                            int var115 = class253.field4418[var6];
                            if (var113 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class99 var116 = class16.method106(39, var113);
                            if (var116.field1746 != var115) {
                                throw new RuntimeException("C3409-1");
                            }
                            class253.field4418[var6++] = var116.method681(var114, (byte) 124) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3410) {
                            var6--;
                            int var117 = class253.field4418[var6];
                            var7--;
                            class108 var118 = class55.field808[var7];
                            if (var117 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class99 var119 = class16.method106(arg1 ^ 0x67A4, var117);
                            if (var119.field1746 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class253.field4418[var6++] = var119.method693(0, var118) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3411) {
                            var6--;
                            int var120 = class253.field4418[var6];
                            class99 var121 = class16.method106(arg1 ^ 0x6789, var120);
                            class253.field4418[var6++] = var121.field1748.method1675(true);
                            continue;
                        }
                    } else if (var505 < 3700) {
                        if (var505 == 3600) {
                            if (class297.field5174 == 0) {
                                class253.field4418[var6++] = -2;
                            } else if (class297.field5174 == 1) {
                                class253.field4418[var6++] = -1;
                            } else {
                                class253.field4418[var6++] = class120.field2056;
                            }
                            continue;
                        }
                        if (var505 == 3601) {
                            var6--;
                            int var122 = class253.field4418[var6];
                            if (class297.field5174 == 2 && var122 < class120.field2056) {
                                class55.field808[var7++] = class197.field3563[var122];
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 3602) {
                            var6--;
                            int var123 = class253.field4418[var6];
                            if (class297.field5174 == 2 && class120.field2056 > var123) {
                                class253.field4418[var6++] = class176.field3204[var123];
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3603) {
                            var6--;
                            int var124 = class253.field4418[var6];
                            if (class297.field5174 == 2 && class120.field2056 > var124) {
                                class253.field4418[var6++] = class295.field5154[var124];
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3604) {
                            var7--;
                            class108 var125 = class55.field808[var7];
                            var6--;
                            int var126 = class253.field4418[var6];
                            class126.method869(var125, var126, true);
                            continue;
                        }
                        if (var505 == 3605) {
                            var7--;
                            class108 var127 = class55.field808[var7];
                            class286.method2051(arg1 + 26556, var127.method743(false));
                            continue;
                        }
                        if (var505 == 3606) {
                            var7--;
                            class108 var128 = class55.field808[var7];
                            class265.method1916(var128.method743(false), -1);
                            continue;
                        }
                        if (var505 == 3607) {
                            var7--;
                            class108 var129 = class55.field808[var7];
                            class101.method700(var129.method743(false), (byte) -29);
                            continue;
                        }
                        if (var505 == 3608) {
                            var7--;
                            class108 var130 = class55.field808[var7];
                            class84.method571(-9799, var130.method743(false));
                            continue;
                        }
                        if (var505 == 3609) {
                            var7--;
                            class108 var131 = class55.field808[var7];
                            if (var131.method746(false, class296.field5166) || var131.method746(false, class271.field4735)) {
                                var131 = var131.method788(7, arg1 ^ 0xFFFFE60D);
                            }
                            class253.field4418[var6++] = class288.method2058(0, var131) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3610) {
                            var6--;
                            int var132 = class253.field4418[var6];
                            if (class297.field5174 == 2 && class120.field2056 > var132) {
                                class55.field808[var7++] = class14.field168[var132];
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 3611) {
                            if (class123.field2095 == null) {
                                class55.field808[var7++] = class134.field2311;
                            } else {
                                class55.field808[var7++] = class123.field2095.method755(8975);
                            }
                            continue;
                        }
                        if (var505 == 3612) {
                            if (class123.field2095 == null) {
                                class253.field4418[var6++] = 0;
                            } else {
                                class253.field4418[var6++] = class299.field5196;
                            }
                            continue;
                        }
                        if (var505 == 3613) {
                            var6--;
                            int var133 = class253.field4418[var6];
                            if (class123.field2095 != null && class299.field5196 > var133) {
                                class55.field808[var7++] = class284.field4974[var133].field2765.method755(8975);
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 3614) {
                            var6--;
                            int var134 = class253.field4418[var6];
                            if (class123.field2095 != null && class299.field5196 > var134) {
                                class253.field4418[var6++] = class284.field4974[var134].field2773;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3615) {
                            var6--;
                            int var135 = class253.field4418[var6];
                            if (class123.field2095 != null && var135 < class299.field5196) {
                                class253.field4418[var6++] = class284.field4974[var135].field2772;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3616) {
                            class253.field4418[var6++] = class6.field76;
                            continue;
                        }
                        if (var505 == 3617) {
                            var7--;
                            class108 var136 = class55.field808[var7];
                            class144.method996(var136, (byte) 85);
                            continue;
                        }
                        if (var505 == 3618) {
                            class253.field4418[var6++] = class39.field546;
                            continue;
                        }
                        if (var505 == 3619) {
                            var7--;
                            class108 var137 = class55.field808[var7];
                            class181.method1312(var137.method743(false), true);
                            continue;
                        }
                        if (var505 == 3620) {
                            class38.method256(-115);
                            continue;
                        }
                        if (var505 == 3621) {
                            if (class297.field5174 == 0) {
                                class253.field4418[var6++] = -1;
                            } else {
                                class253.field4418[var6++] = class176.field3205;
                            }
                            continue;
                        }
                        if (var505 == 3622) {
                            var6--;
                            int var138 = class253.field4418[var6];
                            if (class297.field5174 != 0 && var138 < class176.field3205) {
                                class55.field808[var7++] = class330.method2259((byte) -35, class75.field1153[var138]).method755(8975);
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 3623) {
                            var7--;
                            class108 var139 = class55.field808[var7];
                            if (var139.method746(false, class296.field5166) || var139.method746(false, class271.field4735)) {
                                var139 = var139.method788(7, 32299);
                            }
                            class253.field4418[var6++] = class177.method1258((byte) -37, var139) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3624) {
                            var6--;
                            int var140 = class253.field4418[var6];
                            if (class284.field4974 != null && class299.field5196 > var140 && class284.field4974[var140].field2765.method781(class95.field1513.field757, -26321)) {
                                class253.field4418[var6++] = 1;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3625) {
                            if (class206.field3700 == null) {
                                class55.field808[var7++] = class134.field2311;
                            } else {
                                class55.field808[var7++] = class206.field3700.method755(8975);
                            }
                            continue;
                        }
                        if (var505 == 3626) {
                            var6--;
                            int var141 = class253.field4418[var6];
                            if (class123.field2095 != null && var141 < class299.field5196) {
                                class55.field808[var7++] = class284.field4974[var141].field2770;
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 3627) {
                            var6--;
                            int var142 = class253.field4418[var6];
                            if (class297.field5174 == 2 && var142 >= 0 && var142 < class120.field2056) {
                                class253.field4418[var6++] = client.field4539[var142] ? 1 : 0;
                                continue;
                            }
                            class253.field4418[var6++] = 0;
                            continue;
                        }
                        if (var505 == 3628) {
                            var7--;
                            class108 var143 = class55.field808[var7];
                            if (var143.method746(false, class296.field5166) || var143.method746(false, class271.field4735)) {
                                var143 = var143.method788(7, arg1 ^ 0xFFFFE60D);
                            }
                            class253.field4418[var6++] = class201.method1421(class84.method565(arg1, -26407), var143);
                            continue;
                        }
                        if (var505 == 3629) {
                            class253.field4418[var6++] = class278.field4885;
                            continue;
                        }
                    } else if (var505 < 4000) {
                        if (var505 == 3903) {
                            var6--;
                            int var438 = class253.field4418[var6];
                            class253.field4418[var6++] = class304.field5279[var438].method706((byte) 10);
                            continue;
                        }
                        if (var505 == 3904) {
                            var6--;
                            int var439 = class253.field4418[var6];
                            class253.field4418[var6++] = class304.field5279[var439].field1801;
                            continue;
                        }
                        if (var505 == 3905) {
                            var6--;
                            int var440 = class253.field4418[var6];
                            class253.field4418[var6++] = class304.field5279[var440].field1797;
                            continue;
                        }
                        if (var505 == 3906) {
                            var6--;
                            int var441 = class253.field4418[var6];
                            class253.field4418[var6++] = class304.field5279[var441].field1791;
                            continue;
                        }
                        if (var505 == 3907) {
                            var6--;
                            int var442 = class253.field4418[var6];
                            class253.field4418[var6++] = class304.field5279[var442].field1793;
                            continue;
                        }
                        if (var505 == 3908) {
                            var6--;
                            int var443 = class253.field4418[var6];
                            class253.field4418[var6++] = class304.field5279[var443].field1790;
                            continue;
                        }
                        if (var505 == 3910) {
                            var6--;
                            int var444 = class253.field4418[var6];
                            int var445 = class304.field5279[var444].method711((byte) 53);
                            class253.field4418[var6++] = var445 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3911) {
                            var6--;
                            int var446 = class253.field4418[var6];
                            int var447 = class304.field5279[var446].method711((byte) 34);
                            class253.field4418[var6++] = var447 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3912) {
                            var6--;
                            int var448 = class253.field4418[var6];
                            int var449 = class304.field5279[var448].method711((byte) 121);
                            class253.field4418[var6++] = var449 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 3913) {
                            var6--;
                            int var450 = class253.field4418[var6];
                            int var451 = class304.field5279[var450].method711((byte) 117);
                            class253.field4418[var6++] = var451 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var505 < 4100) {
                        if (var505 == 4000) {
                            var6 -= 2;
                            int var144 = class253.field4418[var6];
                            int var145 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = var144 + var145;
                            continue;
                        }
                        if (var505 == 4001) {
                            var6 -= 2;
                            int var146 = class253.field4418[var6 + 1];
                            int var147 = class253.field4418[var6];
                            class253.field4418[var6++] = var147 - var146;
                            continue;
                        }
                        if (var505 == 4002) {
                            var6 -= 2;
                            int var148 = class253.field4418[var6];
                            int var149 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = var148 * var149;
                            continue;
                        }
                        if (var505 == 4003) {
                            var6 -= 2;
                            int var150 = class253.field4418[var6 + 1];
                            int var151 = class253.field4418[var6];
                            class253.field4418[var6++] = var151 / var150;
                            continue;
                        }
                        if (var505 == 4004) {
                            var6--;
                            int var152 = class253.field4418[var6];
                            class253.field4418[var6++] = (int) (Math.random() * (double) var152);
                            continue;
                        }
                        if (var505 == 4005) {
                            var6--;
                            int var153 = class253.field4418[var6];
                            class253.field4418[var6++] = (int) ((double) (var153 + 1) * Math.random());
                            continue;
                        }
                        if (var505 == 4006) {
                            var6 -= 5;
                            int var154 = class253.field4418[var6];
                            int var155 = class253.field4418[var6 + 1];
                            int var156 = class253.field4418[var6 + 3];
                            int var157 = class253.field4418[var6 + 2];
                            int var158 = class253.field4418[var6 + 4];
                            class253.field4418[var6++] = (var155 - var154) * (var158 - var157) / (var156 - var157) + var154;
                            continue;
                        }
                        if (var505 == 4007) {
                            var6 -= 2;
                            long var159 = (long) class253.field4418[var6];
                            long var161 = (long) class253.field4418[var6 + 1];
                            class253.field4418[var6++] = (int) (var159 * var161 / 100L + var159);
                            continue;
                        }
                        if (var505 == 4008) {
                            var6 -= 2;
                            int var163 = class253.field4418[var6];
                            int var164 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class242.method1674(var163, 0x1 << var164);
                            continue;
                        }
                        if (var505 == 4009) {
                            var6 -= 2;
                            int var165 = class253.field4418[var6 + 1];
                            int var166 = class253.field4418[var6];
                            class253.field4418[var6++] = class162.method1118(var166, -(0x1 << var165) - 1);
                            continue;
                        }
                        if (var505 == 4010) {
                            var6 -= 2;
                            int var167 = class253.field4418[var6 + 1];
                            int var168 = class253.field4418[var6];
                            class253.field4418[var6++] = class162.method1118(0x1 << var167, var168) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var505 == 4011) {
                            var6 -= 2;
                            int var169 = class253.field4418[var6];
                            int var170 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = var169 % var170;
                            continue;
                        }
                        if (var505 == 4012) {
                            var6 -= 2;
                            int var171 = class253.field4418[var6];
                            int var172 = class253.field4418[var6 + 1];
                            if (var171 == 0) {
                                class253.field4418[var6++] = 0;
                            } else {
                                class253.field4418[var6++] = (int) Math.pow((double) var171, (double) var172);
                            }
                            continue;
                        }
                        if (var505 == 4013) {
                            var6 -= 2;
                            int var173 = class253.field4418[var6];
                            int var174 = class253.field4418[var6 + 1];
                            if (var173 == 0) {
                                class253.field4418[var6++] = 0;
                            } else if (var174 == 0) {
                                class253.field4418[var6++] = Integer.MAX_VALUE;
                            } else {
                                class253.field4418[var6++] = (int) Math.pow((double) var173, 1.0D / (double) var174);
                            }
                            continue;
                        }
                        if (var505 == 4014) {
                            var6 -= 2;
                            int var175 = class253.field4418[var6];
                            int var176 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class162.method1118(var175, var176);
                            continue;
                        }
                        if (var505 == 4015) {
                            var6 -= 2;
                            int var177 = class253.field4418[var6];
                            int var178 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = class242.method1674(var178, var177);
                            continue;
                        }
                        if (var505 == 4016) {
                            var6 -= 2;
                            int var179 = class253.field4418[var6];
                            int var180 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = var180 > var179 ? var179 : var180;
                            continue;
                        }
                        if (var505 == 4017) {
                            var6 -= 2;
                            int var181 = class253.field4418[var6];
                            int var182 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = var181 <= var182 ? var182 : var181;
                            continue;
                        }
                        if (var505 == 4018) {
                            var6 -= 3;
                            long var183 = (long) class253.field4418[var6];
                            long var185 = (long) class253.field4418[var6 + 2];
                            long var187 = (long) class253.field4418[var6 + 1];
                            class253.field4418[var6++] = (int) (var183 * var185 / var187);
                            continue;
                        }
                    } else if (var505 < 4200) {
                        if (var505 == 4100) {
                            var7--;
                            class108 var386 = class55.field808[var7];
                            var6--;
                            int var387 = class253.field4418[var6];
                            class55.field808[var7++] = class117.method833(new class108[] { var386, class79.method518(false, var387) }, false);
                            continue;
                        }
                        if (var505 == 4101) {
                            var7 -= 2;
                            class108 var388 = class55.field808[var7];
                            class108 var389 = class55.field808[var7 + 1];
                            class55.field808[var7++] = class117.method833(new class108[] { var388, var389 }, false);
                            continue;
                        }
                        if (var505 == 4102) {
                            var7--;
                            class108 var390 = class55.field808[var7];
                            var6--;
                            int var391 = class253.field4418[var6];
                            class55.field808[var7++] = class117.method833(new class108[] { var390, class303.method2127(class84.method565(arg1, 14708), var391, true) }, false);
                            continue;
                        }
                        if (var505 == 4103) {
                            var7--;
                            class108 var392 = class55.field808[var7];
                            class55.field808[var7++] = var392.method764(false);
                            continue;
                        }
                        if (var505 == 4104) {
                            var6--;
                            int var393 = class253.field4418[var6];
                            long var394 = ((long) var393 + 11745L) * 86400000L;
                            class57.field830.setTime(new Date(var394));
                            int var396 = class57.field830.get(5);
                            int var397 = class57.field830.get(2);
                            int var398 = class57.field830.get(1);
                            class55.field808[var7++] = class117.method833(new class108[] { class79.method518(false, var396), class324.field5529, class22.field359[var397], class324.field5529, class79.method518(false, var398) }, false);
                            continue;
                        }
                        if (var505 == 4105) {
                            var7 -= 2;
                            class108 var399 = class55.field808[var7];
                            class108 var400 = class55.field808[var7 + 1];
                            if (class95.field1513.field721 != null && class95.field1513.field721.field4178) {
                                class55.field808[var7++] = var400;
                                continue;
                            }
                            class55.field808[var7++] = var399;
                            continue;
                        }
                        if (var505 == 4106) {
                            var6--;
                            int var401 = class253.field4418[var6];
                            class55.field808[var7++] = class79.method518(false, var401);
                            continue;
                        }
                        if (var505 == 4107) {
                            var7 -= 2;
                            class253.field4418[var6++] = class55.field808[var7].method754(126, class55.field808[var7 + 1]);
                            continue;
                        }
                        if (var505 == 4108) {
                            var6 -= 2;
                            var7--;
                            class108 var402 = class55.field808[var7];
                            int var403 = class253.field4418[var6];
                            int var404 = class253.field4418[var6 + 1];
                            byte[] var405 = class62.field994.method1868(12236, var404, 0);
                            class250 var406 = new class250(var405);
                            var406.method524(class157.field2831, (int[]) null);
                            class253.field4418[var6++] = var406.method546(var402, var403);
                            continue;
                        }
                        if (var505 == 4109) {
                            var6 -= 2;
                            int var407 = class253.field4418[var6];
                            var7--;
                            class108 var408 = class55.field808[var7];
                            int var409 = class253.field4418[var6 + 1];
                            byte[] var410 = class62.field994.method1868(12236, var409, 0);
                            class250 var411 = new class250(var410);
                            var411.method524(class157.field2831, (int[]) null);
                            class253.field4418[var6++] = var411.method535(var408, var407);
                            continue;
                        }
                        if (var505 == 4110) {
                            var7 -= 2;
                            class108 var412 = class55.field808[var7];
                            class108 var413 = class55.field808[var7 + 1];
                            var6--;
                            if (class253.field4418[var6] == 1) {
                                class55.field808[var7++] = var412;
                            } else {
                                class55.field808[var7++] = var413;
                            }
                            continue;
                        }
                        if (var505 == 4111) {
                            var7--;
                            class108 var414 = class55.field808[var7];
                            class55.field808[var7++] = class80.method519(var414);
                            continue;
                        }
                        if (var505 == 4112) {
                            var7--;
                            class108 var415 = class55.field808[var7];
                            var6--;
                            int var416 = class253.field4418[var6];
                            if (var416 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class55.field808[var7++] = var415.method775((byte) -79, var416);
                            continue;
                        }
                        if (var505 == 4113) {
                            var6--;
                            int var417 = class253.field4418[var6];
                            class253.field4418[var6++] = class277.method2007(var417, 32) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4114) {
                            var6--;
                            int var418 = class253.field4418[var6];
                            class253.field4418[var6++] = class219.method1507(var418, -122) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4115) {
                            var6--;
                            int var419 = class253.field4418[var6];
                            class253.field4418[var6++] = class116.method826(var419, -123) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4116) {
                            var6--;
                            int var420 = class253.field4418[var6];
                            class253.field4418[var6++] = class261.method1855(var420, class84.method565(arg1, -26535)) ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4117) {
                            var7--;
                            class108 var421 = class55.field808[var7];
                            if (var421 == null) {
                                class253.field4418[var6++] = 0;
                            } else {
                                class253.field4418[var6++] = var421.method776(class84.method565(arg1, -26586));
                            }
                            continue;
                        }
                        if (var505 == 4118) {
                            var7--;
                            class108 var422 = class55.field808[var7];
                            var6 -= 2;
                            int var423 = class253.field4418[var6 + 1];
                            int var424 = class253.field4418[var6];
                            class55.field808[var7++] = var422.method750(false, var424, var423);
                            continue;
                        }
                        if (var505 == 4119) {
                            var7--;
                            class108 var425 = class55.field808[var7];
                            class108 var426 = class219.method1510(var425.method776(arg1 + 26586), true);
                            boolean var427 = false;
                            for (int var428 = 0; var425.method776(arg1 ^ 0xFFFF9826) > var428; var428++) {
                                int var429 = var425.method784(var428, arg1 + 26522);
                                if (var429 == 60) {
                                    var427 = true;
                                } else if (var429 == 62) {
                                    var427 = false;
                                } else if (!var427) {
                                    var426.method744(false, var429);
                                }
                            }
                            var426.method745(arg1 ^ 0xFFFF9826);
                            class55.field808[var7++] = var426;
                            continue;
                        }
                        if (var505 == 4120) {
                            var6 -= 2;
                            var7--;
                            class108 var430 = class55.field808[var7];
                            int var431 = class253.field4418[var6];
                            int var432 = class253.field4418[var6 + 1];
                            class253.field4418[var6++] = var430.method747(var431, 1, var432);
                            continue;
                        }
                        if (var505 == 4121) {
                            var7 -= 2;
                            class108 var433 = class55.field808[var7];
                            class108 var434 = class55.field808[var7 + 1];
                            var6--;
                            int var435 = class253.field4418[var6];
                            class253.field4418[var6++] = var433.method783(var434, var435, (byte) 115);
                            continue;
                        }
                        if (var505 == 4122) {
                            var6--;
                            int var436 = class253.field4418[var6];
                            class253.field4418[var6++] = class98.method669((byte) 56, var436);
                            continue;
                        }
                        if (var505 == 4123) {
                            var6--;
                            int var437 = class253.field4418[var6];
                            class253.field4418[var6++] = class293.method2091(var437, true);
                            continue;
                        }
                    } else if (var505 < 4300) {
                        if (var505 == 4200) {
                            var6--;
                            int var367 = class253.field4418[var6];
                            class55.field808[var7++] = class144.method994(true, var367).field2610;
                            continue;
                        }
                        if (var505 == 4201) {
                            var6 -= 2;
                            int var368 = class253.field4418[var6];
                            int var369 = class253.field4418[var6 + 1];
                            class145 var370 = class144.method994(true, var368);
                            if (var369 >= 1 && var369 <= 5 && var370.field2606[var369 - 1] != null) {
                                class55.field808[var7++] = var370.field2606[var369 - 1];
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 4202) {
                            var6 -= 2;
                            int var371 = class253.field4418[var6];
                            int var372 = class253.field4418[var6 + 1];
                            class145 var373 = class144.method994(true, var371);
                            if (var372 >= 1 && var372 <= 5 && var373.field2552[var372 - 1] != null) {
                                class55.field808[var7++] = var373.field2552[var372 - 1];
                                continue;
                            }
                            class55.field808[var7++] = class134.field2311;
                            continue;
                        }
                        if (var505 == 4203) {
                            var6--;
                            int var374 = class253.field4418[var6];
                            class253.field4418[var6++] = class144.method994(true, var374).field2558;
                            continue;
                        }
                        if (var505 == 4204) {
                            var6--;
                            int var375 = class253.field4418[var6];
                            class253.field4418[var6++] = class144.method994(true, var375).field2615 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4205) {
                            var6--;
                            int var376 = class253.field4418[var6];
                            class145 var377 = class144.method994(true, var376);
                            if (var377.field2607 == -1 && var377.field2560 >= 0) {
                                class253.field4418[var6++] = var377.field2560;
                                continue;
                            }
                            class253.field4418[var6++] = var376;
                            continue;
                        }
                        if (var505 == 4206) {
                            var6--;
                            int var378 = class253.field4418[var6];
                            class145 var379 = class144.method994(true, var378);
                            if (var379.field2607 >= 0 && var379.field2560 >= 0) {
                                class253.field4418[var6++] = var379.field2560;
                                continue;
                            }
                            class253.field4418[var6++] = var378;
                            continue;
                        }
                        if (var505 == 4207) {
                            var6--;
                            int var380 = class253.field4418[var6];
                            class253.field4418[var6++] = class144.method994(true, var380).field2583 ? 1 : 0;
                            continue;
                        }
                        if (var505 == 4208) {
                            var6 -= 2;
                            int var381 = class253.field4418[var6];
                            int var382 = class253.field4418[var6 + 1];
                            class251 var383 = class72.method480(var382, 0);
                            if (var383.method1772(true)) {
                                class55.field808[var7++] = class144.method994(true, var381).method1010(-50, var382, var383.field4379);
                            } else {
                                class253.field4418[var6++] = class144.method994(true, var381).method1015(var383.field4385, var382, (byte) 63);
                            }
                            continue;
                        }
                        if (var505 == 4210) {
                            var7--;
                            class108 var384 = class55.field808[var7];
                            var6--;
                            int var385 = class253.field4418[var6];
                            class104.method718(16, var385 == 1, var384);
                            class253.field4418[var6++] = class282.field4940;
                            continue;
                        }
                        if (var505 == 4211) {
                            if (class143.field2524 != null && class282.field4940 > class176.field3202) {
                                class253.field4418[var6++] = class162.method1118(65535, class143.field2524[class176.field3202++]);
                                continue;
                            }
                            class253.field4418[var6++] = -1;
                            continue;
                        }
                        if (var505 == 4212) {
                            class176.field3202 = 0;
                            continue;
                        }
                    } else if (var505 < 4400) {
                        if (var505 == 4300) {
                            var6 -= 2;
                            int var189 = class253.field4418[var6 + 1];
                            int var190 = class253.field4418[var6];
                            class251 var191 = class72.method480(var189, 0);
                            if (var191.method1772(true)) {
                                class55.field808[var7++] = class57.method397(0, var190).method940(var189, var191.field4379, 112);
                            } else {
                                class253.field4418[var6++] = class57.method397(class84.method565(arg1, -26586), var190).method929(var191.field4385, var189, 115);
                            }
                            continue;
                        }
                        if (var505 == 4301) {
                            var6--;
                            int var192 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var192).field2401;
                            continue;
                        }
                        if (var505 == 4302) {
                            var6--;
                            int var193 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var193).field2370;
                            continue;
                        }
                        if (var505 == 4303) {
                            var6--;
                            int var194 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var194).field2371;
                            continue;
                        }
                        if (var505 == 4304) {
                            var6--;
                            int var195 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var195).field2404;
                            continue;
                        }
                        if (var505 == 4305) {
                            var6--;
                            int var196 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var196).field2409;
                            continue;
                        }
                        if (var505 == 4306) {
                            var6--;
                            int var197 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var197).field2377;
                            continue;
                        }
                        if (var505 == 4307) {
                            var6--;
                            int var198 = class253.field4418[var6];
                            class253.field4418[var6++] = class57.method397(0, var198).field2353;
                            continue;
                        }
                    } else if (var505 >= 4500) {
                        if (var505 < 4600) {
                            if (var505 == 4500) {
                                var6 -= 2;
                                int var199 = class253.field4418[var6];
                                int var200 = class253.field4418[var6 + 1];
                                class251 var201 = class72.method480(var200, 0);
                                if (var201.method1772(true)) {
                                    class55.field808[var7++] = class210.method1457(arg1 + 26612, var199).method990(var201.field4379, 1023, var200);
                                } else {
                                    class253.field4418[var6++] = class210.method1457(26, var199).method993(var200, var201.field4385, 32);
                                }
                                continue;
                            }
                        } else if (var505 < 5100) {
                            if (var505 == 5000) {
                                class253.field4418[var6++] = class169.field3027;
                                continue;
                            }
                            if (var505 == 5001) {
                                class258.field4556++;
                                var6 -= 3;
                                class169.field3027 = class253.field4418[var6];
                                class1.field19 = class253.field4418[var6 + 1];
                                class2.field47 = class253.field4418[var6 + 2];
                                class256.field4471.method1427(23, 0);
                                class256.field4471.method1759(-32768, class169.field3027);
                                class256.field4471.method1759(arg1 ^ 0x1826, class1.field19);
                                class256.field4471.method1759(arg1 ^ 0x1826, class2.field47);
                                continue;
                            }
                            if (var505 == 5002) {
                                class277.field4870++;
                                var6 -= 2;
                                int var202 = class253.field4418[var6];
                                int var203 = class253.field4418[var6 + 1];
                                var7--;
                                class108 var204 = class55.field808[var7];
                                class256.field4471.method1427(107, 0);
                                class256.field4471.method1735((byte) -119, var204.method743(false));
                                class256.field4471.method1759(-32768, var202 - 1);
                                class256.field4471.method1759(-32768, var203);
                                continue;
                            }
                            if (var505 == 5003) {
                                class108 var205 = null;
                                var6--;
                                int var206 = class253.field4418[var6];
                                if (var206 < 100) {
                                    var205 = class212.field3784[var206];
                                }
                                if (var205 == null) {
                                    var205 = class134.field2311;
                                }
                                class55.field808[var7++] = var205;
                                continue;
                            }
                            if (var505 == 5004) {
                                var6--;
                                int var207 = class253.field4418[var6];
                                int var208 = -1;
                                if (var207 < 100 && class212.field3784[var207] != null) {
                                    var208 = class95.field1517[var207];
                                }
                                class253.field4418[var6++] = var208;
                                continue;
                            }
                            if (var505 == 5005) {
                                class253.field4418[var6++] = class1.field19;
                                continue;
                            }
                            if (var505 == 5008) {
                                var7--;
                                class108 var209 = class55.field808[var7];
                                if (!var209.method746(false, class151.field2743)) {
                                    if (class299.field5191 == 0 && (class106.field1832 && !class318.field5457 || class151.field2737)) {
                                        continue;
                                    }
                                    byte var210 = 0;
                                    byte var211 = 0;
                                    class27.field411++;
                                    class108 var212 = var209.method764(false);
                                    if (var212.method746(false, class116.field2019)) {
                                        var210 = 0;
                                        var209 = var209.method788(class116.field2019.method776(0), 32299);
                                    } else if (var212.method746(false, class201.field3630)) {
                                        var209 = var209.method788(class201.field3630.method776(0), arg1 ^ 0xFFFFE60D);
                                        var210 = 1;
                                    } else if (var212.method746(false, class144.field2543)) {
                                        var209 = var209.method788(class144.field2543.method776(0), arg1 ^ 0xFFFFE60D);
                                        var210 = 2;
                                    } else if (var212.method746(false, class268.field4715)) {
                                        var209 = var209.method788(class268.field4715.method776(0), 32299);
                                        var210 = 3;
                                    } else if (var212.method746(false, class301.field5244)) {
                                        var210 = 4;
                                        var209 = var209.method788(class301.field5244.method776(arg1 ^ 0xFFFF9826), 32299);
                                    } else if (var212.method746(false, class129.field2219)) {
                                        var210 = 5;
                                        var209 = var209.method788(class129.field2219.method776(0), 32299);
                                    } else if (var212.method746(false, class47.field700)) {
                                        var210 = 6;
                                        var209 = var209.method788(class47.field700.method776(0), 32299);
                                    } else if (var212.method746(false, class24.field373)) {
                                        var209 = var209.method788(class24.field373.method776(arg1 ^ 0xFFFF9826), 32299);
                                        var210 = 7;
                                    } else if (var212.method746(false, class91.field1431)) {
                                        var210 = 8;
                                        var209 = var209.method788(class91.field1431.method776(arg1 + 26586), 32299);
                                    } else if (var212.method746(false, class25.field376)) {
                                        var209 = var209.method788(class25.field376.method776(arg1 + 26586), 32299);
                                        var210 = 9;
                                    } else if (var212.method746(false, class285.field4987)) {
                                        var209 = var209.method788(class285.field4987.method776(0), 32299);
                                        var210 = 10;
                                    } else if (var212.method746(false, class121.field2078)) {
                                        var210 = 11;
                                        var209 = var209.method788(class121.field2078.method776(arg1 + 26586), 32299);
                                    } else if (class88.field1393 != 0) {
                                        if (var212.method746(false, class116.field2006)) {
                                            var209 = var209.method788(class116.field2006.method776(0), arg1 ^ 0xFFFFE60D);
                                            var210 = 0;
                                        } else if (var212.method746(false, class201.field3639)) {
                                            var209 = var209.method788(class201.field3639.method776(arg1 ^ 0xFFFF9826), 32299);
                                            var210 = 1;
                                        } else if (var212.method746(false, class144.field2545)) {
                                            var210 = 2;
                                            var209 = var209.method788(class144.field2545.method776(arg1 ^ 0xFFFF9826), 32299);
                                        } else if (var212.method746(false, class268.field4703)) {
                                            var209 = var209.method788(class268.field4703.method776(arg1 ^ 0xFFFF9826), 32299);
                                            var210 = 3;
                                        } else if (var212.method746(false, class301.field5240)) {
                                            var209 = var209.method788(class301.field5240.method776(arg1 ^ 0xFFFF9826), arg1 ^ 0xFFFFE60D);
                                            var210 = 4;
                                        } else if (var212.method746(false, class129.field2203)) {
                                            var210 = 5;
                                            var209 = var209.method788(class129.field2203.method776(0), 32299);
                                        } else if (var212.method746(false, class47.field701)) {
                                            var210 = 6;
                                            var209 = var209.method788(class47.field701.method776(0), arg1 + 58885);
                                        } else if (var212.method746(false, class24.field368)) {
                                            var210 = 7;
                                            var209 = var209.method788(class24.field368.method776(arg1 + 26586), arg1 ^ 0xFFFFE60D);
                                        } else if (var212.method746(false, class91.field1441)) {
                                            var209 = var209.method788(class91.field1441.method776(0), 32299);
                                            var210 = 8;
                                        } else if (var212.method746(false, class25.field390)) {
                                            var210 = 9;
                                            var209 = var209.method788(class25.field390.method776(arg1 ^ 0xFFFF9826), 32299);
                                        } else if (var212.method746(false, class285.field4980)) {
                                            var209 = var209.method788(class285.field4980.method776(0), 32299);
                                            var210 = 10;
                                        } else if (var212.method746(false, class121.field2076)) {
                                            var210 = 11;
                                            var209 = var209.method788(class121.field2076.method776(0), 32299);
                                        }
                                    }
                                    class108 var213 = var209.method764(false);
                                    if (var213.method746(false, class9.field111)) {
                                        var209 = var209.method788(class9.field111.method776(arg1 ^ 0xFFFF9826), 32299);
                                        var211 = 1;
                                    } else if (var213.method746(false, class180.field3270)) {
                                        var211 = 2;
                                        var209 = var209.method788(class180.field3270.method776(0), arg1 + 58885);
                                    } else if (var213.method746(false, class218.field3876)) {
                                        var209 = var209.method788(class218.field3876.method776(0), 32299);
                                        var211 = 3;
                                    } else if (var213.method746(false, class131.field2235)) {
                                        var209 = var209.method788(class131.field2235.method776(0), 32299);
                                        var211 = 4;
                                    } else if (var213.method746(false, class185.field3408)) {
                                        var209 = var209.method788(class185.field3408.method776(arg1 + 26586), 32299);
                                        var211 = 5;
                                    } else if (class88.field1393 != 0) {
                                        if (var213.method746(false, class9.field110)) {
                                            var211 = 1;
                                            var209 = var209.method788(class9.field110.method776(arg1 + 26586), 32299);
                                        } else if (var213.method746(false, class180.field3282)) {
                                            var211 = 2;
                                            var209 = var209.method788(class180.field3282.method776(0), 32299);
                                        } else if (var213.method746(false, class218.field3889)) {
                                            var209 = var209.method788(class218.field3889.method776(0), 32299);
                                            var211 = 3;
                                        } else if (var213.method746(false, class131.field2255)) {
                                            var209 = var209.method788(class131.field2255.method776(0), 32299);
                                            var211 = 4;
                                        } else if (var213.method746(false, class185.field3391)) {
                                            var211 = 5;
                                            var209 = var209.method788(class185.field3391.method776(0), 32299);
                                        }
                                    }
                                    class256.field4471.method1427(235, 0);
                                    class256.field4471.method1759(-32768, 0);
                                    int var214 = class256.field4471.field4314;
                                    class256.field4471.method1759(-32768, var210);
                                    class256.field4471.method1759(arg1 - 6182, var211);
                                    class55.method384(0, class256.field4471, var209);
                                    class256.field4471.method1766(0, class256.field4471.field4314 - var214);
                                    continue;
                                }
                                class308.method2158(2, var209);
                                continue;
                            }
                            if (var505 == 5009) {
                                var7 -= 2;
                                class108 var215 = class55.field808[var7 + 1];
                                class108 var216 = class55.field808[var7];
                                if (class299.field5191 != 0 || (!class106.field1832 || class318.field5457) && !class151.field2737) {
                                    class166.field2990++;
                                    class256.field4471.method1427(218, 0);
                                    class256.field4471.method1759(arg1 ^ 0x1826, 0);
                                    int var217 = class256.field4471.field4314;
                                    class256.field4471.method1735((byte) -37, var216.method743(false));
                                    class55.method384(0, class256.field4471, var215);
                                    class256.field4471.method1766(0, class256.field4471.field4314 - var217);
                                }
                                continue;
                            }
                            if (var505 == 5010) {
                                var6--;
                                int var218 = class253.field4418[var6];
                                class108 var219 = null;
                                if (var218 < 100) {
                                    var219 = class74.field1112[var218];
                                }
                                if (var219 == null) {
                                    var219 = class134.field2311;
                                }
                                class55.field808[var7++] = var219;
                                continue;
                            }
                            if (var505 == 5011) {
                                var6--;
                                int var220 = class253.field4418[var6];
                                class108 var221 = null;
                                if (var220 < 100) {
                                    var221 = class280.field4912[var220];
                                }
                                if (var221 == null) {
                                    var221 = class134.field2311;
                                }
                                class55.field808[var7++] = var221;
                                continue;
                            }
                            if (var505 == 5012) {
                                var6--;
                                int var222 = class253.field4418[var6];
                                int var223 = -1;
                                if (var222 < 100) {
                                    var223 = class154.field2766[var222];
                                }
                                class253.field4418[var6++] = var223;
                                continue;
                            }
                            if (var505 == 5015) {
                                class108 var224;
                                if (class95.field1513 == null || class95.field1513.field757 == null) {
                                    var224 = class63.field1014;
                                } else {
                                    var224 = class95.field1513.method359(12);
                                }
                                class55.field808[var7++] = var224;
                                continue;
                            }
                            if (var505 == 5016) {
                                class253.field4418[var6++] = class2.field47;
                                continue;
                            }
                            if (var505 == 5017) {
                                class253.field4418[var6++] = class130.field2225;
                                continue;
                            }
                            if (var505 == 5050) {
                                var6--;
                                int var225 = class253.field4418[var6];
                                class55.field808[var7++] = class135.method925(var225, 106).field5399;
                                continue;
                            }
                            if (var505 == 5051) {
                                var6--;
                                int var226 = class253.field4418[var6];
                                class312 var227 = class135.method925(var226, 70);
                                if (var227.field5390 == null) {
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var227.field5390.length;
                                }
                                continue;
                            }
                            if (var505 == 5052) {
                                var6 -= 2;
                                int var228 = class253.field4418[var6];
                                int var229 = class253.field4418[var6 + 1];
                                class312 var230 = class135.method925(var228, 115);
                                int var231 = var230.field5390[var229];
                                class253.field4418[var6++] = var231;
                                continue;
                            }
                            if (var505 == 5053) {
                                var6--;
                                int var232 = class253.field4418[var6];
                                class312 var233 = class135.method925(var232, 99);
                                if (var233.field5393 == null) {
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var233.field5393.length;
                                }
                                continue;
                            }
                            if (var505 == 5054) {
                                var6 -= 2;
                                int var234 = class253.field4418[var6 + 1];
                                int var235 = class253.field4418[var6];
                                class253.field4418[var6++] = class135.method925(var235, class84.method565(arg1, -26524)).field5393[var234];
                                continue;
                            }
                            if (var505 == 5055) {
                                var6--;
                                int var236 = class253.field4418[var6];
                                class55.field808[var7++] = class36.method248(var236, class84.method565(arg1, 30448)).method228(57);
                                continue;
                            }
                            if (var505 == 5056) {
                                var6--;
                                int var237 = class253.field4418[var6];
                                class34 var238 = class36.method248(var237, arg1 ^ 0x76F0);
                                if (var238.field458 == null) {
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var238.field458.length;
                                }
                                continue;
                            }
                            if (var505 == 5057) {
                                var6 -= 2;
                                int var239 = class253.field4418[var6 + 1];
                                int var240 = class253.field4418[var6];
                                class253.field4418[var6++] = class36.method248(var240, class84.method565(arg1, 30448)).field458[var239];
                                continue;
                            }
                            if (var505 == 5058) {
                                class295.field5156 = new class130();
                                var6--;
                                class295.field5156.field2231 = class253.field4418[var6];
                                class295.field5156.field2223 = class36.method248(class295.field5156.field2231, arg1 + 22192);
                                class295.field5156.field2227 = new int[class295.field5156.field2223.method241(-127)];
                                continue;
                            }
                            if (var505 == 5059) {
                                class256.field4471.method1427(112, 0);
                                class13.field155++;
                                class256.field4471.method1759(arg1 - 6182, 0);
                                int var241 = class256.field4471.field4314;
                                class256.field4471.method1759(-32768, 0);
                                class256.field4471.method1724(false, class295.field5156.field2231);
                                class295.field5156.field2223.method235(class295.field5156.field2227, class256.field4471, (byte) 85);
                                class256.field4471.method1766(0, class256.field4471.field4314 - var241);
                                continue;
                            }
                            if (var505 == 5060) {
                                var7--;
                                class108 var242 = class55.field808[var7];
                                class256.field4471.method1427(4, 0);
                                class9.field115++;
                                class256.field4471.method1759(-32768, 0);
                                int var243 = class256.field4471.field4314;
                                class256.field4471.method1735((byte) -95, var242.method743(false));
                                class256.field4471.method1724(false, class295.field5156.field2231);
                                class295.field5156.field2223.method235(class295.field5156.field2227, class256.field4471, (byte) 81);
                                class256.field4471.method1766(0, class256.field4471.field4314 - var243);
                                continue;
                            }
                            if (var505 == 5061) {
                                class256.field4471.method1427(112, 0);
                                class13.field155++;
                                class256.field4471.method1759(-32768, 0);
                                int var244 = class256.field4471.field4314;
                                class256.field4471.method1759(arg1 - 6182, 1);
                                class256.field4471.method1724(false, class295.field5156.field2231);
                                class295.field5156.field2223.method235(class295.field5156.field2227, class256.field4471, (byte) 64);
                                class256.field4471.method1766(0, class256.field4471.field4314 - var244);
                                continue;
                            }
                            if (var505 == 5062) {
                                var6 -= 2;
                                int var245 = class253.field4418[var6];
                                int var246 = class253.field4418[var6 + 1];
                                class253.field4418[var6++] = class135.method925(var245, 112).field5397[var246];
                                continue;
                            }
                            if (var505 == 5063) {
                                var6 -= 2;
                                int var247 = class253.field4418[var6 + 1];
                                int var248 = class253.field4418[var6];
                                class253.field4418[var6++] = class135.method925(var248, class84.method565(arg1, -26541)).field5388[var247];
                                continue;
                            }
                            if (var505 == 5064) {
                                var6 -= 2;
                                int var249 = class253.field4418[var6 + 1];
                                int var250 = class253.field4418[var6];
                                if (var249 == -1) {
                                    class253.field4418[var6++] = -1;
                                } else {
                                    class253.field4418[var6++] = class135.method925(var250, class84.method565(arg1, -26523)).method2174(118, var249);
                                }
                                continue;
                            }
                            if (var505 == 5065) {
                                var6 -= 2;
                                int var251 = class253.field4418[var6];
                                int var252 = class253.field4418[var6 + 1];
                                if (var252 == -1) {
                                    class253.field4418[var6++] = -1;
                                } else {
                                    class253.field4418[var6++] = class135.method925(var251, arg1 + 26698).method2172(var252, -1);
                                }
                                continue;
                            }
                            if (var505 == 5066) {
                                var6--;
                                int var253 = class253.field4418[var6];
                                class253.field4418[var6++] = class36.method248(var253, -4394).method241(-127);
                                continue;
                            }
                            if (var505 == 5067) {
                                var6 -= 2;
                                int var254 = class253.field4418[var6];
                                int var255 = class253.field4418[var6 + 1];
                                int var256 = class36.method248(var254, -4394).method233(var255, false);
                                class253.field4418[var6++] = var256;
                                continue;
                            }
                            if (var505 == 5068) {
                                var6 -= 2;
                                int var257 = class253.field4418[var6];
                                int var258 = class253.field4418[var6 + 1];
                                class295.field5156.field2227[var257] = var258;
                                continue;
                            }
                            if (var505 == 5069) {
                                var6 -= 2;
                                int var259 = class253.field4418[var6];
                                int var260 = class253.field4418[var6 + 1];
                                class295.field5156.field2227[var259] = var260;
                                continue;
                            }
                            if (var505 == 5070) {
                                var6 -= 3;
                                int var261 = class253.field4418[var6];
                                int var262 = class253.field4418[var6 + 2];
                                int var263 = class253.field4418[var6 + 1];
                                class34 var264 = class36.method248(var261, -4394);
                                if (var264.method233(var263, false) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class253.field4418[var6++] = var264.method237(var263, 103, var262);
                                continue;
                            }
                            if (var505 == 5071) {
                                var7--;
                                class108 var265 = class55.field808[var7];
                                var6--;
                                boolean var266 = class253.field4418[var6] == 1;
                                class331.method2265(false, var266, var265);
                                class253.field4418[var6++] = class282.field4940;
                                continue;
                            }
                            if (var505 == 5072) {
                                if (class143.field2524 != null && class176.field3202 < class282.field4940) {
                                    class253.field4418[var6++] = class162.method1118(class143.field2524[class176.field3202++], 65535);
                                    continue;
                                }
                                class253.field4418[var6++] = -1;
                                continue;
                            }
                            if (var505 == 5073) {
                                class176.field3202 = 0;
                                continue;
                            }
                        } else if (var505 < 5200) {
                            if (var505 == 5100) {
                                if (class144.field2529[86]) {
                                    class253.field4418[var6++] = 1;
                                } else {
                                    class253.field4418[var6++] = 0;
                                }
                                continue;
                            }
                            if (var505 == 5101) {
                                if (class144.field2529[82]) {
                                    class253.field4418[var6++] = 1;
                                } else {
                                    class253.field4418[var6++] = 0;
                                }
                                continue;
                            }
                            if (var505 == 5102) {
                                if (class144.field2529[81]) {
                                    class253.field4418[var6++] = 1;
                                } else {
                                    class253.field4418[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var505 < 5300) {
                            if (var505 == 5200) {
                                var6--;
                                class88.method602((byte) -98, class253.field4418[var6]);
                                continue;
                            }
                            if (var505 == 5201) {
                                class253.field4418[var6++] = class22.method154(2);
                                continue;
                            }
                            if (var505 == 5202) {
                                var6--;
                                class246.method1689(class253.field4418[var6], -74);
                                continue;
                            }
                            if (var505 == 5203) {
                                var7--;
                                class34.method232(class55.field808[var7], (byte) 79);
                                continue;
                            }
                            if (var505 == 5204) {
                                class55.field808[var7 - 1] = method1469((byte) -9, class55.field808[var7 - 1]);
                                continue;
                            }
                            if (var505 == 5205) {
                                var7--;
                                class290.method2076(class55.field808[var7], arg1 ^ 0xFFFF98A6);
                                continue;
                            }
                            if (var505 == 5206) {
                                var6--;
                                int var267 = class253.field4418[var6];
                                class173 var268 = class290.method2077((var267 & 0xFFFF0BC) >> 14, false, var267 & 0x3FFF);
                                if (var268 == null) {
                                    class55.field808[var7++] = class134.field2311;
                                } else {
                                    class55.field808[var7++] = var268.field3170;
                                }
                                continue;
                            }
                            if (var505 == 5207) {
                                var7--;
                                class173 var269 = class254.method1793((byte) 102, class55.field808[var7]);
                                if (var269 != null && var269.field3153 != null) {
                                    class55.field808[var7++] = var269.field3153;
                                    continue;
                                }
                                class55.field808[var7++] = class134.field2311;
                                continue;
                            }
                            if (var505 == 5208) {
                                class253.field4418[var6++] = class140.field2466;
                                class253.field4418[var6++] = class84.field1345;
                                continue;
                            }
                            if (var505 == 5209) {
                                class253.field4418[var6++] = class202.field3652 + class144.field2546;
                                class253.field4418[var6++] = class152.field2757 + class83.field1288 - class126.field2121 - 1;
                                continue;
                            }
                            if (var505 == 5210) {
                                class173 var270 = class17.method109(3);
                                if (var270 == null) {
                                    class253.field4418[var6++] = 0;
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var270.field3163 * 64;
                                    class253.field4418[var6++] = var270.field3155 * 64;
                                }
                                continue;
                            }
                            if (var505 == 5211) {
                                class173 var271 = class17.method109(3);
                                if (var271 == null) {
                                    class253.field4418[var6++] = 0;
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var271.field3160 - var271.field3159;
                                    class253.field4418[var6++] = var271.field3168 - var271.field3152;
                                }
                                continue;
                            }
                            if (var505 == 5212) {
                                int var272 = class303.method2132(-10022);
                                int var273 = 0;
                                class108 var274;
                                if (var272 == -1) {
                                    var274 = class134.field2311;
                                } else {
                                    var274 = class42.field559.field5064[var272];
                                    var273 = class42.field559.method2061(var272, -1608225261);
                                }
                                class108 var275 = var274.method763(class2.field27, class98.field1660, true);
                                class55.field808[var7++] = var275;
                                class253.field4418[var6++] = var273;
                                continue;
                            }
                            if (var505 == 5213) {
                                int var276 = 0;
                                int var277 = class240.method1670(-10);
                                class108 var278;
                                if (var277 == -1) {
                                    var278 = class134.field2311;
                                } else {
                                    var278 = class42.field559.field5064[var277];
                                    var276 = class42.field559.method2061(var277, -1608225261);
                                }
                                class108 var279 = var278.method763(class2.field27, class98.field1660, true);
                                class55.field808[var7++] = var279;
                                class253.field4418[var6++] = var276;
                                continue;
                            }
                            if (var505 == 5214) {
                                var6--;
                                int var280 = class253.field4418[var6];
                                class270.method1952(var280 >> 14 & 0x3FFF, arg1 ^ 0x5331, var280 & 0x3FFF);
                                continue;
                            }
                            if (var505 == 5215) {
                                var6--;
                                int var281 = class253.field4418[var6];
                                var7--;
                                class108 var282 = class55.field808[var7];
                                class252 var283 = class181.method1313((var281 & 0xFFFE202) >> 14, -65, var281 & 0x3FFF);
                                boolean var284 = false;
                                for (class173 var285 = (class173) var283.method1778(-128); var285 != null; var285 = (class173) var283.method1783(-27042)) {
                                    if (var285.field3170.method781(var282, -26321)) {
                                        var284 = true;
                                        break;
                                    }
                                }
                                if (var284) {
                                    class253.field4418[var6++] = 1;
                                } else {
                                    class253.field4418[var6++] = 0;
                                }
                                continue;
                            }
                            if (var505 == 5216) {
                                var6--;
                                int var286 = class253.field4418[var6];
                                class75.method493((byte) 98, var286);
                                continue;
                            }
                            if (var505 == 5217) {
                                var6--;
                                int var287 = class253.field4418[var6];
                                if (class294.method2095(var287, 0)) {
                                    class253.field4418[var6++] = 1;
                                } else {
                                    class253.field4418[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var505 < 5400) {
                            if (var505 == 5300) {
                                var6 -= 2;
                                int var288 = class253.field4418[var6 + 1];
                                int var289 = class253.field4418[var6];
                                class92.method618(var289, var288, (byte) 113, false, 3);
                                class253.field4418[var6++] = class168.field3026 == null ? 0 : 1;
                                continue;
                            }
                            if (var505 == 5301) {
                                if (class168.field3026 != null) {
                                    class92.method618(-1, -1, (byte) 61, false, class258.field4562);
                                }
                                continue;
                            }
                            if (var505 == 5302) {
                                class222[] var290 = class29.method205(true);
                                class253.field4418[var6++] = var290.length;
                                continue;
                            }
                            if (var505 == 5303) {
                                var6--;
                                int var291 = class253.field4418[var6];
                                class222[] var292 = class29.method205(true);
                                class253.field4418[var6++] = var292[var291].field3940;
                                class253.field4418[var6++] = var292[var291].field3944;
                                continue;
                            }
                            if (var505 == 5305) {
                                int var293 = class311.field5380;
                                int var294 = -1;
                                int var295 = class288.field5028;
                                class222[] var296 = class29.method205(true);
                                for (int var297 = 0; var297 < var296.length; var297++) {
                                    class222 var298 = var296[var297];
                                    if (var298.field3940 == var293 && var298.field3944 == var295) {
                                        var294 = var297;
                                        break;
                                    }
                                }
                                class253.field4418[var6++] = var294;
                                continue;
                            }
                            if (var505 == 5306) {
                                class253.field4418[var6++] = class281.method2020((byte) -32);
                                continue;
                            }
                            if (var505 == 5307) {
                                var6--;
                                int var299 = class253.field4418[var6];
                                if (var299 < 0 || var299 > 2) {
                                    var299 = 0;
                                }
                                class92.method618(-1, -1, (byte) 82, false, var299);
                                continue;
                            }
                            if (var505 == 5308) {
                                class253.field4418[var6++] = class258.field4562;
                                continue;
                            }
                            if (var505 == 5309) {
                                var6--;
                                int var300 = class253.field4418[var6];
                                if (var300 < 0 || var300 > 2) {
                                    var300 = 0;
                                }
                                class258.field4562 = var300;
                                class29.method212(27551, class289.field5052);
                                continue;
                            }
                        } else if (var505 < 5500) {
                            if (var505 == 5400) {
                                var7 -= 2;
                                class108 var301 = class55.field808[var7 + 1];
                                class259.field4566++;
                                var6--;
                                int var302 = class253.field4418[var6];
                                class108 var303 = class55.field808[var7];
                                class256.field4471.method1427(113, 0);
                                class256.field4471.method1759(arg1 - 6182, class87.method599(12904, var303) + 1 + class87.method599(arg1 + 39490, var301));
                                class256.field4471.method1708(var303, 7733);
                                class256.field4471.method1708(var301, 7733);
                                class256.field4471.method1759(-32768, var302);
                                continue;
                            }
                            if (var505 == 5401) {
                                var6 -= 2;
                                class292.field5118[class253.field4418[var6]] = (short) class156.method1092((byte) 118, class253.field4418[var6 + 1]);
                                class141.method981((byte) 101);
                                class258.method1836(128);
                                class218.method1504(false);
                                class86.method597((byte) -51);
                                class68.method459(false);
                                continue;
                            }
                            if (var505 == 5405) {
                                var6 -= 2;
                                int var304 = class253.field4418[var6];
                                int var305 = class253.field4418[var6 + 1];
                                if (var304 >= 0 && var304 < 2) {
                                    class178.field3234[var304] = new int[var305 << 1][4];
                                }
                                continue;
                            }
                            if (var505 == 5406) {
                                var6 -= 7;
                                int var306 = class253.field4418[var6];
                                int var307 = class253.field4418[var6 + 2];
                                int var308 = class253.field4418[var6 + 1] << 1;
                                int var309 = class253.field4418[var6 + 3];
                                int var310 = class253.field4418[var6 + 4];
                                int var311 = class253.field4418[var6 + 5];
                                int var312 = class253.field4418[var6 + 6];
                                if (var306 >= 0 && var306 < 2 && class178.field3234[var306] != null && var308 >= 0 && class178.field3234[var306].length > var308) {
                                    class178.field3234[var306][var308] = new int[] { class162.method1118(16383, var307 >> 14) * 128, var309, class162.method1118(var307, 16383) * 128, var312 };
                                    class178.field3234[var306][var308 + 1] = new int[] { class162.method1118(16383, var310 >> 14) * 128, var311, class162.method1118(16383, var310) * 128 };
                                }
                                continue;
                            }
                            if (var505 == 5407) {
                                var6--;
                                int var313 = class178.field3234[class253.field4418[var6]].length >> 1;
                                class253.field4418[var6++] = var313;
                                continue;
                            }
                            if (var505 == 5411) {
                                if (class168.field3026 != null) {
                                    class92.method618(-1, -1, (byte) 60, false, class258.field4562);
                                }
                                if (class273.field4805 == null) {
                                    class200.method1413(false, class305.method2140((byte) -17), 3);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var505 == 5419) {
                                class108 var314 = class134.field2311;
                                if (class36.field509 != null) {
                                    var314 = class277.method2006(class36.field509.field3688, 66);
                                    try {
                                        if (class36.field509.field3685 != null) {
                                            byte[] var315 = ((String) class36.field509.field3685).getBytes("ISO-8859-1");
                                            var314 = class304.method2137((byte) 98, 0, var315, var315.length);
                                        }
                                    } catch (UnsupportedEncodingException var503) {
                                    }
                                }
                                class55.field808[var7++] = var314;
                                continue;
                            }
                            if (var505 == 5420) {
                                class253.field4418[var6++] = class139.field2442 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 5421) {
                                if (class168.field3026 != null) {
                                    class92.method618(-1, -1, (byte) 25, false, class258.field4562);
                                }
                                var6--;
                                boolean var317 = class253.field4418[var6] == 1;
                                var7--;
                                class108 var318 = class55.field808[var7];
                                class108 var319 = class117.method833(new class108[] { class305.method2140((byte) -105), var318 }, false);
                                if (class273.field4805 == null && (!var317 || class139.field2442 == 3 || !class139.field2437.startsWith("win") || class74.field1130)) {
                                    class200.method1413(var317, var319, 3);
                                    continue;
                                }
                                class96.field1560 = var317;
                                class83.field1286 = var319;
                                class101.field1773 = class289.field5052.method953((byte) -44, new String(var319.method782(false), "ISO-8859-1"));
                                continue;
                            }
                            if (var505 == 5422) {
                                var7 -= 2;
                                class108 var320 = class55.field808[var7];
                                class108 var321 = class55.field808[var7 + 1];
                                var6--;
                                int var322 = class253.field4418[var6];
                                if (var320.method776(0) > 0) {
                                    if (class242.field4222 == null) {
                                        class242.field4222 = new class108[class55.field813[class223.field3947]];
                                    }
                                    class242.field4222[var322] = var320;
                                }
                                if (var321.method776(0) > 0) {
                                    if (class271.field4736 == null) {
                                        class271.field4736 = new class108[class55.field813[class223.field3947]];
                                    }
                                    class271.field4736[var322] = var321;
                                }
                                continue;
                            }
                            if (var505 == 5423) {
                                var7--;
                                class55.field808[var7].method778(0);
                                continue;
                            }
                        } else if (var505 < 5600) {
                            if (var505 == 5500) {
                                var6 -= 4;
                                int var352 = class253.field4418[var6];
                                int var353 = class253.field4418[var6 + 1];
                                int var354 = class253.field4418[var6 + 3];
                                int var355 = class253.field4418[var6 + 2];
                                class54.method380(var355, false, arg1 + 10935, ((var352 & 0xFFFF499) >> 14) - class305.field5295, var353, var354, (var352 & 0x3FFF) - class137.field2421);
                                continue;
                            }
                            if (var505 == 5501) {
                                var6 -= 4;
                                int var356 = class253.field4418[var6 + 1];
                                int var357 = class253.field4418[var6];
                                int var358 = class253.field4418[var6 + 3];
                                int var359 = class253.field4418[var6 + 2];
                                class141.method980(var358, ((var357 & 0xFFFE33C) >> 14) - class305.field5295, var359, (var357 & 0x3FFF) - class137.field2421, var356, arg1 + 26061);
                                continue;
                            }
                            if (var505 == 5502) {
                                var6 -= 6;
                                int var360 = class253.field4418[var6];
                                if (var360 >= 2) {
                                    throw new RuntimeException();
                                }
                                class98.field1637 = var360;
                                int var361 = class253.field4418[var6 + 1];
                                if ((class178.field3234[class98.field1637].length >> 1) <= (var361 + 1)) {
                                    throw new RuntimeException();
                                }
                                class313.field5412 = 0;
                                class251.field4384 = var361;
                                class45.field656 = class253.field4418[var6 + 2];
                                class109.field1915 = class253.field4418[var6 + 3];
                                int var362 = class253.field4418[var6 + 4];
                                if (var362 >= 2) {
                                    throw new RuntimeException();
                                }
                                class10.field128 = var362;
                                int var363 = class253.field4418[var6 + 5];
                                if (var363 + 1 >= class178.field3234[class10.field128].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class63.field1021 = 3;
                                class325.field5536 = var363;
                                continue;
                            }
                            if (var505 == 5503) {
                                class63.method437(false);
                                continue;
                            }
                            if (var505 == 5504) {
                                var6 -= 2;
                                class176.field3207 = class253.field4418[var6];
                                class186.field3423 = class253.field4418[var6 + 1];
                                class159.method1102((byte) 85);
                                continue;
                            }
                            if (var505 == 5505) {
                                class253.field4418[var6++] = class176.field3207;
                                continue;
                            }
                            if (var505 == 5506) {
                                class253.field4418[var6++] = class186.field3423;
                                continue;
                            }
                        } else if (var505 < 5700) {
                            if (var505 == 5600) {
                                var7 -= 2;
                                class108 var323 = class55.field808[var7 + 1];
                                class108 var324 = class55.field808[var7];
                                var6--;
                                int var325 = class253.field4418[var6];
                                if (class203.field3658 == 10 && class288.field5038 == 0 && class166.field2988 == 0 && class287.field5022 == 0 && class262.field4632 == 0) {
                                    class129.method891(var323, (byte) 85, var324, var325);
                                }
                                continue;
                            }
                            if (var505 == 5601) {
                                class129.method890(-84);
                                continue;
                            }
                            if (var505 == 5602) {
                                if (class166.field2988 == 0) {
                                    class211.field3766 = -2;
                                }
                                continue;
                            }
                            if (var505 == 5603) {
                                var6 -= 4;
                                if (class203.field3658 == 10 && class288.field5038 == 0 && class166.field2988 == 0 && class287.field5022 == 0 && class262.field4632 == 0) {
                                    class106.method726(class253.field4418[var6], true, class253.field4418[var6 + 1], class253.field4418[var6 + 2], class253.field4418[var6 + 3]);
                                }
                                continue;
                            }
                            if (var505 == 5604) {
                                var7--;
                                if (class203.field3658 == 10 && class288.field5038 == 0 && class166.field2988 == 0 && class287.field5022 == 0 && class262.field4632 == 0) {
                                    class310.method2162(class55.field808[var7].method743(false), (byte) 51);
                                }
                                continue;
                            }
                            if (var505 == 5605) {
                                var6 -= 4;
                                var7 -= 2;
                                if (class203.field3658 == 10 && class288.field5038 == 0 && class166.field2988 == 0 && class287.field5022 == 0 && class262.field4632 == 0) {
                                    class142.method982((byte) -14, class253.field4418[var6 + 2], class55.field808[var7 + 1], class253.field4418[var6], class253.field4418[var6 + 3], class55.field808[var7].method743(false), class253.field4418[var6 + 1]);
                                }
                                continue;
                            }
                            if (var505 == 5606) {
                                if (class287.field5022 == 0) {
                                    class15.field196 = -2;
                                }
                                continue;
                            }
                            if (var505 == 5607) {
                                class253.field4418[var6++] = class211.field3766;
                                continue;
                            }
                            if (var505 == 5608) {
                                class253.field4418[var6++] = class261.field4602;
                                continue;
                            }
                            if (var505 == 5609) {
                                class253.field4418[var6++] = class15.field196;
                                continue;
                            }
                            if (var505 == 5610) {
                                for (int var326 = 0; var326 < 5; var326++) {
                                    class55.field808[var7++] = class142.field2508.length > var326 ? class142.field2508[var326].method755(arg1 + 35561) : class134.field2311;
                                }
                                class142.field2508 = null;
                                continue;
                            }
                            if (var505 == 5611) {
                                class253.field4418[var6++] = class183.field3365;
                                continue;
                            }
                        } else if (var505 < 6100) {
                            if (var505 == 6001) {
                                var6--;
                                int var327 = class253.field4418[var6];
                                if (var327 < 1) {
                                    var327 = 1;
                                }
                                if (var327 > 4) {
                                    var327 = 4;
                                }
                                class269.field4716 = var327;
                                if (!class231.field4051 || !class26.field397) {
                                    if (class269.field4716 == 1) {
                                        class263.method1907(0.9F);
                                    }
                                    if (class269.field4716 == 2) {
                                        class263.method1907(0.8F);
                                    }
                                    if (class269.field4716 == 3) {
                                        class263.method1907(0.7F);
                                    }
                                    if (class269.field4716 == 4) {
                                        class263.method1907(0.6F);
                                    }
                                }
                                if (class231.field4051) {
                                    class122.method852(-94);
                                    if (!class26.field397) {
                                        class254.method1795(arg1 + 37059);
                                    }
                                }
                                class258.method1836(128);
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6002) {
                                var6--;
                                class93.method630(class253.field4418[var6] == 1, (byte) -31);
                                class234.method1633((byte) 103);
                                class254.method1795(10473);
                                class79.method516(0);
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6003) {
                                var6--;
                                class163.field2916 = class253.field4418[var6] == 1;
                                class79.method516(0);
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6005) {
                                var6--;
                                class137.field2427 = class253.field4418[var6] == 1;
                                class254.method1795(10473);
                                class29.method212(arg1 ^ 0xFFFFF3B9, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6006) {
                                var6--;
                                class180.field3277 = class253.field4418[var6] == 1;
                                ((class84) class263.field4661).method577(1, !class180.field3277);
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6007) {
                                var6--;
                                class287.field5018 = class253.field4418[var6] == 1;
                                class29.method212(arg1 ^ 0xFFFFF3B9, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6008) {
                                var6--;
                                class283.field4962 = class253.field4418[var6] == 1;
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6009) {
                                var6--;
                                class312.field5394 = class253.field4418[var6] == 1;
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6010) {
                                var6--;
                                class180.field3280 = class253.field4418[var6] == 1;
                                class29.method212(arg1 ^ 0xFFFFF3B9, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6011) {
                                var6--;
                                int var328 = class253.field4418[var6];
                                if (var328 < 0 || var328 > 2) {
                                    var328 = 0;
                                }
                                class247.field4280 = var328;
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6012) {
                                if (class231.field4051) {
                                    class59.method403(0, (byte) -76, 0);
                                }
                                var6--;
                                class26.field397 = class253.field4418[var6] == 1;
                                if (class231.field4051 && class26.field397) {
                                    class263.method1907(0.7F);
                                } else {
                                    if (class269.field4716 == 1) {
                                        class263.method1907(0.9F);
                                    }
                                    if (class269.field4716 == 2) {
                                        class263.method1907(0.8F);
                                    }
                                    if (class269.field4716 == 3) {
                                        class263.method1907(0.7F);
                                    }
                                    if (class269.field4716 == 4) {
                                        class263.method1907(0.6F);
                                    }
                                }
                                class254.method1795(arg1 ^ 0xFFFFB0CF);
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6014) {
                                var6--;
                                class60.field962 = class253.field4418[var6] == 1;
                                if (class231.field4051) {
                                    class254.method1795(10473);
                                }
                                class29.method212(arg1 + 54137, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6015) {
                                var6--;
                                class221.field3937 = class253.field4418[var6] == 1;
                                if (class231.field4051) {
                                    class122.method852(arg1 ^ 0x6795);
                                }
                                class29.method212(arg1 ^ 0xFFFFF3B9, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6016) {
                                var6--;
                                int var329 = class253.field4418[var6];
                                if (class231.field4051) {
                                    class126.field2126 = true;
                                }
                                if (var329 < 0 || var329 > 2) {
                                    var329 = 0;
                                }
                                class184.field3372 = var329;
                                continue;
                            }
                            if (var505 == 6017) {
                                var6--;
                                class131.field2242 = class253.field4418[var6] == 1;
                                class96.method652(15);
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6018) {
                                var6--;
                                int var330 = class253.field4418[var6];
                                if (var330 < 0) {
                                    var330 = 0;
                                }
                                if (var330 > 127) {
                                    var330 = 127;
                                }
                                class15.field194 = var330;
                                class29.method212(arg1 + 54137, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6019) {
                                var6--;
                                int var331 = class253.field4418[var6];
                                if (var331 < 0) {
                                    var331 = 0;
                                }
                                if (var331 > 255) {
                                    var331 = 255;
                                }
                                if (class203.field3671 != var331) {
                                    if (class203.field3671 == 0 && class155.field2797 != -1) {
                                        class134.method921(0, class96.field1535, var331, arg1 + 17637, false, class155.field2797);
                                        class95.field1524 = false;
                                    } else if (var331 == 0) {
                                        class247.method1694(false);
                                        class95.field1524 = false;
                                    } else {
                                        class155.method1083(var331, (byte) 103);
                                    }
                                    class203.field3671 = var331;
                                }
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6020) {
                                var6--;
                                int var332 = class253.field4418[var6];
                                if (var332 < 0) {
                                    var332 = 0;
                                }
                                if (var332 > 127) {
                                    var332 = 127;
                                }
                                class42.field561 = var332;
                                class29.method212(27551, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6021) {
                                var6--;
                                class87.field1381 = class253.field4418[var6] == 1;
                                class79.method516(0);
                                continue;
                            }
                            if (var505 == 6023) {
                                var6--;
                                int var333 = class253.field4418[var6];
                                if (var333 < 0) {
                                    var333 = 0;
                                }
                                if (var333 > 2) {
                                    var333 = 2;
                                }
                                class165.method1150(var333);
                                class29.method212(arg1 + 54137, class289.field5052);
                                class99.field1758 = false;
                                continue;
                            }
                            if (var505 == 6024) {
                                var6--;
                                int var334 = class253.field4418[var6];
                                if (var334 < 0 || var334 > 2) {
                                    var334 = 0;
                                }
                                class299.field5202 = var334;
                                class29.method212(27551, class289.field5052);
                                continue;
                            }
                        } else if (var505 < 6200) {
                            if (var505 == 6101) {
                                class253.field4418[var6++] = class269.field4716;
                                continue;
                            }
                            if (var505 == 6102) {
                                class253.field4418[var6++] = class251.method1774(903) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6103) {
                                class253.field4418[var6++] = class163.field2916 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6105) {
                                class253.field4418[var6++] = class137.field2427 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6106) {
                                class253.field4418[var6++] = class180.field3277 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6107) {
                                class253.field4418[var6++] = class287.field5018 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6108) {
                                class253.field4418[var6++] = class283.field4962 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6109) {
                                class253.field4418[var6++] = class312.field5394 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6110) {
                                class253.field4418[var6++] = class180.field3280 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6111) {
                                class253.field4418[var6++] = class247.field4280;
                                continue;
                            }
                            if (var505 == 6112) {
                                class253.field4418[var6++] = class26.field397 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6114) {
                                class253.field4418[var6++] = class60.field962 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6115) {
                                class253.field4418[var6++] = class221.field3937 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6116) {
                                class253.field4418[var6++] = class184.field3372;
                                continue;
                            }
                            if (var505 == 6117) {
                                class253.field4418[var6++] = class131.field2242 ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6118) {
                                class253.field4418[var6++] = class15.field194;
                                continue;
                            }
                            if (var505 == 6119) {
                                class253.field4418[var6++] = class203.field3671;
                                continue;
                            }
                            if (var505 == 6120) {
                                class253.field4418[var6++] = class42.field561;
                                continue;
                            }
                            if (var505 == 6121) {
                                if (class231.field4051) {
                                    class253.field4418[var6++] = class231.field4082 ? 1 : 0;
                                } else {
                                    class253.field4418[var6++] = 0;
                                }
                                continue;
                            }
                            if (var505 == 6123) {
                                class253.field4418[var6++] = class165.method1145();
                                continue;
                            }
                            if (var505 == 6124) {
                                class253.field4418[var6++] = class299.field5202;
                                continue;
                            }
                        } else if (var505 < 6300) {
                            if (var505 == 6200) {
                                var6 -= 2;
                                class35.field485 = (short) class253.field4418[var6];
                                if (class35.field485 <= 0) {
                                    class35.field485 = 256;
                                }
                                class45.field642 = (short) class253.field4418[var6 + 1];
                                if (class45.field642 <= 0) {
                                    class45.field642 = 205;
                                }
                                continue;
                            }
                            if (var505 == 6201) {
                                var6 -= 2;
                                class331.field5661 = (short) class253.field4418[var6];
                                if (class331.field5661 <= 0) {
                                    class331.field5661 = 256;
                                }
                                class130.field2229 = (short) class253.field4418[var6 + 1];
                                if (class130.field2229 <= 0) {
                                    class130.field2229 = 320;
                                }
                                continue;
                            }
                            if (var505 == 6202) {
                                var6 -= 4;
                                class137.field2416 = (short) class253.field4418[var6];
                                if (class137.field2416 <= 0) {
                                    class137.field2416 = 1;
                                }
                                class301.field5238 = (short) class253.field4418[var6 + 1];
                                if (class301.field5238 <= 0) {
                                    class301.field5238 = 32767;
                                } else if (class301.field5238 < class137.field2416) {
                                    class301.field5238 = class137.field2416;
                                }
                                class326.field5553 = (short) class253.field4418[var6 + 2];
                                if (class326.field5553 <= 0) {
                                    class326.field5553 = 1;
                                }
                                class52.field773 = (short) class253.field4418[var6 + 3];
                                if (class52.field773 <= 0) {
                                    class52.field773 = 32767;
                                } else if (class326.field5553 > class52.field773) {
                                    class52.field773 = class326.field5553;
                                }
                                continue;
                            }
                            if (var505 == 6203) {
                                class141.method977(class122.field2086.field1688, false, false, 0, class122.field2086.field1673, 0);
                                class253.field4418[var6++] = class234.field4137;
                                class253.field4418[var6++] = class155.field2790;
                                continue;
                            }
                            if (var505 == 6204) {
                                class253.field4418[var6++] = class331.field5661;
                                class253.field4418[var6++] = class130.field2229;
                                continue;
                            }
                            if (var505 == 6205) {
                                class253.field4418[var6++] = class35.field485;
                                class253.field4418[var6++] = class45.field642;
                                continue;
                            }
                        } else if (var505 < 6400) {
                            if (var505 == 6300) {
                                class253.field4418[var6++] = (int) (class118.method835(-1272) / 60000L);
                                continue;
                            }
                            if (var505 == 6301) {
                                class253.field4418[var6++] = (int) (class118.method835(-1272) / 86400000L) - 11745;
                                continue;
                            }
                            if (var505 == 6302) {
                                var6 -= 3;
                                int var347 = class253.field4418[var6];
                                int var348 = class253.field4418[var6 + 2];
                                int var349 = class253.field4418[var6 + 1];
                                class57.field830.clear();
                                class57.field830.set(11, 12);
                                class57.field830.set(var348, var349, var347);
                                class253.field4418[var6++] = (int) (class57.field830.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var505 == 6303) {
                                class57.field830.clear();
                                class57.field830.setTime(new Date(class118.method835(-1272)));
                                class253.field4418[var6++] = class57.field830.get(1);
                                continue;
                            }
                            if (var505 == 6304) {
                                var6--;
                                int var350 = class253.field4418[var6];
                                boolean var351 = true;
                                if (var350 < 0) {
                                    var351 = ((var350 + 1) % 4) == 0;
                                } else if (var350 < 1582) {
                                    var351 = var350 % 4 == 0;
                                } else if ((var350 % 4) != 0) {
                                    var351 = false;
                                } else if (var350 % 100 != 0) {
                                    var351 = true;
                                } else if (var350 % 400 != 0) {
                                    var351 = false;
                                }
                                class253.field4418[var6++] = var351 ? 1 : 0;
                                continue;
                            }
                        } else if (var505 < 6500) {
                            if (var505 == 6405) {
                                class253.field4418[var6++] = class45.method323(-104) ? 1 : 0;
                                continue;
                            }
                            if (var505 == 6406) {
                                class253.field4418[var6++] = class26.method173(true) ? 1 : 0;
                                continue;
                            }
                        } else if (var505 < 6600) {
                            if (var505 == 6500) {
                                if (class203.field3658 == 10 && class288.field5038 == 0 && class166.field2988 == 0 && class287.field5022 == 0) {
                                    class253.field4418[var6++] = class180.method1306(-21018) == -1 ? 0 : 1;
                                    continue;
                                }
                                class253.field4418[var6++] = 1;
                                continue;
                            }
                            if (var505 == 6501) {
                                class278 var335 = class147.method1024((byte) -24);
                                if (var335 == null) {
                                    class253.field4418[var6++] = -1;
                                    class253.field4418[var6++] = 0;
                                    class55.field808[var7++] = class134.field2311;
                                    class253.field4418[var6++] = 0;
                                    class55.field808[var7++] = class134.field2311;
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var335.field4887;
                                    class253.field4418[var6++] = var335.field2868;
                                    class55.field808[var7++] = var335.field4881;
                                    class285 var336 = var335.method2008(0);
                                    class253.field4418[var6++] = var336.field4977;
                                    class55.field808[var7++] = var336.field4984;
                                    class253.field4418[var6++] = var335.field2880;
                                }
                                continue;
                            }
                            if (var505 == 6502) {
                                class278 var337 = class170.method1179((byte) 113);
                                if (var337 == null) {
                                    class253.field4418[var6++] = -1;
                                    class253.field4418[var6++] = 0;
                                    class55.field808[var7++] = class134.field2311;
                                    class253.field4418[var6++] = 0;
                                    class55.field808[var7++] = class134.field2311;
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var337.field4887;
                                    class253.field4418[var6++] = var337.field2868;
                                    class55.field808[var7++] = var337.field4881;
                                    class285 var338 = var337.method2008(0);
                                    class253.field4418[var6++] = var338.field4977;
                                    class55.field808[var7++] = var338.field4984;
                                    class253.field4418[var6++] = var337.field2880;
                                }
                                continue;
                            }
                            if (var505 == 6503) {
                                var6--;
                                int var339 = class253.field4418[var6];
                                if (class203.field3658 == 10 && class288.field5038 == 0 && class166.field2988 == 0 && class287.field5022 == 0) {
                                    class253.field4418[var6++] = class286.method2047(var339, (byte) 30) ? 1 : 0;
                                    continue;
                                }
                                class253.field4418[var6++] = 0;
                                continue;
                            }
                            if (var505 == 6504) {
                                var6--;
                                class95.field1523 = class253.field4418[var6];
                                class29.method212(arg1 + 54137, class289.field5052);
                                continue;
                            }
                            if (var505 == 6505) {
                                class253.field4418[var6++] = class95.field1523;
                                continue;
                            }
                            if (var505 == 6506) {
                                var6--;
                                int var340 = class253.field4418[var6];
                                class278 var341 = class135.method926(var340, 846281444);
                                if (var341 == null) {
                                    class253.field4418[var6++] = -1;
                                    class55.field808[var7++] = class134.field2311;
                                    class253.field4418[var6++] = 0;
                                    class55.field808[var7++] = class134.field2311;
                                    class253.field4418[var6++] = 0;
                                } else {
                                    class253.field4418[var6++] = var341.field2868;
                                    class55.field808[var7++] = var341.field4881;
                                    class285 var342 = var341.method2008(arg1 + 26586);
                                    class253.field4418[var6++] = var342.field4977;
                                    class55.field808[var7++] = var342.field4984;
                                    class253.field4418[var6++] = var341.field2880;
                                }
                                continue;
                            }
                            if (var505 == 6507) {
                                var6 -= 4;
                                int var343 = class253.field4418[var6 + 2];
                                int var344 = class253.field4418[var6];
                                boolean var345 = class253.field4418[var6 + 1] == 1;
                                boolean var346 = class253.field4418[var6 + 3] == 1;
                                class35.method242(var343, (byte) 1, var344, var345, var346);
                                continue;
                            }
                        } else if (var505 < 6700) {
                            if (var505 == 6600) {
                                var6--;
                                class282.field4939 = class253.field4418[var6] == 1;
                                class29.method212(arg1 + 54137, class289.field5052);
                                continue;
                            }
                            if (var505 == 6601) {
                                class253.field4418[var6++] = class282.field4939 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var505 == 4400) {
                        var6 -= 2;
                        int var364 = class253.field4418[var6 + 1];
                        int var365 = class253.field4418[var6];
                        class251 var366 = class72.method480(var364, 0);
                        if (var366.method1772(true)) {
                            class55.field808[var7++] = class201.method1424(var365, (byte) 105).method422((byte) -67, var366.field4379, var364);
                        } else {
                            class253.field4418[var6++] = class201.method1424(var365, (byte) 98).method421(var364, var366.field4385, false);
                        }
                        continue;
                    }
                } else {
                    class98 var465;
                    if (var505 >= 2000) {
                        var6--;
                        var465 = class168.method1173(class253.field4418[var6], -1456948048);
                        var505 -= 1000;
                    } else {
                        var465 = var46 ? class242.field4219 : class296.field5162;
                    }
                    if (var505 == 1300) {
                        var6--;
                        int var466 = class253.field4418[var6] - 1;
                        if (var466 >= 0 && var466 <= 9) {
                            var7--;
                            var465.method675(class55.field808[var7], 0, var466);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var505 == 1301) {
                        var6 -= 2;
                        int var467 = class253.field4418[var6];
                        int var468 = class253.field4418[var6 + 1];
                        var465.field1616 = class45.method324(var468, var467, (byte) 77);
                        continue;
                    }
                    if (var505 == 1302) {
                        var6--;
                        var465.field1619 = class253.field4418[var6] == 1;
                        continue;
                    }
                    if (var505 == 1303) {
                        var6--;
                        var465.field1645 = class253.field4418[var6];
                        continue;
                    }
                    if (var505 == 1304) {
                        var6--;
                        var465.field1683 = class253.field4418[var6];
                        continue;
                    }
                    if (var505 == 1305) {
                        var7--;
                        var465.field1669 = class55.field808[var7];
                        continue;
                    }
                    if (var505 == 1306) {
                        var7--;
                        var465.field1628 = class55.field808[var7];
                        continue;
                    }
                    if (var505 == 1307) {
                        var465.field1585 = null;
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var504) {
            if (var5.field1213 == null) {
                if (class220.field3910 != 0) {
                    class210.method1456(class170.field3042, 0, -112, class134.field2311);
                }
                class171.method1188(64, "CS2 - scr:" + var5.field3375 + " op:" + var11, var504);
            } else {
                class108 var500 = class219.method1510(30, true);
                var500.method759(class210.field3753, false).method759(var5.field1213, false);
                for (int var501 = class122.field2087 - 1; var501 >= 0; var501--) {
                    var500.method759(class79.field1197, false).method759(class303.field5256[var501].field3636.field1213, false);
                }
                if (var11 == 40) {
                    int var502 = var10[var8];
                    var500.method759(client.field4532, false).method759(class79.method518(false, var502), false);
                }
                if (class220.field3910 != 0) {
                    class210.method1456(class117.method833(new class108[] { class114.field1958, var5.field1213 }, false), 0, -92, class134.field2311);
                }
                class171.method1188(64, "CS2 - scr:" + var5.field3375 + " op:" + var11 + new String(var500.method782(false)), var504);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V", line = 6203)
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class269.field4717 = 0;
        for (int var7 = -1; var7 < (class61.field969 + class43.field569); var7++) {
            class256 var8;
            if (var7 == -1) {
                var8 = class95.field1513;
            } else if (var7 < class43.field569) {
                var8 = class96.field1558[class194.field3511[var7]];
            } else {
                var8 = class159.field2863[class168.field3020[var7 - class43.field569]];
            }
            if (var8 != null && var8.method319(true)) {
                if (var8 instanceof class45) {
                    class136 var9 = ((class45) var8).field646;
                    if (var9.field2396 != null) {
                        var9 = var9.method938((byte) -35);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class43.field569) {
                    class136 var15 = ((class45) var8).field646;
                    if (var15.field2396 != null) {
                        var15 = var15.method938((byte) -35);
                    }
                    if (var15.field2400 >= 0 && var15.field2400 < class291.field5089.length) {
                        int var16;
                        if (var15.field2380 == -1) {
                            var16 = var8.method1808(111) + 15;
                        } else {
                            var16 = var15.field2380 + 15;
                        }
                        class174.method1238(arg3 >> 1, var8, arg0, var16, arg5, (byte) -19, arg6 >> 1);
                        if (class169.field3035 > -1) {
                            class291.field5089[var15.field2400].method81(arg2 + class169.field3035 - 12, arg4 - -class180.field3307 + -30);
                        }
                    }
                    class295[] var17 = class121.field2075;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class295 var19 = var17[var18];
                        if (var19 != null && var19.field5146 == 1 && class168.field3020[var7 - class43.field569] == var19.field5139 && (class116.field2000 % 20) < 10) {
                            int var20;
                            if (var15.field2380 == -1) {
                                var20 = var8.method1808(122) + 15;
                            } else {
                                var20 = var15.field2380 + 15;
                            }
                            class174.method1238(arg3 >> 1, var8, arg0, var20, arg5, (byte) -19, arg6 >> 1);
                            if (class169.field3035 > -1) {
                                class86.field1362[var19.field5147].method81(arg2 + class169.field3035 - 12, arg4 + -28 + class180.field3307);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class51 var11 = (class51) var8;
                    if (var11.field734 != -1 || var11.field749 != -1) {
                        class174.method1238(arg3 >> 1, var8, arg0, var8.method1808(69) + 15, arg5, (byte) -19, arg6 >> 1);
                        if (class169.field3035 > -1) {
                            if (var11.field734 != -1) {
                                class145.field2624[var11.field734].method81(class169.field3035 + arg2 - 12, -var10 + class180.field3307 + arg4);
                                var10 += 25;
                            }
                            if (var11.field749 != -1) {
                                class291.field5089[var11.field749].method81(class169.field3035 + arg2 - 12, -var10 + arg4 + class180.field3307);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class295[] var13 = class121.field2075;
                        while (var12 < var13.length) {
                            class295 var14 = var13[var12];
                            if (var14 != null && var14.field5146 == 10 && class194.field3511[var7] == var14.field5139) {
                                class174.method1238(arg3 >> 1, var8, arg0, var8.method1808(123) + 15, arg5, (byte) -19, arg6 >> 1);
                                if (class169.field3035 > -1) {
                                    class86.field1362[var14.field5147].method81(class169.field3035 + arg2 - 12, -var10 + arg4 + class180.field3307);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field4467 != null && (var7 >= class43.field569 || class169.field3027 == 0 || class169.field3027 == 3 || class169.field3027 == 1 && class288.method2058(0, ((class51) var8).field757))) {
                    class174.method1238(arg3 >> 1, var8, arg0, var8.method1808(64), arg5, (byte) -19, arg6 >> 1);
                    if (class169.field3035 > -1 && class326.field5557 > class269.field4717) {
                        class326.field5562[class269.field4717] = class256.field4525.method543(var8.field4467) / 2;
                        class326.field5573[class269.field4717] = class256.field4525.field1214;
                        class326.field5546[class269.field4717] = class169.field3035;
                        class326.field5567[class269.field4717] = class180.field3307;
                        class326.field5571[class269.field4717] = var8.field4511;
                        class326.field5569[class269.field4717] = var8.field4523;
                        class326.field5574[class269.field4717] = var8.field4524;
                        class326.field5564[class269.field4717] = var8.field4467;
                        class269.field4717++;
                    }
                }
                if (var8.field4491 > class116.field2000) {
                    class135 var21 = class298.field5188[0];
                    class135 var22 = class298.field5188[1];
                    int var23;
                    if ((var8 instanceof class45)) {
                        class45 var24 = (class45) var8;
                        class135[] var25 = (class135[]) ((class135[]) class293.field5122.method642((long) var24.field646.field2397, (byte) -113));
                        if (var25 == null) {
                            var25 = class83.method557(class215.field3801, 0, var24.field646.field2397, (byte) 56);
                            if (var25 != null) {
                                class293.field5122.method643((byte) -49, (long) var24.field646.field2397, var25);
                            }
                        }
                        if (var25 != null && var25.length == 2) {
                            var22 = var25[1];
                            var21 = var25[0];
                        }
                        class136 var26 = var24.field646;
                        if (var26.field2380 == -1) {
                            var23 = var8.method1808(77);
                        } else {
                            var23 = var26.field2380;
                        }
                    } else {
                        var23 = var8.method1808(arg1 ^ 0x49);
                    }
                    class174.method1238(arg3 >> 1, var8, arg0, var23 - (-var21.field2329 - 10), arg5, (byte) -19, arg6 >> 1);
                    if (class169.field3035 > -1) {
                        int var27 = class180.field3307 + arg4 - 3;
                        int var28 = class169.field3035 + arg2 - (var21.field2347 >> 1);
                        var21.method81(var28, var27);
                        int var29 = var8.field4489 * var21.field2347 / 255;
                        int var30 = var21.field2329;
                        if (class231.field4051) {
                            class50.method350(var28, var27, var28 + var29, var27 - -var30);
                        } else {
                            class28.method180(var28, var27, var28 + var29, var27 + var30);
                        }
                        var22.method81(var28, var27);
                        if (class231.field4051) {
                            class50.method345(arg2, arg4, arg2 + arg6, arg3 + arg4);
                        } else {
                            class28.method185(arg2, arg4, arg2 + arg6, arg3 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field4454[var31] > class116.field2000) {
                        int var32;
                        if ((var8 instanceof class45)) {
                            class45 var33 = (class45) var8;
                            class136 var34 = var33.field646;
                            if (var34.field2380 == -1) {
                                var32 = var8.method1808(65) / 2;
                            } else {
                                var32 = var34.field2380 / 2;
                            }
                        } else {
                            var32 = var8.method1808(119) / 2;
                        }
                        class174.method1238(arg3 >> 1, var8, arg0, var32, arg5, (byte) -19, arg6 >> 1);
                        if (class169.field3035 > -1) {
                            if (var31 == 1) {
                                class180.field3307 -= 20;
                            }
                            if (var31 == 2) {
                                class169.field3035 -= 15;
                                class180.field3307 -= 10;
                            }
                            if (var31 == 3) {
                                class169.field3035 += 15;
                                class180.field3307 -= 10;
                            }
                            class270.field4732[var8.field4477[var31]].method81(class169.field3035 + arg2 - 12, class180.field3307 + arg4 + -12);
                            class223.field3953.method545(class79.method518(false, var8.field4451[var31]), arg2 + class169.field3035 - 1, class180.field3307 + 3 + arg4, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg1 != 1) {
            method1470(-78, 69, (class286) null);
        }
        field3796++;
        for (int var35 = 0; var35 < class269.field4717; var35++) {
            int var36 = class326.field5546[var35];
            int var37 = class326.field5562[var35];
            int var38 = class326.field5567[var35];
            boolean var39 = true;
            int var40 = class326.field5573[var35];
            while (var39) {
                var39 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class326.field5567[var41] - class326.field5573[var41]) < (var38 + 2) && var38 - var40 < class326.field5567[var41] + 2 && (class326.field5546[var41] + class326.field5562[var41]) > (var36 - var37) && (var36 + var37) > (class326.field5546[var41] - class326.field5562[var41]) && var38 > (class326.field5567[var41] - class326.field5573[var41])) {
                        var38 = class326.field5567[var41] - class326.field5573[var41];
                        var39 = true;
                    }
                }
            }
            class169.field3035 = class326.field5546[var35];
            class180.field3307 = class326.field5567[var35] = var38;
            class108 var42 = class326.field5564[var35];
            if (class220.field3917 == 0) {
                int var43 = 16776960;
                if (class326.field5571[var35] < 6) {
                    var43 = class2.field40[class326.field5571[var35]];
                }
                if (class326.field5571[var35] == 6) {
                    var43 = (class278.field4886 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class326.field5571[var35] == 7) {
                    var43 = (class278.field4886 % 20) < 10 ? 255 : 65535;
                }
                if (class326.field5571[var35] == 8) {
                    var43 = class278.field4886 % 20 < 10 ? 45056 : 8454016;
                }
                if (class326.field5571[var35] == 9) {
                    int var44 = 150 - class326.field5574[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = (var44 * 5) + 64780;
                    }
                }
                if (class326.field5571[var35] == 10) {
                    int var45 = 150 - class326.field5574[var35];
                    if (var45 < 50) {
                        var43 = (var45 * 5) + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 + 16711935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + (255 - var45 * 5) + 500;
                    }
                }
                if (class326.field5571[var35] == 11) {
                    int var46 = 150 - class326.field5574[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 32768000 + 16777215 - (var46 * 327680);
                    }
                }
                if (class326.field5569[var35] == 0) {
                    class256.field4525.method545(var42, class169.field3035 + arg2, arg4 - -class180.field3307, var43, 0);
                }
                if (class326.field5569[var35] == 1) {
                    class256.field4525.method523(var42, class169.field3035 + arg2, class180.field3307 + arg4, var43, 0, class278.field4886);
                }
                if (class326.field5569[var35] == 2) {
                    class256.field4525.method532(var42, arg2 + class169.field3035, arg4 - -class180.field3307, var43, 0, class278.field4886);
                }
                if (class326.field5569[var35] == 3) {
                    class256.field4525.method544(var42, class169.field3035 + arg2, arg4 - -class180.field3307, var43, 0, class278.field4886, 150 - class326.field5574[var35]);
                }
                if (class326.field5569[var35] == 4) {
                    int var47 = (150 - class326.field5574[var35]) * (class256.field4525.method543(var42) + 100) / 150;
                    if (class231.field4051) {
                        class50.method350(arg2 + class169.field3035 - 50, arg4, arg2 + class169.field3035 + 50, arg3 + arg4);
                    } else {
                        class28.method180(arg2 + class169.field3035 - 50, arg4, class169.field3035 + arg2 + 50, arg3 + arg4);
                    }
                    class256.field4525.method520(var42, class169.field3035 + arg2 + 50 - var47, class180.field3307 + arg4, var43, 0);
                    if (class231.field4051) {
                        class50.method345(arg2, arg4, arg2 + arg6, arg3 + arg4);
                    } else {
                        class28.method185(arg2, arg4, arg2 + arg6, arg3 + arg4);
                    }
                }
                if (class326.field5569[var35] == 5) {
                    int var48 = 150 - class326.field5574[var35];
                    if (class231.field4051) {
                        class50.method350(arg2, class180.field3307 + arg4 - class256.field4525.field1214 - 1, arg2 - -arg6, class180.field3307 + arg4 + 5);
                    } else {
                        class28.method180(arg2, class180.field3307 + arg4 - class256.field4525.field1214 - 1, arg2 + arg6, arg4 + class180.field3307 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class256.field4525.method545(var42, class169.field3035 + arg2, class180.field3307 + arg4 + var49, var43, 0);
                    if (class231.field4051) {
                        class50.method345(arg2, arg4, arg2 + arg6, arg4 - -arg3);
                    } else {
                        class28.method185(arg2, arg4, arg2 + arg6, arg3 + arg4);
                    }
                }
            } else {
                class256.field4525.method545(var42, class169.field3035 + arg2, class180.field3307 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 6693)
    public static void method1472(byte arg0) {
        if (arg0 >= -4) {
            field3793 = (class131) null;
        }
        field3793 = null;
        field3789 = null;
        field3795 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([S[Lsf;B)V", line = 6707)
    public static final void method1473(short[] arg0, class108[] arg1, byte arg2) {
        class249.method1718(arg0, arg2 ^ 0x7D, arg1, arg1.length - 1, 0);
        field3797++;
        if (arg2 != -27) {
            method1472((byte) -103);
        }
    }
}
