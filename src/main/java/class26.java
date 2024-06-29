import java.io.UnsupportedEncodingException;
import java.util.Date;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class26 {

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "Le;")
    public static class191 field373 = class54.method368("null", 2047);

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "Le;")
    public static class191 field380 = class54.method368("blinken1:", 2047);

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "Le;")
    public static class191 field385 = class54.method368("", 2047);

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "Le;")
    public static class191 field381 = field385;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Le;")
    public static class191 field375 = field385;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([BI)[B")
    public static final byte[] method187(byte[] arg0, int arg1) {
        field376++;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        if (arg1 > -26) {
            field381 = null;
        }
        class58.method390(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static void method188(byte arg0) {
        field373 = null;
        if (arg0 != 118) {
            method187((byte[]) null, 7);
        }
        field380 = null;
        field375 = null;
        field381 = null;
        field385 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZI)Le;")
    public static final class191 method189(int arg0, boolean arg1, int arg2) {
        field374++;
        if (arg1) {
            field380 = null;
        }
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class91.field1497;
        } else if (var3 < -6) {
            return class192.field3418;
        } else if (var3 < -3) {
            return class119.field1962;
        } else if (var3 < 0) {
            return class213.field3755;
        } else if (var3 > 9) {
            return class16.field211;
        } else if (var3 > 6) {
            return class161.field2732;
        } else if (var3 > 3) {
            return class250.field4445;
        } else if (var3 > 0) {
            return class25.field365;
        } else {
            return class107.field1775;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIII)V")
    public static final void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 5360) {
            return;
        }
        field384++;
        int var10000 = arg1 ^ 0x14F7;
        int var8 = arg2 + 1;
        class242.method1700(var10000, arg5, arg0, class232.field4151[arg2], arg3);
        int var9 = arg4 - 1;
        class242.method1700(7, arg5, arg0, class232.field4151[arg4], arg3);
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class232.field4151[var6];
            var7[arg3] = var7[arg0] = arg5;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Llb;")
    private static final class197 method191(byte arg0, int arg1) {
        field382++;
        class197 var2 = (class197) class265.field4688.method437((byte) 112, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class152.field2604.method826((byte) 35, arg1, 0);
        if (var3 == null) {
            return null;
        }
        class197 var4 = new class197();
        class225 var5 = new class225(var3);
        var5.field3996 = var5.field3995.length - 2;
        int var6 = var5.method1593(true);
        int var7 = var5.field3995.length - var6 - 2 - 12;
        var5.field3996 = var7;
        int var8 = var5.method1562(21705);
        var4.field3516 = var5.method1593(true);
        var4.field3521 = var5.method1593(true);
        var4.field3511 = var5.method1593(true);
        var4.field3522 = var5.method1593(true);
        int var9 = var5.method1580(-126);
        if (var9 > 0) {
            var4.field3524 = new class97[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1593(true);
                class97 var12 = new class97(class10.method71(var11, -480947516));
                var4.field3524[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1562(21705);
                    int var14 = var5.method1562(21705);
                    var12.method605((long) var13, -3, new class115(var14));
                }
            }
        }
        var5.field3996 = 0;
        int var15 = 95 / ((-arg0 - 20) / 45);
        var4.field3512 = var5.method1612(-1);
        var4.field3520 = new int[var8];
        var4.field3527 = new class191[var8];
        int var16 = 0;
        var4.field3519 = new int[var8];
        while (var5.field3996 < var7) {
            int var17 = var5.method1593(true);
            if (var17 == 3) {
                var4.field3527[var16] = var5.method1596((byte) 52);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field3519[var16] = var5.method1580(-72);
            } else {
                var4.field3519[var16] = var5.method1562(21705);
            }
            var4.field3520[var16++] = var17;
        }
        class265.field4688.method439(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Lng;I)V")
    public static final void method192(class121 arg0, int arg1) {
        field377++;
        class176.field3026 = arg0;
        if (arg1 != 0) {
            field380 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILkk;I)V")
    public static final void method193(int arg0, class61 arg1, int arg2) {
        field379++;
        Object[] var3 = arg1.field1101;
        int var4 = (Integer) var3[0];
        class197 var5 = method191((byte) 117, var4);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        int var7 = 0;
        class261.field4597 = 0;
        int var8 = -1;
        byte var9 = -1;
        int[] var10 = var5.field3519;
        int[] var11 = var5.field3520;
        try {
            class173.field2921 = new class191[var5.field3521];
            class148.field2556 = new int[var5.field3516];
            int var12 = 0;
            if (arg0 == 3) {
                int var13 = 0;
                for (int var14 = 1; var14 < var3.length; var14++) {
                    if (var3[var14] instanceof Integer) {
                        int var15 = (Integer) var3[var14];
                        if (var15 == -2147483647) {
                            var15 = arg1.field1100;
                        }
                        if (var15 == -2147483646) {
                            var15 = arg1.field1091;
                        }
                        if (var15 == -2147483645) {
                            var15 = arg1.field1089 == null ? -1 : arg1.field1089.field491;
                        }
                        if (var15 == -2147483644) {
                            var15 = arg1.field1102;
                        }
                        if (var15 == -2147483643) {
                            var15 = arg1.field1089 == null ? -1 : arg1.field1089.field589;
                        }
                        if (var15 == -2147483642) {
                            var15 = arg1.field1088 == null ? -1 : arg1.field1088.field491;
                        }
                        if (var15 == -2147483641) {
                            var15 = arg1.field1088 == null ? -1 : arg1.field1088.field589;
                        }
                        if (var15 == -2147483640) {
                            var15 = arg1.field1084;
                        }
                        if (var15 == -2147483639) {
                            var15 = arg1.field1096;
                        }
                        class148.field2556[var12++] = var15;
                    } else if (var3[var14] instanceof class191) {
                        class191 var16 = (class191) var3[var14];
                        if (var16.method1317(-27518, class54.field1003)) {
                            var16 = arg1.field1095;
                        }
                        class173.field2921[var13++] = var16;
                    }
                }
                int var17 = 0;
                label3494: while (true) {
                    var17++;
                    if (var17 > arg2) {
                        throw new RuntimeException("slow");
                    }
                    var8++;
                    int var461 = var11[var8];
                    if (var461 < 100) {
                        if (var461 == 0) {
                            class66.field1152[var6++] = var10[var8];
                            continue;
                        }
                        if (var461 == 1) {
                            int var18 = var10[var8];
                            class66.field1152[var6++] = class164.field2778[var18];
                            continue;
                        }
                        if (var461 == 2) {
                            int var19 = var10[var8];
                            var6--;
                            class14.method98(class66.field1152[var6], false, var19);
                            continue;
                        }
                        if (var461 == 3) {
                            class266.field4713[var7++] = var5.field3527[var8];
                            continue;
                        }
                        if (var461 == 6) {
                            var8 += var10[var8];
                            continue;
                        }
                        if (var461 == 7) {
                            var6 -= 2;
                            if (class66.field1152[var6 + 1] != class66.field1152[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var461 == 8) {
                            var6 -= 2;
                            if (class66.field1152[var6 + 1] == class66.field1152[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var461 == 9) {
                            var6 -= 2;
                            if (class66.field1152[var6] < class66.field1152[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var461 == 10) {
                            var6 -= 2;
                            if (class66.field1152[var6] > class66.field1152[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var461 == 21) {
                            if (class261.field4597 == 0) {
                                return;
                            }
                            class141 var20 = class51.field914[--class261.field4597];
                            var8 = var20.field2355;
                            var5 = var20.field2347;
                            class173.field2921 = var20.field2351;
                            var11 = var5.field3520;
                            var10 = var5.field3519;
                            class148.field2556 = var20.field2345;
                            continue;
                        }
                        if (var461 == 25) {
                            int var21 = var10[var8];
                            class66.field1152[var6++] = class33.method223((byte) -64, var21);
                            continue;
                        }
                        if (var461 == 27) {
                            int var22 = var10[var8];
                            var6--;
                            class270.method1843(var22, -16, class66.field1152[var6]);
                            continue;
                        }
                        if (var461 == 31) {
                            var6 -= 2;
                            if (class66.field1152[var6] <= class66.field1152[var6 + 1]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var461 == 32) {
                            var6 -= 2;
                            if (class66.field1152[var6 + 1] <= class66.field1152[var6]) {
                                var8 += var10[var8];
                            }
                            continue;
                        }
                        if (var461 == 33) {
                            class66.field1152[var6++] = class148.field2556[var10[var8]];
                            continue;
                        }
                        int var10001;
                        if (var461 == 34) {
                            var10001 = var10[var8];
                            var6--;
                            class148.field2556[var10001] = class66.field1152[var6];
                            continue;
                        }
                        if (var461 == 35) {
                            class266.field4713[var7++] = class173.field2921[var10[var8]];
                            continue;
                        }
                        if (var461 == 36) {
                            var10001 = var10[var8];
                            var7--;
                            class173.field2921[var10001] = class266.field4713[var7];
                            continue;
                        }
                        if (var461 == 37) {
                            int var23 = var10[var8];
                            var7 -= var23;
                            class191 var24 = class134.method900(var7, class266.field4713, 0, var23);
                            class266.field4713[var7++] = var24;
                            continue;
                        }
                        if (var461 == 38) {
                            var6--;
                            continue;
                        }
                        if (var461 == 39) {
                            var7--;
                            continue;
                        }
                        if (var461 == 40) {
                            int var25 = var10[var8];
                            class197 var26 = method191((byte) -87, var25);
                            int[] var27 = new int[var26.field3516];
                            class191[] var28 = new class191[var26.field3521];
                            for (int var29 = 0; var29 < var26.field3511; var29++) {
                                var27[var29] = class66.field1152[var6 + var29 - var26.field3511];
                            }
                            for (int var30 = 0; var30 < var26.field3522; var30++) {
                                var28[var30] = class266.field4713[var7 + var30 - var26.field3522];
                            }
                            var7 -= var26.field3522;
                            var6 -= var26.field3511;
                            class141 var31 = new class141();
                            var31.field2345 = class148.field2556;
                            var31.field2347 = var5;
                            var31.field2351 = class173.field2921;
                            var31.field2355 = var8;
                            if (class261.field4597 >= class51.field914.length) {
                                throw new RuntimeException();
                            }
                            var8 = -1;
                            var5 = var26;
                            class51.field914[class261.field4597++] = var31;
                            var10 = var26.field3519;
                            class173.field2921 = var28;
                            var11 = var26.field3520;
                            class148.field2556 = var27;
                            continue;
                        }
                        if (var461 == 42) {
                            class66.field1152[var6++] = class161.field2729[var10[var8]];
                            continue;
                        }
                        if (var461 == 43) {
                            int var32 = var10[var8];
                            var6--;
                            class161.field2729[var32] = class66.field1152[var6];
                            class57.method380(-95, var32);
                            continue;
                        }
                        if (var461 == 44) {
                            int var33 = var10[var8] >> 16;
                            int var34 = var10[var8] & 0xFFFF;
                            var6--;
                            int var35 = class66.field1152[var6];
                            if (var35 >= 0 && var35 <= 5000) {
                                class46.field828[var33] = var35;
                                byte var36 = -1;
                                if (var34 == 105) {
                                    var36 = 0;
                                }
                                int var37 = 0;
                                while (true) {
                                    if (var35 <= var37) {
                                        continue label3494;
                                    }
                                    class126.field2089[var33][var37] = var36;
                                    var37++;
                                }
                            }
                            throw new RuntimeException();
                        }
                        if (var461 == 45) {
                            int var38 = var10[var8];
                            var6--;
                            int var39 = class66.field1152[var6];
                            if (var39 >= 0 && var39 < class46.field828[var38]) {
                                class66.field1152[var6++] = class126.field2089[var38][var39];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var461 == 46) {
                            var6 -= 2;
                            int var40 = var10[var8];
                            int var41 = class66.field1152[var6];
                            if (var41 >= 0 && class46.field828[var40] > var41) {
                                class126.field2089[var40][var41] = class66.field1152[var6 + 1];
                                continue;
                            }
                            throw new RuntimeException();
                        }
                        if (var461 == 47) {
                            class191 var42 = class258.field4584[var10[var8]];
                            if (var42 == null) {
                                var42 = class27.field397;
                            }
                            class266.field4713[var7++] = var42;
                            continue;
                        }
                        if (var461 == 48) {
                            int var43 = var10[var8];
                            var7--;
                            class258.field4584[var43] = class266.field4713[var7];
                            class255.method1764(120, var43);
                            continue;
                        }
                        if (var461 == 51) {
                            class97 var44 = var5.field3524[var10[var8]];
                            var6--;
                            class115 var45 = (class115) var44.method612((long) class66.field1152[var6], true);
                            if (var45 != null) {
                                var8 += var45.field1896;
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
                    if (var461 < 300) {
                        if (var461 == 100) {
                            var6 -= 3;
                            int var439 = class66.field1152[var6 + 1];
                            int var440 = class66.field1152[var6 + 2];
                            int var441 = class66.field1152[var6];
                            if (var439 == 0) {
                                throw new RuntimeException();
                            }
                            class33 var442 = class233.method1646(5877, var441);
                            if (var442.field548 == null) {
                                var442.field548 = new class33[var440 + 1];
                            }
                            if (var442.field548.length <= var440) {
                                class33[] var443 = new class33[var440 + 1];
                                for (int var444 = 0; var444 < var442.field548.length; var444++) {
                                    var443[var444] = var442.field548[var444];
                                }
                                var442.field548 = var443;
                            }
                            if (var440 > 0 && var442.field548[var440 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var440 - 1));
                            }
                            class33 var445 = new class33();
                            var445.field493 = var439;
                            var445.field478 = var445.field491 = var442.field491;
                            var445.field589 = var440;
                            var445.field591 = true;
                            var442.field548[var440] = var445;
                            if (var46) {
                                class138.field2310 = var445;
                            } else {
                                class262.field4649 = var445;
                            }
                            class184.method1238(var442, (byte) -55);
                            continue;
                        }
                        if (var461 == 101) {
                            class33 var446 = var46 ? class138.field2310 : class262.field4649;
                            if (var446.field589 == -1) {
                                if (var46) {
                                    throw new RuntimeException("Tried to .cc_delete static .active-component!");
                                }
                                throw new RuntimeException("Tried to cc_delete static active-component!");
                            }
                            class33 var447 = class233.method1646(5877, var446.field491);
                            var447.field548[var446.field589] = null;
                            class184.method1238(var447, (byte) -23);
                            continue;
                        }
                        if (var461 == 102) {
                            var6--;
                            class33 var448 = class233.method1646(5877, class66.field1152[var6]);
                            var448.field548 = null;
                            class184.method1238(var448, (byte) -18);
                            continue;
                        }
                        if (var461 == 200) {
                            var6 -= 2;
                            int var449 = class66.field1152[var6 + 1];
                            int var450 = class66.field1152[var6];
                            class33 var451 = class10.method74(var450, var449, (byte) -36);
                            if (var451 != null && var449 != -1) {
                                class66.field1152[var6++] = 1;
                                if (var46) {
                                    class138.field2310 = var451;
                                } else {
                                    class262.field4649 = var451;
                                }
                                continue;
                            }
                            class66.field1152[var6++] = 0;
                            continue;
                        }
                        if (var461 == 201) {
                            var6--;
                            int var452 = class66.field1152[var6];
                            class33 var453 = class233.method1646(5877, var452);
                            if (var453 == null) {
                                class66.field1152[var6++] = 0;
                            } else {
                                class66.field1152[var6++] = 1;
                                if (var46) {
                                    class138.field2310 = var453;
                                } else {
                                    class262.field4649 = var453;
                                }
                            }
                            continue;
                        }
                    } else if (var461 < 500) {
                        if (var461 == 403) {
                            var6 -= 2;
                            int var434 = class66.field1152[var6];
                            if (var434 >= 7) {
                                var434 -= 7;
                            }
                            int var435 = class66.field1152[var6 + 1];
                            class175.field2946.field1306.method1219(var434, (byte) -87, var435);
                            continue;
                        }
                        if (var461 == 404) {
                            var6 -= 2;
                            int var436 = class66.field1152[var6 + 1];
                            int var437 = class66.field1152[var6];
                            class175.field2946.field1306.method1222(var437, var436, arg0 ^ 0xFC);
                            continue;
                        }
                        if (var461 == 410) {
                            var6--;
                            boolean var438 = class66.field1152[var6] != 0;
                            class175.field2946.field1306.method1225((byte) -49, var438);
                            continue;
                        }
                    } else {
                        int var10000;
                        if (var461 >= 1000 && var461 < 1100 || var461 >= 2000 && var461 < 2100) {
                            class33 var428;
                            if (var461 < 2000) {
                                var428 = var46 ? class138.field2310 : class262.field4649;
                            } else {
                                var461 -= 1000;
                                var10000 = arg0 + 5874;
                                var6--;
                                var428 = class233.method1646(var10000, class66.field1152[var6]);
                            }
                            if (var461 == 1000) {
                                var6 -= 4;
                                var428.field529 = class66.field1152[var6];
                                var428.field558 = class66.field1152[var6 + 1];
                                int var429 = class66.field1152[var6 + 3];
                                if (var429 < 0) {
                                    var429 = 0;
                                } else if (var429 > 5) {
                                    var429 = 5;
                                }
                                int var430 = class66.field1152[var6 + 2];
                                if (var430 < 0) {
                                    var430 = 0;
                                } else if (var430 > 5) {
                                    var430 = 5;
                                }
                                var428.field480 = (byte) var430;
                                var428.field497 = (byte) var429;
                                class184.method1238(var428, (byte) -69);
                                class49.method333(80, var428);
                                if (var428.field589 == -1) {
                                    class230.method1639(var428.field491, arg0 + 8);
                                }
                                continue;
                            }
                            if (var461 == 1001) {
                                var6 -= 4;
                                var428.field488 = class66.field1152[var6];
                                var428.field469 = class66.field1152[var6 + 1];
                                var428.field593 = 0;
                                var428.field527 = 0;
                                int var431 = class66.field1152[var6 + 3];
                                int var432 = class66.field1152[var6 + 2];
                                if (var432 < 0) {
                                    var432 = 0;
                                } else if (var432 > 4) {
                                    var432 = 4;
                                }
                                if (var431 < 0) {
                                    var431 = 0;
                                } else if (var431 > 4) {
                                    var431 = 4;
                                }
                                var428.field549 = (byte) var431;
                                var428.field582 = (byte) var432;
                                class184.method1238(var428, (byte) -98);
                                class49.method333(arg0 + 123, var428);
                                if (var428.field493 == 0) {
                                    class27.method196(var428, false, arg0 + 106);
                                }
                                continue;
                            }
                            if (var461 == 1003) {
                                var6--;
                                boolean var433 = class66.field1152[var6] == 1;
                                if (var428.field607 != var433) {
                                    var428.field607 = var433;
                                    class184.method1238(var428, (byte) -111);
                                }
                                if (var428.field589 == -1) {
                                    class196.method1386(0, var428.field491);
                                }
                                continue;
                            }
                            if (var461 == 1004) {
                                var6 -= 2;
                                var428.field473 = class66.field1152[var6];
                                var428.field590 = class66.field1152[var6 + 1];
                                class184.method1238(var428, (byte) -93);
                                class49.method333(107, var428);
                                if (var428.field493 == 0) {
                                    class27.method196(var428, false, 109);
                                }
                                continue;
                            }
                        } else if (!(var461 < 1100 || var461 >= 1200) || !(var461 < 2100 || var461 >= 2200)) {
                            class33 var47;
                            if (var461 < 2000) {
                                var47 = var46 ? class138.field2310 : class262.field4649;
                            } else {
                                var10000 = arg0 + 5874;
                                var6--;
                                var47 = class233.method1646(var10000, class66.field1152[var6]);
                                var461 -= 1000;
                            }
                            if (var461 == 1100) {
                                var6 -= 2;
                                var47.field585 = class66.field1152[var6];
                                if (var47.field585 > (var47.field462 - var47.field537)) {
                                    var47.field585 = var47.field462 - var47.field537;
                                }
                                if (var47.field585 < 0) {
                                    var47.field585 = 0;
                                }
                                var47.field534 = class66.field1152[var6 + 1];
                                if (var47.field534 > (var47.field482 - var47.field561)) {
                                    var47.field534 = var47.field482 - var47.field561;
                                }
                                if (var47.field534 < 0) {
                                    var47.field534 = 0;
                                }
                                class184.method1238(var47, (byte) -115);
                                if (var47.field589 == -1) {
                                    class147.method993(true, var47.field491);
                                }
                                continue;
                            }
                            if (var461 == 1101) {
                                var6--;
                                var47.field562 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -68);
                                if (var47.field589 == -1) {
                                    class182.method1229(var47.field491, 6);
                                }
                                continue;
                            }
                            if (var461 == 1102) {
                                var6--;
                                var47.field615 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -53);
                                continue;
                            }
                            if (var461 == 1103) {
                                var6--;
                                var47.field512 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -73);
                                continue;
                            }
                            if (var461 == 1104) {
                                var6--;
                                var47.field528 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -22);
                                continue;
                            }
                            if (var461 == 1105) {
                                var6--;
                                var47.field500 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -72);
                                continue;
                            }
                            if (var461 == 1106) {
                                var6--;
                                var47.field592 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -84);
                                continue;
                            }
                            if (var461 == 1107) {
                                var6--;
                                var47.field474 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -81);
                                continue;
                            }
                            if (var461 == 1108) {
                                var47.field505 = 1;
                                var6--;
                                var47.field518 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -87);
                                if (var47.field589 == -1) {
                                    class8.method61(var47.field491, -62);
                                }
                                continue;
                            }
                            if (var461 == 1109) {
                                var6 -= 6;
                                var47.field619 = class66.field1152[var6];
                                var47.field495 = class66.field1152[var6 + 1];
                                var47.field603 = class66.field1152[var6 + 2];
                                var47.field510 = class66.field1152[var6 + 3];
                                var47.field470 = class66.field1152[var6 + 4];
                                var47.field508 = class66.field1152[var6 + 5];
                                class184.method1238(var47, (byte) -119);
                                if (var47.field589 == -1) {
                                    class37.method253(true, var47.field491);
                                    class217.method1479(10, var47.field491);
                                }
                                continue;
                            }
                            if (var461 == 1110) {
                                var6--;
                                int var48 = class66.field1152[var6];
                                if (var47.field514 != var48) {
                                    var47.field557 = 0;
                                    var47.field479 = 0;
                                    var47.field514 = var48;
                                    class184.method1238(var47, (byte) -88);
                                }
                                if (var47.field589 == -1) {
                                    class267.method1832((byte) 67, var47.field491);
                                }
                                continue;
                            }
                            if (var461 == 1111) {
                                var6--;
                                var47.field502 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -118);
                                continue;
                            }
                            if (var461 == 1112) {
                                var7--;
                                class191 var49 = class266.field4713[var7];
                                if (!var49.method1317(-27518, var47.field609)) {
                                    var47.field609 = var49;
                                    class184.method1238(var47, (byte) -88);
                                }
                                if (var47.field589 == -1) {
                                    class53.method360(var47.field491, (byte) -28);
                                }
                                continue;
                            }
                            if (var461 == 1113) {
                                var6--;
                                var47.field531 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -96);
                                continue;
                            }
                            if (var461 == 1114) {
                                var6 -= 3;
                                var47.field463 = class66.field1152[var6];
                                var47.field551 = class66.field1152[var6 + 1];
                                var47.field571 = class66.field1152[var6 + 2];
                                class184.method1238(var47, (byte) -22);
                                continue;
                            }
                            if (var461 == 1115) {
                                var6--;
                                var47.field628 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -89);
                                continue;
                            }
                            if (var461 == 1116) {
                                var6--;
                                var47.field464 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -69);
                                continue;
                            }
                            if (var461 == 1117) {
                                var6--;
                                var47.field563 = class66.field1152[var6];
                                class184.method1238(var47, (byte) -108);
                                continue;
                            }
                            if (var461 == 1118) {
                                var6--;
                                var47.field604 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -118);
                                continue;
                            }
                            if (var461 == 1119) {
                                var6--;
                                var47.field471 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -19);
                                continue;
                            }
                            if (var461 == 1120) {
                                var6 -= 2;
                                var47.field462 = class66.field1152[var6];
                                var47.field482 = class66.field1152[var6 + 1];
                                class184.method1238(var47, (byte) -57);
                                if (var47.field493 == 0) {
                                    class27.method196(var47, false, 109);
                                }
                                continue;
                            }
                            if (var461 == 1121) {
                                var6 -= 2;
                                class184.method1238(var47, (byte) -36);
                                continue;
                            }
                            if (var461 == 1122) {
                                var6--;
                                var47.field613 = class66.field1152[var6] == 1;
                                class184.method1238(var47, (byte) -107);
                                continue;
                            }
                        } else if (!(var461 < 1200 || var461 >= 1300) || !(var461 < 2200 || var461 >= 2300)) {
                            class33 var424;
                            if (var461 >= 2000) {
                                var10000 = arg0 + 5874;
                                var6--;
                                var424 = class233.method1646(var10000, class66.field1152[var6]);
                                var461 -= 1000;
                            } else {
                                var424 = var46 ? class138.field2310 : class262.field4649;
                            }
                            class184.method1238(var424, (byte) -24);
                            if (var461 == 1200 || var461 == 1205) {
                                var6 -= 2;
                                int var425 = class66.field1152[var6];
                                int var426 = class66.field1152[var6 + 1];
                                if (var424.field589 == -1) {
                                    class34.method239((byte) 107, var424.field491);
                                    class37.method253(true, var424.field491);
                                    class217.method1479(arg0 + 7, var424.field491);
                                }
                                if (var425 == -1) {
                                    var424.field546 = -1;
                                    var424.field518 = -1;
                                    var424.field505 = 1;
                                } else {
                                    var424.field466 = var426;
                                    var424.field546 = var425;
                                    class148 var427 = class100.method623(arg0 - 4, var425);
                                    var424.field619 = var427.field2560;
                                    if (var461 == 1205) {
                                        var424.field602 = false;
                                    } else {
                                        var424.field602 = true;
                                    }
                                    var424.field470 = var427.field2554;
                                    var424.field508 = var427.field2500;
                                    var424.field495 = var427.field2517;
                                    var424.field510 = var427.field2527;
                                    if (var424.field527 > 0) {
                                        var424.field508 = var424.field508 * 32 / var424.field527;
                                    } else if (var424.field488 > 0) {
                                        var424.field508 = var424.field508 * 32 / var424.field488;
                                    }
                                    var424.field603 = var427.field2516;
                                }
                                continue;
                            }
                            if (var461 == 1201) {
                                var424.field505 = 2;
                                var6--;
                                var424.field518 = class66.field1152[var6];
                                if (var424.field589 == -1) {
                                    class8.method61(var424.field491, 103);
                                }
                                continue;
                            }
                            if (var461 == 1202) {
                                var424.field505 = 3;
                                var424.field518 = class175.field2946.field1306.method1217(1230265253);
                                if (var424.field589 == -1) {
                                    class8.method61(var424.field491, 108);
                                }
                                continue;
                            }
                            if (var461 == 1203) {
                                var424.field505 = 6;
                                var6--;
                                var424.field518 = class66.field1152[var6];
                                if (var424.field589 == -1) {
                                    class8.method61(var424.field491, arg0 - 51);
                                }
                                continue;
                            }
                            if (var461 == 1204) {
                                var424.field505 = 5;
                                var6--;
                                var424.field518 = class66.field1152[var6];
                                if (var424.field589 == -1) {
                                    class8.method61(var424.field491, -46);
                                }
                                continue;
                            }
                        } else if ((var461 < 1300 || var461 >= 1400) && (var461 < 2300 || var461 >= 2400)) {
                            if (var461 >= 1400 && var461 < 1500 || var461 >= 2400 && var461 < 2500) {
                                class33 var417;
                                if (var461 >= 2000) {
                                    var461 -= 1000;
                                    var6--;
                                    var417 = class233.method1646(5877, class66.field1152[var6]);
                                } else {
                                    var417 = var46 ? class138.field2310 : class262.field4649;
                                }
                                int[] var418 = null;
                                var7--;
                                class191 var419 = class266.field4713[var7];
                                if (var419.method1304(63) > 0 && var419.method1354(var419.method1304(arg0 + 60) - 1, (byte) -89) == 89) {
                                    var6--;
                                    int var420 = class66.field1152[var6];
                                    if (var420 > 0) {
                                        var418 = new int[var420];
                                        while (var420-- > 0) {
                                            var6--;
                                            var418[var420] = class66.field1152[var6];
                                        }
                                    }
                                    var419 = var419.method1330(0, -102, var419.method1304(63) - 1);
                                }
                                Object[] var421 = new Object[var419.method1304(arg0 ^ 0x3C) + 1];
                                for (int var422 = var421.length - 1; var422 >= 1; var422--) {
                                    if (var419.method1354(var422 - 1, (byte) -89) == 115) {
                                        var7--;
                                        var421[var422] = class266.field4713[var7];
                                    } else {
                                        var6--;
                                        var421[var422] = Integer.valueOf(class66.field1152[var6]);
                                    }
                                }
                                var6--;
                                int var423 = class66.field1152[var6];
                                if (var423 == -1) {
                                    var421 = null;
                                } else {
                                    var421[0] = Integer.valueOf(var423);
                                }
                                if (var461 == 1400) {
                                    var417.field544 = var421;
                                } else if (var461 == 1401) {
                                    var417.field620 = var421;
                                } else if (var461 == 1402) {
                                    var417.field550 = var421;
                                } else if (var461 == 1403) {
                                    var417.field570 = var421;
                                } else if (var461 == 1404) {
                                    var417.field564 = var421;
                                } else if (var461 == 1405) {
                                    var417.field595 = var421;
                                } else if (var461 == 1406) {
                                    var417.field594 = var421;
                                } else if (var461 == 1407) {
                                    var417.field516 = var421;
                                    var417.field472 = var418;
                                } else if (var461 == 1408) {
                                    var417.field586 = var421;
                                } else if (var461 == 1409) {
                                    var417.field542 = var421;
                                } else if (var461 == 1410) {
                                    var417.field507 = var421;
                                } else if (var461 == 1411) {
                                    var417.field575 = var421;
                                } else if (var461 == 1412) {
                                    var417.field498 = var421;
                                } else if (var461 == 1414) {
                                    var417.field618 = var421;
                                    var417.field486 = var418;
                                } else if (var461 == 1415) {
                                    var417.field584 = var421;
                                    var417.field465 = var418;
                                } else if (var461 == 1416) {
                                    var417.field536 = var421;
                                } else if (var461 == 1417) {
                                    var417.field541 = var421;
                                } else if (var461 == 1418) {
                                    var417.field487 = var421;
                                } else if (var461 == 1419) {
                                    var417.field567 = var421;
                                } else if (var461 == 1420) {
                                    var417.field556 = var421;
                                } else if (var461 == 1421) {
                                    var417.field569 = var421;
                                } else if (var461 == 1422) {
                                    var417.field581 = var421;
                                } else if (var461 == 1423) {
                                    var417.field629 = var421;
                                } else if (var461 == 1424) {
                                    var417.field626 = var421;
                                } else if (var461 == 1425) {
                                    var417.field522 = var421;
                                } else if (var461 == 1426) {
                                    var417.field543 = var421;
                                } else if (var461 == 1427) {
                                    var417.field621 = var421;
                                } else if (var461 == 1428) {
                                    var417.field460 = var421;
                                    var417.field484 = var418;
                                } else if (var461 == 1429) {
                                    var417.field553 = var421;
                                    var417.field576 = var418;
                                }
                                var417.field513 = true;
                                continue;
                            }
                            if (var461 < 1600) {
                                class33 var416 = var46 ? class138.field2310 : class262.field4649;
                                if (var461 == 1500) {
                                    class66.field1152[var6++] = var416.field526;
                                    continue;
                                }
                                if (var461 == 1501) {
                                    class66.field1152[var6++] = var416.field624;
                                    continue;
                                }
                                if (var461 == 1502) {
                                    class66.field1152[var6++] = var416.field537;
                                    continue;
                                }
                                if (var461 == 1503) {
                                    class66.field1152[var6++] = var416.field561;
                                    continue;
                                }
                                if (var461 == 1504) {
                                    class66.field1152[var6++] = var416.field607 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 1505) {
                                    class66.field1152[var6++] = var416.field478;
                                    continue;
                                }
                            } else if (var461 < 1700) {
                                class33 var415 = var46 ? class138.field2310 : class262.field4649;
                                if (var461 == 1600) {
                                    class66.field1152[var6++] = var415.field585;
                                    continue;
                                }
                                if (var461 == 1601) {
                                    class66.field1152[var6++] = var415.field534;
                                    continue;
                                }
                                if (var461 == 1602) {
                                    class266.field4713[var7++] = var415.field609;
                                    continue;
                                }
                                if (var461 == 1603) {
                                    class66.field1152[var6++] = var415.field462;
                                    continue;
                                }
                                if (var461 == 1604) {
                                    class66.field1152[var6++] = var415.field482;
                                    continue;
                                }
                                if (var461 == 1605) {
                                    class66.field1152[var6++] = var415.field508;
                                    continue;
                                }
                                if (var461 == 1606) {
                                    class66.field1152[var6++] = var415.field603;
                                    continue;
                                }
                                if (var461 == 1607) {
                                    class66.field1152[var6++] = var415.field470;
                                    continue;
                                }
                                if (var461 == 1608) {
                                    class66.field1152[var6++] = var415.field510;
                                    continue;
                                }
                                if (var461 == 1609) {
                                    class66.field1152[var6++] = var415.field512;
                                    continue;
                                }
                            } else if (var461 < 1800) {
                                class33 var54 = var46 ? class138.field2310 : class262.field4649;
                                if (var461 == 1700) {
                                    class66.field1152[var6++] = var54.field546;
                                    continue;
                                }
                                if (var461 == 1701) {
                                    if (var54.field546 == -1) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = var54.field466;
                                    }
                                    continue;
                                }
                                if (var461 == 1702) {
                                    class66.field1152[var6++] = var54.field589;
                                    continue;
                                }
                            } else if (var461 < 1900) {
                                class33 var413 = var46 ? class138.field2310 : class262.field4649;
                                if (var461 == 1800) {
                                    class66.field1152[var6++] = class40.method268(127, client.method668(var413));
                                    continue;
                                }
                                if (var461 == 1801) {
                                    var6--;
                                    int var414 = class66.field1152[var6];
                                    int var463 = var414 - 1;
                                    if (var413.field521 != null && var413.field521.length > var463 && var413.field521[var463] != null) {
                                        class266.field4713[var7++] = var413.field521[var463];
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 1802) {
                                    if (var413.field565 == null) {
                                        class266.field4713[var7++] = class172.field2893;
                                    } else {
                                        class266.field4713[var7++] = var413.field565;
                                    }
                                    continue;
                                }
                            } else if (var461 < 2600) {
                                var6--;
                                class33 var412 = class233.method1646(5877, class66.field1152[var6]);
                                if (var461 == 2500) {
                                    class66.field1152[var6++] = var412.field526;
                                    continue;
                                }
                                if (var461 == 2501) {
                                    class66.field1152[var6++] = var412.field624;
                                    continue;
                                }
                                if (var461 == 2502) {
                                    class66.field1152[var6++] = var412.field537;
                                    continue;
                                }
                                if (var461 == 2503) {
                                    class66.field1152[var6++] = var412.field561;
                                    continue;
                                }
                                if (var461 == 2504) {
                                    class66.field1152[var6++] = var412.field607 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 2505) {
                                    class66.field1152[var6++] = var412.field478;
                                    continue;
                                }
                            } else if (var461 < 2700) {
                                var10000 = arg0 + 5874;
                                var6--;
                                class33 var55 = class233.method1646(var10000, class66.field1152[var6]);
                                if (var461 == 2600) {
                                    class66.field1152[var6++] = var55.field585;
                                    continue;
                                }
                                if (var461 == 2601) {
                                    class66.field1152[var6++] = var55.field534;
                                    continue;
                                }
                                if (var461 == 2602) {
                                    class266.field4713[var7++] = var55.field609;
                                    continue;
                                }
                                if (var461 == 2603) {
                                    class66.field1152[var6++] = var55.field462;
                                    continue;
                                }
                                if (var461 == 2604) {
                                    class66.field1152[var6++] = var55.field482;
                                    continue;
                                }
                                if (var461 == 2605) {
                                    class66.field1152[var6++] = var55.field508;
                                    continue;
                                }
                                if (var461 == 2606) {
                                    class66.field1152[var6++] = var55.field603;
                                    continue;
                                }
                                if (var461 == 2607) {
                                    class66.field1152[var6++] = var55.field470;
                                    continue;
                                }
                                if (var461 == 2608) {
                                    class66.field1152[var6++] = var55.field510;
                                    continue;
                                }
                                if (var461 == 2609) {
                                    class66.field1152[var6++] = var55.field512;
                                    continue;
                                }
                            } else if (var461 < 2800) {
                                if (var461 == 2700) {
                                    var10000 = arg0 + 5874;
                                    var6--;
                                    class33 var402 = class233.method1646(var10000, class66.field1152[var6]);
                                    class66.field1152[var6++] = var402.field546;
                                    continue;
                                }
                                if (var461 == 2701) {
                                    var10000 = arg0 ^ 0x16F6;
                                    var6--;
                                    class33 var403 = class233.method1646(var10000, class66.field1152[var6]);
                                    if (var403.field546 == -1) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = var403.field466;
                                    }
                                    continue;
                                }
                                if (var461 == 2702) {
                                    var6--;
                                    int var404 = class66.field1152[var6];
                                    class267 var405 = (class267) class73.field1259.method612((long) var404, true);
                                    if (var405 == null) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = 1;
                                    }
                                    continue;
                                }
                                if (var461 == 2703) {
                                    var6--;
                                    class33 var406 = class233.method1646(5877, class66.field1152[var6]);
                                    if (var406.field548 == null) {
                                        class66.field1152[var6++] = 0;
                                        continue;
                                    }
                                    int var407 = var406.field548.length;
                                    for (int var408 = 0; var408 < var406.field548.length; var408++) {
                                        if (var406.field548[var408] == null) {
                                            var407 = var408;
                                            break;
                                        }
                                    }
                                    class66.field1152[var6++] = var407;
                                    continue;
                                }
                                if (var461 == 2704 || var461 == 2705) {
                                    var6 -= 2;
                                    int var409 = class66.field1152[var6];
                                    int var410 = class66.field1152[var6 + 1];
                                    class267 var411 = (class267) class73.field1259.method612((long) var409, true);
                                    if (var411 != null && var411.field4721 == var410) {
                                        class66.field1152[var6++] = 1;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                            } else if (var461 < 2900) {
                                var6--;
                                class33 var56 = class233.method1646(5877, class66.field1152[var6]);
                                if (var461 == 2800) {
                                    class66.field1152[var6++] = class40.method268(127, client.method668(var56));
                                    continue;
                                }
                                if (var461 == 2801) {
                                    var6--;
                                    int var57 = class66.field1152[var6];
                                    int var462 = var57 - 1;
                                    if (var56.field521 != null && var462 < var56.field521.length && var56.field521[var462] != null) {
                                        class266.field4713[var7++] = var56.field521[var462];
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 2802) {
                                    if (var56.field565 == null) {
                                        class266.field4713[var7++] = class172.field2893;
                                    } else {
                                        class266.field4713[var7++] = var56.field565;
                                    }
                                    continue;
                                }
                            } else if (var461 < 3200) {
                                if (var461 == 3100) {
                                    var7--;
                                    class191 var58 = class266.field4713[var7];
                                    class47.method320(var58, class172.field2893, 0, -1);
                                    continue;
                                }
                                if (var461 == 3101) {
                                    var6 -= 2;
                                    class88.method535(class66.field1152[var6], 0, class66.field1152[var6 + 1], class175.field2946);
                                    continue;
                                }
                                if (var461 == 3103) {
                                    class256.method1773((byte) 89);
                                    continue;
                                }
                                if (var461 == 3104) {
                                    var7--;
                                    class191 var59 = class266.field4713[var7];
                                    class141.field2349++;
                                    int var60 = 0;
                                    if (var59.method1337(0)) {
                                        var60 = var59.method1358(arg0 ^ 0xFFFFBE13);
                                    }
                                    class53.field963.method1096(244, 0);
                                    class53.field963.method1576(30289, var60);
                                    continue;
                                }
                                if (var461 == 3105) {
                                    var7--;
                                    class191 var61 = class266.field4713[var7];
                                    class53.field963.method1096(150, 0);
                                    class53.field963.method1589(var61.method1352(65), false);
                                    class242.field4309++;
                                    continue;
                                }
                                if (var461 == 3106) {
                                    class54.field993++;
                                    var7--;
                                    class191 var62 = class266.field4713[var7];
                                    class53.field963.method1096(191, 0);
                                    class53.field963.method1613(var62.method1304(63) + 1, 21);
                                    class53.field963.method1586(var62, (byte) -117);
                                    continue;
                                }
                                if (var461 == 3107) {
                                    var7--;
                                    class191 var63 = class266.field4713[var7];
                                    var6--;
                                    int var64 = class66.field1152[var6];
                                    class110.method708(3, var64, var63);
                                    continue;
                                }
                                if (var461 == 3108) {
                                    var6 -= 3;
                                    int var65 = class66.field1152[var6];
                                    int var66 = class66.field1152[var6 + 1];
                                    int var67 = class66.field1152[var6 + 2];
                                    class33 var68 = class233.method1646(5877, var67);
                                    class83.method523((byte) -51, var65, var66, var68);
                                    continue;
                                }
                                if (var461 == 3109) {
                                    var6 -= 2;
                                    int var69 = class66.field1152[var6 + 1];
                                    int var70 = class66.field1152[var6];
                                    class33 var71 = var46 ? class138.field2310 : class262.field4649;
                                    class83.method523((byte) -51, var70, var69, var71);
                                    continue;
                                }
                                if (var461 == 3110) {
                                    class209.field3725++;
                                    var6--;
                                    int var72 = class66.field1152[var6];
                                    class53.field963.method1096(224, arg0 - 3);
                                    class53.field963.method1608(var72, false);
                                    continue;
                                }
                            } else if (var461 < 3300) {
                                if (var461 == 3200) {
                                    var6 -= 3;
                                    class147.method989(class66.field1152[var6], true, class66.field1152[var6 + 2], class66.field1152[var6 + 1]);
                                    continue;
                                }
                                if (var461 == 3201) {
                                    var10000 = arg0 ^ 0x2;
                                    var6--;
                                    class183.method1234(var10000, class66.field1152[var6]);
                                    continue;
                                }
                                if (var461 == 3202) {
                                    var6 -= 2;
                                    class21.method154(class66.field1152[var6 + 1], arg0 - 5463, class66.field1152[var6]);
                                    continue;
                                }
                            } else if (var461 < 3400) {
                                if (var461 == 3300) {
                                    class66.field1152[var6++] = class135.field2267;
                                    continue;
                                }
                                if (var461 == 3301) {
                                    var6 -= 2;
                                    int var73 = class66.field1152[var6];
                                    int var74 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class138.method918(var74, var73, class62.method416(arg0, -4));
                                    continue;
                                }
                                if (var461 == 3302) {
                                    var6 -= 2;
                                    int var75 = class66.field1152[var6];
                                    int var76 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class169.method1141(var75, arg0 + 123, var76);
                                    continue;
                                }
                                if (var461 == 3303) {
                                    var6 -= 2;
                                    int var77 = class66.field1152[var6];
                                    int var78 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class149.method1015(false, var77, var78);
                                    continue;
                                }
                                if (var461 == 3304) {
                                    var6--;
                                    int var79 = class66.field1152[var6];
                                    class66.field1152[var6++] = class211.method1456(5, var79).field1585;
                                    continue;
                                }
                                if (var461 == 3305) {
                                    var6--;
                                    int var80 = class66.field1152[var6];
                                    class66.field1152[var6++] = class199.field3557[var80];
                                    continue;
                                }
                                if (var461 == 3306) {
                                    var6--;
                                    int var81 = class66.field1152[var6];
                                    class66.field1152[var6++] = class239.field4256[var81];
                                    continue;
                                }
                                if (var461 == 3307) {
                                    var6--;
                                    int var82 = class66.field1152[var6];
                                    class66.field1152[var6++] = class173.field2917[var82];
                                    continue;
                                }
                                if (var461 == 3308) {
                                    int var83 = class261.field4598;
                                    int var84 = (class175.field2946.field3003 >> 7) + class225.field4061;
                                    int var85 = (class175.field2946.field2972 >> 7) + class193.field3474;
                                    class66.field1152[var6++] = (var83 << 28) + (var84 << 14) + var85;
                                    continue;
                                }
                                if (var461 == 3309) {
                                    var6--;
                                    int var86 = class66.field1152[var6];
                                    class66.field1152[var6++] = class167.method1128(268423961, var86) >> 14;
                                    continue;
                                }
                                if (var461 == 3310) {
                                    var6--;
                                    int var87 = class66.field1152[var6];
                                    class66.field1152[var6++] = var87 >> 28;
                                    continue;
                                }
                                if (var461 == 3311) {
                                    var6--;
                                    int var88 = class66.field1152[var6];
                                    class66.field1152[var6++] = class167.method1128(16383, var88);
                                    continue;
                                }
                                if (var461 == 3312) {
                                    class66.field1152[var6++] = class200.field3588 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3313) {
                                    var6 -= 2;
                                    int var89 = class66.field1152[var6] + 32768;
                                    int var90 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class138.method918(var90, var89, -1);
                                    continue;
                                }
                                if (var461 == 3314) {
                                    var6 -= 2;
                                    int var91 = class66.field1152[var6] + 32768;
                                    int var92 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class169.method1141(var91, 126, var92);
                                    continue;
                                }
                                if (var461 == 3315) {
                                    var6 -= 2;
                                    int var93 = class66.field1152[var6 + 1];
                                    int var94 = class66.field1152[var6] + 32768;
                                    class66.field1152[var6++] = class149.method1015(false, var94, var93);
                                    continue;
                                }
                                if (var461 == 3316) {
                                    if (class227.field4084 >= 2) {
                                        class66.field1152[var6++] = class227.field4084;
                                    } else {
                                        class66.field1152[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var461 == 3317) {
                                    class66.field1152[var6++] = class172.field2889;
                                    continue;
                                }
                                if (var461 == 3318) {
                                    class66.field1152[var6++] = class135.field2263;
                                    continue;
                                }
                                if (var461 == 3321) {
                                    class66.field1152[var6++] = class4.field38;
                                    continue;
                                }
                                if (var461 == 3322) {
                                    class66.field1152[var6++] = class28.field399;
                                    continue;
                                }
                                if (var461 == 3323) {
                                    if (class232.field4152 >= 5 && class232.field4152 <= 9) {
                                        class66.field1152[var6++] = 1;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3324) {
                                    if (class232.field4152 >= 5 && class232.field4152 <= 9) {
                                        class66.field1152[var6++] = class232.field4152;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3325) {
                                    if (class180.field3090 <= 0) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = 1;
                                    }
                                    continue;
                                }
                                if (var461 == 3326) {
                                    class66.field1152[var6++] = class175.field2946.field1330;
                                    continue;
                                }
                                if (var461 == 3327) {
                                    class66.field1152[var6++] = class175.field2946.field1306.field3099 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3328) {
                                    class66.field1152[var6++] = class42.field739;
                                    continue;
                                }
                                if (var461 == 3329) {
                                    class66.field1152[var6++] = class39.field706;
                                    continue;
                                }
                                if (var461 == 3330) {
                                    var6--;
                                    int var95 = class66.field1152[var6];
                                    class66.field1152[var6++] = class226.method1618(0, var95);
                                    continue;
                                }
                                if (var461 == 3331) {
                                    var6 -= 2;
                                    int var96 = class66.field1152[var6];
                                    int var97 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class138.method922(false, var96, var97, true);
                                    continue;
                                }
                                if (var461 == 3332) {
                                    var6 -= 2;
                                    int var98 = class66.field1152[var6];
                                    int var99 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class138.method922(true, var98, var99, true);
                                    continue;
                                }
                                if (var461 == 3333) {
                                    class66.field1152[var6++] = class233.field4154;
                                    continue;
                                }
                            } else if (var461 < 3500) {
                                if (var461 == 3400) {
                                    var6 -= 2;
                                    int var100 = class66.field1152[var6 + 1];
                                    int var101 = class66.field1152[var6];
                                    class122 var102 = class211.method1453(var101, false);
                                    class266.field4713[var7++] = var102.method832(var100, 121);
                                    continue;
                                }
                                if (var461 == 3408) {
                                    var6 -= 4;
                                    int var103 = class66.field1152[var6];
                                    int var104 = class66.field1152[var6 + 1];
                                    int var105 = class66.field1152[var6 + 2];
                                    int var106 = class66.field1152[var6 + 3];
                                    class122 var107 = class211.method1453(var105, false);
                                    if (var107.field2009 == var103 && var107.field2012 == var104) {
                                        if (var104 == 115) {
                                            class266.field4713[var7++] = var107.method832(var106, -75);
                                        } else {
                                            class66.field1152[var6++] = var107.method830(var106, -12572);
                                        }
                                        continue;
                                    }
                                    throw new RuntimeException("C3408-1");
                                }
                                if (var461 == 3409) {
                                    var6 -= 3;
                                    int var108 = class66.field1152[var6 + 1];
                                    int var109 = class66.field1152[var6 + 2];
                                    int var110 = class66.field1152[var6];
                                    if (var108 == -1) {
                                        throw new RuntimeException("C3409-2");
                                    }
                                    class122 var111 = class211.method1453(var108, false);
                                    if (var111.field2012 != var110) {
                                        throw new RuntimeException("C3409-1");
                                    }
                                    class66.field1152[var6++] = var111.method829((byte) -41, var109) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3410) {
                                    var6--;
                                    int var112 = class66.field1152[var6];
                                    var7--;
                                    class191 var113 = class266.field4713[var7];
                                    if (var112 == -1) {
                                        throw new RuntimeException("C3410-2");
                                    }
                                    class122 var114 = class211.method1453(var112, false);
                                    if (var114.field2012 != 115) {
                                        throw new RuntimeException("C3410-1");
                                    }
                                    class66.field1152[var6++] = var114.method835((byte) -115, var113) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3411) {
                                    var6--;
                                    int var115 = class66.field1152[var6];
                                    class122 var116 = class211.method1453(var115, false);
                                    class66.field1152[var6++] = var116.field2022.method607(4583);
                                    continue;
                                }
                            } else if (var461 < 3700) {
                                if (var461 == 3600) {
                                    if (class263.field4662 == 0) {
                                        class66.field1152[var6++] = -2;
                                    } else if (class263.field4662 == 1) {
                                        class66.field1152[var6++] = -1;
                                    } else {
                                        class66.field1152[var6++] = class270.field4759;
                                    }
                                    continue;
                                }
                                if (var461 == 3601) {
                                    var6--;
                                    int var117 = class66.field1152[var6];
                                    if (class263.field4662 == 2 && var117 < class270.field4759) {
                                        class266.field4713[var7++] = class252.field4466[var117];
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 3602) {
                                    var6--;
                                    int var118 = class66.field1152[var6];
                                    if (class263.field4662 == 2 && var118 < class270.field4759) {
                                        class66.field1152[var6++] = class206.field3650[var118];
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3603) {
                                    var6--;
                                    int var119 = class66.field1152[var6];
                                    if (class263.field4662 == 2 && class270.field4759 > var119) {
                                        class66.field1152[var6++] = class33.field504[var119];
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3604) {
                                    var6--;
                                    int var120 = class66.field1152[var6];
                                    var7--;
                                    class191 var121 = class266.field4713[var7];
                                    class256.method1768(-44, var120, var121);
                                    continue;
                                }
                                if (var461 == 3605) {
                                    var7--;
                                    class191 var122 = class266.field4713[var7];
                                    class97.method606((byte) 15, var122.method1352(65));
                                    continue;
                                }
                                if (var461 == 3606) {
                                    var7--;
                                    class191 var123 = class266.field4713[var7];
                                    class145.method980(var123.method1352(arg0 + 62), (byte) 115);
                                    continue;
                                }
                                if (var461 == 3607) {
                                    var7--;
                                    class191 var124 = class266.field4713[var7];
                                    class152.method1031(true, var124.method1352(65));
                                    continue;
                                }
                                if (var461 == 3608) {
                                    var7--;
                                    class191 var125 = class266.field4713[var7];
                                    class137.method914(var125.method1352(arg0 + 62), arg0 ^ 0x69A3);
                                    continue;
                                }
                                if (var461 == 3609) {
                                    var7--;
                                    class191 var126 = class266.field4713[var7];
                                    if (var126.method1318(class95.field1542, arg0 ^ 0x3AD3) || var126.method1318(class158.field2684, 15056)) {
                                        var126 = var126.method1315(7, (byte) -92);
                                    }
                                    class66.field1152[var6++] = class273.method1863(var126, arg0 - 3) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3610) {
                                    var6--;
                                    int var127 = class66.field1152[var6];
                                    if (class263.field4662 == 2 && class270.field4759 > var127) {
                                        class266.field4713[var7++] = class209.field3702[var127];
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 3611) {
                                    if (class182.field3135 == null) {
                                        class266.field4713[var7++] = class172.field2893;
                                    } else {
                                        class266.field4713[var7++] = class182.field3135.method1345((byte) -18);
                                    }
                                    continue;
                                }
                                if (var461 == 3612) {
                                    if (class182.field3135 == null) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = class255.field4521;
                                    }
                                    continue;
                                }
                                if (var461 == 3613) {
                                    var6--;
                                    int var128 = class66.field1152[var6];
                                    if (class182.field3135 != null && class255.field4521 > var128) {
                                        class266.field4713[var7++] = class181.field3106[var128].field3992.method1345((byte) -18);
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 3614) {
                                    var6--;
                                    int var129 = class66.field1152[var6];
                                    if (class182.field3135 != null && var129 < class255.field4521) {
                                        class66.field1152[var6++] = class181.field3106[var129].field3989;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3615) {
                                    var6--;
                                    int var130 = class66.field1152[var6];
                                    if (class182.field3135 != null && var130 < class255.field4521) {
                                        class66.field1152[var6++] = class181.field3106[var130].field3988;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3616) {
                                    class66.field1152[var6++] = class137.field2299;
                                    continue;
                                }
                                if (var461 == 3617) {
                                    var7--;
                                    class191 var131 = class266.field4713[var7];
                                    class210.method1447(var131, false);
                                    continue;
                                }
                                if (var461 == 3618) {
                                    class66.field1152[var6++] = class24.field341;
                                    continue;
                                }
                                if (var461 == 3619) {
                                    var7--;
                                    class191 var132 = class266.field4713[var7];
                                    class211.method1454(var132.method1352(65), 2);
                                    continue;
                                }
                                if (var461 == 3620) {
                                    class143.method943(109);
                                    continue;
                                }
                                if (var461 == 3621) {
                                    if (class263.field4662 == 0) {
                                        class66.field1152[var6++] = -1;
                                    } else {
                                        class66.field1152[var6++] = class254.field4506;
                                    }
                                    continue;
                                }
                                if (var461 == 3622) {
                                    var6--;
                                    int var133 = class66.field1152[var6];
                                    if (class263.field4662 != 0 && class254.field4506 > var133) {
                                        class266.field4713[var7++] = class33.method225(class207.field3693[var133], false).method1345((byte) -18);
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 3623) {
                                    var7--;
                                    class191 var134 = class266.field4713[var7];
                                    if (var134.method1318(class95.field1542, 15056) || var134.method1318(class158.field2684, 15056)) {
                                        var134 = var134.method1315(7, (byte) 111);
                                    }
                                    class66.field1152[var6++] = class166.method1121(var134, (byte) 111) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3624) {
                                    var6--;
                                    int var135 = class66.field1152[var6];
                                    if (class181.field3106 != null && var135 < class255.field4521 && class181.field3106[var135].field3992.method1351(-23098, class175.field2946.field1315)) {
                                        class66.field1152[var6++] = 1;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3625) {
                                    if (class79.field1348 == null) {
                                        class266.field4713[var7++] = class172.field2893;
                                    } else {
                                        class266.field4713[var7++] = class79.field1348.method1345((byte) -18);
                                    }
                                    continue;
                                }
                                if (var461 == 3626) {
                                    var6--;
                                    int var136 = class66.field1152[var6];
                                    if (class182.field3135 != null && var136 < class255.field4521) {
                                        class266.field4713[var7++] = class181.field3106[var136].field3984;
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 3627) {
                                    var6--;
                                    int var137 = class66.field1152[var6];
                                    if (class263.field4662 == 2 && var137 >= 0 && var137 < class270.field4759) {
                                        class66.field1152[var6++] = class42.field743[var137] ? 1 : 0;
                                        continue;
                                    }
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 3628) {
                                    var7--;
                                    class191 var138 = class266.field4713[var7];
                                    if (var138.method1318(class95.field1542, 15056) || var138.method1318(class158.field2684, 15056)) {
                                        var138 = var138.method1315(7, (byte) -102);
                                    }
                                    class66.field1152[var6++] = class133.method895(var138, 127);
                                    continue;
                                }
                            } else if (var461 < 4000) {
                                if (var461 == 3903) {
                                    var6--;
                                    int var388 = class66.field1152[var6];
                                    class66.field1152[var6++] = class268.field4734[var388].method465(-1515711317);
                                    continue;
                                }
                                if (var461 == 3904) {
                                    var6--;
                                    int var389 = class66.field1152[var6];
                                    class66.field1152[var6++] = class268.field4734[var389].field1229;
                                    continue;
                                }
                                if (var461 == 3905) {
                                    var6--;
                                    int var390 = class66.field1152[var6];
                                    class66.field1152[var6++] = class268.field4734[var390].field1231;
                                    continue;
                                }
                                if (var461 == 3906) {
                                    var6--;
                                    int var391 = class66.field1152[var6];
                                    class66.field1152[var6++] = class268.field4734[var391].field1230;
                                    continue;
                                }
                                if (var461 == 3907) {
                                    var6--;
                                    int var392 = class66.field1152[var6];
                                    class66.field1152[var6++] = class268.field4734[var392].field1234;
                                    continue;
                                }
                                if (var461 == 3908) {
                                    var6--;
                                    int var393 = class66.field1152[var6];
                                    class66.field1152[var6++] = class268.field4734[var393].field1228;
                                    continue;
                                }
                                if (var461 == 3910) {
                                    var6--;
                                    int var394 = class66.field1152[var6];
                                    int var395 = class268.field4734[var394].method466(arg0 - 116);
                                    class66.field1152[var6++] = var395 == 0 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3911) {
                                    var6--;
                                    int var396 = class66.field1152[var6];
                                    int var397 = class268.field4734[var396].method466(-109);
                                    class66.field1152[var6++] = var397 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3912) {
                                    var6--;
                                    int var398 = class66.field1152[var6];
                                    int var399 = class268.field4734[var398].method466(arg0 - 118);
                                    class66.field1152[var6++] = var399 == 5 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 3913) {
                                    var6--;
                                    int var400 = class66.field1152[var6];
                                    int var401 = class268.field4734[var400].method466(arg0 - 120);
                                    class66.field1152[var6++] = var401 == 1 ? 1 : 0;
                                    continue;
                                }
                            } else if (var461 < 4100) {
                                if (var461 == 4000) {
                                    var6 -= 2;
                                    int var343 = class66.field1152[var6];
                                    int var344 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = var343 + var344;
                                    continue;
                                }
                                if (var461 == 4001) {
                                    var6 -= 2;
                                    int var345 = class66.field1152[var6 + 1];
                                    int var346 = class66.field1152[var6];
                                    class66.field1152[var6++] = var346 - var345;
                                    continue;
                                }
                                if (var461 == 4002) {
                                    var6 -= 2;
                                    int var347 = class66.field1152[var6];
                                    int var348 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = var347 * var348;
                                    continue;
                                }
                                if (var461 == 4003) {
                                    var6 -= 2;
                                    int var349 = class66.field1152[var6 + 1];
                                    int var350 = class66.field1152[var6];
                                    class66.field1152[var6++] = var350 / var349;
                                    continue;
                                }
                                if (var461 == 4004) {
                                    var6--;
                                    int var351 = class66.field1152[var6];
                                    class66.field1152[var6++] = (int) (Math.random() * (double) var351);
                                    continue;
                                }
                                if (var461 == 4005) {
                                    var6--;
                                    int var352 = class66.field1152[var6];
                                    class66.field1152[var6++] = (int) ((double) (var352 + 1) * Math.random());
                                    continue;
                                }
                                if (var461 == 4006) {
                                    var6 -= 5;
                                    int var353 = class66.field1152[var6];
                                    int var354 = class66.field1152[var6 + 1];
                                    int var355 = class66.field1152[var6 + 2];
                                    int var356 = class66.field1152[var6 + 3];
                                    int var357 = class66.field1152[var6 + 4];
                                    class66.field1152[var6++] = (var354 - var353) * (var357 - var355) / (var356 - var355) + var353;
                                    continue;
                                }
                                if (var461 == 4007) {
                                    var6 -= 2;
                                    long var358 = (long) class66.field1152[var6 + 1];
                                    long var360 = (long) class66.field1152[var6];
                                    class66.field1152[var6++] = (int) (var360 + (var358 * var360 / 100L));
                                    continue;
                                }
                                if (var461 == 4008) {
                                    var6 -= 2;
                                    int var362 = class66.field1152[var6];
                                    int var363 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class217.method1476(var362, 0x1 << var363);
                                    continue;
                                }
                                if (var461 == 4009) {
                                    var6 -= 2;
                                    int var364 = class66.field1152[var6 + 1];
                                    int var365 = class66.field1152[var6];
                                    class66.field1152[var6++] = class167.method1128(var365, -(0x1 << var364) - 1);
                                    continue;
                                }
                                if (var461 == 4010) {
                                    var6 -= 2;
                                    int var366 = class66.field1152[var6];
                                    int var367 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class167.method1128(0x1 << var367, var366) == 0 ? 0 : 1;
                                    continue;
                                }
                                if (var461 == 4011) {
                                    var6 -= 2;
                                    int var368 = class66.field1152[var6];
                                    int var369 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = var368 % var369;
                                    continue;
                                }
                                if (var461 == 4012) {
                                    var6 -= 2;
                                    int var370 = class66.field1152[var6];
                                    int var371 = class66.field1152[var6 + 1];
                                    if (var370 == 0) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = (int) Math.pow((double) var370, (double) var371);
                                    }
                                    continue;
                                }
                                if (var461 == 4013) {
                                    var6 -= 2;
                                    int var372 = class66.field1152[var6];
                                    int var373 = class66.field1152[var6 + 1];
                                    if (var372 == 0) {
                                        class66.field1152[var6++] = 0;
                                    } else if (var373 == 0) {
                                        class66.field1152[var6++] = Integer.MAX_VALUE;
                                    } else {
                                        class66.field1152[var6++] = (int) Math.pow((double) var372, 1.0D / (double) var373);
                                    }
                                    continue;
                                }
                                if (var461 == 4014) {
                                    var6 -= 2;
                                    int var374 = class66.field1152[var6 + 1];
                                    int var375 = class66.field1152[var6];
                                    class66.field1152[var6++] = class167.method1128(var375, var374);
                                    continue;
                                }
                                if (var461 == 4015) {
                                    var6 -= 2;
                                    int var376 = class66.field1152[var6];
                                    int var377 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class217.method1476(var376, var377);
                                    continue;
                                }
                                if (var461 == 4016) {
                                    var6 -= 2;
                                    int var378 = class66.field1152[var6];
                                    int var379 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = var378 < var379 ? var378 : var379;
                                    continue;
                                }
                                if (var461 == 4017) {
                                    var6 -= 2;
                                    int var380 = class66.field1152[var6 + 1];
                                    int var381 = class66.field1152[var6];
                                    class66.field1152[var6++] = var381 <= var380 ? var380 : var381;
                                    continue;
                                }
                                if (var461 == 4018) {
                                    var6 -= 3;
                                    long var382 = (long) class66.field1152[var6];
                                    long var384 = (long) class66.field1152[var6 + 1];
                                    long var386 = (long) class66.field1152[var6 + 2];
                                    class66.field1152[var6++] = (int) (var382 * var386 / var384);
                                    continue;
                                }
                            } else if (var461 < 4200) {
                                if (var461 == 4100) {
                                    var7--;
                                    class191 var139 = class266.field4713[var7];
                                    var6--;
                                    int var140 = class66.field1152[var6];
                                    class266.field4713[var7++] = class228.method1629(new class191[] { var139, class92.method563(class62.method416(arg0, -122), var140) }, (byte) -107);
                                    continue;
                                }
                                if (var461 == 4101) {
                                    var7 -= 2;
                                    class191 var141 = class266.field4713[var7];
                                    class191 var142 = class266.field4713[var7 + 1];
                                    class266.field4713[var7++] = class228.method1629(new class191[] { var141, var142 }, (byte) -19);
                                    continue;
                                }
                                if (var461 == 4102) {
                                    var7--;
                                    class191 var143 = class266.field4713[var7];
                                    var6--;
                                    int var144 = class66.field1152[var6];
                                    class266.field4713[var7++] = class228.method1629(new class191[] { var143, class166.method1118(true, arg0 + 7, var144) }, (byte) -119);
                                    continue;
                                }
                                if (var461 == 4103) {
                                    var7--;
                                    class191 var145 = class266.field4713[var7];
                                    class266.field4713[var7++] = var145.method1324(0);
                                    continue;
                                }
                                if (var461 == 4104) {
                                    var6--;
                                    int var146 = class66.field1152[var6];
                                    long var147 = (long) var146 * 86400000L + 1014768000000L;
                                    class102.field1678.setTime(new Date(var147));
                                    int var149 = class102.field1678.get(5);
                                    int var150 = class102.field1678.get(2);
                                    int var151 = class102.field1678.get(1);
                                    class266.field4713[var7++] = class228.method1629(new class191[] { class92.method563(-117, var149), class8.field73, class241.field4289[var150], class8.field73, class92.method563(-70, var151) }, (byte) -73);
                                    continue;
                                }
                                if (var461 == 4105) {
                                    var7 -= 2;
                                    class191 var152 = class266.field4713[var7 + 1];
                                    class191 var153 = class266.field4713[var7];
                                    if (class175.field2946.field1306 != null && class175.field2946.field1306.field3099) {
                                        class266.field4713[var7++] = var152;
                                        continue;
                                    }
                                    class266.field4713[var7++] = var153;
                                    continue;
                                }
                                if (var461 == 4106) {
                                    var6--;
                                    int var154 = class66.field1152[var6];
                                    class266.field4713[var7++] = class92.method563(arg0 - 116, var154);
                                    continue;
                                }
                                if (var461 == 4107) {
                                    var7 -= 2;
                                    class66.field1152[var6++] = class266.field4713[var7].method1343(98, class266.field4713[var7 + 1]);
                                    continue;
                                }
                                if (var461 == 4108) {
                                    var6 -= 2;
                                    var7--;
                                    class191 var155 = class266.field4713[var7];
                                    int var156 = class66.field1152[var6];
                                    int var157 = class66.field1152[var6 + 1];
                                    byte[] var158 = class256.field4545.method826((byte) 35, var157, 0);
                                    class195 var159 = new class195(var158);
                                    var159.method282(class37.field671, (int[]) null);
                                    class66.field1152[var6++] = var159.method305(var155, var156);
                                    continue;
                                }
                                if (var461 == 4109) {
                                    var7--;
                                    class191 var160 = class266.field4713[var7];
                                    var6 -= 2;
                                    int var161 = class66.field1152[var6];
                                    int var162 = class66.field1152[var6 + 1];
                                    byte[] var163 = class256.field4545.method826((byte) 35, var162, 0);
                                    class195 var164 = new class195(var163);
                                    var164.method282(class37.field671, (int[]) null);
                                    class66.field1152[var6++] = var164.method285(var160, var161);
                                    continue;
                                }
                                if (var461 == 4110) {
                                    var7 -= 2;
                                    class191 var165 = class266.field4713[var7 + 1];
                                    class191 var166 = class266.field4713[var7];
                                    var6--;
                                    if (class66.field1152[var6] == 1) {
                                        class266.field4713[var7++] = var166;
                                    } else {
                                        class266.field4713[var7++] = var165;
                                    }
                                    continue;
                                }
                                if (var461 == 4111) {
                                    var7--;
                                    class191 var167 = class266.field4713[var7];
                                    class266.field4713[var7++] = class44.method299(var167);
                                    continue;
                                }
                                if (var461 == 4112) {
                                    var7--;
                                    class191 var168 = class266.field4713[var7];
                                    var6--;
                                    int var169 = class66.field1152[var6];
                                    if (var169 == -1) {
                                        throw new RuntimeException("null char");
                                    }
                                    class266.field4713[var7++] = var168.method1341(var169, false);
                                    continue;
                                }
                                if (var461 == 4113) {
                                    var6--;
                                    int var170 = class66.field1152[var6];
                                    class66.field1152[var6++] = class67.method447(var170, class62.method416(arg0, 118)) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 4114) {
                                    var6--;
                                    int var171 = class66.field1152[var6];
                                    class66.field1152[var6++] = class201.method1407(var171, 2) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 4115) {
                                    var6--;
                                    int var172 = class66.field1152[var6];
                                    class66.field1152[var6++] = class35.method241(var172, -70) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 4116) {
                                    var6--;
                                    int var173 = class66.field1152[var6];
                                    class66.field1152[var6++] = class137.method912(var173, -26100) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 4117) {
                                    var7--;
                                    class191 var174 = class266.field4713[var7];
                                    if (var174 == null) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = var174.method1304(63);
                                    }
                                    continue;
                                }
                                if (var461 == 4118) {
                                    var6 -= 2;
                                    var7--;
                                    class191 var175 = class266.field4713[var7];
                                    int var176 = class66.field1152[var6];
                                    int var177 = class66.field1152[var6 + 1];
                                    class266.field4713[var7++] = var175.method1330(var176, -79, var177);
                                    continue;
                                }
                                if (var461 == 4119) {
                                    var7--;
                                    class191 var178 = class266.field4713[var7];
                                    class191 var179 = class167.method1123(-4636, var178.method1304(63));
                                    boolean var180 = false;
                                    for (int var181 = 0; var178.method1304(arg0 + 60) > var181; var181++) {
                                        int var182 = var178.method1354(var181, (byte) -89);
                                        if (var182 == 60) {
                                            var180 = true;
                                        } else if (var182 == 62) {
                                            var180 = false;
                                        } else if (!var180) {
                                            var179.method1353((byte) 72, var182);
                                        }
                                    }
                                    var179.method1307((byte) 109);
                                    class266.field4713[var7++] = var179;
                                    continue;
                                }
                                if (var461 == 4120) {
                                    var7--;
                                    class191 var183 = class266.field4713[var7];
                                    var6 -= 2;
                                    int var184 = class66.field1152[var6];
                                    int var185 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = var183.method1305(var184, class62.method416(arg0, 83), var185);
                                    continue;
                                }
                                if (var461 == 4121) {
                                    var7 -= 2;
                                    class191 var186 = class266.field4713[var7];
                                    class191 var187 = class266.field4713[var7 + 1];
                                    var6--;
                                    int var188 = class66.field1152[var6];
                                    class66.field1152[var6++] = var186.method1314(1, var187, var188);
                                    continue;
                                }
                                if (var461 == 4122) {
                                    var6--;
                                    int var189 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method906(var189, (byte) -92);
                                    continue;
                                }
                                if (var461 == 4123) {
                                    var6--;
                                    int var190 = class66.field1152[var6];
                                    class66.field1152[var6++] = class152.method1032(var190, -39);
                                    continue;
                                }
                            } else if (var461 < 4300) {
                                if (var461 == 4200) {
                                    var6--;
                                    int var324 = class66.field1152[var6];
                                    class266.field4713[var7++] = class100.method623(-1, var324).field2529;
                                    continue;
                                }
                                if (var461 == 4201) {
                                    var6 -= 2;
                                    int var325 = class66.field1152[var6];
                                    int var326 = class66.field1152[var6 + 1];
                                    class148 var327 = class100.method623(-1, var325);
                                    if (var326 >= 1 && var326 <= 5 && var327.field2508[var326 - 1] != null) {
                                        class266.field4713[var7++] = var327.field2508[var326 - 1];
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 4202) {
                                    var6 -= 2;
                                    int var328 = class66.field1152[var6];
                                    int var329 = class66.field1152[var6 + 1];
                                    class148 var330 = class100.method623(arg0 ^ 0xFFFFFFFC, var328);
                                    if (var329 >= 1 && var329 <= 5 && var330.field2512[var329 - 1] != null) {
                                        class266.field4713[var7++] = var330.field2512[var329 - 1];
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                                if (var461 == 4203) {
                                    var6--;
                                    int var331 = class66.field1152[var6];
                                    class66.field1152[var6++] = class100.method623(-1, var331).field2498;
                                    continue;
                                }
                                if (var461 == 4204) {
                                    var6--;
                                    int var332 = class66.field1152[var6];
                                    class66.field1152[var6++] = class100.method623(class62.method416(arg0, -4), var332).field2521 == 1 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 4205) {
                                    var6--;
                                    int var333 = class66.field1152[var6];
                                    class148 var334 = class100.method623(arg0 - 4, var333);
                                    if (var334.field2534 == -1 && var334.field2545 >= 0) {
                                        class66.field1152[var6++] = var334.field2545;
                                        continue;
                                    }
                                    class66.field1152[var6++] = var333;
                                    continue;
                                }
                                if (var461 == 4206) {
                                    var6--;
                                    int var335 = class66.field1152[var6];
                                    class148 var336 = class100.method623(-1, var335);
                                    if (var336.field2534 >= 0 && var336.field2545 >= 0) {
                                        class66.field1152[var6++] = var336.field2545;
                                        continue;
                                    }
                                    class66.field1152[var6++] = var335;
                                    continue;
                                }
                                if (var461 == 4207) {
                                    var6--;
                                    int var337 = class66.field1152[var6];
                                    class66.field1152[var6++] = class100.method623(-1, var337).field2513 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 4208) {
                                    var6 -= 2;
                                    int var338 = class66.field1152[var6];
                                    int var339 = class66.field1152[var6 + 1];
                                    class25 var340 = class36.method250(var339, false);
                                    if (var340.method186(93)) {
                                        class266.field4713[var7++] = class100.method623(-1, var338).method999(var340.field361, (byte) 84, var339);
                                    } else {
                                        class66.field1152[var6++] = class100.method623(-1, var338).method1011(var339, 37, var340.field372);
                                    }
                                    continue;
                                }
                                if (var461 == 4210) {
                                    var7--;
                                    class191 var341 = class266.field4713[var7];
                                    var6--;
                                    int var342 = class66.field1152[var6];
                                    class179.method1205(var341, var342 == 1, (byte) 126);
                                    class66.field1152[var6++] = class30.field429;
                                    continue;
                                }
                                if (var461 == 4211) {
                                    if (class207.field3696 != null && class30.field429 > class271.field4783) {
                                        class66.field1152[var6++] = class167.method1128(65535, class207.field3696[class271.field4783++]);
                                        continue;
                                    }
                                    class66.field1152[var6++] = -1;
                                    continue;
                                }
                                if (var461 == 4212) {
                                    class271.field4783 = 0;
                                    continue;
                                }
                            } else if (var461 < 4400) {
                                if (var461 == 4300) {
                                    var6 -= 2;
                                    int var314 = class66.field1152[var6];
                                    int var315 = class66.field1152[var6 + 1];
                                    class25 var316 = class36.method250(var315, false);
                                    if (var316.method186(101)) {
                                        class266.field4713[var7++] = class135.method904(60, var314).method1240(var316.field361, (byte) -123, var315);
                                    } else {
                                        class66.field1152[var6++] = class135.method904(arg0 - 121, var314).method1251(var315, var316.field372, -3873);
                                    }
                                    continue;
                                }
                                if (var461 == 4301) {
                                    var6--;
                                    int var317 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(-121, var317).field3213;
                                    continue;
                                }
                                if (var461 == 4302) {
                                    var6--;
                                    int var318 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(arg0 + 46, var318).field3186;
                                    continue;
                                }
                                if (var461 == 4303) {
                                    var6--;
                                    int var319 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(-31, var319).field3227;
                                    continue;
                                }
                                if (var461 == 4304) {
                                    var6--;
                                    int var320 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(class62.method416(arg0, 17), var320).field3181;
                                    continue;
                                }
                                if (var461 == 4305) {
                                    var6--;
                                    int var321 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(arg0 + 35, var321).field3214;
                                    continue;
                                }
                                if (var461 == 4306) {
                                    var6--;
                                    int var322 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(-37, var322).field3202;
                                    continue;
                                }
                                if (var461 == 4307) {
                                    var6--;
                                    int var323 = class66.field1152[var6];
                                    class66.field1152[var6++] = class135.method904(-116, var323).field3163;
                                    continue;
                                }
                            } else if (var461 < 4500) {
                                if (var461 == 4400) {
                                    var6 -= 2;
                                    int var191 = class66.field1152[var6 + 1];
                                    int var192 = class66.field1152[var6];
                                    class25 var193 = class36.method250(var191, false);
                                    if (var193.method186(52)) {
                                        class266.field4713[var7++] = class31.method216(var192, (byte) 117).method639(var191, var193.field361, 57);
                                    } else {
                                        class66.field1152[var6++] = class31.method216(var192, (byte) 120).method631(var191, var193.field372, 28397);
                                    }
                                    continue;
                                }
                            } else if (var461 < 4600) {
                                if (var461 == 4500) {
                                    var6 -= 2;
                                    int var194 = class66.field1152[var6 + 1];
                                    int var195 = class66.field1152[var6];
                                    class25 var196 = class36.method250(var194, false);
                                    if (var196.method186(arg0 ^ 0x7B)) {
                                        class266.field4713[var7++] = class152.method1033((byte) -101, var195).method1652(-128, var196.field361, var194);
                                    } else {
                                        class66.field1152[var6++] = class152.method1033((byte) -125, var195).method1650(var196.field372, 60, var194);
                                    }
                                    continue;
                                }
                            } else if (var461 < 5100) {
                                if (var461 == 5000) {
                                    class66.field1152[var6++] = class35.field650;
                                    continue;
                                }
                                if (var461 == 5001) {
                                    var6 -= 3;
                                    class39.field695++;
                                    class35.field650 = class66.field1152[var6];
                                    class24.field353 = class66.field1152[var6 + 1];
                                    class209.field3716 = class66.field1152[var6 + 2];
                                    class53.field963.method1096(20, 0);
                                    class53.field963.method1613(class35.field650, arg0 + 18);
                                    class53.field963.method1613(class24.field353, 21);
                                    class53.field963.method1613(class209.field3716, 21);
                                    continue;
                                }
                                if (var461 == 5002) {
                                    var6 -= 2;
                                    class65.field1134++;
                                    var7--;
                                    class191 var251 = class266.field4713[var7];
                                    int var252 = class66.field1152[var6];
                                    int var253 = class66.field1152[var6 + 1];
                                    class53.field963.method1096(75, 0);
                                    class53.field963.method1589(var251.method1352(65), false);
                                    class53.field963.method1613(var252 - 1, 21);
                                    class53.field963.method1613(var253, 21);
                                    continue;
                                }
                                if (var461 == 5003) {
                                    var6--;
                                    int var254 = class66.field1152[var6];
                                    class191 var255 = null;
                                    if (var254 < 100) {
                                        var255 = class88.field1445[var254];
                                    }
                                    if (var255 == null) {
                                        var255 = class172.field2893;
                                    }
                                    class266.field4713[var7++] = var255;
                                    continue;
                                }
                                if (var461 == 5004) {
                                    var6--;
                                    int var256 = class66.field1152[var6];
                                    int var257 = -1;
                                    if (var256 < 100 && class88.field1445[var256] != null) {
                                        var257 = class266.field4711[var256];
                                    }
                                    class66.field1152[var6++] = var257;
                                    continue;
                                }
                                if (var461 == 5005) {
                                    class66.field1152[var6++] = class24.field353;
                                    continue;
                                }
                                if (var461 == 5008) {
                                    var7--;
                                    class191 var258 = class266.field4713[var7];
                                    if (var258.method1318(class121.field1973, 15056)) {
                                        class152.method1034(arg0 - 96, var258);
                                        continue;
                                    }
                                    if (class227.field4084 == 0 && (class42.field739 == 1 || class39.field706 == 1)) {
                                        continue;
                                    }
                                    class40.field712++;
                                    class191 var259 = var258.method1324(0);
                                    byte var260 = 0;
                                    if (var259.method1318(class242.field4311, 15056)) {
                                        var258 = var258.method1315(class242.field4311.method1304(63), (byte) -123);
                                        var260 = 0;
                                    } else if (var259.method1318(class118.field1948, 15056)) {
                                        var260 = 1;
                                        var258 = var258.method1315(class118.field1948.method1304(arg0 ^ 0x3C), (byte) 76);
                                    } else if (var259.method1318(class196.field3506, 15056)) {
                                        var258 = var258.method1315(class196.field3506.method1304(63), (byte) -110);
                                        var260 = 2;
                                    } else if (var259.method1318(class38.field691, 15056)) {
                                        var258 = var258.method1315(class38.field691.method1304(63), (byte) -120);
                                        var260 = 3;
                                    } else if (var259.method1318(class192.field3420, 15056)) {
                                        var260 = 4;
                                        var258 = var258.method1315(class192.field3420.method1304(63), (byte) 100);
                                    } else if (var259.method1318(class46.field832, 15056)) {
                                        var258 = var258.method1315(class46.field832.method1304(63), (byte) -108);
                                        var260 = 5;
                                    } else if (var259.method1318(class91.field1500, arg0 ^ 0x3AD3)) {
                                        var260 = 6;
                                        var258 = var258.method1315(class91.field1500.method1304(63), (byte) -95);
                                    } else if (var259.method1318(class250.field4452, 15056)) {
                                        var258 = var258.method1315(class250.field4452.method1304(63), (byte) -117);
                                        var260 = 7;
                                    } else if (var259.method1318(class148.field2561, 15056)) {
                                        var260 = 8;
                                        var258 = var258.method1315(class148.field2561.method1304(63), (byte) -98);
                                    } else if (var259.method1318(class221.field3889, 15056)) {
                                        var258 = var258.method1315(class221.field3889.method1304(63), (byte) 96);
                                        var260 = 9;
                                    } else if (var259.method1318(class73.field1256, arg0 + 15053)) {
                                        var258 = var258.method1315(class73.field1256.method1304(63), (byte) 61);
                                        var260 = 10;
                                    } else if (var259.method1318(class142.field2368, 15056)) {
                                        var260 = 11;
                                        var258 = var258.method1315(class142.field2368.method1304(63), (byte) 74);
                                    } else if (class233.field4165 != 0) {
                                        if (var259.method1318(class242.field4317, 15056)) {
                                            var258 = var258.method1315(class242.field4317.method1304(63), (byte) 29);
                                            var260 = 0;
                                        } else if (var259.method1318(class118.field1951, arg0 ^ 0x3AD3)) {
                                            var258 = var258.method1315(class118.field1951.method1304(63), (byte) -107);
                                            var260 = 1;
                                        } else if (var259.method1318(class196.field3501, 15056)) {
                                            var260 = 2;
                                            var258 = var258.method1315(class196.field3501.method1304(arg0 ^ 0x3C), (byte) -99);
                                        } else if (var259.method1318(class38.field692, 15056)) {
                                            var258 = var258.method1315(class38.field692.method1304(63), (byte) -116);
                                            var260 = 3;
                                        } else if (var259.method1318(class192.field3431, arg0 + 15053)) {
                                            var260 = 4;
                                            var258 = var258.method1315(class192.field3431.method1304(63), (byte) 98);
                                        } else if (var259.method1318(class46.field834, 15056)) {
                                            var258 = var258.method1315(class46.field834.method1304(63), (byte) -107);
                                            var260 = 5;
                                        } else if (var259.method1318(class91.field1499, arg0 ^ 0x3AD3)) {
                                            var260 = 6;
                                            var258 = var258.method1315(class91.field1499.method1304(arg0 ^ 0x3C), (byte) 75);
                                        } else if (var259.method1318(class250.field4451, 15056)) {
                                            var260 = 7;
                                            var258 = var258.method1315(class250.field4451.method1304(63), (byte) -126);
                                        } else if (var259.method1318(class148.field2486, arg0 ^ 0x3AD3)) {
                                            var260 = 8;
                                            var258 = var258.method1315(class148.field2486.method1304(63), (byte) 59);
                                        } else if (var259.method1318(class221.field3903, 15056)) {
                                            var260 = 9;
                                            var258 = var258.method1315(class221.field3903.method1304(63), (byte) -111);
                                        } else if (var259.method1318(class73.field1267, arg0 + 15053)) {
                                            var258 = var258.method1315(class73.field1267.method1304(arg0 + 60), (byte) 123);
                                            var260 = 10;
                                        } else if (var259.method1318(class142.field2370, 15056)) {
                                            var258 = var258.method1315(class142.field2370.method1304(arg0 + 60), (byte) -125);
                                            var260 = 11;
                                        }
                                    }
                                    byte var261 = 0;
                                    class191 var262 = var258.method1324(0);
                                    if (var262.method1318(class217.field3828, 15056)) {
                                        var258 = var258.method1315(class217.field3828.method1304(arg0 + 60), (byte) 52);
                                        var261 = 1;
                                    } else if (var262.method1318(class240.field4267, arg0 + 15053)) {
                                        var258 = var258.method1315(class240.field4267.method1304(63), (byte) -88);
                                        var261 = 2;
                                    } else if (var262.method1318(class115.field1902, 15056)) {
                                        var258 = var258.method1315(class115.field1902.method1304(63), (byte) 108);
                                        var261 = 3;
                                    } else if (var262.method1318(class165.field2782, 15056)) {
                                        var258 = var258.method1315(class165.field2782.method1304(63), (byte) -123);
                                        var261 = 4;
                                    } else if (var262.method1318(class104.field1716, arg0 + 15053)) {
                                        var258 = var258.method1315(class104.field1716.method1304(63), (byte) 119);
                                        var261 = 5;
                                    } else if (class233.field4165 != 0) {
                                        if (var262.method1318(class217.field3822, 15056)) {
                                            var261 = 1;
                                            var258 = var258.method1315(class217.field3822.method1304(63), (byte) 86);
                                        } else if (var262.method1318(class240.field4268, arg0 ^ 0x3AD3)) {
                                            var261 = 2;
                                            var258 = var258.method1315(class240.field4268.method1304(63), (byte) 72);
                                        } else if (var262.method1318(class115.field1897, 15056)) {
                                            var261 = 3;
                                            var258 = var258.method1315(class115.field1897.method1304(arg0 + 60), (byte) -109);
                                        } else if (var262.method1318(class165.field2789, 15056)) {
                                            var258 = var258.method1315(class165.field2789.method1304(63), (byte) -105);
                                            var261 = 4;
                                        } else if (var262.method1318(class104.field1712, arg0 + 15053)) {
                                            var261 = 5;
                                            var258 = var258.method1315(class104.field1712.method1304(arg0 + 60), (byte) 95);
                                        }
                                    }
                                    class53.field963.method1096(100, 0);
                                    class53.field963.method1613(0, 21);
                                    int var263 = class53.field963.field3996;
                                    class53.field963.method1613(var260, 21);
                                    class53.field963.method1613(var261, 21);
                                    class178.method1197(class53.field963, var258, true);
                                    class53.field963.method1567(28916, class53.field963.field3996 - var263);
                                    continue;
                                }
                                if (var461 == 5009) {
                                    var7 -= 2;
                                    class191 var264 = class266.field4713[var7];
                                    class191 var265 = class266.field4713[var7 + 1];
                                    if (class227.field4084 != 0 || class42.field739 != 1 && class39.field706 != 1) {
                                        class53.field963.method1096(221, 0);
                                        class149.field2575++;
                                        class53.field963.method1613(0, arg0 + 18);
                                        int var266 = class53.field963.field3996;
                                        class53.field963.method1589(var264.method1352(65), false);
                                        class178.method1197(class53.field963, var265, true);
                                        class53.field963.method1567(28916, class53.field963.field3996 - var266);
                                    }
                                    continue;
                                }
                                if (var461 == 5010) {
                                    var6--;
                                    int var267 = class66.field1152[var6];
                                    class191 var268 = null;
                                    if (var267 < 100) {
                                        var268 = class263.field4671[var267];
                                    }
                                    if (var268 == null) {
                                        var268 = class172.field2893;
                                    }
                                    class266.field4713[var7++] = var268;
                                    continue;
                                }
                                if (var461 == 5011) {
                                    class191 var269 = null;
                                    var6--;
                                    int var270 = class66.field1152[var6];
                                    if (var270 < 100) {
                                        var269 = class234.field4169[var270];
                                    }
                                    if (var269 == null) {
                                        var269 = class172.field2893;
                                    }
                                    class266.field4713[var7++] = var269;
                                    continue;
                                }
                                if (var461 == 5012) {
                                    int var271 = -1;
                                    var6--;
                                    int var272 = class66.field1152[var6];
                                    if (var272 < 100) {
                                        var271 = class232.field4153[var272];
                                    }
                                    class66.field1152[var6++] = var271;
                                    continue;
                                }
                                if (var461 == 5015) {
                                    class191 var273;
                                    if (class175.field2946 == null || class175.field2946.field1315 == null) {
                                        var273 = field381;
                                    } else {
                                        var273 = class175.field2946.method494((byte) 43);
                                    }
                                    class266.field4713[var7++] = var273;
                                    continue;
                                }
                                if (var461 == 5016) {
                                    class66.field1152[var6++] = class209.field3716;
                                    continue;
                                }
                                if (var461 == 5017) {
                                    class66.field1152[var6++] = class269.field4752;
                                    continue;
                                }
                                if (var461 == 5050) {
                                    var6--;
                                    int var274 = class66.field1152[var6];
                                    class266.field4713[var7++] = class236.method1662(var274, -1).field2793;
                                    continue;
                                }
                                if (var461 == 5051) {
                                    var6--;
                                    int var275 = class66.field1152[var6];
                                    class165 var276 = class236.method1662(var275, -1);
                                    if (var276.field2798 == null) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = var276.field2798.length;
                                    }
                                    continue;
                                }
                                if (var461 == 5052) {
                                    var6 -= 2;
                                    int var277 = class66.field1152[var6];
                                    int var278 = class66.field1152[var6 + 1];
                                    class165 var279 = class236.method1662(var277, -1);
                                    int var280 = var279.field2798[var278];
                                    class66.field1152[var6++] = var280;
                                    continue;
                                }
                                if (var461 == 5053) {
                                    var6--;
                                    int var281 = class66.field1152[var6];
                                    class165 var282 = class236.method1662(var281, arg0 ^ 0xFFFFFFFC);
                                    if (var282.field2783 == null) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = var282.field2783.length;
                                    }
                                    continue;
                                }
                                if (var461 == 5054) {
                                    var6 -= 2;
                                    int var283 = class66.field1152[var6];
                                    int var284 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class236.method1662(var283, -1).field2783[var284];
                                    continue;
                                }
                                if (var461 == 5055) {
                                    var6--;
                                    int var285 = class66.field1152[var6];
                                    class266.field4713[var7++] = class39.method263(var285, (byte) -122).method463(-1);
                                    continue;
                                }
                                if (var461 == 5056) {
                                    var6--;
                                    int var286 = class66.field1152[var6];
                                    class69 var287 = class39.method263(var286, (byte) -120);
                                    if (var287.field1209 == null) {
                                        class66.field1152[var6++] = 0;
                                    } else {
                                        class66.field1152[var6++] = var287.field1209.length;
                                    }
                                    continue;
                                }
                                if (var461 == 5057) {
                                    var6 -= 2;
                                    int var288 = class66.field1152[var6];
                                    int var289 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class39.method263(var288, (byte) -126).field1209[var289];
                                    continue;
                                }
                                if (var461 == 5058) {
                                    class159.field2706 = new class64();
                                    var6--;
                                    class159.field2706.field1130 = class66.field1152[var6];
                                    class159.field2706.field1129 = class39.method263(class159.field2706.field1130, (byte) -125);
                                    class159.field2706.field1133 = new int[class159.field2706.field1129.method456(0)];
                                    continue;
                                }
                                if (var461 == 5059) {
                                    class100.field1595++;
                                    class53.field963.method1096(165, 0);
                                    class53.field963.method1613(0, 21);
                                    int var290 = class53.field963.field3996;
                                    class53.field963.method1613(0, arg0 ^ 0x16);
                                    class53.field963.method1608(class159.field2706.field1130, false);
                                    class159.field2706.field1129.method454(-67, class159.field2706.field1133, class53.field963);
                                    class53.field963.method1567(28916, class53.field963.field3996 - var290);
                                    continue;
                                }
                                if (var461 == 5060) {
                                    class205.field3631++;
                                    var7--;
                                    class191 var291 = class266.field4713[var7];
                                    class53.field963.method1096(38, 0);
                                    class53.field963.method1613(0, arg0 + 18);
                                    int var292 = class53.field963.field3996;
                                    class53.field963.method1589(var291.method1352(65), false);
                                    class53.field963.method1608(class159.field2706.field1130, false);
                                    class159.field2706.field1129.method454(-83, class159.field2706.field1133, class53.field963);
                                    class53.field963.method1567(arg0 ^ 0x70F7, class53.field963.field3996 - var292);
                                    continue;
                                }
                                if (var461 == 5061) {
                                    class100.field1595++;
                                    class53.field963.method1096(165, 0);
                                    class53.field963.method1613(0, 21);
                                    int var293 = class53.field963.field3996;
                                    class53.field963.method1613(1, 21);
                                    class53.field963.method1608(class159.field2706.field1130, false);
                                    class159.field2706.field1129.method454(-104, class159.field2706.field1133, class53.field963);
                                    class53.field963.method1567(28916, class53.field963.field3996 - var293);
                                    continue;
                                }
                                if (var461 == 5062) {
                                    var6 -= 2;
                                    int var294 = class66.field1152[var6];
                                    int var295 = class66.field1152[var6 + 1];
                                    class66.field1152[var6++] = class236.method1662(var294, -1).field2788[var295];
                                    continue;
                                }
                                if (var461 == 5063) {
                                    var6 -= 2;
                                    int var296 = class66.field1152[var6 + 1];
                                    int var297 = class66.field1152[var6];
                                    class66.field1152[var6++] = class236.method1662(var297, -1).field2799[var296];
                                    continue;
                                }
                                if (var461 == 5064) {
                                    var6 -= 2;
                                    int var298 = class66.field1152[var6];
                                    int var299 = class66.field1152[var6 + 1];
                                    if (var299 == -1) {
                                        class66.field1152[var6++] = -1;
                                    } else {
                                        class66.field1152[var6++] = class236.method1662(var298, class62.method416(arg0, -4)).method1116(true, var299);
                                    }
                                    continue;
                                }
                                if (var461 == 5065) {
                                    var6 -= 2;
                                    int var300 = class66.field1152[var6];
                                    int var301 = class66.field1152[var6 + 1];
                                    if (var301 == -1) {
                                        class66.field1152[var6++] = -1;
                                    } else {
                                        class66.field1152[var6++] = class236.method1662(var300, -1).method1114(class62.method416(arg0, -4), var301);
                                    }
                                    continue;
                                }
                                if (var461 == 5066) {
                                    var6--;
                                    int var302 = class66.field1152[var6];
                                    class66.field1152[var6++] = class39.method263(var302, (byte) -120).method456(0);
                                    continue;
                                }
                                if (var461 == 5067) {
                                    var6 -= 2;
                                    int var303 = class66.field1152[var6];
                                    int var304 = class66.field1152[var6 + 1];
                                    int var305 = class39.method263(var303, (byte) -127).method459(-19524, var304);
                                    class66.field1152[var6++] = var305;
                                    continue;
                                }
                                if (var461 == 5068) {
                                    var6 -= 2;
                                    int var306 = class66.field1152[var6];
                                    int var307 = class66.field1152[var6 + 1];
                                    class159.field2706.field1133[var306] = var307;
                                    continue;
                                }
                                if (var461 == 5069) {
                                    var6 -= 2;
                                    int var308 = class66.field1152[var6 + 1];
                                    int var309 = class66.field1152[var6];
                                    class159.field2706.field1133[var309] = var308;
                                    continue;
                                }
                                if (var461 == 5070) {
                                    var6 -= 3;
                                    int var310 = class66.field1152[var6];
                                    int var311 = class66.field1152[var6 + 1];
                                    int var312 = class66.field1152[var6 + 2];
                                    class69 var313 = class39.method263(var310, (byte) -124);
                                    if (var313.method459(-19524, var311) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class66.field1152[var6++] = var313.method457(var312, var311, (byte) -127);
                                    continue;
                                }
                            } else if (var461 < 5200) {
                                if (var461 == 5100) {
                                    if (class88.field1438[86]) {
                                        class66.field1152[var6++] = 1;
                                    } else {
                                        class66.field1152[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var461 == 5101) {
                                    if (class88.field1438[82]) {
                                        class66.field1152[var6++] = 1;
                                    } else {
                                        class66.field1152[var6++] = 0;
                                    }
                                    continue;
                                }
                                if (var461 == 5102) {
                                    if (class88.field1438[81]) {
                                        class66.field1152[var6++] = 1;
                                    } else {
                                        class66.field1152[var6++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var461 < 5300) {
                                if (var461 == 5200) {
                                    var6--;
                                    class20.method148(class66.field1152[var6], -38);
                                    continue;
                                }
                                if (var461 == 5201) {
                                    class66.field1152[var6++] = class260.method1786(true);
                                    continue;
                                }
                                if (var461 == 5202) {
                                    var6--;
                                    class271.method1851((byte) -48, class66.field1152[var6]);
                                    continue;
                                }
                                if (var461 == 5203) {
                                    var7--;
                                    class240.method1686(class266.field4713[var7], (byte) -103);
                                    continue;
                                }
                                if (var461 == 5204) {
                                    class266.field4713[var7 - 1] = class173.method1164(arg0 + 113, class266.field4713[var7 + -1]);
                                    continue;
                                }
                                if (var461 == 5205) {
                                    var7--;
                                    class221.method1531(class266.field4713[var7], (byte) -127);
                                    continue;
                                }
                                if (var461 == 5206) {
                                    var6--;
                                    int var248 = class66.field1152[var6];
                                    class49 var249 = class57.method383((var248 & 0xFFFECCE) >> 14, var248 & 0x3FFF, 28908);
                                    if (var249 == null) {
                                        class266.field4713[var7++] = class172.field2893;
                                    } else {
                                        class266.field4713[var7++] = var249.field883;
                                    }
                                    continue;
                                }
                                if (var461 == 5207) {
                                    var7--;
                                    class49 var250 = class104.method650((byte) -85, class266.field4713[var7]);
                                    if (var250 != null && var250.field878 != null) {
                                        class266.field4713[var7++] = var250.field878;
                                        continue;
                                    }
                                    class266.field4713[var7++] = class172.field2893;
                                    continue;
                                }
                            } else if (var461 < 5400) {
                                if (var461 == 5306) {
                                    class66.field1152[var6++] = class149.method1017(0);
                                    continue;
                                }
                            } else if (var461 < 5500) {
                                if (var461 == 5400) {
                                    var7 -= 2;
                                    class230.field4133++;
                                    class191 var197 = class266.field4713[var7];
                                    var6--;
                                    int var198 = class66.field1152[var6];
                                    class191 var199 = class266.field4713[var7 + 1];
                                    class53.field963.method1096(129, 0);
                                    class53.field963.method1613(class33.method230(29546, var197) + class33.method230(29546, var199) + 1, arg0 + 18);
                                    class53.field963.method1586(var197, (byte) -117);
                                    class53.field963.method1586(var199, (byte) -117);
                                    class53.field963.method1613(var198, 21);
                                    continue;
                                }
                                if (var461 == 5401) {
                                    var6 -= 2;
                                    class128.field2119[class66.field1152[var6]] = (short) class126.method851(-29413, class66.field1152[var6 + 1]);
                                    class102.method630((byte) -102);
                                    class172.method1160(false);
                                    class128.method869(arg0 ^ 0x2);
                                    class104.method652(896);
                                    class235.method1658(18138);
                                    continue;
                                }
                                if (var461 == 5405) {
                                    var6 -= 2;
                                    int var200 = class66.field1152[var6];
                                    int var201 = class66.field1152[var6 + 1];
                                    if (var200 >= 0 && var200 < 2) {
                                        class4.field35[var200] = new int[var201 << 1][4];
                                    }
                                    continue;
                                }
                                if (var461 == 5406) {
                                    var6 -= 7;
                                    int var202 = class66.field1152[var6];
                                    int var203 = class66.field1152[var6 + 2];
                                    int var204 = class66.field1152[var6 + 3];
                                    int var205 = class66.field1152[var6 + 1] << 1;
                                    int var206 = class66.field1152[var6 + 6];
                                    int var207 = class66.field1152[var6 + 5];
                                    int var208 = class66.field1152[var6 + 4];
                                    if (var202 >= 0 && var202 < 2 && class4.field35[var202] != null && var205 >= 0 && var205 < class4.field35[var202].length) {
                                        class4.field35[var202][var205] = new int[] { (class167.method1128(var203, 268430559) >> 14) * 128, var204, class167.method1128(16383, var203) * 128, var206 };
                                        class4.field35[var202][var205 + 1] = new int[] { (class167.method1128(var208, 268431249) >> 14) * 128, var207, class167.method1128(var208, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var461 == 5407) {
                                    var6--;
                                    int var209 = class4.field35[class66.field1152[var6]].length >> 1;
                                    class66.field1152[var6++] = var209;
                                    continue;
                                }
                                if (var461 == 5408) {
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 5409) {
                                    class172.method1155(false);
                                    continue;
                                }
                                if (var461 == 5411) {
                                    if (class114.field1884 == null) {
                                        class219.method1487(-27286, false, class146.method982(-1));
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var461 == 5419) {
                                    class191 var210 = class172.field2893;
                                    if (class128.field2116 != null) {
                                        var210 = class268.method1835(-30159, class128.field2116.field1358);
                                        try {
                                            if (class128.field2116.field1360 != null) {
                                                byte[] var211 = ((String) class128.field2116.field1360).getBytes("ISO-8859-1");
                                                var210 = class76.method491(var211.length, var211, 0, -1);
                                            }
                                        } catch (UnsupportedEncodingException var459) {
                                        }
                                    }
                                    class266.field4713[var7++] = var210;
                                    continue;
                                }
                                if (var461 == 5420) {
                                    class66.field1152[var6++] = class39.field708 == 2 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 5421) {
                                    var7--;
                                    class191 var212 = class266.field4713[var7];
                                    var6--;
                                    boolean var213 = class66.field1152[var6] == 1;
                                    class191 var214 = class228.method1629(new class191[] { class146.method982(arg0 ^ 0xFFFFFFFC), var212 }, (byte) -39);
                                    if (class114.field1884 == null && (!var213 || class39.field708 == 2 || !class247.field4375.startsWith("win") || class34.field639)) {
                                        class219.method1487(-27286, var213, var214);
                                        continue;
                                    }
                                    class233.field4167 = var214;
                                    class235.field4187 = var213;
                                    class126.field2084 = class167.field2820.method1724(arg0 ^ 0x3, new String(var214.method1308(50), "ISO-8859-1"));
                                    continue;
                                }
                                if (var461 == 5422) {
                                    var7 -= 2;
                                    class191 var215 = class266.field4713[var7];
                                    var6--;
                                    int var216 = class66.field1152[var6];
                                    class191 var217 = class266.field4713[var7 + 1];
                                    if (var215.method1304(63) > 0) {
                                        if (class8.field83 == null) {
                                            class8.field83 = new class191[class191.field3398[class83.field1394]];
                                        }
                                        class8.field83[var216] = var215;
                                    }
                                    if (var217.method1304(arg0 + 60) > 0) {
                                        if (class227.field4089 == null) {
                                            class227.field4089 = new class191[class191.field3398[class83.field1394]];
                                        }
                                        class227.field4089[var216] = var217;
                                    }
                                    continue;
                                }
                            } else if (var461 < 5600) {
                                if (var461 == 5500) {
                                    var6 -= 4;
                                    int var236 = class66.field1152[var6];
                                    int var237 = class66.field1152[var6 + 3];
                                    int var238 = class66.field1152[var6 + 1];
                                    int var239 = class66.field1152[var6 + 2];
                                    class232.method1641(var239, var238, -14563, false, (var236 >> 14 & 0x3FFF) - class225.field4061, var237, (var236 & 0x3FFF) - class193.field3474);
                                    continue;
                                }
                                if (var461 == 5501) {
                                    var6 -= 4;
                                    int var240 = class66.field1152[var6 + 1];
                                    int var241 = class66.field1152[var6];
                                    int var242 = class66.field1152[var6 + 2];
                                    int var243 = class66.field1152[var6 + 3];
                                    class63.method423(var240, (var241 >> 14 & 0x3FFF) - class225.field4061, -1, var243, (var241 & 0x3FFF) - class193.field3474, var242);
                                    continue;
                                }
                                if (var461 == 5502) {
                                    var6 -= 6;
                                    int var244 = class66.field1152[var6];
                                    if (var244 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class22.field320 = var244;
                                    int var245 = class66.field1152[var6 + 1];
                                    if ((var245 + 1) >= (class4.field35[class22.field320].length >> 1)) {
                                        throw new RuntimeException();
                                    }
                                    class263.field4672 = 0;
                                    class132.field2222 = var245;
                                    class18.field244 = class66.field1152[var6 + 2];
                                    class122.field2015 = class66.field1152[var6 + 3];
                                    int var246 = class66.field1152[var6 + 4];
                                    if (var246 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class271.field4776 = var246;
                                    int var247 = class66.field1152[var6 + 5];
                                    if (class4.field35[class271.field4776].length >> 1 <= var247 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class156.field2668 = var247;
                                    class243.field4345 = 3;
                                    continue;
                                }
                                if (var461 == 5503) {
                                    class250.method1744(1);
                                    continue;
                                }
                                if (var461 == 5504) {
                                    var6 -= 2;
                                    class269.field4751 = class66.field1152[var6];
                                    class65.field1138 = class66.field1152[var6 + 1];
                                    class265.method1818((byte) 47);
                                    continue;
                                }
                                if (var461 == 5505) {
                                    class66.field1152[var6++] = class269.field4751;
                                    continue;
                                }
                                if (var461 == 5506) {
                                    class66.field1152[var6++] = class65.field1138;
                                    continue;
                                }
                            } else if (var461 < 5700) {
                                if (var461 == 5600) {
                                    var7 -= 2;
                                    class191 var232 = class266.field4713[var7];
                                    var6--;
                                    int var233 = class66.field1152[var6];
                                    class191 var234 = class266.field4713[var7 + 1];
                                    if (class47.field836 == 10 && class49.field894 == 0 && class126.field2081 == 0) {
                                        class207.method1425(var234, (byte) 32, var233, var232);
                                    }
                                    continue;
                                }
                                if (var461 == 5601) {
                                    class86.method529((byte) 120);
                                    continue;
                                }
                                if (var461 == 5602) {
                                    if (class49.field894 == 0) {
                                        class240.field4263 = -2;
                                    }
                                    continue;
                                }
                                if (var461 == 5603) {
                                    var6 -= 4;
                                    if (class47.field836 == 10 && class49.field894 == 0 && class126.field2081 == 0) {
                                        method194(class66.field1152[var6 + 3], class66.field1152[var6], class66.field1152[var6 + 2], class66.field1152[var6 + 1], arg0 + 4962);
                                    }
                                    continue;
                                }
                                if (var461 == 5604) {
                                    var7--;
                                    if (class47.field836 == 10 && class49.field894 == 0 && class126.field2081 == 0) {
                                        class215.method1468(-32109, class266.field4713[var7].method1352(65));
                                    }
                                    continue;
                                }
                                if (var461 == 5605) {
                                    var7 -= 2;
                                    var6 -= 4;
                                    if (class47.field836 == 10 && class49.field894 == 0 && class126.field2081 == 0) {
                                        class226.method1620(arg0 - 131, class66.field1152[var6 + 1], class266.field4713[var7 + 1], class66.field1152[var6 + 2], class266.field4713[var7].method1352(arg0 ^ 0x42), class66.field1152[var6], class66.field1152[var6 + 3]);
                                    }
                                    continue;
                                }
                                if (var461 == 5606) {
                                    if (class126.field2081 == 0) {
                                        class24.field345 = -2;
                                    }
                                    continue;
                                }
                                if (var461 == 5607) {
                                    class66.field1152[var6++] = class240.field4263;
                                    continue;
                                }
                                if (var461 == 5608) {
                                    class66.field1152[var6++] = class100.field1602;
                                    continue;
                                }
                                if (var461 == 5609) {
                                    class66.field1152[var6++] = class24.field345;
                                    continue;
                                }
                                if (var461 == 5610) {
                                    for (int var235 = 0; var235 < 5; var235++) {
                                        class266.field4713[var7++] = var235 >= class131.field2187.length ? class172.field2893 : class131.field2187[var235].method1345((byte) -18);
                                    }
                                    class131.field2187 = null;
                                    continue;
                                }
                                if (var461 == 5611) {
                                    class66.field1152[var6++] = class209.field3713;
                                    continue;
                                }
                            } else if (var461 < 6100) {
                                if (var461 == 6001) {
                                    var6--;
                                    int var218 = class66.field1152[var6];
                                    if (var218 < 1) {
                                        var218 = 1;
                                    }
                                    if (var218 > 4) {
                                        var218 = 4;
                                    }
                                    class87.field1421 = var218;
                                    if (class87.field1421 == 1) {
                                        class15.method103(0.9F);
                                    }
                                    if (class87.field1421 == 2) {
                                        class15.method103(0.8F);
                                    }
                                    if (class87.field1421 == 3) {
                                        class15.method103(0.7F);
                                    }
                                    if (class87.field1421 == 4) {
                                        class15.method103(0.6F);
                                    }
                                    class172.method1160(false);
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6002) {
                                    var6--;
                                    class168.method1135(class66.field1152[var6] == 1, -74);
                                    class219.method1485(true);
                                    class169.method1144(-1001);
                                    class61.method413(-12379);
                                    class243.method1703(arg0 ^ 0x287C, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6003) {
                                    var6--;
                                    class183.field3154 = class66.field1152[var6] == 1;
                                    class61.method413(-12379);
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6005) {
                                    var6--;
                                    class225.field4029 = class66.field1152[var6] == 1;
                                    class169.method1144(-1001);
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6006) {
                                    var6--;
                                    class209.field3721 = class66.field1152[var6] == 1;
                                    ((class192) class15.field199).method1368((byte) 80, !class209.field3721);
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6007) {
                                    var6--;
                                    class41.field729 = class66.field1152[var6] == 1;
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6008) {
                                    var6--;
                                    class127.field2111 = class66.field1152[var6] == 1;
                                    class243.method1703(arg0 ^ 0x287C, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6009) {
                                    var6--;
                                    class226.field4074 = class66.field1152[var6] == 1;
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6010) {
                                    var6--;
                                    class252.field4472 = class66.field1152[var6] == 1;
                                    class243.method1703(arg0 + 10364, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6011) {
                                    var6--;
                                    int var219 = class66.field1152[var6];
                                    if (var219 < 0 || var219 > 2) {
                                        var219 = 0;
                                    }
                                    class102.field1660 = var219;
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6012) {
                                    var6--;
                                    class75.field1289 = class66.field1152[var6] == 1;
                                    if (class87.field1421 == 1) {
                                        class15.method103(0.9F);
                                    }
                                    if (class87.field1421 == 2) {
                                        class15.method103(0.8F);
                                    }
                                    if (class87.field1421 == 3) {
                                        class15.method103(0.7F);
                                    }
                                    if (class87.field1421 == 4) {
                                        class15.method103(0.6F);
                                    }
                                    class169.method1144(-1001);
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6014) {
                                    var6--;
                                    class213.field3772 = class66.field1152[var6] == 1;
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6015) {
                                    var6--;
                                    class50.field898 = class66.field1152[var6] == 1;
                                    class243.method1703(arg0 ^ 0x287C, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6016) {
                                    var6--;
                                    int var220 = class66.field1152[var6];
                                    if (var220 < 0 || var220 > 2) {
                                        var220 = 0;
                                    }
                                    class56.field1036 = var220;
                                    class243.method1703(arg0 + 10364, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6017) {
                                    var6--;
                                    class126.field2088 = class66.field1152[var6] == 1;
                                    class183.method1236(arg0 ^ 0x803);
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6018) {
                                    var6--;
                                    int var221 = class66.field1152[var6];
                                    if (var221 < 0) {
                                        var221 = 0;
                                    }
                                    if (var221 > 127) {
                                        var221 = 127;
                                    }
                                    class30.field425 = var221;
                                    class243.method1703(arg0 ^ 0x287C, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6019) {
                                    var6--;
                                    int var222 = class66.field1152[var6];
                                    if (var222 < 0) {
                                        var222 = 0;
                                    }
                                    if (var222 > 255) {
                                        var222 = 255;
                                    }
                                    if (class255.field4532 != var222) {
                                        if (class255.field4532 == 0 && class11.field128 != -1) {
                                            class184.method1249((byte) -80, 0, class11.field128, class102.field1653, false, var222);
                                            class141.field2360 = false;
                                        } else if (var222 == 0) {
                                            class235.method1659(125);
                                            class141.field2360 = false;
                                        } else {
                                            class39.method264(var222, (byte) 14);
                                        }
                                        class255.field4532 = var222;
                                    }
                                    class243.method1703(arg0 ^ 0x287C, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6020) {
                                    var6--;
                                    int var223 = class66.field1152[var6];
                                    if (var223 < 0) {
                                        var223 = 0;
                                    }
                                    if (var223 > 127) {
                                        var223 = 127;
                                    }
                                    class173.field2904 = var223;
                                    class243.method1703(10367, class167.field2820);
                                    class30.field427 = false;
                                    continue;
                                }
                                if (var461 == 6021) {
                                    var6--;
                                    class99.field1581 = class66.field1152[var6] == 1;
                                    class61.method413(-12379);
                                    continue;
                                }
                                if (var461 == 6022) {
                                    var6--;
                                    class61.field1105 = class66.field1152[var6] == 1;
                                    class243.method1703(10367, class167.field2820);
                                    class147.method988(0, 0);
                                    continue;
                                }
                            } else if (var461 < 6200) {
                                if (var461 == 6101) {
                                    class66.field1152[var6++] = class87.field1421;
                                    continue;
                                }
                                if (var461 == 6102) {
                                    class66.field1152[var6++] = class188.method1298(10) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6103) {
                                    class66.field1152[var6++] = class183.field3154 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6105) {
                                    class66.field1152[var6++] = class225.field4029 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6106) {
                                    class66.field1152[var6++] = class209.field3721 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6107) {
                                    class66.field1152[var6++] = class41.field729 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6108) {
                                    class66.field1152[var6++] = class127.field2111 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6109) {
                                    class66.field1152[var6++] = class226.field4074 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6110) {
                                    class66.field1152[var6++] = class252.field4472 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6111) {
                                    class66.field1152[var6++] = class102.field1660;
                                    continue;
                                }
                                if (var461 == 6112) {
                                    class66.field1152[var6++] = class75.field1289 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6114) {
                                    class66.field1152[var6++] = class213.field3772 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6115) {
                                    class66.field1152[var6++] = class50.field898 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6116) {
                                    class66.field1152[var6++] = class56.field1036;
                                    continue;
                                }
                                if (var461 == 6117) {
                                    class66.field1152[var6++] = class126.field2088 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6118) {
                                    class66.field1152[var6++] = class30.field425;
                                    continue;
                                }
                                if (var461 == 6119) {
                                    class66.field1152[var6++] = class255.field4532;
                                    continue;
                                }
                                if (var461 == 6120) {
                                    class66.field1152[var6++] = class173.field2904;
                                    continue;
                                }
                                if (var461 == 6121) {
                                    class66.field1152[var6++] = 0;
                                    continue;
                                }
                                if (var461 == 6122) {
                                    class66.field1152[var6++] = class61.field1105 ? 1 : 0;
                                    continue;
                                }
                            } else if (var461 < 6300) {
                                if (var461 == 6200) {
                                    var6 -= 2;
                                    class141.field2348 = (short) class66.field1152[var6];
                                    if (class141.field2348 <= 0) {
                                        class141.field2348 = 256;
                                    }
                                    class10.field112 = (short) class66.field1152[var6 + 1];
                                    if (class10.field112 <= 0) {
                                        class10.field112 = 205;
                                    }
                                    continue;
                                }
                                if (var461 == 6201) {
                                    var6 -= 2;
                                    class86.field1415 = (short) class66.field1152[var6];
                                    if (class86.field1415 <= 0) {
                                        class86.field1415 = 256;
                                    }
                                    class135.field2261 = (short) class66.field1152[var6 + 1];
                                    if (class135.field2261 <= 0) {
                                        class135.field2261 = 320;
                                    }
                                    continue;
                                }
                                if (var461 == 6202) {
                                    var6 -= 4;
                                    class89.field1449 = (short) class66.field1152[var6];
                                    if (class89.field1449 <= 0) {
                                        class89.field1449 = 1;
                                    }
                                    class41.field731 = (short) class66.field1152[var6 + 1];
                                    if (class41.field731 <= 0) {
                                        class41.field731 = 32767;
                                    } else if (class89.field1449 > class41.field731) {
                                        class41.field731 = class89.field1449;
                                    }
                                    class179.field3085 = (short) class66.field1152[var6 + 2];
                                    if (class179.field3085 <= 0) {
                                        class179.field3085 = 1;
                                    }
                                    class255.field4531 = (short) class66.field1152[var6 + 3];
                                    if (class255.field4531 <= 0) {
                                        class255.field4531 = 32767;
                                    } else if (class179.field3085 > class255.field4531) {
                                        class255.field4531 = class179.field3085;
                                    }
                                    continue;
                                }
                                if (var461 == 6203) {
                                    class180.method1212(0, class153.field2628.field561, arg0 - 3, class153.field2628.field537, 0, false);
                                    class66.field1152[var6++] = class8.field84;
                                    class66.field1152[var6++] = class169.field2861;
                                    continue;
                                }
                                if (var461 == 6204) {
                                    class66.field1152[var6++] = class86.field1415;
                                    class66.field1152[var6++] = class135.field2261;
                                    continue;
                                }
                                if (var461 == 6205) {
                                    class66.field1152[var6++] = class141.field2348;
                                    class66.field1152[var6++] = class10.field112;
                                    continue;
                                }
                            } else if (var461 < 6400) {
                                if (var461 == 6300) {
                                    class66.field1152[var6++] = (int) (class27.method198((byte) -113) / 60000L);
                                    continue;
                                }
                                if (var461 == 6301) {
                                    class66.field1152[var6++] = (int) (class27.method198((byte) -125) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var461 == 6302) {
                                    var6 -= 3;
                                    int var224 = class66.field1152[var6];
                                    int var225 = class66.field1152[var6 + 2];
                                    int var226 = class66.field1152[var6 + 1];
                                    class102.field1678.clear();
                                    class102.field1678.set(11, 12);
                                    class102.field1678.set(var225, var226, var224);
                                    class66.field1152[var6++] = (int) (class102.field1678.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var461 == 6303) {
                                    class102.field1678.clear();
                                    class102.field1678.setTime(new Date(class27.method198((byte) -128)));
                                    class66.field1152[var6++] = class102.field1678.get(1);
                                    continue;
                                }
                                if (var461 == 6304) {
                                    var6--;
                                    int var227 = class66.field1152[var6];
                                    boolean var228 = true;
                                    if (var227 < 0) {
                                        var228 = ((var227 + 1) % 4) == 0;
                                    } else if (var227 < 1582) {
                                        var228 = (var227 % 4) == 0;
                                    } else if ((var227 % 4) != 0) {
                                        var228 = false;
                                    } else if (var227 % 100 != 0) {
                                        var228 = true;
                                    } else if ((var227 % 400) != 0) {
                                        var228 = false;
                                    }
                                    class66.field1152[var6++] = var228 ? 1 : 0;
                                    continue;
                                }
                            } else if (var461 < 6500) {
                                if (var461 == 6400) {
                                    class66.field1152[var6++] = class39.field709 ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6401) {
                                    var7--;
                                    class191 var229 = class266.field4713[var7];
                                    var6--;
                                    int var230 = class66.field1152[var6];
                                    String var231;
                                    try {
                                        var231 = new String(var229.method1308(108), "ISO-8859-1");
                                    } catch (UnsupportedEncodingException var458) {
                                        var231 = new String(var229.method1308(106));
                                    }
                                    if (class39.field709) {
                                        if (!browsercontrol.iscreated()) {
                                            browsercontrol.create("about:blank");
                                        }
                                        if (browsercontrol.iscreated()) {
                                            browsercontrol.navigate(var231);
                                            class213.field3764 = var230;
                                            class147.method988(0, arg0 ^ 0x3);
                                        }
                                    }
                                    continue;
                                }
                                if (var461 == 6402) {
                                    if (browsercontrol.iscreated()) {
                                        browsercontrol.navigate("about:blank");
                                        browsercontrol.hide();
                                        class213.field3764 = 0;
                                        class147.method988(0, 0);
                                    }
                                    continue;
                                }
                                if (var461 == 6403) {
                                    class266.field4713[var7++] = class24.field343;
                                    continue;
                                }
                                if (var461 == 6404) {
                                    class266.field4713[var7++] = class203.field3618;
                                    continue;
                                }
                                if (var461 == 6405) {
                                    class66.field1152[var6++] = class119.method786(2253) ? 1 : 0;
                                    continue;
                                }
                                if (var461 == 6406) {
                                    class66.field1152[var6++] = class27.method195((byte) -122) ? 1 : 0;
                                    continue;
                                }
                            }
                        } else {
                            class33 var50;
                            if (var461 < 2000) {
                                var50 = var46 ? class138.field2310 : class262.field4649;
                            } else {
                                var6--;
                                var50 = class233.method1646(5877, class66.field1152[var6]);
                                var461 -= 1000;
                            }
                            if (var461 == 1300) {
                                var6--;
                                int var51 = class66.field1152[var6] - 1;
                                if (var51 >= 0 && var51 <= 9) {
                                    var7--;
                                    var50.method237(true, var51, class266.field4713[var7]);
                                    continue;
                                }
                                var7--;
                                continue;
                            }
                            if (var461 == 1301) {
                                var6 -= 2;
                                int var52 = class66.field1152[var6 + 1];
                                int var53 = class66.field1152[var6];
                                var50.field509 = class10.method74(var53, var52, (byte) 122);
                                continue;
                            }
                            if (var461 == 1302) {
                                var6--;
                                var50.field630 = class66.field1152[var6] == 1;
                                continue;
                            }
                            if (var461 == 1303) {
                                var6--;
                                var50.field545 = class66.field1152[var6];
                                continue;
                            }
                            if (var461 == 1304) {
                                var6--;
                                var50.field511 = class66.field1152[var6];
                                continue;
                            }
                            if (var461 == 1305) {
                                var7--;
                                var50.field565 = class266.field4713[var7];
                                continue;
                            }
                            if (var461 == 1306) {
                                var7--;
                                var50.field583 = class266.field4713[var7];
                                continue;
                            }
                            if (var461 == 1307) {
                                var50.field521 = null;
                                continue;
                            }
                        }
                    }
                    throw new IllegalStateException();
                }
            }
        } catch (Exception var460) {
            if (var5.field3512 == null) {
                if (class18.field239 != 0) {
                    class47.method320(class240.field4262, class172.field2893, 0, arg0 ^ 0xFFFFFFFC);
                }
                class25.method182(var460, "CS2 - scr:" + var5.field1713 + " op:" + var9, true);
            } else {
                class191 var455 = class167.method1123(-4636, 30);
                var455.method1326((byte) -9, class159.field2707).method1326((byte) -9, var5.field3512);
                for (int var456 = class261.field4597 - 1; var456 >= 0; var456--) {
                    var455.method1326((byte) -9, class119.field1961).method1326((byte) -9, class51.field914[var456].field2347.field3512);
                }
                if (var9 == 40) {
                    int var457 = var10[var8];
                    var455.method1326((byte) -9, class210.field3731).method1326((byte) -9, class92.method563(-92, var457));
                }
                if (class18.field239 != 0) {
                    class47.method320(class228.method1629(new class191[] { class71.field1251, var5.field3512 }, (byte) -65), class172.field2893, 0, -1);
                }
                class25.method182(var460, "CS2 - scr:" + var5.field1713 + " op:" + var9 + new String(var455.method1308(arg0 + 42)), true);
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
    private static final void method194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class53.field963.field3996 = 0;
        class53.field963.method1613(171, 21);
        class53.field963.method1613(arg1, arg4 - 4944);
        class53.field963.method1613(arg3, arg4 - 4944);
        field383++;
        class53.field963.method1608(arg2, false);
        if (arg4 != 4965) {
            return;
        }
        class53.field963.method1608(arg0, false);
        class173.field2902 = 0;
        class126.field2081 = 1;
        class24.field345 = -3;
        class239.field4224 = 0;
    }
}
