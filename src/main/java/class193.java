import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class193 extends class248 {

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "Ljava/lang/Object;")
    private Object field3283;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static volatile int field3276 = 0;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "J")
    public static long field3275 = 0L;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "Lub;")
    public static class227 field3278 = class257.method1749("(U1", 17263);

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "Lub;")
    private static class227 field3292 = class257.method1749("Loading textures )2 ", 17263);

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "Lub;")
    public static class227 field3289 = field3292;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "[I")
    public static int[] field3284 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
    public static int field3294 = 127;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "Lrb;")
    public static class254 field3290 = new class254(50);

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    public static int field3296 = 0;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public static int field3295 = 0;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "Lub;")
    public static class227 field3297 = class257.method1749("Wordpack geladen)3", 17263);

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "Lnj;")
    public static class226 field3291;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static final void method1225(int arg0) {
        if (arg0 != -636686418) {
            method1225(8);
        }
        field3286++;
        int var1 = class21.field381.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class21.field381[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class80.field1391; var4++) {
                    if (class88.field1532[var4] == class177.field2976[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class88.field1532[class80.field1391] = class177.field2976[var2];
                    var3 = class80.field1391++;
                }
                int var5 = 0;
                class226 var6 = new class226(class21.field381[var2]);
                while (class21.field381[var2].length > var6.field3879 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1447(0);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FE1) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class177.field2976[var2] & 0xFF) * 64 + var11 - class78.field1367;
                    int var13 = (class177.field2976[var2] >> 8) * 64 - (class192.field3267 - var10);
                    class147 var14 = class59.method362(-32544, var6.method1447(0));
                    if (class220.field3715[var7] == null && (var14.field2559 & 0x1) > 0 && class14.field269 == var9 && var13 >= 0 && (var14.field2542 + var13) < 104 && var12 >= 0 && (var14.field2542 + var12) < 104) {
                        class220.field3715[var7] = new class195();
                        class195 var15 = class220.field3715[var7];
                        class146.field2517[class71.field1254++] = var7;
                        var15.field3315 = var14;
                        var15.field73 = class253.field4393;
                        var15.field67 = var15.field3315.field2540;
                        var15.field63 = var15.field3315.field2523;
                        var15.field64 = var15.field3315.field2547;
                        var15.field105 = var15.field3315.field2577;
                        var15.field100 = var15.field3315.field2557;
                        var15.field81 = var15.field3315.field2531;
                        var15.field61 = var15.field3315.field2567;
                        if (var15.field81 == 0) {
                            var15.field106 = 0;
                        }
                        var15.field45 = var15.field3315.field2542;
                        var15.field55 = var15.field3315.field2561;
                        var15.method18(var12, var13, true, 74);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lub;I)V")
    public static final void method1226(class227 arg0, int arg1) {
        class9.field167 = arg0;
        field3287++;
        if (class61.field1123.field4153 == null) {
            return;
        }
        try {
            class227 var2 = class254.field4470.method1513(class61.field1123.field4153, arg1 - 96);
            class227 var3 = class100.field1754.method1513(class61.field1123.field4153, -98);
            class227 var4 = class76.method445((byte) 102, new class227[] { var2, class31.field494, arg0, class9.field174, var3 });
            class227 var5;
            if (arg0.method1521((byte) 45) == 0) {
                var5 = class76.method445((byte) 103, new class227[] { var4, class192.field3269 });
            } else {
                var5 = class76.method445((byte) -123, new class227[] { var4, class119.field2163, class245.method1637(class12.method57(-99) + 94608000000L, (byte) 47), class124.field2221, class237.method1582((byte) -128, 94608000L) });
            }
            class76.method445((byte) -123, new class227[] { class221.field3749, var5, class54.field939 }).method1520(false, class61.field1123.field4153);
        } catch (Throwable var6) {
        }
        if (arg1 != -2) {
            field3284 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZII)I")
    public static final int method1227(int arg0, boolean arg1, int arg2, int arg3) {
        field3282++;
        int var4 = arg0 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        if (!arg1) {
            method1225(79);
        }
        int var6 = arg2;
        if (arg2 < 3 && (class40.field654[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var7 = arg0 & 0x7F;
        int var8 = arg3 & 0x7F;
        int var9 = (128 - var7) * class98.field1717[var6][var4][var5] + class98.field1717[var6][var4 + 1][var5] * var7 >> 7;
        int var10 = (128 - var7) * class98.field1717[var6][var4][var5 + 1] + class98.field1717[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var8) * var9 + var8 * var10 >> 7;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method667(byte arg0) {
        field3277++;
        if (arg0 != 85) {
            method1226((class227) null, -33);
        }
        return this.field3283;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)Lge;")
    public static final class200 method1228(int arg0, int arg1) {
        field3285++;
        class200 var2 = (class200) class199.field3415.method1037(103, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class128.field2254.method884(0, -59, arg0);
        if (var3 == null) {
            return null;
        }
        class200 var4 = new class200();
        class226 var5 = new class226(var3);
        var5.field3879 = var5.field3901.length - 2;
        int var6 = var5.method1447(0);
        int var7 = var5.field3901.length - var6 - 2 - 12;
        var5.field3879 = var7;
        int var8 = var5.method1478(-32053);
        var4.field3427 = var5.method1447(0);
        var4.field3428 = var5.method1447(0);
        if (arg1 < 99) {
            return null;
        }
        var4.field3440 = var5.method1447(0);
        var4.field3426 = var5.method1447(0);
        int var9 = var5.method1471(255);
        if (var9 > 0) {
            var4.field3424 = new class201[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1447(0);
                class201 var12 = new class201(class45.method239(var11, false));
                var4.field3424[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1478(-32053);
                    int var14 = var5.method1478(-32053);
                    var12.method1300(new class216(var14), (long) var13, -2875);
                }
            }
        }
        int var15 = 0;
        var5.field3879 = 0;
        var4.field3429 = var5.method1448(98);
        var4.field3435 = new int[var8];
        var4.field3421 = new int[var8];
        var4.field3431 = new class227[var8];
        while (var5.field3879 < var7) {
            int var16 = var5.method1447(0);
            if (var16 == 3) {
                var4.field3431[var15] = var5.method1480(-117);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field3421[var15] = var5.method1471(255);
            } else {
                var4.field3421[var15] = var5.method1478(-32053);
            }
            var4.field3435[var15++] = var16;
        }
        class199.field3415.method1032(-810, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static final void method1229(int arg0) {
        field3279++;
        if (arg0 != 1179390311) {
            field3296 = -16;
        }
        class7.field150.method1723(-4173);
        class96.field1681.method1723(arg0 ^ 0xB9B3FED4);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)Z")
    public final boolean method668(boolean arg0) {
        field3281++;
        return arg0;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class193(Object arg0) {
        this.field3283 = arg0;
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(B)V")
    public static void method1230(byte arg0) {
        field3290 = null;
        field3297 = null;
        field3278 = null;
        if (arg0 >= 15) {
            field3289 = null;
            field3291 = null;
            field3292 = null;
            field3284 = null;
        }
    }
}
