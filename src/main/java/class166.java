import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class166 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lhd;")
    public class128 field2352 = new class128();

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2353 = null;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2359 = "cyan:";

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "Ljava/lang/String;")
    public static String field2369 = "Prepared sound engine";

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field2356;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lhd;")
    private class128 field2358;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[Lbf;")
    public static class108[] field2357;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1055(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2356++;
        for (int var5 = 0; var5 < class261.field4206; var5++) {
            if (class78.field1092[var5] + class112.field1611[var5] > arg3 && class78.field1092[var5] < (arg3 + arg0) && arg2 < class82.field1135[var5] + class282.field4496[var5] && class82.field1135[var5] < (arg1 + arg2)) {
                class274.field4355[var5] = true;
            }
        }
        if (!arg4) {
            method1060(55, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
    public final int method1056(int arg0) {
        int var2 = 0;
        if (arg0 != 939337164) {
            field2369 = null;
        }
        field2366++;
        class128 var3 = this.field2352.field1789;
        while (this.field2352 != var3) {
            var3 = var3.field1789;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)Lim;")
    public static final class178 method1057(int arg0, int arg1) {
        int var2 = arg1 >> 16;
        int var3 = arg1 & 0xFFFF;
        field2362++;
        if (class262.field4214[var2] == null || class262.field4214[var2][var3] == null) {
            boolean var4 = class311.method2104(82, var2);
            if (!var4) {
                return null;
            }
        }
        int var5 = 31 % ((-arg0 - 29) / 61);
        return class262.field4214[var2][var3];
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method1058(boolean arg0) {
        field2357 = null;
        field2369 = null;
        if (arg0) {
            method1067(58, (class60) null, false);
        }
        field2353 = null;
        field2359 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)Lhd;")
    public final class128 method1059(byte arg0) {
        class128 var2 = this.field2352.field1789;
        field2363++;
        if (arg0 != -106) {
            return null;
        } else if (this.field2352 == var2) {
            this.field2358 = null;
            return null;
        } else {
            this.field2358 = var2.field1789;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)I")
    public static final int method1060(int arg0, boolean arg1) {
        if (!arg1) {
            return -71;
        }
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        field2354++;
        int var3 = arg0 * 6 - 61440;
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public static final void method1061(int arg0) {
        field2370++;
        class278.field4412 = new class222(32);
        int var1 = 51 % ((-arg0 - 63) / 32);
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)I")
    public static final int method1062(byte arg0) {
        if (arg0 >= -120) {
            field2364 = -40;
        }
        field2355++;
        return 14;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(B)Lhd;")
    public final class128 method1063(byte arg0) {
        field2360++;
        class128 var2 = this.field2352.field1789;
        if (this.field2352 == var2) {
            return null;
        }
        if (arg0 >= -57) {
            field2357 = null;
        }
        var2.method819((byte) -12);
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)Lhd;")
    public final class128 method1064(byte arg0) {
        field2351++;
        class128 var2 = this.field2358;
        if (this.field2352 == var2) {
            this.field2358 = null;
            return null;
        } else if (arg0 > -50) {
            return null;
        } else {
            this.field2358 = var2.field1789;
            return var2;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class166() {
        this.field2352.field1789 = this.field2352;
        this.field2352.field1786 = this.field2352;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public final void method1065(int arg0) {
        field2361++;
        while (true) {
            class128 var2 = this.field2352.field1789;
            if (this.field2352 == var2) {
                if (arg0 != 0) {
                    this.method1068((class128) null, (byte) -47);
                }
                this.field2358 = null;
                return;
            }
            var2.method819((byte) -12);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)V")
    public static final void method1066(boolean arg0, byte arg1) {
        field2365++;
        if (arg1 > -30) {
            return;
        }
        byte var2 = 4;
        byte[][] var3 = class117.field1685;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            int var12 = class213.field3218[var5] >> 8;
            byte[] var13 = var3[var5];
            int var14 = class213.field3218[var5] & 0xFF;
            int var15 = var12 * 64 - class228.field3570;
            int var16 = var14 * 64 - class170.field2421;
            if (var13 != null) {
                class8.method45(4087);
                var11 = class159.method988(var15, 97, arg0, class170.field2421, class156.field2153, var13, class228.field3570, var16);
            }
            if (!arg0 && class200.field3045 / 8 == var12 && (class281.field4460 / 8) == var14) {
                if (var11 == null) {
                    class227.field3551 = -1;
                } else {
                    class106.field1516 = var11[2];
                    class227.field3551 = var11[0];
                    class48.field688 = var11[4];
                    class223.field3470 = var11[3];
                    class241.field3786 = var11[1];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class213.field3218[var6] >> 8) * 64 - class228.field3570;
            int var8 = (class213.field3218[var6] & 0xFF) * 64 - class170.field2421;
            byte[] var9 = var3[var6];
            if (var9 == null && class281.field4460 < 800) {
                class8.method45(4087);
                for (int var10 = 0; var10 < var2; var10++) {
                    class303.method2024(104, 64, var10, var7, 64, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILpm;Z)V")
    public static final void method1067(int arg0, class60 arg1, boolean arg2) {
        field2368++;
        int var3 = arg1.field831;
        int var4 = (int) arg1.field2141;
        arg1.method962(arg0 + 124);
        if (arg2) {
            class110.method705(var3, true);
        }
        class290.method1950((byte) -106, var3);
        class178 var5 = method1057(108, var4);
        if (var5 != null) {
            class312.method2108(false, var5);
        }
        if (arg0 != 4) {
            field2357 = null;
        }
        int var6 = class179.field2721;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class100.method643(true, class151.field2101[var7])) {
                class79.method506(-71, var7);
            }
        }
        if (class179.field2721 == 1) {
            class171.field2447 = false;
            method1055(class243.field3815, class227.field3557, class189.field2868, class295.field4707, true);
        } else {
            method1055(class243.field3815, class227.field3557, class189.field2868, class295.field4707, true);
            int var8 = class261.field4201.method230(class24.field386);
            for (int var9 = 0; var9 < class179.field2721; var9++) {
                int var10 = class261.field4201.method230(class45.method291(50, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class243.field3815 = var8 + 8;
            class227.field3557 = class179.field2721 * 15 + (class158.field2193 ? 26 : 22);
        }
        if (class104.field1499 != -1) {
            class68.method451(1, (byte) -107, class104.field1499);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lhd;B)V")
    public final void method1068(class128 arg0, byte arg1) {
        if (arg0.field1786 != null) {
            arg0.method819((byte) -12);
        }
        if (arg1 != -45) {
            return;
        }
        field2367++;
        arg0.field1789 = this.field2352;
        arg0.field1786 = this.field2352.field1786;
        arg0.field1786.field1789 = arg0;
        arg0.field1789.field1786 = arg0;
    }
}
