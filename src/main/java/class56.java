import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public abstract class class56 extends class5 {

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "Lhj;")
    private static class69 field997 = class181.method1318("Sep", (byte) -108);

    @OriginalMember(owner = "client!qb", name = "U", descriptor = "Lhj;")
    public static class69 field1012 = class181.method1318("null", (byte) -112);

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Lhj;")
    private static class69 field1002 = class181.method1318("Mar", (byte) -113);

    @OriginalMember(owner = "client!qb", name = "cb", descriptor = "I")
    public static int field1020 = 0;

    @OriginalMember(owner = "client!qb", name = "Z", descriptor = "Lhj;")
    private static class69 field1017 = class181.method1318("Feb", (byte) -121);

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "Lhj;")
    private static class69 field1003 = class181.method1318("Apr", (byte) -115);

    @OriginalMember(owner = "client!qb", name = "db", descriptor = "Lhj;")
    private static class69 field1021 = class181.method1318("Nov", (byte) -119);

    @OriginalMember(owner = "client!qb", name = "Y", descriptor = "I")
    public static volatile int field1016 = 0;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Lhj;")
    private static class69 field1001 = class181.method1318("Jan", (byte) -112);

    @OriginalMember(owner = "client!qb", name = "V", descriptor = "Lhj;")
    private static class69 field1013 = class181.method1318("Aug", (byte) -126);

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Lhj;")
    private static class69 field1004 = class181.method1318("Jul", (byte) -111);

    @OriginalMember(owner = "client!qb", name = "X", descriptor = "Lhj;")
    private static class69 field1015 = class181.method1318("May", (byte) -117);

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "Lhj;")
    private static class69 field1005 = class181.method1318("Jun", (byte) -111);

    @OriginalMember(owner = "client!qb", name = "fb", descriptor = "Lhj;")
    private static class69 field1023 = class181.method1318("Dec", (byte) -121);

    @OriginalMember(owner = "client!qb", name = "hb", descriptor = "Lhj;")
    private static class69 field1025 = class181.method1318("Oct", (byte) -115);

    @OriginalMember(owner = "client!qb", name = "gb", descriptor = "[Lhj;")
    public static class69[] field1024 = new class69[] { field1001, field1017, field1002, field1003, field1015, field1005, field1004, field1013, field997, field1025, field1021, field1023 };

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!qb", name = "W", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!qb", name = "ab", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!qb", name = "bb", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!qb", name = "eb", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
    public int field996;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public int field998;

    @OriginalMember(owner = "client!qb", name = "G", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
    public abstract void method332(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)V")
    public abstract void method333(int arg0, int arg1);

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)Lqk;")
    public static final class200 method334(int arg0, int arg1) {
        field1018++;
        if (arg1 >= -21) {
            field1005 = null;
        }
        class200 var2 = (class200) class265.field4712.method1448((long) arg0, (byte) -40);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class147.field2723.method590(0, arg0, 0);
        if (var3 == null) {
            return null;
        }
        class200 var4 = new class200();
        class128 var5 = new class128(var3);
        var5.field2379 = var5.field2385.length - 2;
        int var6 = var5.method912(92);
        int var7 = var5.field2385.length - var6 - 2 - 12;
        var5.field2379 = var7;
        int var8 = var5.method923(true);
        var4.field3620 = var5.method912(100);
        var4.field3611 = var5.method912(52);
        var4.field3617 = var5.method912(-128);
        var4.field3621 = var5.method912(49);
        int var9 = var5.method937(false);
        if (var9 > 0) {
            var4.field3612 = new class103[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method912(-127);
                class103 var12 = new class103(class127.method903(90, var11));
                var4.field3612[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method923(true);
                    int var14 = var5.method923(true);
                    var12.method761((long) var13, 0, new class3(var14));
                }
            }
        }
        var5.field2379 = 0;
        var4.field3610 = var5.method925((byte) -51);
        var4.field3608 = new int[var8];
        var4.field3616 = new class69[var8];
        int var15 = 0;
        var4.field3609 = new int[var8];
        while (var5.field2379 < var7) {
            int var16 = var5.method912(62);
            if (var16 == 3) {
                var4.field3616[var15] = var5.method963(false);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3608[var15] = var5.method937(false);
            } else {
                var4.field3608[var15] = var5.method923(true);
            }
            var4.field3609[var15++] = var16;
        }
        class265.field4712.method1453(0, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIII)V")
    public abstract void method335(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Ltk;B)Z")
    public static final boolean method336(class50 arg0, byte arg1) {
        field1007++;
        if (arg0.field828 == 205) {
            class123.field2288 = 250;
            return true;
        } else if (arg1 == 17) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIIII)V")
    public static final void method337(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1008++;
        if (class131.method971(arg7, (byte) 106)) {
            class118.field2233 = null;
            int var10 = 87 / ((-arg0 - 77) / 38);
            class101.method748(arg3, arg1, arg5, class116.field2222[arg7], arg6, -1, arg4, 1, arg8, arg2);
            if (class118.field2233 != null) {
                class101.method748(class232.field4237, arg1, class100.field1881, class118.field2233, arg6, -1412584499, arg4, 1, arg8, arg2);
                class118.field2233 = null;
            }
        } else if (arg2 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class40.field576[var9] = true;
            }
        } else {
            class40.field576[arg2] = true;
        }
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
    public static void method338(int arg0) {
        field1013 = null;
        field1024 = null;
        field1005 = null;
        field1015 = null;
        if (arg0 != 1) {
            method346(86, 13, 68, true, -109, -69, -56, 79);
        }
        field1025 = null;
        field1017 = null;
        field1001 = null;
        field1002 = null;
        field1021 = null;
        field1023 = null;
        field1004 = null;
        field1012 = null;
        field997 = null;
        field1003 = null;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(IIII)V")
    public abstract void method339(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
    public abstract void method340(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)V")
    public abstract void method341(int arg0, int arg1);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)Lfh;")
    public static final class128 method342(byte arg0) {
        field1022++;
        class128 var1 = new class128(24);
        var1.method933(3, -20946);
        var1.method933(class10.field88, -20946);
        var1.method933(class151.field2790 ? 1 : 0, arg0 ^ 0x51BD);
        var1.method933(class45.field649 ? 1 : 0, -20946);
        var1.method933(class64.field1246 ? 1 : 0, -20946);
        var1.method933(class57.field1030 ? 1 : 0, -20946);
        var1.method933(class119.field2249 ? 1 : 0, arg0 - 20837);
        var1.method933(class222.field4033 ? 1 : 0, -20946);
        var1.method933(class9.field63 ? 1 : 0, -20946);
        var1.method933(class233.field4261 ? 1 : 0, -20946);
        var1.method933(class191.field3461, -20946);
        var1.method933(class91.field1712 ? 1 : 0, -20946);
        var1.method933(class133.field2476 ? 1 : 0, -20946);
        var1.method933(class250.field4537 ? 1 : 0, -20946);
        var1.method933(class44.field627, -20946);
        var1.method933(class95.field1784 ? 1 : 0, -20946);
        var1.method933(class91.field1726, -20946);
        var1.method933(class81.field1554, -20946);
        if (arg0 != -109) {
            return null;
        }
        var1.method933(class11.field105, arg0 - 20837);
        var1.method943((byte) 127, class23.field334);
        var1.method943((byte) 127, class98.field1852);
        var1.method933(class144.field2679 ? 1 : 0, -20946);
        return var1;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIII)V")
    public abstract void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIBII)V")
    public final void method344(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1000++;
        int var6 = this.field1009 << 3;
        int var7 = (arg4 << 4) + (var6 & 0xF);
        int var8 = -38 % ((27 - arg2) / 42);
        int var9 = this.field1014 << 3;
        int var10 = (arg1 << 4) + (var9 & 0xF);
        this.method343(var6, var9, var7, var10, arg0, arg3);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBI)V")
    public static final void method345(int arg0, byte arg1, int arg2) {
        field1011++;
        if (class177.field3218 < 2 && class144.field2680 == 0 && !class65.field1254) {
            return;
        }
        class69 var3;
        if (class144.field2680 == 1 && class177.field3218 < 2) {
            var3 = class9.method42(93, new class69[] { class228.field4165, class104.field1939, class223.field4072, class51.field899 });
        } else if (class65.field1254 && class177.field3218 < 2) {
            var3 = class9.method42(-111, new class69[] { class200.field3624, class104.field1939, class66.field1279, class51.field899 });
        } else {
            var3 = class224.method1589(false, class177.field3218 - 1);
        }
        if (class177.field3218 > 2) {
            var3 = class9.method42(50, new class69[] { var3, class170.field3117, class98.method727(-229, class177.field3218 - 2), class4.field26 });
        }
        int var4 = class26.field378.method1604(var3, arg2 + 4, arg0 - -15, 16777215, 0, class32.field439, class110.field2102);
        class224.method1588(15, (byte) 59, arg0, arg2 + 4, class26.field378.method1606(var3) - -var4);
        if (arg1 <= 121) {
            method346(52, 42, -106, false, -88, 56, -30, 22);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIZIIII)V")
    public static final void method346(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field1019++;
        if (arg7 < 128 || arg4 < 128 || arg7 > 13056 || arg4 > 13056) {
            class236.field4296 = -1;
            class228.field4146 = -1;
            return;
        }
        int var8 = class156.method1179(arg7, arg4, 90, class52.field927) - arg1;
        int var9 = var8 - class31.field427;
        int var10 = arg4 - class123.field2291;
        int var11 = class178.field3247[class148.field2753];
        int var12 = class178.field3232[class148.field2753];
        int var13 = class178.field3247[class162.field3006];
        int var14 = arg7 - class127.field2327;
        int var15 = class178.field3232[class162.field3006];
        int var16 = var10 * var13 + (var14 * var15) >> 16;
        if (!arg3) {
            return;
        }
        int var17 = var10 * var15 - (var13 * var14) >> 16;
        int var19 = var9 * var12 - var11 * var17 >> 16;
        int var20 = var9 * var11 + var12 * var17 >> 16;
        if (var20 < 50) {
            class236.field4296 = -1;
            class228.field4146 = -1;
        } else {
            class236.field4296 = (var19 << 9) / var20 + arg5;
            class228.field4146 = (var16 << 9) / var20 + arg0;
        }
    }
}
