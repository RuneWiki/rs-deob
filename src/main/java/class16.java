import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lcb;")
    public class17 field341 = new class17();

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[Lmb;")
    public static class84[] field332 = new class84[5];

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lmb;")
    public static class84 field336 = class79.method672(true, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field339 = 0;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lmb;")
    public static class84 field348 = class79.method672(true, " ");

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lmb;")
    private static class84 field349 = class79.method672(true, " has logged out)3");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lmb;")
    public static class84 field331 = field349;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lmb;")
    public static class84 field351 = class79.method672(true, "mapdots");

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lmb;")
    public static class84 field354 = class79.method672(true, "Welt");

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lsa;")
    public static class119 field345 = new class119(64);

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "Lmb;")
    private static class84 field362 = class79.method672(true, "Try again in 60 secs)3)3)3");

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "Lmb;")
    public static class84 field365 = field362;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field364 = 2;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "Lsc;")
    public static class121 field359;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Lcb;")
    private class17 field355;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Ljd;")
    public static class66 field363;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lcb;ILcb;)V")
    public final void method95(class17 arg0, int arg1, class17 arg2) {
        if (arg2.field382 != null) {
            arg2.method121(false);
        }
        arg2.field369 = arg0;
        if (arg1 != 0) {
            this.method103(2);
        }
        arg2.field382 = arg0.field382;
        arg2.field382.field369 = arg2;
        field347++;
        arg2.field369.field382 = arg2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public final void method96(int arg0) {
        field340++;
        if (arg0 > -17) {
            field359 = null;
        }
        while (true) {
            class17 var2 = this.field341.field369;
            if (this.field341 == var2) {
                return;
            }
            var2.method121(false);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method97(int arg0, int arg1) {
        class136.field3228 = -1;
        class84.field2101 = arg1;
        if (arg0 != 5) {
            return;
        }
        class60.field1486 = null;
        class75.field1865 = -1;
        field343++;
        class44.field973 = false;
        class65.field1597 = 0;
        class58.field1453 = 1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
    public static final void method98(int arg0, byte arg1) {
        field360++;
        if (!class47.method338(-118, arg0)) {
            return;
        }
        class57[] var2 = class24.field557[arg0];
        int var3 = 0;
        if (arg1 >= -126) {
            field354 = null;
        }
        while (var2.length > var3) {
            class57 var4 = var2[var3];
            if (var4 != null) {
                var4.field1361 = 0;
                var4.field1320 = 0;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method99(byte arg0) {
        field350++;
        class14.field279.method599(-99);
        class141.field3372.method979(0, 0);
        class145.field3548 = class104.method860(class145.field3548);
        if (arg0 != 23) {
            method99((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZB)I")
    public static final int method100(boolean arg0, boolean arg1, byte arg2) {
        int var3 = 0;
        if (arg2 > -12) {
            method105((byte) 123);
        }
        if (arg0) {
            var3 += class92.field2285 + class102.field2488;
        }
        if (arg1) {
            var3 += class66.field1627 + class11.field190;
        }
        field357++;
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)Lcb;")
    public final class17 method101(int arg0) {
        class17 var2 = this.field341.field382;
        field344++;
        if (this.field341 == var2) {
            this.field355 = null;
            return null;
        }
        this.field355 = var2.field382;
        if (arg0 != -19268) {
            field331 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)Lcb;")
    public final class17 method102(int arg0) {
        if (arg0 > -21) {
            this.method103(-78);
        }
        class17 var2 = this.field341.field382;
        field337++;
        if (this.field341 == var2) {
            return null;
        } else {
            var2.method121(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)Lcb;")
    public final class17 method103(int arg0) {
        field353++;
        class17 var2 = this.field341.field369;
        if (arg0 > -50) {
            field339 = 99;
        }
        if (this.field341 == var2) {
            return null;
        } else {
            var2.method121(false);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)Lcb;")
    public final class17 method104(byte arg0) {
        field346++;
        class17 var2 = this.field341.field369;
        if (arg0 != 101) {
            this.field355 = null;
        }
        if (this.field341 == var2) {
            this.field355 = null;
            return null;
        } else {
            this.field355 = var2.field369;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    public static void method105(byte arg0) {
        field363 = null;
        field354 = null;
        field345 = null;
        field331 = null;
        field351 = null;
        if (arg0 <= 4) {
            method111((byte) 58);
        }
        field336 = null;
        field365 = null;
        field349 = null;
        field332 = null;
        field348 = null;
        field362 = null;
        field359 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lsd;III)Lsc;")
    public static final class121 method106(class122 arg0, int arg1, int arg2, int arg3) {
        field356++;
        if (class127.method1037(arg2, (byte) -100, arg0, arg3)) {
            if (arg1 != -8265) {
                field332 = null;
            }
            return class69.method608(55);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)Lcb;")
    public final class17 method107(int arg0) {
        field342++;
        class17 var2 = this.field355;
        if (arg0 != -2) {
            method112(-33, -55, 58, -112, -115, -98, -32, 11, -79, -77, -126, true);
        }
        if (this.field341 == var2) {
            this.field355 = null;
            return null;
        } else {
            this.field355 = var2.field369;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lcb;I)V")
    public final void method108(class17 arg0, int arg1) {
        if (arg1 > -20) {
            method99((byte) 111);
        }
        if (arg0.field382 != null) {
            arg0.method121(false);
        }
        arg0.field382 = this.field341.field382;
        field358++;
        arg0.field369 = this.field341;
        arg0.field382.field369 = arg0;
        arg0.field369.field382 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BLcb;)V")
    public final void method109(byte arg0, class17 arg1) {
        if (arg1.field382 != null) {
            arg1.method121(false);
        }
        field352++;
        arg1.field382 = this.field341;
        if (arg0 < 41) {
            method99((byte) -68);
        }
        arg1.field369 = this.field341.field369;
        arg1.field382.field369 = arg1;
        arg1.field369.field382 = arg1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Z)V")
    public static final void method110(boolean arg0) {
        if (!arg0) {
            return;
        }
        field338++;
        for (int var1 = 0; var1 < class77.field1940; var1++) {
            int var2 = class87.field2146[var1];
            class103 var3 = class69.field1673[var2];
            if (var3 != null) {
                class76.method651(var3.field2510.field3367, true, var3);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(B)V")
    public static final void method111(byte arg0) {
        class70.field1700 = 0;
        field333++;
        int var1 = (class40.field925.field3549 >> 7) + class95.field2359;
        int var2 = (class40.field925.field3535 >> 7) + class10.field159;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class70.field1700 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class70.field1700 = 1;
        }
        if (arg0 > 63 && (class70.field1700 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062)) {
            class70.field1700 = 0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
    public static final boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class129.field3111[var12][var36] = 0;
                class47.field1019[var12][var36] = 99999999;
            }
        }
        field335++;
        int var13 = arg0;
        class129.field3111[arg0][arg2] = 99;
        class47.field1019[arg0][arg2] = 0;
        byte var14 = 0;
        int var15 = arg2;
        int var16 = 0;
        boolean var17 = false;
        class123.field2988[var14] = arg0;
        int var37 = var14 + 1;
        class110.field2655[var14] = arg2;
        int[][] var18 = class65.field1603[class13.field251].field1591;
        int var19 = class123.field2988.length;
        while (var37 != var16) {
            var15 = class110.field2655[var16];
            var13 = class123.field2988[var16];
            var16 = (var16 + 1) % var19;
            if (arg5 == var13 && arg10 == var15) {
                var17 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class65.field1603[class13.field251].method580(arg5, arg3, var15, arg9 - 1, (byte) -64, arg10, var13)) {
                    var17 = true;
                    break;
                }
                if (arg9 < 10 && class65.field1603[class13.field251].method595(0, arg3, arg10, var15, var13, arg5, arg9 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg8 != 0 && arg1 != 0 && class65.field1603[class13.field251].method590(arg5, arg10, arg1, var15, arg8, arg4, 32, var13)) {
                var17 = true;
                break;
            }
            int var35 = class47.field1019[var13][var15] + 1;
            if (var13 > 0 && class129.field3111[var13 - 1][var15] == 0 && (var18[var13 - 1][var15] & 0x1280108) == 0) {
                class123.field2988[var37] = var13 - 1;
                class110.field2655[var37] = var15;
                class129.field3111[var13 - 1][var15] = 2;
                var37 = (var37 + 1) % var19;
                class47.field1019[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class129.field3111[var13 + 1][var15] == 0 && (var18[var13 + 1][var15] & 0x1280180) == 0) {
                class123.field2988[var37] = var13 + 1;
                class110.field2655[var37] = var15;
                var37 = (var37 + 1) % var19;
                class129.field3111[var13 + 1][var15] = 8;
                class47.field1019[var13 + 1][var15] = var35;
            }
            if (var15 > 0 && class129.field3111[var13][var15 - 1] == 0 && (var18[var13][var15 - 1] & 0x1280102) == 0) {
                class123.field2988[var37] = var13;
                class110.field2655[var37] = var15 - 1;
                var37 = (var37 + 1) % var19;
                class129.field3111[var13][var15 - 1] = 1;
                class47.field1019[var13][var15 - 1] = var35;
            }
            if (var15 < 103 && class129.field3111[var13][var15 + 1] == 0 && (var18[var13][var15 + 1] & 0x1280120) == 0) {
                class123.field2988[var37] = var13;
                class110.field2655[var37] = var15 + 1;
                class129.field3111[var13][var15 + 1] = 4;
                var37 = (var37 + 1) % var19;
                class47.field1019[var13][var15 + 1] = var35;
            }
            if (var13 > 0 && var15 > 0 && class129.field3111[var13 - 1][var15 - 1] == 0 && (var18[var13 - 1][var15 - 1] & 0x128010E) == 0 && (var18[var13 - 1][var15] & 0x1280108) == 0 && (var18[var13][var15 - 1] & 0x1280102) == 0) {
                class123.field2988[var37] = var13 - 1;
                class110.field2655[var37] = var15 - 1;
                class129.field3111[var13 - 1][var15 - 1] = 3;
                class47.field1019[var13 - 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var19;
            }
            if (var13 < 103 && var15 > 0 && class129.field3111[var13 + 1][var15 - 1] == 0 && (var18[var13 + 1][var15 - 1] & 0x1280183) == 0 && (var18[var13 + 1][var15] & 0x1280180) == 0 && (var18[var13][var15 - 1] & 0x1280102) == 0) {
                class123.field2988[var37] = var13 + 1;
                class110.field2655[var37] = var15 - 1;
                var37 = (var37 + 1) % var19;
                class129.field3111[var13 + 1][var15 - 1] = 9;
                class47.field1019[var13 + 1][var15 - 1] = var35;
            }
            if (var13 > 0 && var15 < 103 && class129.field3111[var13 - 1][var15 + 1] == 0 && (var18[var13 - 1][var15 + 1] & 0x1280138) == 0 && (var18[var13 - 1][var15] & 0x1280108) == 0 && (var18[var13][var15 + 1] & 0x1280120) == 0) {
                class123.field2988[var37] = var13 - 1;
                class110.field2655[var37] = var15 + 1;
                class129.field3111[var13 - 1][var15 + 1] = 6;
                var37 = (var37 + 1) % var19;
                class47.field1019[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class129.field3111[var13 + 1][var15 + 1] == 0 && (var18[var13 + 1][var15 + 1] & 0x12801E0) == 0 && (var18[var13 + 1][var15] & 0x1280180) == 0 && (var18[var13][var15 + 1] & 0x1280120) == 0) {
                class123.field2988[var37] = var13 + 1;
                class110.field2655[var37] = var15 + 1;
                class129.field3111[var13 + 1][var15 + 1] = 12;
                class47.field1019[var13 + 1][var15 + 1] = var35;
                var37 = (var37 + 1) % var19;
            }
        }
        class88.field2198 = 0;
        if (!var17) {
            if (!arg11) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg5 - var22; var23 <= arg5 + var22; var23++) {
                for (int var24 = arg10 - var22; var24 <= arg10 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class47.field1019[var23][var24] < 100) {
                        int var25 = 0;
                        if (var23 < arg5) {
                            var25 = arg5 - var23;
                        } else if (arg8 + arg5 - 1 < var23) {
                            var25 = var23 + 1 - arg5 - arg8;
                        }
                        int var26 = 0;
                        if (arg10 > var24) {
                            var26 = arg10 - var24;
                        } else if (var24 > arg10 + arg1 - 1) {
                            var26 = var24 + 1 - arg10 - arg1;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && var21 > class47.field1019[var23][var24]) {
                            var13 = var23;
                            var15 = var24;
                            var20 = var27;
                            var21 = class47.field1019[var23][var24];
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg0 == var13 && arg2 == var15) {
                return false;
            }
            class88.field2198 = 1;
        }
        byte var28 = 0;
        class123.field2988[var28] = var13;
        int var38 = var28 + 1;
        class110.field2655[var28] = var15;
        int var29;
        int var30 = var29 = class129.field3111[var13][var15];
        if (arg6 != 32689) {
            field348 = null;
        }
        while (arg0 != var13 || arg2 != var15) {
            if (var29 != var30) {
                var29 = var30;
                class123.field2988[var38] = var13;
                class110.field2655[var38++] = var15;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            var30 = class129.field3111[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class110.field2655[var38];
            int var33 = class123.field2988[var38];
            if (arg7 == 0) {
                class80.field1978.method769((byte) 41, 196);
                class131.field3130++;
                class80.field1978.method393(var31 + var31 + 3, -17343);
            }
            if (arg7 == 1) {
                class80.field1978.method769((byte) 18, 234);
                class86.field2124++;
                class80.field1978.method393(var31 + var31 + 3 + 14, -17343);
            }
            if (arg7 == 2) {
                class80.field1978.method769((byte) -2, 96);
                class117.field2792++;
                class80.field1978.method393(var31 + var31 + 3, -17343);
            }
            class80.field1978.method396(class11.field198[82] ? 1 : 0, (byte) 45);
            class80.field1978.method420(class10.field159 + var32, arg6 + -868235465);
            class80.field1978.method395((byte) -57, class95.field2359 + var33);
            class1.field15 = class123.field2988[0];
            class40.field919 = class110.field2655[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class80.field1978.method390(arg6 ^ 0xFFFFC5E8, class123.field2988[var38] - var33);
                class80.field1978.method390(-17831, class110.field2655[var38] - var32);
            }
            return true;
        } else if (arg7 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)Lcb;")
    public final class17 method113(int arg0) {
        class17 var2 = this.field355;
        field361++;
        if (arg0 != 28480) {
            method112(126, -37, -49, 11, 21, 83, -71, -37, 1, -29, -88, false);
        }
        if (this.field341 == var2) {
            this.field355 = null;
            return null;
        } else {
            this.field355 = var2.field382;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class16() {
        this.field341.field382 = this.field341;
        this.field341.field369 = this.field341;
    }
}
