import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public abstract class class74 extends class25 {

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field1170 = 0;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Ldf;")
    public static class51 field1173 = class46.method233("::clientdrop", 100);

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Ldf;")
    public static class51 field1177 = null;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "Lbg;")
    public static class217 field1172 = new class217(64);

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "Ldf;")
    private static class51 field1180 = class46.method233("Loading config )2 ", 100);

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "[I")
    public static int[] field1181 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "Ldf;")
    public static class51 field1179 = field1180;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
    public static int field1182 = 0;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "I")
    public static int field1183 = 0;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "[Lnf;")
    public static class149[] field1175;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method476(boolean arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lu;I)V")
    public static final void method528(class111 arg0, int arg1) {
        field1171++;
        class143.field2398 = arg0.method810(class225.field3967, arg1);
        class228.field3983 = arg0.method810(class2.field11, arg1);
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public static void method529(int arg0) {
        field1173 = null;
        field1177 = null;
        field1172 = null;
        int var1 = 98 / ((arg0 + 18) / 54);
        field1179 = null;
        field1181 = null;
        field1180 = null;
        field1175 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ldf;ILdf;I)V")
    public static final void method530(class51 arg0, int arg1, class51 arg2, int arg3) {
        class241.field4188 = 0;
        class43.field695 = arg0;
        field1174++;
        class258.field4508 = arg3;
        class156.field2578 = false;
        class43.field697 = arg2;
        if (class43.field697.method315(false, class43.field696) || class43.field695.method315(false, class43.field696)) {
            class24.field364 = 0;
            class63.field1033 = 3;
        } else {
            class26.field385 = arg1;
            class125.field2122 = 0;
            class63.field1033 = -3;
            class24.field364 = 1;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)Z")
    public abstract boolean method477(boolean arg0);

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILre;)V")
    public static final void method531(int arg0, int arg1, class205 arg2) {
        Object[] var3 = arg2.field3423;
        int var4 = (Integer) var3[0];
        field1176++;
        class50 var5 = class132.method972(-104, var4);
        if (var5 == null) {
            return;
        }
        class38.field586 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = -1;
        int var9 = 53 % ((31 - arg1) / 50);
        int[] var10 = var5.field798;
        int[] var11 = var5.field803;
        byte var12 = -1;
        try {
            class218.field3791 = new class51[var5.field790];
            int var13 = 0;
            class63.field1032 = new int[var5.field802];
            int var14 = 0;
            for (int var15 = 1; var15 < var3.length; var15++) {
                if (var3[var15] instanceof Integer) {
                    int var16 = (Integer) var3[var15];
                    if (var16 == -2147483647) {
                        var16 = arg2.field3434;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg2.field3438;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg2.field3433 == null ? -1 : arg2.field3433.field3703;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg2.field3422;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg2.field3433 == null ? -1 : arg2.field3433.field3568;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg2.field3431 == null ? -1 : arg2.field3431.field3703;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg2.field3431 == null ? -1 : arg2.field3431.field3568;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg2.field3425;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg2.field3430;
                    }
                    class63.field1032[var13++] = var16;
                } else if (var3[var15] instanceof class51) {
                    class51 var17 = (class51) var3[var15];
                    if (var17.method315(false, class70.field1131)) {
                        var17 = arg2.field3427;
                    }
                    class218.field3791[var14++] = var17;
                }
            }
            int var18 = 0;
            label3391: while (true) {
                var18++;
                if (var18 > arg0) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var452 = var10[var8];
                if (var452 < 100) {
                    if (var452 == 0) {
                        class115.field1955[var6++] = var11[var8];
                        continue;
                    }
                    if (var452 == 1) {
                        int var19 = var11[var8];
                        class115.field1955[var6++] = class30.field439[var19];
                        continue;
                    }
                    if (var452 == 2) {
                        int var20 = var11[var8];
                        var6--;
                        class261.method1775(class115.field1955[var6], var20, -11828);
                        continue;
                    }
                    if (var452 == 3) {
                        class70.field1132[var7++] = var5.field789[var8];
                        continue;
                    }
                    if (var452 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var452 == 7) {
                        var6 -= 2;
                        if (class115.field1955[var6 + 1] != class115.field1955[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var452 == 8) {
                        var6 -= 2;
                        if (class115.field1955[var6 + 1] == class115.field1955[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var452 == 9) {
                        var6 -= 2;
                        if (class115.field1955[var6 + 1] > class115.field1955[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var452 == 10) {
                        var6 -= 2;
                        if (class115.field1955[var6 + 1] < class115.field1955[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var452 == 21) {
                        if (class38.field586 == 0) {
                            return;
                        }
                        class31 var21 = class3.field17[--class38.field586];
                        class63.field1032 = var21.field450;
                        class218.field3791 = var21.field455;
                        var8 = var21.field444;
                        var5 = var21.field454;
                        var11 = var5.field803;
                        var10 = var5.field798;
                        continue;
                    }
                    if (var452 == 25) {
                        int var22 = var11[var8];
                        class115.field1955[var6++] = class149.method1078((byte) -126, var22);
                        continue;
                    }
                    if (var452 == 27) {
                        int var23 = var11[var8];
                        var6--;
                        class8.method38(0, class115.field1955[var6], var23);
                        continue;
                    }
                    if (var452 == 31) {
                        var6 -= 2;
                        if (class115.field1955[var6] <= class115.field1955[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var452 == 32) {
                        var6 -= 2;
                        if (class115.field1955[var6 + 1] <= class115.field1955[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var452 == 33) {
                        class115.field1955[var6++] = class63.field1032[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var452 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class63.field1032[var10001] = class115.field1955[var6];
                        continue;
                    }
                    if (var452 == 35) {
                        class70.field1132[var7++] = class218.field3791[var11[var8]];
                        continue;
                    }
                    if (var452 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class218.field3791[var10001] = class70.field1132[var7];
                        continue;
                    }
                    if (var452 == 37) {
                        int var24 = var11[var8];
                        var7 -= var24;
                        class51 var25 = class146.method1044(var7, class70.field1132, var24, true);
                        class70.field1132[var7++] = var25;
                        continue;
                    }
                    if (var452 == 38) {
                        var6--;
                        continue;
                    }
                    if (var452 == 39) {
                        var7--;
                        continue;
                    }
                    if (var452 == 40) {
                        int var26 = var11[var8];
                        class50 var27 = class132.method972(-113, var26);
                        class51[] var28 = new class51[var27.field790];
                        int[] var29 = new int[var27.field802];
                        for (int var30 = 0; var30 < var27.field791; var30++) {
                            var29[var30] = class115.field1955[var6 + var30 - var27.field791];
                        }
                        for (int var31 = 0; var31 < var27.field794; var31++) {
                            var28[var31] = class70.field1132[var7 + var31 - var27.field794];
                        }
                        var7 -= var27.field794;
                        var6 -= var27.field791;
                        class31 var32 = new class31();
                        var32.field455 = class218.field3791;
                        var32.field450 = class63.field1032;
                        var32.field444 = var8;
                        var32.field454 = var5;
                        if (class3.field17.length <= class38.field586) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class3.field17[class38.field586++] = var32;
                        var5 = var27;
                        var11 = var27.field803;
                        class218.field3791 = var28;
                        var10 = var27.field798;
                        class63.field1032 = var29;
                        continue;
                    }
                    if (var452 == 42) {
                        class115.field1955[var6++] = class151.field2512[var11[var8]];
                        continue;
                    }
                    if (var452 == 43) {
                        int var33 = var11[var8];
                        var6--;
                        class151.field2512[var33] = class115.field1955[var6];
                        class35.method176(var33, 1);
                        continue;
                    }
                    if (var452 == 44) {
                        int var34 = var11[var8] >> 16;
                        var6--;
                        int var35 = class115.field1955[var6];
                        int var36 = var11[var8] & 0xFFFF;
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var37 = -1;
                            class212.field3517[var34] = var35;
                            if (var36 == 105) {
                                var37 = 0;
                            }
                            int var38 = 0;
                            while (true) {
                                if (var38 >= var35) {
                                    continue label3391;
                                }
                                class47.field744[var34][var38] = var37;
                                var38++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var452 == 45) {
                        var6--;
                        int var39 = class115.field1955[var6];
                        int var40 = var11[var8];
                        if (var39 >= 0 && var39 < class212.field3517[var40]) {
                            class115.field1955[var6++] = class47.field744[var40][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var452 == 46) {
                        var6 -= 2;
                        int var41 = var11[var8];
                        int var42 = class115.field1955[var6];
                        if (var42 >= 0 && var42 < class212.field3517[var41]) {
                            class47.field744[var41][var42] = class115.field1955[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var452 == 47) {
                        class51 var43 = class84.field1417[var11[var8]];
                        if (var43 == null) {
                            var43 = class121.field2012;
                        }
                        class70.field1132[var7++] = var43;
                        continue;
                    }
                    if (var452 == 48) {
                        int var44 = var11[var8];
                        var7--;
                        class84.field1417[var44] = class70.field1132[var7];
                        class109.method792((byte) 105, var44);
                        continue;
                    }
                    if (var452 == 51) {
                        class212 var45 = var5.field801[var11[var8]];
                        var6--;
                        class255 var46 = (class255) var45.method1453((long) class115.field1955[var6], 1);
                        if (var46 != null) {
                            var8 += var46.field4454;
                        }
                        continue;
                    }
                }
                boolean var47;
                if (var11[var8] == 1) {
                    var47 = true;
                } else {
                    var47 = false;
                }
                if (var452 < 300) {
                    if (var452 == 100) {
                        var6 -= 3;
                        int var430 = class115.field1955[var6];
                        int var431 = class115.field1955[var6 + 1];
                        int var432 = class115.field1955[var6 + 2];
                        if (var431 == 0) {
                            throw new RuntimeException();
                        }
                        class213 var433 = class198.method1392(11823, var430);
                        if (var433.field3556 == null) {
                            var433.field3556 = new class213[var432 + 1];
                        }
                        if (var432 >= var433.field3556.length) {
                            class213[] var434 = new class213[var432 + 1];
                            for (int var435 = 0; var435 < var433.field3556.length; var435++) {
                                var434[var435] = var433.field3556[var435];
                            }
                            var433.field3556 = var434;
                        }
                        if (var432 > 0 && var433.field3556[var432 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var432 - 1));
                        }
                        class213 var436 = new class213();
                        var436.field3623 = var431;
                        var436.field3574 = true;
                        var436.field3689 = var436.field3703 = var433.field3703;
                        var436.field3568 = var432;
                        var433.field3556[var432] = var436;
                        if (var47) {
                            class243.field4212 = var436;
                        } else {
                            class8.field82 = var436;
                        }
                        class25.method135(var433, -28014);
                        continue;
                    }
                    if (var452 == 101) {
                        class213 var437 = var47 ? class243.field4212 : class8.field82;
                        if (var437.field3568 == -1) {
                            if (!var47) {
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            throw new RuntimeException("Tried to .cc_delete static .active-component!");
                        }
                        class213 var438 = class198.method1392(11823, var437.field3703);
                        var438.field3556[var437.field3568] = null;
                        class25.method135(var438, -28014);
                        continue;
                    }
                    if (var452 == 102) {
                        var6--;
                        class213 var439 = class198.method1392(11823, class115.field1955[var6]);
                        var439.field3556 = null;
                        class25.method135(var439, -28014);
                        continue;
                    }
                    if (var452 == 200) {
                        var6 -= 2;
                        int var440 = class115.field1955[var6];
                        int var441 = class115.field1955[var6 + 1];
                        class213 var442 = class198.method1395(-1, var441, var440);
                        if (var442 != null && var441 != -1) {
                            class115.field1955[var6++] = 1;
                            if (var47) {
                                class243.field4212 = var442;
                            } else {
                                class8.field82 = var442;
                            }
                            continue;
                        }
                        class115.field1955[var6++] = 0;
                        continue;
                    }
                    if (var452 == 201) {
                        var6--;
                        int var443 = class115.field1955[var6];
                        class213 var444 = class198.method1392(11823, var443);
                        if (var444 == null) {
                            class115.field1955[var6++] = 0;
                        } else {
                            class115.field1955[var6++] = 1;
                            if (var47) {
                                class243.field4212 = var444;
                            } else {
                                class8.field82 = var444;
                            }
                        }
                        continue;
                    }
                } else if (var452 < 500) {
                    if (var452 == 403) {
                        var6 -= 2;
                        int var48 = class115.field1955[var6 + 1];
                        int var49 = class115.field1955[var6];
                        if (var49 >= 7) {
                            var49 -= 7;
                        }
                        class44.field706.field1708.method1024(121, var49, var48);
                        continue;
                    }
                    if (var452 == 404) {
                        var6 -= 2;
                        int var50 = class115.field1955[var6];
                        int var51 = class115.field1955[var6 + 1];
                        class44.field706.field1708.method1030(var51, (byte) 93, var50);
                        continue;
                    }
                    if (var452 == 410) {
                        var6--;
                        boolean var52 = class115.field1955[var6] != 0;
                        class44.field706.field1708.method1028((byte) 50, var52);
                        continue;
                    }
                } else if (!(var452 < 1000 || var452 >= 1100) || !(var452 < 2000 || var452 >= 2100)) {
                    class213 var424;
                    if (var452 < 2000) {
                        var424 = var47 ? class243.field4212 : class8.field82;
                    } else {
                        var452 -= 1000;
                        var6--;
                        var424 = class198.method1392(11823, class115.field1955[var6]);
                    }
                    if (var452 == 1000) {
                        var6 -= 4;
                        var424.field3690 = class115.field1955[var6];
                        var424.field3674 = class115.field1955[var6 + 1];
                        int var425 = class115.field1955[var6 + 3];
                        int var426 = class115.field1955[var6 + 2];
                        if (var426 < 0) {
                            var426 = 0;
                        } else if (var426 > 5) {
                            var426 = 5;
                        }
                        if (var425 < 0) {
                            var425 = 0;
                        } else if (var425 > 5) {
                            var425 = 5;
                        }
                        var424.field3681 = (byte) var425;
                        var424.field3651 = (byte) var426;
                        class25.method135(var424, -28014);
                        class242.method1658((byte) 79, var424);
                        continue;
                    }
                    if (var452 == 1001) {
                        var6 -= 4;
                        var424.field3540 = class115.field1955[var6];
                        var424.field3694 = class115.field1955[var6 + 1];
                        var424.field3560 = 0;
                        var424.field3582 = 0;
                        int var427 = class115.field1955[var6 + 2];
                        if (var427 < 0) {
                            var427 = 0;
                        } else if (var427 > 4) {
                            var427 = 4;
                        }
                        int var428 = class115.field1955[var6 + 3];
                        var424.field3644 = (byte) var427;
                        if (var428 < 0) {
                            var428 = 0;
                        } else if (var428 > 4) {
                            var428 = 4;
                        }
                        var424.field3552 = (byte) var428;
                        class25.method135(var424, -28014);
                        class242.method1658((byte) 87, var424);
                        if (var424.field3623 == 0) {
                            class97.method718(-29, false, var424);
                        }
                        continue;
                    }
                    if (var452 == 1003) {
                        var6--;
                        boolean var429 = class115.field1955[var6] == 1;
                        if (var424.field3700 != var429) {
                            var424.field3700 = var429;
                            class25.method135(var424, -28014);
                        }
                        continue;
                    }
                    if (var452 == 1004) {
                        var6 -= 2;
                        var424.field3569 = class115.field1955[var6];
                        var424.field3658 = class115.field1955[var6 + 1];
                        class25.method135(var424, -28014);
                        class242.method1658((byte) 95, var424);
                        if (var424.field3623 == 0) {
                            class97.method718(-69, false, var424);
                        }
                        continue;
                    }
                } else if (var452 >= 1100 && var452 < 1200 || var452 >= 2100 && var452 < 2200) {
                    class213 var421;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var6--;
                        var421 = class198.method1392(11823, class115.field1955[var6]);
                    } else {
                        var421 = var47 ? class243.field4212 : class8.field82;
                    }
                    if (var452 == 1100) {
                        var6 -= 2;
                        var421.field3648 = class115.field1955[var6];
                        if (var421.field3648 > (var421.field3591 - var421.field3603)) {
                            var421.field3648 = var421.field3591 - var421.field3603;
                        }
                        if (var421.field3648 < 0) {
                            var421.field3648 = 0;
                        }
                        var421.field3593 = class115.field1955[var6 + 1];
                        if (var421.field3546 - var421.field3608 < var421.field3593) {
                            var421.field3593 = var421.field3546 - var421.field3608;
                        }
                        if (var421.field3593 < 0) {
                            var421.field3593 = 0;
                        }
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1101) {
                        var6--;
                        var421.field3550 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1102) {
                        var6--;
                        var421.field3596 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1103) {
                        var6--;
                        var421.field3688 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1104) {
                        var6--;
                        var421.field3620 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1105) {
                        var6--;
                        var421.field3635 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1106) {
                        var6--;
                        var421.field3641 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1107) {
                        var6--;
                        var421.field3559 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1108) {
                        var421.field3649 = 1;
                        var6--;
                        var421.field3619 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1109) {
                        var6 -= 6;
                        var421.field3583 = class115.field1955[var6];
                        var421.field3549 = class115.field1955[var6 + 1];
                        var421.field3586 = class115.field1955[var6 + 2];
                        var421.field3668 = class115.field1955[var6 + 3];
                        var421.field3598 = class115.field1955[var6 + 4];
                        var421.field3553 = class115.field1955[var6 + 5];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1110) {
                        var6--;
                        int var422 = class115.field1955[var6];
                        if (var421.field3633 != var422) {
                            var421.field3633 = var422;
                            var421.field3697 = 0;
                            var421.field3618 = 0;
                            class25.method135(var421, -28014);
                        }
                        continue;
                    }
                    if (var452 == 1111) {
                        var6--;
                        var421.field3655 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1112) {
                        var7--;
                        class51 var423 = class70.field1132[var7];
                        if (!var423.method315(false, var421.field3627)) {
                            var421.field3627 = var423;
                            class25.method135(var421, -28014);
                        }
                        continue;
                    }
                    if (var452 == 1113) {
                        var6--;
                        var421.field3615 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1114) {
                        var6 -= 3;
                        var421.field3580 = class115.field1955[var6];
                        var421.field3677 = class115.field1955[var6 + 1];
                        var421.field3589 = class115.field1955[var6 + 2];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1115) {
                        var6--;
                        var421.field3547 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1116) {
                        var6--;
                        var421.field3696 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1117) {
                        var6--;
                        var421.field3539 = class115.field1955[var6];
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1118) {
                        var6--;
                        var421.field3673 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1119) {
                        var6--;
                        var421.field3625 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                    if (var452 == 1120) {
                        var6 -= 2;
                        var421.field3591 = class115.field1955[var6];
                        var421.field3546 = class115.field1955[var6 + 1];
                        class25.method135(var421, -28014);
                        if (var421.field3623 == 0) {
                            class97.method718(-14, false, var421);
                        }
                        continue;
                    }
                    if (var452 == 1121) {
                        class25.method135(var421, -28014);
                        var6 -= 2;
                        continue;
                    }
                    if (var452 == 1122) {
                        var6--;
                        var421.field3695 = class115.field1955[var6] == 1;
                        class25.method135(var421, -28014);
                        continue;
                    }
                } else if (var452 >= 1200 && var452 < 1300 || var452 >= 2200 && var452 < 2300) {
                    class213 var417;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var6--;
                        var417 = class198.method1392(11823, class115.field1955[var6]);
                    } else {
                        var417 = var47 ? class243.field4212 : class8.field82;
                    }
                    class25.method135(var417, -28014);
                    if (var452 == 1200 || var452 == 1205) {
                        var6 -= 2;
                        int var418 = class115.field1955[var6];
                        int var419 = class115.field1955[var6 + 1];
                        if (var418 == -1) {
                            var417.field3649 = 1;
                            var417.field3619 = -1;
                            var417.field3571 = -1;
                        } else {
                            var417.field3578 = var419;
                            var417.field3571 = var418;
                            class222 var420 = class219.method1508(var418, (byte) -83);
                            var417.field3549 = var420.field3848;
                            if (var452 == 1205) {
                                var417.field3643 = false;
                            } else {
                                var417.field3643 = true;
                            }
                            var417.field3583 = var420.field3874;
                            var417.field3553 = var420.field3851;
                            if (var417.field3582 > 0) {
                                var417.field3553 = var417.field3553 * 32 / var417.field3582;
                            } else if (var417.field3540 > 0) {
                                var417.field3553 = var417.field3553 * 32 / var417.field3540;
                            }
                            var417.field3668 = var420.field3906;
                            var417.field3586 = var420.field3911;
                            var417.field3598 = var420.field3847;
                        }
                        continue;
                    }
                    if (var452 == 1201) {
                        var417.field3649 = 2;
                        var6--;
                        var417.field3619 = class115.field1955[var6];
                        continue;
                    }
                    if (var452 == 1202) {
                        var417.field3649 = 3;
                        var417.field3619 = class44.field706.field1708.method1026(1);
                        continue;
                    }
                    if (var452 == 1203) {
                        var417.field3649 = 6;
                        var6--;
                        var417.field3619 = class115.field1955[var6];
                        continue;
                    }
                    if (var452 == 1204) {
                        var417.field3649 = 5;
                        var6--;
                        var417.field3619 = class115.field1955[var6];
                        continue;
                    }
                } else if (var452 >= 1300 && var452 < 1400 || var452 >= 2300 && var452 < 2400) {
                    class213 var413;
                    if (var452 >= 2000) {
                        var452 -= 1000;
                        var6--;
                        var413 = class198.method1392(11823, class115.field1955[var6]);
                    } else {
                        var413 = var47 ? class243.field4212 : class8.field82;
                    }
                    if (var452 == 1300) {
                        var6--;
                        int var414 = class115.field1955[var6] - 1;
                        if (var414 >= 0 && var414 <= 9) {
                            var7--;
                            var413.method1463(class70.field1132[var7], var414, false);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var452 == 1301) {
                        var6 -= 2;
                        int var415 = class115.field1955[var6];
                        int var416 = class115.field1955[var6 + 1];
                        var413.field3631 = class198.method1395(-1, var416, var415);
                        continue;
                    }
                    if (var452 == 1302) {
                        var6--;
                        var413.field3573 = class115.field1955[var6] == 1;
                        continue;
                    }
                    if (var452 == 1303) {
                        var6--;
                        var413.field3626 = class115.field1955[var6];
                        continue;
                    }
                    if (var452 == 1304) {
                        var6--;
                        var413.field3610 = class115.field1955[var6];
                        continue;
                    }
                    if (var452 == 1305) {
                        var7--;
                        var413.field3687 = class70.field1132[var7];
                        continue;
                    }
                    if (var452 == 1306) {
                        var7--;
                        var413.field3541 = class70.field1132[var7];
                        continue;
                    }
                    if (var452 == 1307) {
                        var413.field3566 = null;
                        continue;
                    }
                } else {
                    if (var452 >= 1400 && var452 < 1500 || var452 >= 2400 && var452 < 2500) {
                        class213 var406;
                        if (var452 >= 2000) {
                            var6--;
                            var406 = class198.method1392(11823, class115.field1955[var6]);
                            var452 -= 1000;
                        } else {
                            var406 = var47 ? class243.field4212 : class8.field82;
                        }
                        var7--;
                        class51 var407 = class70.field1132[var7];
                        int[] var408 = null;
                        if (var407.method293(false) > 0 && var407.method268(var407.method293(false) - 1, -121) == 89) {
                            var6--;
                            int var409 = class115.field1955[var6];
                            if (var409 > 0) {
                                var408 = new int[var409];
                                while ((var409--) > 0) {
                                    var6--;
                                    var408[var409] = class115.field1955[var6];
                                }
                            }
                            var407 = var407.method269((byte) -74, 0, var407.method293(false) - 1);
                        }
                        Object[] var410 = new Object[var407.method293(false) + 1];
                        for (int var411 = var410.length - 1; var411 >= 1; var411--) {
                            if (var407.method268(var411 - 1, -102) == 115) {
                                var7--;
                                var410[var411] = class70.field1132[var7];
                            } else {
                                var6--;
                                var410[var411] = Integer.valueOf(class115.field1955[var6]);
                            }
                        }
                        var6--;
                        int var412 = class115.field1955[var6];
                        if (var412 == -1) {
                            var410 = null;
                        } else {
                            var410[0] = Integer.valueOf(var412);
                        }
                        if (var452 == 1400) {
                            var406.field3663 = var410;
                        } else if (var452 == 1401) {
                            var406.field3639 = var410;
                        } else if (var452 == 1402) {
                            var406.field3551 = var410;
                        } else if (var452 == 1403) {
                            var406.field3645 = var410;
                        } else if (var452 == 1404) {
                            var406.field3570 = var410;
                        } else if (var452 == 1405) {
                            var406.field3577 = var410;
                        } else if (var452 == 1406) {
                            var406.field3666 = var410;
                        } else if (var452 == 1407) {
                            var406.field3662 = var408;
                            var406.field3702 = var410;
                        } else if (var452 == 1408) {
                            var406.field3691 = var410;
                        } else if (var452 == 1409) {
                            var406.field3599 = var410;
                        } else if (var452 == 1410) {
                            var406.field3650 = var410;
                        } else if (var452 == 1411) {
                            var406.field3572 = var410;
                        } else if (var452 == 1412) {
                            var406.field3622 = var410;
                        } else if (var452 == 1414) {
                            var406.field3557 = var408;
                            var406.field3604 = var410;
                        } else if (var452 == 1415) {
                            var406.field3624 = var408;
                            var406.field3617 = var410;
                        } else if (var452 == 1416) {
                            var406.field3660 = var410;
                        } else if (var452 == 1417) {
                            var406.field3642 = var410;
                        } else if (var452 == 1418) {
                            var406.field3561 = var410;
                        } else if (var452 == 1419) {
                            var406.field3545 = var410;
                        } else if (var452 == 1420) {
                            var406.field3693 = var410;
                        } else if (var452 == 1421) {
                            var406.field3565 = var410;
                        } else if (var452 == 1422) {
                            var406.field3544 = var410;
                        } else if (var452 == 1423) {
                            var406.field3555 = var410;
                        } else if (var452 == 1424) {
                            var406.field3542 = var410;
                        } else if (var452 == 1425) {
                            var406.field3579 = var410;
                        } else if (var452 == 1426) {
                            var406.field3685 = var410;
                        } else if (var452 == 1427) {
                            var406.field3628 = var410;
                        } else if (var452 == 1428) {
                            var406.field3672 = var408;
                            var406.field3548 = var410;
                        } else if (var452 == 1429) {
                            var406.field3647 = var408;
                            var406.field3664 = var410;
                        }
                        var406.field3656 = true;
                        continue;
                    }
                    if (var452 < 1600) {
                        class213 var405 = var47 ? class243.field4212 : class8.field82;
                        if (var452 == 1500) {
                            class115.field1955[var6++] = var405.field3605;
                            continue;
                        }
                        if (var452 == 1501) {
                            class115.field1955[var6++] = var405.field3629;
                            continue;
                        }
                        if (var452 == 1502) {
                            class115.field1955[var6++] = var405.field3603;
                            continue;
                        }
                        if (var452 == 1503) {
                            class115.field1955[var6++] = var405.field3608;
                            continue;
                        }
                        if (var452 == 1504) {
                            class115.field1955[var6++] = var405.field3700 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 1505) {
                            class115.field1955[var6++] = var405.field3689;
                            continue;
                        }
                    } else if (var452 < 1700) {
                        class213 var404 = var47 ? class243.field4212 : class8.field82;
                        if (var452 == 1600) {
                            class115.field1955[var6++] = var404.field3648;
                            continue;
                        }
                        if (var452 == 1601) {
                            class115.field1955[var6++] = var404.field3593;
                            continue;
                        }
                        if (var452 == 1602) {
                            class70.field1132[var7++] = var404.field3627;
                            continue;
                        }
                        if (var452 == 1603) {
                            class115.field1955[var6++] = var404.field3591;
                            continue;
                        }
                        if (var452 == 1604) {
                            class115.field1955[var6++] = var404.field3546;
                            continue;
                        }
                        if (var452 == 1605) {
                            class115.field1955[var6++] = var404.field3553;
                            continue;
                        }
                        if (var452 == 1606) {
                            class115.field1955[var6++] = var404.field3586;
                            continue;
                        }
                        if (var452 == 1607) {
                            class115.field1955[var6++] = var404.field3598;
                            continue;
                        }
                        if (var452 == 1608) {
                            class115.field1955[var6++] = var404.field3668;
                            continue;
                        }
                        if (var452 == 1609) {
                            class115.field1955[var6++] = var404.field3688;
                            continue;
                        }
                    } else if (var452 < 1800) {
                        class213 var53 = var47 ? class243.field4212 : class8.field82;
                        if (var452 == 1700) {
                            class115.field1955[var6++] = var53.field3571;
                            continue;
                        }
                        if (var452 == 1701) {
                            if (var53.field3571 == -1) {
                                class115.field1955[var6++] = 0;
                            } else {
                                class115.field1955[var6++] = var53.field3578;
                            }
                            continue;
                        }
                        if (var452 == 1702) {
                            class115.field1955[var6++] = var53.field3568;
                            continue;
                        }
                    } else if (var452 < 1900) {
                        class213 var402 = var47 ? class243.field4212 : class8.field82;
                        if (var452 == 1800) {
                            class115.field1955[var6++] = class149.method1075(client.method1061(var402), 1044683339);
                            continue;
                        }
                        if (var452 == 1801) {
                            var6--;
                            int var403 = class115.field1955[var6];
                            int var454 = var403 - 1;
                            if (var402.field3566 != null && var402.field3566.length > var454 && var402.field3566[var454] != null) {
                                class70.field1132[var7++] = var402.field3566[var454];
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 1802) {
                            if (var402.field3687 == null) {
                                class70.field1132[var7++] = class184.field3044;
                            } else {
                                class70.field1132[var7++] = var402.field3687;
                            }
                            continue;
                        }
                    } else if (var452 < 2600) {
                        var6--;
                        class213 var401 = class198.method1392(11823, class115.field1955[var6]);
                        if (var452 == 2500) {
                            class115.field1955[var6++] = var401.field3605;
                            continue;
                        }
                        if (var452 == 2501) {
                            class115.field1955[var6++] = var401.field3629;
                            continue;
                        }
                        if (var452 == 2502) {
                            class115.field1955[var6++] = var401.field3603;
                            continue;
                        }
                        if (var452 == 2503) {
                            class115.field1955[var6++] = var401.field3608;
                            continue;
                        }
                        if (var452 == 2504) {
                            class115.field1955[var6++] = var401.field3700 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 2505) {
                            class115.field1955[var6++] = var401.field3689;
                            continue;
                        }
                    } else if (var452 < 2700) {
                        var6--;
                        class213 var54 = class198.method1392(11823, class115.field1955[var6]);
                        if (var452 == 2600) {
                            class115.field1955[var6++] = var54.field3648;
                            continue;
                        }
                        if (var452 == 2601) {
                            class115.field1955[var6++] = var54.field3593;
                            continue;
                        }
                        if (var452 == 2602) {
                            class70.field1132[var7++] = var54.field3627;
                            continue;
                        }
                        if (var452 == 2603) {
                            class115.field1955[var6++] = var54.field3591;
                            continue;
                        }
                        if (var452 == 2604) {
                            class115.field1955[var6++] = var54.field3546;
                            continue;
                        }
                        if (var452 == 2605) {
                            class115.field1955[var6++] = var54.field3553;
                            continue;
                        }
                        if (var452 == 2606) {
                            class115.field1955[var6++] = var54.field3586;
                            continue;
                        }
                        if (var452 == 2607) {
                            class115.field1955[var6++] = var54.field3598;
                            continue;
                        }
                        if (var452 == 2608) {
                            class115.field1955[var6++] = var54.field3668;
                            continue;
                        }
                        if (var452 == 2609) {
                            class115.field1955[var6++] = var54.field3688;
                            continue;
                        }
                    } else if (var452 < 2800) {
                        if (var452 == 2700) {
                            var6--;
                            class213 var391 = class198.method1392(11823, class115.field1955[var6]);
                            class115.field1955[var6++] = var391.field3571;
                            continue;
                        }
                        if (var452 == 2701) {
                            var6--;
                            class213 var392 = class198.method1392(11823, class115.field1955[var6]);
                            if (var392.field3571 == -1) {
                                class115.field1955[var6++] = 0;
                            } else {
                                class115.field1955[var6++] = var392.field3578;
                            }
                            continue;
                        }
                        if (var452 == 2702) {
                            var6--;
                            int var393 = class115.field1955[var6];
                            class42 var394 = (class42) class79.field1265.method1453((long) var393, 1);
                            if (var394 == null) {
                                class115.field1955[var6++] = 0;
                            } else {
                                class115.field1955[var6++] = 1;
                            }
                            continue;
                        }
                        if (var452 == 2703) {
                            var6--;
                            class213 var395 = class198.method1392(11823, class115.field1955[var6]);
                            if (var395.field3556 == null) {
                                class115.field1955[var6++] = 0;
                                continue;
                            }
                            int var396 = var395.field3556.length;
                            for (int var397 = 0; var397 < var395.field3556.length; var397++) {
                                if (var395.field3556[var397] == null) {
                                    var396 = var397;
                                    break;
                                }
                            }
                            class115.field1955[var6++] = var396;
                            continue;
                        }
                        if (var452 == 2704 || var452 == 2705) {
                            var6 -= 2;
                            int var398 = class115.field1955[var6 + 1];
                            int var399 = class115.field1955[var6];
                            class42 var400 = (class42) class79.field1265.method1453((long) var399, 1);
                            if (var400 != null && var400.field668 == var398) {
                                class115.field1955[var6++] = 1;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                    } else if (var452 < 2900) {
                        var6--;
                        class213 var389 = class198.method1392(11823, class115.field1955[var6]);
                        if (var452 == 2800) {
                            class115.field1955[var6++] = class149.method1075(client.method1061(var389), 1044683339);
                            continue;
                        }
                        if (var452 == 2801) {
                            var6--;
                            int var390 = class115.field1955[var6];
                            int var453 = var390 - 1;
                            if (var389.field3566 != null && var453 < var389.field3566.length && var389.field3566[var453] != null) {
                                class70.field1132[var7++] = var389.field3566[var453];
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 2802) {
                            if (var389.field3687 == null) {
                                class70.field1132[var7++] = class184.field3044;
                            } else {
                                class70.field1132[var7++] = var389.field3687;
                            }
                            continue;
                        }
                    } else if (var452 < 3200) {
                        if (var452 == 3100) {
                            var7--;
                            class51 var374 = class70.field1132[var7];
                            class147.method1064(var374, class184.field3044, (byte) 91, 0);
                            continue;
                        }
                        if (var452 == 3101) {
                            var6 -= 2;
                            class181.method1290(class44.field706, -19, class115.field1955[var6], class115.field1955[var6 + 1]);
                            continue;
                        }
                        if (var452 == 3103) {
                            class231.method1598(-127);
                            continue;
                        }
                        if (var452 == 3104) {
                            var7--;
                            class51 var375 = class70.field1132[var7];
                            class179.field2952++;
                            int var376 = 0;
                            if (var375.method290(-20661)) {
                                var376 = var375.method274((byte) 11);
                            }
                            class95.field1575.method424((byte) 113, 76);
                            class95.field1575.method870(var376, (byte) 12);
                            continue;
                        }
                        if (var452 == 3105) {
                            class163.field2668++;
                            var7--;
                            class51 var377 = class70.field1132[var7];
                            class95.field1575.method424((byte) 82, 132);
                            class95.field1575.method885(var377.method316(126), (byte) -98);
                            continue;
                        }
                        if (var452 == 3106) {
                            class27.field388++;
                            var7--;
                            class51 var378 = class70.field1132[var7];
                            class95.field1575.method424((byte) 89, 23);
                            class95.field1575.method919(-4742, var378.method293(false) + 1);
                            class95.field1575.method896((byte) 0, var378);
                            continue;
                        }
                        if (var452 == 3107) {
                            var7--;
                            class51 var379 = class70.field1132[var7];
                            var6--;
                            int var380 = class115.field1955[var6];
                            class35.method172(var380, false, var379);
                            continue;
                        }
                        if (var452 == 3108) {
                            var6 -= 3;
                            int var381 = class115.field1955[var6 + 1];
                            int var382 = class115.field1955[var6];
                            int var383 = class115.field1955[var6 + 2];
                            class213 var384 = class198.method1392(11823, var383);
                            class7.method34(var381, var384, var382, 120);
                            continue;
                        }
                        if (var452 == 3109) {
                            var6 -= 2;
                            int var385 = class115.field1955[var6 + 1];
                            int var386 = class115.field1955[var6];
                            class213 var387 = var47 ? class243.field4212 : class8.field82;
                            class7.method34(var385, var387, var386, 114);
                            continue;
                        }
                        if (var452 == 3110) {
                            class22.field313++;
                            var6--;
                            int var388 = class115.field1955[var6];
                            class95.field1575.method424((byte) 121, 91);
                            class95.field1575.method895(-37, var388);
                            continue;
                        }
                    } else if (var452 < 3300) {
                        if (var452 == 3200) {
                            var6 -= 3;
                            class47.method245(-30361, class115.field1955[var6 + 2], class115.field1955[var6], class115.field1955[var6 + 1]);
                            continue;
                        }
                        if (var452 == 3201) {
                            var6--;
                            class196.method1388((byte) 89, class115.field1955[var6]);
                            continue;
                        }
                        if (var452 == 3202) {
                            var6 -= 2;
                            class222.method1530(class115.field1955[var6], 98, class115.field1955[var6 + 1]);
                            continue;
                        }
                    } else if (var452 < 3400) {
                        if (var452 == 3300) {
                            class115.field1955[var6++] = class179.field2960;
                            continue;
                        }
                        if (var452 == 3301) {
                            var6 -= 2;
                            int var347 = class115.field1955[var6];
                            int var348 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class84.method652(-91, var348, var347);
                            continue;
                        }
                        if (var452 == 3302) {
                            var6 -= 2;
                            int var349 = class115.field1955[var6];
                            int var350 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class36.method184(var349, var350, (byte) -7);
                            continue;
                        }
                        if (var452 == 3303) {
                            var6 -= 2;
                            int var351 = class115.field1955[var6 + 1];
                            int var352 = class115.field1955[var6];
                            class115.field1955[var6++] = class69.method478(var351, var352, 503);
                            continue;
                        }
                        if (var452 == 3304) {
                            var6--;
                            int var353 = class115.field1955[var6];
                            class115.field1955[var6++] = class29.method149(var353, -26793).field3745;
                            continue;
                        }
                        if (var452 == 3305) {
                            var6--;
                            int var354 = class115.field1955[var6];
                            class115.field1955[var6++] = class246.field4264[var354];
                            continue;
                        }
                        if (var452 == 3306) {
                            var6--;
                            int var355 = class115.field1955[var6];
                            class115.field1955[var6++] = class123.field2089[var355];
                            continue;
                        }
                        if (var452 == 3307) {
                            var6--;
                            int var356 = class115.field1955[var6];
                            class115.field1955[var6++] = class259.field4517[var356];
                            continue;
                        }
                        if (var452 == 3308) {
                            int var357 = (class44.field706.field4319 >> 7) + class11.field160;
                            int var358 = class257.field4496;
                            int var359 = (class44.field706.field4348 >> 7) + class241.field4179;
                            class115.field1955[var6++] = (var358 << 28) + (var357 << 14) + var359;
                            continue;
                        }
                        if (var452 == 3309) {
                            var6--;
                            int var360 = class115.field1955[var6];
                            class115.field1955[var6++] = class191.method1366(16383, var360 >> 14);
                            continue;
                        }
                        if (var452 == 3310) {
                            var6--;
                            int var361 = class115.field1955[var6];
                            class115.field1955[var6++] = var361 >> 28;
                            continue;
                        }
                        if (var452 == 3311) {
                            var6--;
                            int var362 = class115.field1955[var6];
                            class115.field1955[var6++] = class191.method1366(var362, 16383);
                            continue;
                        }
                        if (var452 == 3312) {
                            class115.field1955[var6++] = class44.field703 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3313) {
                            var6 -= 2;
                            int var363 = class115.field1955[var6] + 32768;
                            int var364 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class84.method652(-95, var364, var363);
                            continue;
                        }
                        if (var452 == 3314) {
                            var6 -= 2;
                            int var365 = class115.field1955[var6 + 1];
                            int var366 = class115.field1955[var6] + 32768;
                            class115.field1955[var6++] = class36.method184(var366, var365, (byte) -7);
                            continue;
                        }
                        if (var452 == 3315) {
                            var6 -= 2;
                            int var367 = class115.field1955[var6] + 32768;
                            int var368 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class69.method478(var368, var367, 503);
                            continue;
                        }
                        if (var452 == 3316) {
                            if (class179.field2954 >= 2) {
                                class115.field1955[var6++] = class179.field2954;
                            } else {
                                class115.field1955[var6++] = 0;
                            }
                            continue;
                        }
                        if (var452 == 3317) {
                            class115.field1955[var6++] = class260.field4546;
                            continue;
                        }
                        if (var452 == 3318) {
                            class115.field1955[var6++] = class259.field4521;
                            continue;
                        }
                        if (var452 == 3321) {
                            class115.field1955[var6++] = class84.field1405;
                            continue;
                        }
                        if (var452 == 3322) {
                            class115.field1955[var6++] = class115.field1948;
                            continue;
                        }
                        if (var452 == 3323) {
                            if (class192.field3212 >= 5 && class192.field3212 <= 9) {
                                class115.field1955[var6++] = 1;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3324) {
                            if (class192.field3212 >= 5 && class192.field3212 <= 9) {
                                class115.field1955[var6++] = class192.field3212;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3325) {
                            if (class122.field2081 > 0) {
                                class115.field1955[var6++] = 1;
                            } else {
                                class115.field1955[var6++] = 0;
                            }
                            continue;
                        }
                        if (var452 == 3326) {
                            class115.field1955[var6++] = class44.field706.field1697;
                            continue;
                        }
                        if (var452 == 3327) {
                            class115.field1955[var6++] = class44.field706.field1708.field2387 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3328) {
                            class115.field1955[var6++] = class241.field4180;
                            continue;
                        }
                        if (var452 == 3329) {
                            class115.field1955[var6++] = class115.field1953;
                            continue;
                        }
                        if (var452 == 3330) {
                            var6--;
                            int var369 = class115.field1955[var6];
                            class115.field1955[var6++] = class231.method1597(false, var369);
                            continue;
                        }
                        if (var452 == 3331) {
                            var6 -= 2;
                            int var370 = class115.field1955[var6];
                            int var371 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class118.method856((byte) 87, var371, false, var370);
                            continue;
                        }
                        if (var452 == 3332) {
                            var6 -= 2;
                            int var372 = class115.field1955[var6];
                            int var373 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class118.method856((byte) 72, var373, true, var372);
                            continue;
                        }
                        if (var452 == 3333) {
                            class115.field1955[var6++] = class258.field4508;
                            continue;
                        }
                    } else if (var452 < 3500) {
                        if (var452 == 3400) {
                            var6 -= 2;
                            int var332 = class115.field1955[var6];
                            int var333 = class115.field1955[var6 + 1];
                            class52 var334 = class49.method252(-1, var332);
                            class70.field1132[var7++] = var334.method334(var333, (byte) 41);
                            continue;
                        }
                        if (var452 == 3408) {
                            var6 -= 4;
                            int var335 = class115.field1955[var6];
                            int var336 = class115.field1955[var6 + 1];
                            int var337 = class115.field1955[var6 + 2];
                            int var338 = class115.field1955[var6 + 3];
                            class52 var339 = class49.method252(-1, var337);
                            if (var339.field891 == var335 && var339.field893 == var336) {
                                if (var336 == 115) {
                                    class70.field1132[var7++] = var339.method334(var338, (byte) 41);
                                } else {
                                    class115.field1955[var6++] = var339.method328(-126, var338);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var452 == 3409) {
                            var6 -= 3;
                            int var340 = class115.field1955[var6];
                            int var341 = class115.field1955[var6 + 1];
                            int var342 = class115.field1955[var6 + 2];
                            class52 var343 = class49.method252(-1, var341);
                            if (var343.field893 != var340) {
                                throw new RuntimeException("C3409-1");
                            }
                            class115.field1955[var6++] = var343.method330(true, var342) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3410) {
                            var6--;
                            int var344 = class115.field1955[var6];
                            var7--;
                            class51 var345 = class70.field1132[var7];
                            class52 var346 = class49.method252(-1, var344);
                            if (var346.field893 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class115.field1955[var6++] = var346.method327(23870, var345) ? 1 : 0;
                            continue;
                        }
                    } else if (var452 < 3700) {
                        if (var452 == 3600) {
                            if (class80.field1334 == 0) {
                                class115.field1955[var6++] = -2;
                            } else if (class80.field1334 == 1) {
                                class115.field1955[var6++] = -1;
                            } else {
                                class115.field1955[var6++] = class184.field3051;
                            }
                            continue;
                        }
                        if (var452 == 3601) {
                            var6--;
                            int var55 = class115.field1955[var6];
                            if (class80.field1334 == 2 && class184.field3051 > var55) {
                                class70.field1132[var7++] = class216.field3749[var55];
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 3602) {
                            var6--;
                            int var56 = class115.field1955[var6];
                            if (class80.field1334 == 2 && class184.field3051 > var56) {
                                class115.field1955[var6++] = class96.field1588[var56];
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3603) {
                            var6--;
                            int var57 = class115.field1955[var6];
                            if (class80.field1334 == 2 && class184.field3051 > var57) {
                                class115.field1955[var6++] = class30.field433[var57];
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3604) {
                            var6--;
                            int var58 = class115.field1955[var6];
                            var7--;
                            class51 var59 = class70.field1132[var7];
                            class163.method1148(var59, 133, var58);
                            continue;
                        }
                        if (var452 == 3605) {
                            var7--;
                            class51 var60 = class70.field1132[var7];
                            class247.method1682(124, var60.method316(125));
                            continue;
                        }
                        if (var452 == 3606) {
                            var7--;
                            class51 var61 = class70.field1132[var7];
                            class3.method10(var61.method316(99), -3);
                            continue;
                        }
                        if (var452 == 3607) {
                            var7--;
                            class51 var62 = class70.field1132[var7];
                            class244.method1665(122, var62.method316(17));
                            continue;
                        }
                        if (var452 == 3608) {
                            var7--;
                            class51 var63 = class70.field1132[var7];
                            class2.method4(-20194, var63.method316(45));
                            continue;
                        }
                        if (var452 == 3609) {
                            var7--;
                            class51 var64 = class70.field1132[var7];
                            if (var64.method276(-125, class41.field651) || var64.method276(-117, class210.field3500)) {
                                var64 = var64.method279((byte) -55, 7);
                            }
                            class115.field1955[var6++] = class183.method1295(11418, var64) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3610) {
                            var6--;
                            int var65 = class115.field1955[var6];
                            if (class80.field1334 == 2 && var65 < class184.field3051) {
                                class70.field1132[var7++] = class149.field2492[var65];
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 3611) {
                            if (class69.field1115 == null) {
                                class70.field1132[var7++] = class184.field3044;
                            } else {
                                class70.field1132[var7++] = class69.field1115.method304((byte) -92);
                            }
                            continue;
                        }
                        if (var452 == 3612) {
                            if (class69.field1115 == null) {
                                class115.field1955[var6++] = 0;
                            } else {
                                class115.field1955[var6++] = class52.field884;
                            }
                            continue;
                        }
                        if (var452 == 3613) {
                            var6--;
                            int var66 = class115.field1955[var6];
                            if (class69.field1115 != null && class52.field884 > var66) {
                                class70.field1132[var7++] = class153.field2547[var66].field4162.method304((byte) -92);
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 3614) {
                            var6--;
                            int var67 = class115.field1955[var6];
                            if (class69.field1115 != null && class52.field884 > var67) {
                                class115.field1955[var6++] = class153.field2547[var67].field4164;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3615) {
                            var6--;
                            int var68 = class115.field1955[var6];
                            if (class69.field1115 != null && class52.field884 > var68) {
                                class115.field1955[var6++] = class153.field2547[var68].field4158;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3616) {
                            class115.field1955[var6++] = class153.field2559;
                            continue;
                        }
                        if (var452 == 3617) {
                            var7--;
                            class51 var69 = class70.field1132[var7];
                            class89.method673(var69, true);
                            continue;
                        }
                        if (var452 == 3618) {
                            class115.field1955[var6++] = class172.field2811;
                            continue;
                        }
                        if (var452 == 3619) {
                            var7--;
                            class51 var70 = class70.field1132[var7];
                            class97.method717((byte) 89, var70.method316(50));
                            continue;
                        }
                        if (var452 == 3620) {
                            class115.method846(-128);
                            continue;
                        }
                        if (var452 == 3621) {
                            if (class80.field1334 == 0) {
                                class115.field1955[var6++] = -1;
                            } else {
                                class115.field1955[var6++] = class108.field1844;
                            }
                            continue;
                        }
                        if (var452 == 3622) {
                            var6--;
                            int var71 = class115.field1955[var6];
                            if (class80.field1334 != 0 && var71 < class108.field1844) {
                                class70.field1132[var7++] = class63.method422(class203.field3396[var71], -71).method304((byte) -92);
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 3623) {
                            var7--;
                            class51 var72 = class70.field1132[var7];
                            if (var72.method276(-121, class41.field651) || var72.method276(-114, class210.field3500)) {
                                var72 = var72.method279((byte) -55, 7);
                            }
                            class115.field1955[var6++] = class75.method535(false, var72) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3624) {
                            var6--;
                            int var73 = class115.field1955[var6];
                            if (class153.field2547 != null && var73 < class52.field884 && class153.field2547[var73].field4162.method292(true, class44.field706.field1711)) {
                                class115.field1955[var6++] = 1;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3625) {
                            if (class205.field3437 == null) {
                                class70.field1132[var7++] = class184.field3044;
                            } else {
                                class70.field1132[var7++] = class205.field3437.method304((byte) -92);
                            }
                            continue;
                        }
                        if (var452 == 3626) {
                            var6--;
                            int var74 = class115.field1955[var6];
                            if (class69.field1115 != null && var74 < class52.field884) {
                                class70.field1132[var7++] = class153.field2547[var74].field4154;
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 3627) {
                            var6--;
                            int var75 = class115.field1955[var6];
                            if (class80.field1334 == 2 && var75 >= 0 && class184.field3051 > var75) {
                                class115.field1955[var6++] = class201.field3352[var75] ? 1 : 0;
                                continue;
                            }
                            class115.field1955[var6++] = 0;
                            continue;
                        }
                        if (var452 == 3628) {
                            var7--;
                            class51 var76 = class70.field1132[var7];
                            if (var76.method276(-112, class41.field651) || var76.method276(-119, class210.field3500)) {
                                var76 = var76.method279((byte) -55, 7);
                            }
                            class115.field1955[var6++] = class111.method826((byte) -95, var76);
                            continue;
                        }
                    } else if (var452 < 4000) {
                        if (var452 == 3903) {
                            var6--;
                            int var318 = class115.field1955[var6];
                            class115.field1955[var6++] = class247.field4303[var318].method668(26299);
                            continue;
                        }
                        if (var452 == 3904) {
                            var6--;
                            int var319 = class115.field1955[var6];
                            class115.field1955[var6++] = class247.field4303[var319].field1445;
                            continue;
                        }
                        if (var452 == 3905) {
                            var6--;
                            int var320 = class115.field1955[var6];
                            class115.field1955[var6++] = class247.field4303[var320].field1452;
                            continue;
                        }
                        if (var452 == 3906) {
                            var6--;
                            int var321 = class115.field1955[var6];
                            class115.field1955[var6++] = class247.field4303[var321].field1458;
                            continue;
                        }
                        if (var452 == 3907) {
                            var6--;
                            int var322 = class115.field1955[var6];
                            class115.field1955[var6++] = class247.field4303[var322].field1462;
                            continue;
                        }
                        if (var452 == 3908) {
                            var6--;
                            int var323 = class115.field1955[var6];
                            class115.field1955[var6++] = class247.field4303[var323].field1449;
                            continue;
                        }
                        if (var452 == 3910) {
                            var6--;
                            int var324 = class115.field1955[var6];
                            int var325 = class247.field4303[var324].method663(7);
                            class115.field1955[var6++] = var325 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3911) {
                            var6--;
                            int var326 = class115.field1955[var6];
                            int var327 = class247.field4303[var326].method663(7);
                            class115.field1955[var6++] = var327 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3912) {
                            var6--;
                            int var328 = class115.field1955[var6];
                            int var329 = class247.field4303[var328].method663(7);
                            class115.field1955[var6++] = var329 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 3913) {
                            var6--;
                            int var330 = class115.field1955[var6];
                            int var331 = class247.field4303[var330].method663(7);
                            class115.field1955[var6++] = var331 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var452 < 4100) {
                        if (var452 == 4000) {
                            var6 -= 2;
                            int var77 = class115.field1955[var6];
                            int var78 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = var77 + var78;
                            continue;
                        }
                        if (var452 == 4001) {
                            var6 -= 2;
                            int var79 = class115.field1955[var6];
                            int var80 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = var79 - var80;
                            continue;
                        }
                        if (var452 == 4002) {
                            var6 -= 2;
                            int var81 = class115.field1955[var6 + 1];
                            int var82 = class115.field1955[var6];
                            class115.field1955[var6++] = var81 * var82;
                            continue;
                        }
                        if (var452 == 4003) {
                            var6 -= 2;
                            int var83 = class115.field1955[var6 + 1];
                            int var84 = class115.field1955[var6];
                            class115.field1955[var6++] = var84 / var83;
                            continue;
                        }
                        if (var452 == 4004) {
                            var6--;
                            int var85 = class115.field1955[var6];
                            class115.field1955[var6++] = (int) (Math.random() * (double) var85);
                            continue;
                        }
                        if (var452 == 4005) {
                            var6--;
                            int var86 = class115.field1955[var6];
                            class115.field1955[var6++] = (int) (Math.random() * (double) (var86 + 1));
                            continue;
                        }
                        if (var452 == 4006) {
                            var6 -= 5;
                            int var87 = class115.field1955[var6 + 1];
                            int var88 = class115.field1955[var6 + 2];
                            int var89 = class115.field1955[var6];
                            int var90 = class115.field1955[var6 + 3];
                            int var91 = class115.field1955[var6 + 4];
                            class115.field1955[var6++] = var89 + ((var91 - var88) * (var87 - var89) / (var90 - var88));
                            continue;
                        }
                        if (var452 == 4007) {
                            var6 -= 2;
                            long var92 = (long) class115.field1955[var6 + 1];
                            long var94 = (long) class115.field1955[var6];
                            class115.field1955[var6++] = (int) (var94 + (var92 * var94 / 100L));
                            continue;
                        }
                        if (var452 == 4008) {
                            var6 -= 2;
                            int var96 = class115.field1955[var6 + 1];
                            int var97 = class115.field1955[var6];
                            class115.field1955[var6++] = class82.method642(var97, 0x1 << var96);
                            continue;
                        }
                        if (var452 == 4009) {
                            var6 -= 2;
                            int var98 = class115.field1955[var6];
                            int var99 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class191.method1366(-(0x1 << var99) - 1, var98);
                            continue;
                        }
                        if (var452 == 4010) {
                            var6 -= 2;
                            int var100 = class115.field1955[var6 + 1];
                            int var101 = class115.field1955[var6];
                            class115.field1955[var6++] = class191.method1366(0x1 << var100, var101) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var452 == 4011) {
                            var6 -= 2;
                            int var102 = class115.field1955[var6 + 1];
                            int var103 = class115.field1955[var6];
                            class115.field1955[var6++] = var103 % var102;
                            continue;
                        }
                        if (var452 == 4012) {
                            var6 -= 2;
                            int var104 = class115.field1955[var6 + 1];
                            int var105 = class115.field1955[var6];
                            if (var105 == 0) {
                                class115.field1955[var6++] = 0;
                            } else {
                                class115.field1955[var6++] = (int) Math.pow((double) var105, (double) var104);
                            }
                            continue;
                        }
                        if (var452 == 4013) {
                            var6 -= 2;
                            int var106 = class115.field1955[var6];
                            int var107 = class115.field1955[var6 + 1];
                            if (var106 == 0) {
                                class115.field1955[var6++] = 0;
                            } else if (var107 == 0) {
                                class115.field1955[var6++] = Integer.MAX_VALUE;
                            } else {
                                class115.field1955[var6++] = (int) Math.pow((double) var106, 1.0D / (double) var107);
                            }
                            continue;
                        }
                        if (var452 == 4014) {
                            var6 -= 2;
                            int var108 = class115.field1955[var6];
                            int var109 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class191.method1366(var109, var108);
                            continue;
                        }
                        if (var452 == 4015) {
                            var6 -= 2;
                            int var110 = class115.field1955[var6];
                            int var111 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = class82.method642(var111, var110);
                            continue;
                        }
                        if (var452 == 4016) {
                            var6 -= 2;
                            int var112 = class115.field1955[var6 + 1];
                            int var113 = class115.field1955[var6];
                            class115.field1955[var6++] = var112 <= var113 ? var112 : var113;
                            continue;
                        }
                        if (var452 == 4017) {
                            var6 -= 2;
                            int var114 = class115.field1955[var6];
                            int var115 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = var115 >= var114 ? var115 : var114;
                            continue;
                        }
                        if (var452 == 4018) {
                            var6 -= 3;
                            long var116 = (long) class115.field1955[var6 + 1];
                            long var118 = (long) class115.field1955[var6 + 2];
                            long var120 = (long) class115.field1955[var6];
                            class115.field1955[var6++] = (int) (var118 * var120 / var116);
                            continue;
                        }
                    } else if (var452 < 4200) {
                        if (var452 == 4100) {
                            var7--;
                            class51 var266 = class70.field1132[var7];
                            var6--;
                            int var267 = class115.field1955[var6];
                            class70.field1132[var7++] = class20.method104(-125, new class51[] { var266, class51.method311(var267, 10) });
                            continue;
                        }
                        if (var452 == 4101) {
                            var7 -= 2;
                            class51 var268 = class70.field1132[var7];
                            class51 var269 = class70.field1132[var7 + 1];
                            class70.field1132[var7++] = class20.method104(-120, new class51[] { var268, var269 });
                            continue;
                        }
                        if (var452 == 4102) {
                            var6--;
                            int var270 = class115.field1955[var6];
                            var7--;
                            class51 var271 = class70.field1132[var7];
                            class70.field1132[var7++] = class20.method104(111, new class51[] { var271, class181.method1287(var270, true, true) });
                            continue;
                        }
                        if (var452 == 4103) {
                            var7--;
                            class51 var272 = class70.field1132[var7];
                            class70.field1132[var7++] = var272.method313(93);
                            continue;
                        }
                        if (var452 == 4104) {
                            var6--;
                            int var273 = class115.field1955[var6];
                            long var274 = ((long) var273 + 11745L) * 86400000L;
                            class175.field2876.setTime(new Date(var274));
                            int var276 = class175.field2876.get(5);
                            int var277 = class175.field2876.get(2);
                            int var278 = class175.field2876.get(1);
                            class70.field1132[var7++] = class20.method104(-10, new class51[] { class51.method311(var276, 10), class221.field3841, class90.field1497[var277], class221.field3841, class51.method311(var278, 10) });
                            continue;
                        }
                        if (var452 == 4105) {
                            var7 -= 2;
                            class51 var279 = class70.field1132[var7];
                            class51 var280 = class70.field1132[var7 + 1];
                            if (class44.field706.field1708 != null && class44.field706.field1708.field2387) {
                                class70.field1132[var7++] = var280;
                                continue;
                            }
                            class70.field1132[var7++] = var279;
                            continue;
                        }
                        if (var452 == 4106) {
                            var6--;
                            int var281 = class115.field1955[var6];
                            class70.field1132[var7++] = class51.method311(var281, 10);
                            continue;
                        }
                        if (var452 == 4107) {
                            var7 -= 2;
                            class115.field1955[var6++] = class70.field1132[var7].method302(78, class70.field1132[var7 + 1]);
                            continue;
                        }
                        if (var452 == 4108) {
                            var6 -= 2;
                            var7--;
                            class51 var282 = class70.field1132[var7];
                            int var283 = class115.field1955[var6];
                            int var284 = class115.field1955[var6 + 1];
                            byte[] var285 = class72.field1146.method828(var284, (byte) 113, 0);
                            class54 var286 = new class54(var285);
                            var286.method1315(class93.field1551, (int[]) null);
                            class115.field1955[var6++] = var286.method1326(var282, var283);
                            continue;
                        }
                        if (var452 == 4109) {
                            var6 -= 2;
                            int var287 = class115.field1955[var6];
                            var7--;
                            class51 var288 = class70.field1132[var7];
                            int var289 = class115.field1955[var6 + 1];
                            byte[] var290 = class72.field1146.method828(var289, (byte) 116, 0);
                            class54 var291 = new class54(var290);
                            var291.method1315(class93.field1551, (int[]) null);
                            class115.field1955[var6++] = var291.method1319(var288, var287);
                            continue;
                        }
                        if (var452 == 4110) {
                            var7 -= 2;
                            class51 var292 = class70.field1132[var7 + 1];
                            class51 var293 = class70.field1132[var7];
                            var6--;
                            if (class115.field1955[var6] == 1) {
                                class70.field1132[var7++] = var293;
                            } else {
                                class70.field1132[var7++] = var292;
                            }
                            continue;
                        }
                        if (var452 == 4111) {
                            var7--;
                            class51 var294 = class70.field1132[var7];
                            class70.field1132[var7++] = class187.method1322(var294);
                            continue;
                        }
                        if (var452 == 4112) {
                            var7--;
                            class51 var295 = class70.field1132[var7];
                            var6--;
                            int var296 = class115.field1955[var6];
                            if (var296 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class70.field1132[var7++] = var295.method287(var296, (byte) -81);
                            continue;
                        }
                        if (var452 == 4113) {
                            var6--;
                            int var297 = class115.field1955[var6];
                            class115.field1955[var6++] = class217.method1486(var297, (byte) -119) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4114) {
                            var6--;
                            int var298 = class115.field1955[var6];
                            class115.field1955[var6++] = class97.method724(var298, 0) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4115) {
                            var6--;
                            int var299 = class115.field1955[var6];
                            class115.field1955[var6++] = client.method1047(0, var299) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4116) {
                            var6--;
                            int var300 = class115.field1955[var6];
                            class115.field1955[var6++] = class107.method766((byte) -121, var300) ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4117) {
                            var7--;
                            class51 var301 = class70.field1132[var7];
                            if (var301 == null) {
                                class115.field1955[var6++] = 0;
                            } else {
                                class115.field1955[var6++] = var301.method293(false);
                            }
                            continue;
                        }
                        if (var452 == 4118) {
                            var7--;
                            class51 var302 = class70.field1132[var7];
                            var6 -= 2;
                            int var303 = class115.field1955[var6 + 1];
                            int var304 = class115.field1955[var6];
                            class70.field1132[var7++] = var302.method269((byte) -74, var304, var303);
                            continue;
                        }
                        if (var452 == 4119) {
                            var7--;
                            class51 var305 = class70.field1132[var7];
                            class51 var306 = class131.method964(0, var305.method293(false));
                            boolean var307 = false;
                            for (int var308 = 0; var305.method293(false) > var308; var308++) {
                                int var309 = var305.method268(var308, -119);
                                if (var309 == 60) {
                                    var307 = true;
                                } else if (var309 == 62) {
                                    var307 = false;
                                } else if (!var307) {
                                    var306.method314(var309, 255);
                                }
                            }
                            var306.method285(43);
                            class70.field1132[var7++] = var306;
                            continue;
                        }
                        if (var452 == 4120) {
                            var6 -= 2;
                            var7--;
                            class51 var310 = class70.field1132[var7];
                            int var311 = class115.field1955[var6];
                            int var312 = class115.field1955[var6 + 1];
                            class115.field1955[var6++] = var310.method319(26, var311, var312);
                            continue;
                        }
                        if (var452 == 4121) {
                            var7 -= 2;
                            class51 var313 = class70.field1132[var7];
                            var6--;
                            int var314 = class115.field1955[var6];
                            class51 var315 = class70.field1132[var7 + 1];
                            class115.field1955[var6++] = var313.method289(var315, var314, (byte) 110);
                            continue;
                        }
                        if (var452 == 4122) {
                            var6--;
                            int var316 = class115.field1955[var6];
                            class115.field1955[var6++] = class17.method90(var316, -4102);
                            continue;
                        }
                        if (var452 == 4123) {
                            var6--;
                            int var317 = class115.field1955[var6];
                            class115.field1955[var6++] = class90.method683(-123, var317);
                            continue;
                        }
                    } else if (var452 < 4300) {
                        if (var452 == 4200) {
                            var6--;
                            int var247 = class115.field1955[var6];
                            class70.field1132[var7++] = class219.method1508(var247, (byte) -76).field3907;
                            continue;
                        }
                        if (var452 == 4201) {
                            var6 -= 2;
                            int var248 = class115.field1955[var6];
                            int var249 = class115.field1955[var6 + 1];
                            class222 var250 = class219.method1508(var248, (byte) -89);
                            if (var249 >= 1 && var249 <= 5 && var250.field3915[var249 - 1] != null) {
                                class70.field1132[var7++] = var250.field3915[var249 - 1];
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 4202) {
                            var6 -= 2;
                            int var251 = class115.field1955[var6 + 1];
                            int var252 = class115.field1955[var6];
                            class222 var253 = class219.method1508(var252, (byte) 123);
                            if (var251 >= 1 && var251 <= 5 && var253.field3908[var251 - 1] != null) {
                                class70.field1132[var7++] = var253.field3908[var251 - 1];
                                continue;
                            }
                            class70.field1132[var7++] = class184.field3044;
                            continue;
                        }
                        if (var452 == 4203) {
                            var6--;
                            int var254 = class115.field1955[var6];
                            class115.field1955[var6++] = class219.method1508(var254, (byte) 121).field3880;
                            continue;
                        }
                        if (var452 == 4204) {
                            var6--;
                            int var255 = class115.field1955[var6];
                            class115.field1955[var6++] = class219.method1508(var255, (byte) -109).field3913 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4205) {
                            var6--;
                            int var256 = class115.field1955[var6];
                            class222 var257 = class219.method1508(var256, (byte) 121);
                            if (var257.field3882 == -1 && var257.field3900 >= 0) {
                                class115.field1955[var6++] = var257.field3900;
                                continue;
                            }
                            class115.field1955[var6++] = var256;
                            continue;
                        }
                        if (var452 == 4206) {
                            var6--;
                            int var258 = class115.field1955[var6];
                            class222 var259 = class219.method1508(var258, (byte) -105);
                            if (var259.field3882 >= 0 && var259.field3900 >= 0) {
                                class115.field1955[var6++] = var259.field3900;
                                continue;
                            }
                            class115.field1955[var6++] = var258;
                            continue;
                        }
                        if (var452 == 4207) {
                            var6--;
                            int var260 = class115.field1955[var6];
                            class115.field1955[var6++] = class219.method1508(var260, (byte) 104).field3914 ? 1 : 0;
                            continue;
                        }
                        if (var452 == 4208) {
                            var6 -= 2;
                            int var261 = class115.field1955[var6];
                            int var262 = class115.field1955[var6 + 1];
                            class67 var263 = class225.method1546(11, var262);
                            if (var263.method474((byte) -16)) {
                                class70.field1132[var7++] = class219.method1508(var261, (byte) -78).method1522((byte) -125, var262, var263.field1091);
                            } else {
                                class115.field1955[var6++] = class219.method1508(var261, (byte) 98).method1531(var263.field1102, 1, var262);
                            }
                            continue;
                        }
                        if (var452 == 4210) {
                            var7--;
                            class51 var264 = class70.field1132[var7];
                            var6--;
                            int var265 = class115.field1955[var6];
                            class147.method1067(var265 == 1, -76, var264);
                            class115.field1955[var6++] = class120.field1995;
                            continue;
                        }
                        if (var452 == 4211) {
                            if (class69.field1117 != null && class120.field1995 > class218.field3807) {
                                class115.field1955[var6++] = class191.method1366(class69.field1117[class218.field3807++], 65535);
                                continue;
                            }
                            class115.field1955[var6++] = -1;
                            continue;
                        }
                        if (var452 == 4212) {
                            class218.field3807 = 0;
                            continue;
                        }
                    } else if (var452 >= 4400) {
                        if (var452 < 4500) {
                            if (var452 == 4400) {
                                var6 -= 2;
                                int var122 = class115.field1955[var6 + 1];
                                int var123 = class115.field1955[var6];
                                class67 var124 = class225.method1546(11, var122);
                                if (var124.method474((byte) -2)) {
                                    class70.field1132[var7++] = class41.method210(var123, (byte) 75).method771(var122, var124.field1091, (byte) 120);
                                } else {
                                    class115.field1955[var6++] = class41.method210(var123, (byte) 75).method789(var122, (byte) -126, var124.field1102);
                                }
                                continue;
                            }
                        } else if (var452 < 4600) {
                            if (var452 == 4500) {
                                var6 -= 2;
                                int var125 = class115.field1955[var6];
                                int var126 = class115.field1955[var6 + 1];
                                class67 var127 = class225.method1546(11, var126);
                                if (var127.method474((byte) -40)) {
                                    class70.field1132[var7++] = class8.method40(var125, true).method759(var127.field1091, var126, 1);
                                } else {
                                    class115.field1955[var6++] = class8.method40(var125, true).method757(-1, var126, var127.field1102);
                                }
                                continue;
                            }
                        } else if (var452 < 5100) {
                            if (var452 == 5000) {
                                class115.field1955[var6++] = class125.field2115;
                                continue;
                            }
                            if (var452 == 5001) {
                                var6 -= 3;
                                class42.field671++;
                                class125.field2115 = class115.field1955[var6];
                                class210.field3502 = class115.field1955[var6 + 1];
                                class33.field494 = class115.field1955[var6 + 2];
                                class95.field1575.method424((byte) 119, 60);
                                class95.field1575.method919(-4742, class125.field2115);
                                class95.field1575.method919(-4742, class210.field3502);
                                class95.field1575.method919(-4742, class33.field494);
                                continue;
                            }
                            if (var452 == 5002) {
                                var7--;
                                class51 var128 = class70.field1132[var7];
                                class53.field903++;
                                var6 -= 2;
                                int var129 = class115.field1955[var6];
                                int var130 = class115.field1955[var6 + 1];
                                class95.field1575.method424((byte) 109, 108);
                                class95.field1575.method885(var128.method316(70), (byte) -111);
                                class95.field1575.method919(-4742, var129 - 1);
                                class95.field1575.method919(-4742, var130);
                                continue;
                            }
                            if (var452 == 5003) {
                                class51 var131 = null;
                                var6--;
                                int var132 = class115.field1955[var6];
                                if (var132 < 100) {
                                    var131 = class169.field2740[var132];
                                }
                                if (var131 == null) {
                                    var131 = class184.field3044;
                                }
                                class70.field1132[var7++] = var131;
                                continue;
                            }
                            if (var452 == 5004) {
                                var6--;
                                int var133 = class115.field1955[var6];
                                int var134 = -1;
                                if (var133 < 100 && class169.field2740[var133] != null) {
                                    var134 = class40.field626[var133];
                                }
                                class115.field1955[var6++] = var134;
                                continue;
                            }
                            if (var452 == 5005) {
                                class115.field1955[var6++] = class210.field3502;
                                continue;
                            }
                            if (var452 == 5008) {
                                var7--;
                                class51 var135 = class70.field1132[var7];
                                if (var135.method276(-117, class123.field2084)) {
                                    class3.method9(var135, 17601);
                                    continue;
                                }
                                if (class179.field2954 == 0 && (class241.field4180 == 1 || class115.field1953 == 1)) {
                                    continue;
                                }
                                byte var136 = 0;
                                class51 var137 = var135.method313(52);
                                byte var138 = 0;
                                if (var137.method276(-120, class198.field3305)) {
                                    var136 = 0;
                                    var135 = var135.method279((byte) -55, class198.field3305.method293(false));
                                } else if (var137.method276(-116, class204.field3417)) {
                                    var135 = var135.method279((byte) -55, class204.field3417.method293(false));
                                    var136 = 1;
                                } else if (var137.method276(-119, class252.field4433)) {
                                    var135 = var135.method279((byte) -55, class252.field4433.method293(false));
                                    var136 = 2;
                                } else if (var137.method276(-119, class245.field4256)) {
                                    var136 = 3;
                                    var135 = var135.method279((byte) -55, class245.field4256.method293(false));
                                } else if (var137.method276(-117, class29.field414)) {
                                    var135 = var135.method279((byte) -55, class29.field414.method293(false));
                                    var136 = 4;
                                } else if (var137.method276(-128, class99.field1655)) {
                                    var135 = var135.method279((byte) -55, class99.field1655.method293(false));
                                    var136 = 5;
                                } else if (var137.method276(-126, class107.field1768)) {
                                    var136 = 6;
                                    var135 = var135.method279((byte) -55, class107.field1768.method293(false));
                                } else if (var137.method276(-118, class144.field2413)) {
                                    var136 = 7;
                                    var135 = var135.method279((byte) -55, class144.field2413.method293(false));
                                } else if (var137.method276(-117, class16.field255)) {
                                    var136 = 8;
                                    var135 = var135.method279((byte) -55, class16.field255.method293(false));
                                } else if (var137.method276(-126, class260.field4540)) {
                                    var136 = 9;
                                    var135 = var135.method279((byte) -55, class260.field4540.method293(false));
                                } else if (var137.method276(-127, class263.field4600)) {
                                    var135 = var135.method279((byte) -55, class263.field4600.method293(false));
                                    var136 = 10;
                                } else if (var137.method276(-115, class84.field1403)) {
                                    var136 = 11;
                                    var135 = var135.method279((byte) -55, class84.field1403.method293(false));
                                } else if (class196.field3290 != 0) {
                                    if (var137.method276(-126, class198.field3314)) {
                                        var136 = 0;
                                        var135 = var135.method279((byte) -55, class198.field3314.method293(false));
                                    } else if (var137.method276(-126, class204.field3421)) {
                                        var136 = 1;
                                        var135 = var135.method279((byte) -55, class204.field3421.method293(false));
                                    } else if (var137.method276(-117, class252.field4438)) {
                                        var136 = 2;
                                        var135 = var135.method279((byte) -55, class252.field4438.method293(false));
                                    } else if (var137.method276(-113, class245.field4255)) {
                                        var135 = var135.method279((byte) -55, class245.field4255.method293(false));
                                        var136 = 3;
                                    } else if (var137.method276(-117, class29.field417)) {
                                        var136 = 4;
                                        var135 = var135.method279((byte) -55, class29.field417.method293(false));
                                    } else if (var137.method276(-126, class99.field1653)) {
                                        var135 = var135.method279((byte) -55, class99.field1653.method293(false));
                                        var136 = 5;
                                    } else if (var137.method276(-125, class107.field1767)) {
                                        var135 = var135.method279((byte) -55, class107.field1767.method293(false));
                                        var136 = 6;
                                    } else if (var137.method276(-124, class144.field2417)) {
                                        var135 = var135.method279((byte) -55, class144.field2417.method293(false));
                                        var136 = 7;
                                    } else if (var137.method276(-115, class16.field254)) {
                                        var136 = 8;
                                        var135 = var135.method279((byte) -55, class16.field254.method293(false));
                                    } else if (var137.method276(-120, class260.field4544)) {
                                        var135 = var135.method279((byte) -55, class260.field4544.method293(false));
                                        var136 = 9;
                                    } else if (var137.method276(-114, class263.field4604)) {
                                        var135 = var135.method279((byte) -55, class263.field4604.method293(false));
                                        var136 = 10;
                                    } else if (var137.method276(-125, class84.field1407)) {
                                        var136 = 11;
                                        var135 = var135.method279((byte) -55, class84.field1407.method293(false));
                                    }
                                }
                                class28.field405++;
                                class51 var139 = var135.method313(116);
                                if (var139.method276(-115, class135.field2251)) {
                                    var138 = 1;
                                    var135 = var135.method279((byte) -55, class135.field2251.method293(false));
                                } else if (var139.method276(-117, class183.field3028)) {
                                    var138 = 2;
                                    var135 = var135.method279((byte) -55, class183.field3028.method293(false));
                                } else if (var139.method276(-122, class246.field4270)) {
                                    var135 = var135.method279((byte) -55, class246.field4270.method293(false));
                                    var138 = 3;
                                } else if (var139.method276(-128, class182.field3010)) {
                                    var138 = 4;
                                    var135 = var135.method279((byte) -55, class182.field3010.method293(false));
                                } else if (var139.method276(-120, class12.field188)) {
                                    var135 = var135.method279((byte) -55, class12.field188.method293(false));
                                    var138 = 5;
                                } else if (class196.field3290 != 0) {
                                    if (var139.method276(-116, class135.field2249)) {
                                        var138 = 1;
                                        var135 = var135.method279((byte) -55, class135.field2249.method293(false));
                                    } else if (var139.method276(-118, class183.field3024)) {
                                        var138 = 2;
                                        var135 = var135.method279((byte) -55, class183.field3024.method293(false));
                                    } else if (var139.method276(-112, class246.field4273)) {
                                        var135 = var135.method279((byte) -55, class246.field4273.method293(false));
                                        var138 = 3;
                                    } else if (var139.method276(-121, class182.field2996)) {
                                        var138 = 4;
                                        var135 = var135.method279((byte) -55, class182.field2996.method293(false));
                                    } else if (var139.method276(-116, class12.field178)) {
                                        var138 = 5;
                                        var135 = var135.method279((byte) -55, class12.field178.method293(false));
                                    }
                                }
                                class95.field1575.method424((byte) 124, 142);
                                class95.field1575.method919(-4742, 0);
                                int var140 = class95.field1575.field2026;
                                class95.field1575.method919(-4742, var136);
                                class95.field1575.method919(-4742, var138);
                                class237.method1642(151, var135, class95.field1575);
                                class95.field1575.method888(31, class95.field1575.field2026 - var140);
                                continue;
                            }
                            if (var452 == 5009) {
                                var7 -= 2;
                                class51 var141 = class70.field1132[var7];
                                class51 var142 = class70.field1132[var7 + 1];
                                if (class179.field2954 != 0 || class241.field4180 != 1 && class115.field1953 != 1) {
                                    class7.field75++;
                                    class95.field1575.method424((byte) 113, 134);
                                    class95.field1575.method919(-4742, 0);
                                    int var143 = class95.field1575.field2026;
                                    class95.field1575.method885(var141.method316(107), (byte) -126);
                                    class237.method1642(151, var142, class95.field1575);
                                    class95.field1575.method888(26, class95.field1575.field2026 - var143);
                                }
                                continue;
                            }
                            if (var452 == 5010) {
                                class51 var144 = null;
                                var6--;
                                int var145 = class115.field1955[var6];
                                if (var145 < 100) {
                                    var144 = class89.field1476[var145];
                                }
                                if (var144 == null) {
                                    var144 = class184.field3044;
                                }
                                class70.field1132[var7++] = var144;
                                continue;
                            }
                            if (var452 == 5011) {
                                class51 var146 = null;
                                var6--;
                                int var147 = class115.field1955[var6];
                                if (var147 < 100) {
                                    var146 = class92.field1524[var147];
                                }
                                if (var146 == null) {
                                    var146 = class184.field3044;
                                }
                                class70.field1132[var7++] = var146;
                                continue;
                            }
                            if (var452 == 5012) {
                                var6--;
                                int var148 = class115.field1955[var6];
                                int var149 = -1;
                                if (var148 < 100) {
                                    var149 = class258.field4510[var148];
                                }
                                class115.field1955[var6++] = var149;
                                continue;
                            }
                            if (var452 == 5015) {
                                class51 var150;
                                if (class44.field706 == null || class44.field706.field1711 == null) {
                                    var150 = class43.field697;
                                } else {
                                    var150 = class44.field706.method747(false);
                                }
                                class70.field1132[var7++] = var150;
                                continue;
                            }
                            if (var452 == 5016) {
                                class115.field1955[var6++] = class33.field494;
                                continue;
                            }
                            if (var452 == 5017) {
                                class115.field1955[var6++] = class132.field2202;
                                continue;
                            }
                            if (var452 == 5050) {
                                var6--;
                                int var151 = class115.field1955[var6];
                                class70.field1132[var7++] = class184.method1301((byte) -81, var151).field1663;
                                continue;
                            }
                            if (var452 == 5051) {
                                var6--;
                                int var152 = class115.field1955[var6];
                                class100 var153 = class184.method1301((byte) -67, var152);
                                if (var153.field1666 == null) {
                                    class115.field1955[var6++] = 0;
                                } else {
                                    class115.field1955[var6++] = var153.field1666.length;
                                }
                                continue;
                            }
                            if (var452 == 5052) {
                                var6 -= 2;
                                int var154 = class115.field1955[var6 + 1];
                                int var155 = class115.field1955[var6];
                                class100 var156 = class184.method1301((byte) -48, var155);
                                int var157 = var156.field1666[var154];
                                class115.field1955[var6++] = var157;
                                continue;
                            }
                            if (var452 == 5053) {
                                var6--;
                                int var158 = class115.field1955[var6];
                                class100 var159 = class184.method1301((byte) -127, var158);
                                if (var159.field1665 == null) {
                                    class115.field1955[var6++] = 0;
                                } else {
                                    class115.field1955[var6++] = var159.field1665.length;
                                }
                                continue;
                            }
                            if (var452 == 5054) {
                                var6 -= 2;
                                int var160 = class115.field1955[var6];
                                int var161 = class115.field1955[var6 + 1];
                                class115.field1955[var6++] = class184.method1301((byte) -79, var160).field1665[var161];
                                continue;
                            }
                            if (var452 == 5055) {
                                var6--;
                                int var162 = class115.field1955[var6];
                                class70.field1132[var7++] = class225.method1551((byte) -99, var162).method1761(80);
                                continue;
                            }
                            if (var452 == 5056) {
                                var6--;
                                int var163 = class115.field1955[var6];
                                class259 var164 = class225.method1551((byte) -98, var163);
                                if (var164.field4519 == null) {
                                    class115.field1955[var6++] = 0;
                                } else {
                                    class115.field1955[var6++] = var164.field4519.length;
                                }
                                continue;
                            }
                            if (var452 == 5057) {
                                var6 -= 2;
                                int var165 = class115.field1955[var6];
                                int var166 = class115.field1955[var6 + 1];
                                class115.field1955[var6++] = class225.method1551((byte) 99, var165).field4519[var166];
                                continue;
                            }
                            if (var452 == 5058) {
                                class184.field3046 = new class159();
                                var6--;
                                class184.field3046.field2610 = class115.field1955[var6];
                                class184.field3046.field2604 = class225.method1551((byte) 110, class184.field3046.field2610);
                                class184.field3046.field2616 = new int[class184.field3046.field2604.method1757((byte) 120)];
                                continue;
                            }
                            if (var452 == 5059) {
                                class95.field1575.method424((byte) 85, 13);
                                class153.field2542++;
                                class95.field1575.method919(-4742, 0);
                                int var167 = class95.field1575.field2026;
                                class95.field1575.method919(-4742, 0);
                                class95.field1575.method895(-103, class184.field3046.field2610);
                                class184.field3046.field2604.method1755(0, class95.field1575, class184.field3046.field2616);
                                class95.field1575.method888(100, class95.field1575.field2026 - var167);
                                continue;
                            }
                            if (var452 == 5060) {
                                class84.field1404++;
                                var7--;
                                class51 var168 = class70.field1132[var7];
                                class95.field1575.method424((byte) 110, 242);
                                class95.field1575.method919(-4742, 0);
                                int var169 = class95.field1575.field2026;
                                class95.field1575.method885(var168.method316(54), (byte) -121);
                                class95.field1575.method895(-5, class184.field3046.field2610);
                                class184.field3046.field2604.method1755(0, class95.field1575, class184.field3046.field2616);
                                class95.field1575.method888(-99, class95.field1575.field2026 - var169);
                                continue;
                            }
                            if (var452 == 5061) {
                                class95.field1575.method424((byte) 95, 13);
                                class95.field1575.method919(-4742, 0);
                                class153.field2542++;
                                int var170 = class95.field1575.field2026;
                                class95.field1575.method919(-4742, 1);
                                class95.field1575.method895(-11, class184.field3046.field2610);
                                class184.field3046.field2604.method1755(0, class95.field1575, class184.field3046.field2616);
                                class95.field1575.method888(58, class95.field1575.field2026 - var170);
                                continue;
                            }
                            if (var452 == 5062) {
                                var6 -= 2;
                                int var171 = class115.field1955[var6 + 1];
                                int var172 = class115.field1955[var6];
                                class115.field1955[var6++] = class184.method1301((byte) -117, var172).field1656[var171];
                                continue;
                            }
                            if (var452 == 5063) {
                                var6 -= 2;
                                int var173 = class115.field1955[var6];
                                int var174 = class115.field1955[var6 + 1];
                                class115.field1955[var6++] = class184.method1301((byte) -30, var173).field1662[var174];
                                continue;
                            }
                            if (var452 == 5064) {
                                var6 -= 2;
                                int var175 = class115.field1955[var6];
                                int var176 = class115.field1955[var6 + 1];
                                if (var176 == -1) {
                                    class115.field1955[var6++] = -1;
                                } else {
                                    class115.field1955[var6++] = class184.method1301((byte) -48, var175).method735(-1, var176);
                                }
                                continue;
                            }
                            if (var452 == 5065) {
                                var6 -= 2;
                                int var177 = class115.field1955[var6];
                                int var178 = class115.field1955[var6 + 1];
                                if (var178 == -1) {
                                    class115.field1955[var6++] = -1;
                                } else {
                                    class115.field1955[var6++] = class184.method1301((byte) -72, var177).method733(var178, 1);
                                }
                                continue;
                            }
                            if (var452 == 5066) {
                                var6--;
                                int var179 = class115.field1955[var6];
                                class115.field1955[var6++] = class225.method1551((byte) 101, var179).method1757((byte) 122);
                                continue;
                            }
                            if (var452 == 5067) {
                                var6 -= 2;
                                int var180 = class115.field1955[var6 + 1];
                                int var181 = class115.field1955[var6];
                                int var182 = class225.method1551((byte) 113, var181).method1756(true, var180);
                                class115.field1955[var6++] = var182;
                                continue;
                            }
                            if (var452 == 5068) {
                                var6 -= 2;
                                int var183 = class115.field1955[var6 + 1];
                                int var184 = class115.field1955[var6];
                                class184.field3046.field2616[var184] = var183;
                                continue;
                            }
                            if (var452 == 5069) {
                                var6 -= 2;
                                int var185 = class115.field1955[var6 + 1];
                                int var186 = class115.field1955[var6];
                                class184.field3046.field2616[var186] = var185;
                                continue;
                            }
                            if (var452 == 5070) {
                                var6 -= 3;
                                int var187 = class115.field1955[var6];
                                int var188 = class115.field1955[var6 + 2];
                                int var189 = class115.field1955[var6 + 1];
                                class259 var190 = class225.method1551((byte) -36, var187);
                                if (var190.method1756(true, var189) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class115.field1955[var6++] = var190.method1758((byte) -121, var189, var188);
                                continue;
                            }
                        } else if (var452 < 5200) {
                            if (var452 == 5100) {
                                if (class144.field2405[86]) {
                                    class115.field1955[var6++] = 1;
                                } else {
                                    class115.field1955[var6++] = 0;
                                }
                                continue;
                            }
                            if (var452 == 5101) {
                                if (class144.field2405[82]) {
                                    class115.field1955[var6++] = 1;
                                } else {
                                    class115.field1955[var6++] = 0;
                                }
                                continue;
                            }
                            if (var452 == 5102) {
                                if (class144.field2405[81]) {
                                    class115.field1955[var6++] = 1;
                                } else {
                                    class115.field1955[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var452 < 5300) {
                            if (var452 == 5200) {
                                var6--;
                                class245.method1670(5582, class115.field1955[var6]);
                                continue;
                            }
                            if (var452 == 5201) {
                                class115.field1955[var6++] = class100.method730(true);
                                continue;
                            }
                            if (var452 == 5202) {
                                var6--;
                                class184.method1304(false, class115.field1955[var6]);
                                continue;
                            }
                            if (var452 == 5203) {
                                var7--;
                                class63.method420(false, class70.field1132[var7]);
                                continue;
                            }
                            if (var452 == 5204) {
                                class70.field1132[var7 - 1] = class124.method927(class70.field1132[var7 - 1], -107);
                                continue;
                            }
                            if (var452 == 5205) {
                                var7--;
                                class247.method1684(78, class70.field1132[var7]);
                                continue;
                            }
                            if (var452 == 5206) {
                                var6--;
                                int var241 = class115.field1955[var6];
                                class5 var242 = class225.method1549(var241 & 0x3FFF, var241 >> 14 & 0x3FFF, true);
                                if (var242 == null) {
                                    class70.field1132[var7++] = class184.field3044;
                                } else {
                                    class70.field1132[var7++] = var242.field44;
                                }
                                continue;
                            }
                            if (var452 == 5207) {
                                var7--;
                                class5 var243 = class136.method987(class70.field1132[var7], -116);
                                if (var243 != null && var243.field41 != null) {
                                    class70.field1132[var7++] = var243.field41;
                                    continue;
                                }
                                class70.field1132[var7++] = class184.field3044;
                                continue;
                            }
                        } else if (var452 >= 5400) {
                            if (var452 < 5500) {
                                if (var452 == 5400) {
                                    class77.field1238++;
                                    var7 -= 2;
                                    class51 var221 = class70.field1132[var7];
                                    var6--;
                                    int var222 = class115.field1955[var6];
                                    class51 var223 = class70.field1132[var7 + 1];
                                    class95.field1575.method424((byte) 109, 215);
                                    class95.field1575.method919(-4742, class216.method1483(110, var221) + class216.method1483(-76, var223) + 1);
                                    class95.field1575.method896((byte) 0, var221);
                                    class95.field1575.method896((byte) 0, var223);
                                    class95.field1575.method919(-4742, var222);
                                    continue;
                                }
                                if (var452 == 5401) {
                                    var6 -= 2;
                                    class66.field1068[class115.field1955[var6]] = (short) class92.method700(class115.field1955[var6 + 1], 119);
                                    class49.method258((byte) -85);
                                    class231.method1593(7);
                                    class163.method1146(98);
                                    class222.method1537(true);
                                    class20.method99((byte) -127);
                                    continue;
                                }
                                if (var452 == 5405) {
                                    var6 -= 2;
                                    int var224 = class115.field1955[var6];
                                    int var225 = class115.field1955[var6 + 1];
                                    if (var224 >= 0 && var224 < 2) {
                                        class177.field2899[var224] = new int[var225 << 1][4];
                                    }
                                    continue;
                                }
                                if (var452 == 5406) {
                                    var6 -= 7;
                                    int var226 = class115.field1955[var6];
                                    int var227 = class115.field1955[var6 + 2];
                                    int var228 = class115.field1955[var6 + 3];
                                    int var229 = class115.field1955[var6 + 1] << 1;
                                    int var230 = class115.field1955[var6 + 4];
                                    int var231 = class115.field1955[var6 + 5];
                                    int var232 = class115.field1955[var6 + 6];
                                    if (var226 >= 0 && var226 < 2 && class177.field2899[var226] != null && var229 >= 0 && var229 < class177.field2899[var226].length) {
                                        class177.field2899[var226][var229] = new int[] { class191.method1366(16383, var227 >> 14) * 128, var228, class191.method1366(16383, var227) * 128, var232 };
                                        class177.field2899[var226][var229 + 1] = new int[] { (class191.method1366(268419872, var230) >> 14) * 128, var231, class191.method1366(var230, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var452 == 5407) {
                                    var6--;
                                    int var233 = class177.field2899[class115.field1955[var6]].length >> 1;
                                    class115.field1955[var6++] = var233;
                                    continue;
                                }
                                if (var452 == 5408) {
                                    class115.field1955[var6++] = 0;
                                    continue;
                                }
                                if (var452 == 5409) {
                                    class131.method962(true);
                                    continue;
                                }
                                if (var452 == 5411) {
                                    if (class131.field2193 == null) {
                                        class76.method547(64, class32.method164(-3850), false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var452 == 5419) {
                                    class51 var234 = class184.field3044;
                                    if (class180.field2974 != null) {
                                        var234 = class108.method775(class180.field2974.field2508, (byte) 19);
                                        try {
                                            if (class180.field2974.field2505 != null) {
                                                byte[] var235 = ((String) class180.field2974.field2505).getBytes("ISO-8859-1");
                                                var234 = class101.method741(var235.length, 0, true, var235);
                                            }
                                        } catch (UnsupportedEncodingException var449) {
                                        }
                                    }
                                    class70.field1132[var7++] = var234;
                                    continue;
                                }
                                if (var452 == 5420) {
                                    class115.field1955[var6++] = class100.field1661 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 5421) {
                                    var7--;
                                    class51 var236 = class70.field1132[var7];
                                    var6--;
                                    boolean var237 = class115.field1955[var6] == 1;
                                    class76.method547(64, class20.method104(26, new class51[] { class32.method164(-3850), var236 }), var237);
                                    continue;
                                }
                                if (var452 == 5422) {
                                    var7 -= 2;
                                    class51 var238 = class70.field1132[var7];
                                    class51 var239 = class70.field1132[var7 + 1];
                                    var6--;
                                    int var240 = class115.field1955[var6];
                                    if (var238.method293(false) > 0) {
                                        if (class210.field3496 == null) {
                                            class210.field3496 = new class51[class45.field720[class86.field1440]];
                                        }
                                        class210.field3496[var240] = var238;
                                    }
                                    if (var239.method293(false) > 0) {
                                        if (class144.field2406 == null) {
                                            class144.field2406 = new class51[class45.field720[class86.field1440]];
                                        }
                                        class144.field2406[var240] = var239;
                                    }
                                    continue;
                                }
                            } else if (var452 < 5600) {
                                if (var452 == 5500) {
                                    var6 -= 4;
                                    int var191 = class115.field1955[var6];
                                    int var192 = class115.field1955[var6 + 1];
                                    int var193 = class115.field1955[var6 + 2];
                                    int var194 = class115.field1955[var6 + 3];
                                    class153.method1106((var191 >> 14 & 0x3FFF) - class11.field160, (var191 & 0x3FFF) + -class241.field4179, (byte) 48, var193, false, var194, var192);
                                    continue;
                                }
                                if (var452 == 5501) {
                                    var6 -= 4;
                                    int var195 = class115.field1955[var6];
                                    int var196 = class115.field1955[var6 + 1];
                                    int var197 = class115.field1955[var6 + 2];
                                    int var198 = class115.field1955[var6 + 3];
                                    class60.method400(var196, var197, var198, (byte) -53, (var195 & 0x3FFF) - class241.field4179, (var195 >> 14 & 0x3FFF) + -class11.field160);
                                    continue;
                                }
                                if (var452 == 5502) {
                                    var6 -= 6;
                                    int var199 = class115.field1955[var6];
                                    if (var199 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class48.field759 = var199;
                                    int var200 = class115.field1955[var6 + 1];
                                    if (var200 + 1 >= class177.field2899[class48.field759].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class193.field3236 = var200;
                                    class257.field4497 = 0;
                                    class167.field2725 = class115.field1955[var6 + 2];
                                    class3.field15 = class115.field1955[var6 + 3];
                                    int var201 = class115.field1955[var6 + 4];
                                    if (var201 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class188.field3143 = var201;
                                    int var202 = class115.field1955[var6 + 5];
                                    if (class177.field2899[class188.field3143].length >> 1 <= var202 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class201.field3361 = 3;
                                    class172.field2824 = var202;
                                    continue;
                                }
                                if (var452 == 5503) {
                                    class223.method1540(124);
                                    continue;
                                }
                                if (var452 == 5504) {
                                    var6 -= 2;
                                    class192.field3211 = class115.field1955[var6];
                                    class120.field1993 = class115.field1955[var6 + 1];
                                    class64.method429((byte) 65);
                                    continue;
                                }
                                if (var452 == 5505) {
                                    class115.field1955[var6++] = class192.field3211;
                                    continue;
                                }
                                if (var452 == 5506) {
                                    class115.field1955[var6++] = class120.field1993;
                                    continue;
                                }
                            } else if (var452 < 5700) {
                                if (var452 == 5600) {
                                    var7 -= 2;
                                    class51 var217 = class70.field1132[var7];
                                    class51 var218 = class70.field1132[var7 + 1];
                                    var6--;
                                    int var219 = class115.field1955[var6];
                                    if (class195.field3249 == 10 && class24.field364 == 0 && class210.field3497 == 0) {
                                        method530(var218, 0, var217, var219);
                                    }
                                    continue;
                                }
                                if (var452 == 5601) {
                                    class139.method1007((byte) 77);
                                    continue;
                                }
                                if (var452 == 5602) {
                                    if (class24.field364 == 0) {
                                        class63.field1033 = -2;
                                    }
                                    continue;
                                }
                                if (var452 == 5603) {
                                    var6 -= 4;
                                    if (class195.field3249 == 10 && class24.field364 == 0 && class210.field3497 == 0) {
                                        class172.method1207(class115.field1955[var6 + 1], class115.field1955[var6], class115.field1955[var6 + 3], 0, class115.field1955[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var452 == 5604) {
                                    var7--;
                                    if (class195.field3249 == 10 && class24.field364 == 0 && class210.field3497 == 0) {
                                        class258.method1752(true, class70.field1132[var7].method316(35));
                                    }
                                    continue;
                                }
                                if (var452 == 5605) {
                                    var7 -= 2;
                                    var6 -= 4;
                                    if (class195.field3249 == 10 && class24.field364 == 0 && class210.field3497 == 0) {
                                        class171.method1203(class70.field1132[var7].method316(32), class115.field1955[var6 + 3], 99999999, class115.field1955[var6], class115.field1955[var6 + 1], class70.field1132[var7 + 1], class115.field1955[var6 + 2]);
                                    }
                                    continue;
                                }
                                if (var452 == 5606) {
                                    if (class210.field3497 == 0) {
                                        class181.field2987 = -2;
                                    }
                                    continue;
                                }
                                if (var452 == 5607) {
                                    class115.field1955[var6++] = class63.field1033;
                                    continue;
                                }
                                if (var452 == 5608) {
                                    class115.field1955[var6++] = class241.field4188;
                                    continue;
                                }
                                if (var452 == 5609) {
                                    class115.field1955[var6++] = class181.field2987;
                                    continue;
                                }
                                if (var452 == 5610) {
                                    for (int var220 = 0; var220 < 5; var220++) {
                                        class70.field1132[var7++] = var220 < class171.field2801.length ? class171.field2801[var220].method304((byte) -92) : class184.field3044;
                                    }
                                    class171.field2801 = null;
                                    continue;
                                }
                            } else if (var452 < 6100) {
                                if (var452 == 6001) {
                                    var6--;
                                    int var203 = class115.field1955[var6];
                                    if (var203 < 1) {
                                        var203 = 1;
                                    }
                                    if (var203 > 4) {
                                        var203 = 4;
                                    }
                                    class40.field623 = var203;
                                    if (class40.field623 == 1) {
                                        class73.method509(0.9F);
                                    }
                                    if (class40.field623 == 2) {
                                        class73.method509(0.8F);
                                    }
                                    if (class40.field623 == 3) {
                                        class73.method509(0.7F);
                                    }
                                    if (class40.field623 == 4) {
                                        class73.method509(0.6F);
                                    }
                                    class231.method1593(7);
                                    class99.method729(class25.field376, (byte) -94);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6002) {
                                    var6--;
                                    class105.method755(class115.field1955[var6] == 1, 303);
                                    class177.method1244(52);
                                    class49.method255((byte) 58);
                                    class75.method534((byte) -119);
                                    class99.method729(class25.field376, (byte) 36);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6003) {
                                    var6--;
                                    class142.field2376 = class115.field1955[var6] == 1;
                                    class75.method534((byte) 103);
                                    class99.method729(class25.field376, (byte) -121);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6005) {
                                    var6--;
                                    class193.field3244 = class115.field1955[var6] == 1;
                                    class49.method255((byte) 68);
                                    class99.method729(class25.field376, (byte) 73);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6006) {
                                    var6--;
                                    class120.field2000 = class115.field1955[var6] == 1;
                                    ((class66) class73.field1166).method463(126, !class120.field2000);
                                    class99.method729(class25.field376, (byte) 32);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6007) {
                                    var6--;
                                    class35.field517 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) -120);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6008) {
                                    var6--;
                                    class98.field1636 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) 16);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6009) {
                                    var6--;
                                    class190.field3182 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) -90);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6010) {
                                    var6--;
                                    class174.field2860 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) 55);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6011) {
                                    var6--;
                                    int var204 = class115.field1955[var6];
                                    if (var204 < 0 || var204 > 2) {
                                        var204 = 0;
                                    }
                                    class103.field1699 = var204;
                                    class99.method729(class25.field376, (byte) -116);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6012) {
                                    var6--;
                                    class263.field4602 = class115.field1955[var6] == 1;
                                    if (class40.field623 == 1) {
                                        class73.method509(0.9F);
                                    }
                                    if (class40.field623 == 2) {
                                        class73.method509(0.8F);
                                    }
                                    if (class40.field623 == 3) {
                                        class73.method509(0.7F);
                                    }
                                    if (class40.field623 == 4) {
                                        class73.method509(0.6F);
                                    }
                                    class49.method255((byte) 66);
                                    class99.method729(class25.field376, (byte) -116);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6014) {
                                    var6--;
                                    class20.field272 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) 72);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6015) {
                                    var6--;
                                    class66.field1075 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) -100);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6016) {
                                    var6--;
                                    int var205 = class115.field1955[var6];
                                    if (var205 < 0 || var205 > 2) {
                                        var205 = 0;
                                    }
                                    class205.field3429 = var205;
                                    class99.method729(class25.field376, (byte) -114);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6017) {
                                    var6--;
                                    class212.field3522 = class115.field1955[var6] == 1;
                                    class63.method415(0);
                                    class99.method729(class25.field376, (byte) 79);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6018) {
                                    var6--;
                                    int var206 = class115.field1955[var6];
                                    if (var206 < 0) {
                                        var206 = 0;
                                    }
                                    if (var206 > 127) {
                                        var206 = 127;
                                    }
                                    class261.field4551 = var206;
                                    class99.method729(class25.field376, (byte) 1);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6019) {
                                    var6--;
                                    int var207 = class115.field1955[var6];
                                    if (var207 < 0) {
                                        var207 = 0;
                                    }
                                    if (var207 > 255) {
                                        var207 = 255;
                                    }
                                    if (class26.field381 != var207) {
                                        if (class26.field381 == 0 && class153.field2556 != -1) {
                                            class9.method42(0, class149.field2493, (byte) 83, class153.field2556, var207, false);
                                            class236.field4117 = false;
                                        } else if (var207 == 0) {
                                            class135.method984(2);
                                            class236.field4117 = false;
                                        } else {
                                            class90.method682(true, var207);
                                        }
                                        class26.field381 = var207;
                                    }
                                    class99.method729(class25.field376, (byte) -122);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6020) {
                                    var6--;
                                    int var208 = class115.field1955[var6];
                                    if (var208 < 0) {
                                        var208 = 0;
                                    }
                                    if (var208 > 127) {
                                        var208 = 127;
                                    }
                                    class218.field3801 = var208;
                                    class99.method729(class25.field376, (byte) -103);
                                    class210.field3498 = false;
                                    continue;
                                }
                                if (var452 == 6021) {
                                    var6--;
                                    class111.field1881 = class115.field1955[var6] == 1;
                                    class75.method534((byte) 110);
                                    continue;
                                }
                                if (var452 == 6022) {
                                    var6--;
                                    class230.field4009 = class115.field1955[var6] == 1;
                                    class99.method729(class25.field376, (byte) 90);
                                    class41.method206((byte) 125, 0);
                                    continue;
                                }
                            } else if (var452 < 6200) {
                                if (var452 == 6101) {
                                    class115.field1955[var6++] = class40.field623;
                                    continue;
                                }
                                if (var452 == 6102) {
                                    class115.field1955[var6++] = class34.method170(103) ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6103) {
                                    class115.field1955[var6++] = class142.field2376 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6105) {
                                    class115.field1955[var6++] = class193.field3244 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6106) {
                                    class115.field1955[var6++] = class120.field2000 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6107) {
                                    class115.field1955[var6++] = class35.field517 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6108) {
                                    class115.field1955[var6++] = class98.field1636 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6109) {
                                    class115.field1955[var6++] = class190.field3182 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6110) {
                                    class115.field1955[var6++] = class174.field2860 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6111) {
                                    class115.field1955[var6++] = class103.field1699;
                                    continue;
                                }
                                if (var452 == 6112) {
                                    class115.field1955[var6++] = class263.field4602 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6114) {
                                    class115.field1955[var6++] = class20.field272 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6115) {
                                    class115.field1955[var6++] = class66.field1075 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6116) {
                                    class115.field1955[var6++] = class205.field3429;
                                    continue;
                                }
                                if (var452 == 6117) {
                                    class115.field1955[var6++] = class212.field3522 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6118) {
                                    class115.field1955[var6++] = class261.field4551;
                                    continue;
                                }
                                if (var452 == 6119) {
                                    class115.field1955[var6++] = class26.field381;
                                    continue;
                                }
                                if (var452 == 6120) {
                                    class115.field1955[var6++] = class218.field3801;
                                    continue;
                                }
                                if (var452 == 6121) {
                                    class115.field1955[var6++] = 0;
                                    continue;
                                }
                                if (var452 == 6122) {
                                    class115.field1955[var6++] = class230.field4009 ? 1 : 0;
                                    continue;
                                }
                            } else if (var452 < 6300) {
                                if (var452 == 6200) {
                                    var6 -= 2;
                                    class221.field3844 = (short) class115.field1955[var6];
                                    if (class221.field3844 <= 0) {
                                        class221.field3844 = 256;
                                    }
                                    class143.field2391 = (short) class115.field1955[var6 + 1];
                                    if (class143.field2391 <= 0) {
                                        class143.field2391 = 205;
                                    }
                                    continue;
                                }
                                if (var452 == 6201) {
                                    var6 -= 2;
                                    class180.field2963 = (short) class115.field1955[var6];
                                    if (class180.field2963 <= 0) {
                                        class180.field2963 = 256;
                                    }
                                    class118.field1980 = (short) class115.field1955[var6 + 1];
                                    if (class118.field1980 <= 0) {
                                        class118.field1980 = 320;
                                    }
                                    continue;
                                }
                                if (var452 == 6202) {
                                    var6 -= 4;
                                    class140.field2347 = (short) class115.field1955[var6];
                                    if (class140.field2347 <= 0) {
                                        class140.field2347 = 1;
                                    }
                                    class207.field3459 = (short) class115.field1955[var6 + 1];
                                    if (class207.field3459 <= 0) {
                                        class207.field3459 = 32767;
                                    } else if (class140.field2347 > class207.field3459) {
                                        class207.field3459 = class140.field2347;
                                    }
                                    class75.field1185 = (short) class115.field1955[var6 + 2];
                                    if (class75.field1185 <= 0) {
                                        class75.field1185 = 1;
                                    }
                                    class245.field4257 = (short) class115.field1955[var6 + 3];
                                    if (class245.field4257 <= 0) {
                                        class245.field4257 = 32767;
                                    } else if (class245.field4257 < class75.field1185) {
                                        class245.field4257 = class75.field1185;
                                    }
                                    continue;
                                }
                                if (var452 == 6203) {
                                    class218.method1504(0, (byte) -112, 0, class243.field4207.field3603, class243.field4207.field3608, false);
                                    class115.field1955[var6++] = class225.field3964;
                                    class115.field1955[var6++] = class172.field2822;
                                    continue;
                                }
                                if (var452 == 6204) {
                                    class115.field1955[var6++] = class180.field2963;
                                    class115.field1955[var6++] = class118.field1980;
                                    continue;
                                }
                                if (var452 == 6205) {
                                    class115.field1955[var6++] = class221.field3844;
                                    class115.field1955[var6++] = class143.field2391;
                                    continue;
                                }
                            } else if (var452 < 6400) {
                                if (var452 == 6300) {
                                    class115.field1955[var6++] = (int) (class7.method31((byte) -88) / 60000L);
                                    continue;
                                }
                                if (var452 == 6301) {
                                    class115.field1955[var6++] = (int) (class7.method31((byte) -88) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var452 == 6302) {
                                    var6 -= 3;
                                    int var212 = class115.field1955[var6];
                                    int var213 = class115.field1955[var6 + 2];
                                    int var214 = class115.field1955[var6 + 1];
                                    class175.field2876.clear();
                                    class175.field2876.set(11, 12);
                                    class175.field2876.set(var213, var214, var212);
                                    class115.field1955[var6++] = (int) (class175.field2876.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var452 == 6303) {
                                    class175.field2876.clear();
                                    class175.field2876.setTime(new Date(class7.method31((byte) -88)));
                                    class115.field1955[var6++] = class175.field2876.get(1);
                                    continue;
                                }
                                if (var452 == 6304) {
                                    var6--;
                                    int var215 = class115.field1955[var6];
                                    boolean var216 = true;
                                    if (var215 < 0) {
                                        var216 = ((var215 + 1) % 4) == 0;
                                    } else if (var215 < 1582) {
                                        var216 = (var215 % 4) == 0;
                                    } else if (var215 % 4 != 0) {
                                        var216 = false;
                                    } else if (var215 % 100 != 0) {
                                        var216 = true;
                                    } else if (var215 % 400 != 0) {
                                        var216 = false;
                                    }
                                    class115.field1955[var6++] = var216 ? 1 : 0;
                                    continue;
                                }
                            } else if (var452 < 6500) {
                                if (var452 == 6400) {
                                    class115.field1955[var6++] = class26.field384 ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6401) {
                                    var6--;
                                    int var209 = class115.field1955[var6];
                                    var7--;
                                    class51 var210 = class70.field1132[var7];
                                    String var211;
                                    try {
                                        var211 = new String(var210.method291((byte) 124), "ISO-8859-1");
                                    } catch (UnsupportedEncodingException var450) {
                                        var211 = new String(var210.method291((byte) 123));
                                    }
                                    if (class26.field384) {
                                        if (!browsercontrol.iscreated()) {
                                            browsercontrol.create("about:blank");
                                        }
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate(var211);
                                            class205.field3426 = var209;
                                            class41.method206((byte) 125, 0);
                                        }
                                    }
                                    continue;
                                }
                                if (var452 == 6402) {
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate("about:blank");
                                        browsercontrol.hide();
                                        class205.field3426 = 0;
                                        class41.method206((byte) 119, 0);
                                    }
                                    continue;
                                }
                                if (var452 == 6403) {
                                    class70.field1132[var7++] = class195.field3269;
                                    continue;
                                }
                                if (var452 == 6404) {
                                    class70.field1132[var7++] = class170.field2781;
                                    continue;
                                }
                                if (var452 == 6405) {
                                    class115.field1955[var6++] = class83.method644((byte) -71) ? 1 : 0;
                                    continue;
                                }
                                if (var452 == 6406) {
                                    class115.field1955[var6++] = class129.method954(26546) ? 1 : 0;
                                    continue;
                                }
                            }
                        } else if (var452 == 5306) {
                            class115.field1955[var6++] = class76.method543(-70);
                            continue;
                        }
                    } else if (var452 == 4300) {
                        var6 -= 2;
                        int var244 = class115.field1955[var6];
                        int var245 = class115.field1955[var6 + 1];
                        class67 var246 = class225.method1546(11, var245);
                        if (var246.method474((byte) -95)) {
                            class70.field1132[var7++] = class247.method1678((byte) -89, var244).method61(var245, var246.field1091, -107);
                        } else {
                            class115.field1955[var6++] = class247.method1678((byte) -71, var244).method57(var246.field1102, var245, (byte) 68);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var451) {
            if (var5.field793 == null) {
                if (class239.field4155 != 0) {
                    class147.method1064(class45.field725, class184.field3044, (byte) 76, 0);
                }
                class89.method674(var451, "CS2 - scr:" + var5.field1760 + " op:" + var12, 95);
            } else {
                class51 var446 = class131.method964(0, 30);
                var446.method305((byte) -110, class160.field2618).method305((byte) -91, var5.field793);
                for (int var447 = class38.field586 - 1; var447 >= 0; var447--) {
                    var446.method305((byte) -123, class221.field3839).method305((byte) -100, class3.field17[var447].field454.field793);
                }
                if (var12 == 40) {
                    int var448 = var11[var8];
                    var446.method305((byte) -101, class195.field3256).method305((byte) -128, class51.method311(var448, 10));
                }
                if (class239.field4155 != 0) {
                    class147.method1064(class20.method104(20, new class51[] { class42.field680, var5.field793 }), class184.field3044, (byte) 49, 0);
                }
                class89.method674(var451, "CS2 - scr:" + var5.field1760 + " op:" + var12 + new String(var446.method291((byte) 72)), 95);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lu;Z)V")
    public static final void method532(class111 arg0, boolean arg1) {
        field1178++;
        class175.field2869 = arg0;
        if (arg1) {
            method531(121, -40, (class205) null);
        }
    }
}
