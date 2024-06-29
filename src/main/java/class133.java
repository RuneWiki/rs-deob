import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class133 {

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Lmb;")
    private static class132 field2494 = class166.method1092("Mar", 111);

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lmb;")
    private static class132 field2492 = class166.method1092("Jul", 111);

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lmb;")
    private static class132 field2491 = class166.method1092("Aug", 121);

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lmb;")
    private static class132 field2495 = class166.method1092("Jan", 127);

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Lmb;")
    public static class132 field2501 = class166.method1092("60 Sekunden noch einmal)3)3)3", 112);

    @OriginalMember(owner = "client!mc", name = "t", descriptor = "Lmb;")
    private static class132 field2508 = class166.method1092("Feb", 125);

    @OriginalMember(owner = "client!mc", name = "s", descriptor = "Lmb;")
    private static class132 field2507 = class166.method1092("Dec", 113);

    @OriginalMember(owner = "client!mc", name = "r", descriptor = "Lmb;")
    private static class132 field2506 = class166.method1092("Invalid username or password)3", 112);

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "Lmb;")
    public static class132 field2504 = class166.method1092("http:)4)4", 124);

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "Lmb;")
    private static class132 field2496 = class166.method1092("Sep", 114);

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "Lmb;")
    public static class132 field2498 = class166.method1092("sl_flags", 112);

    @OriginalMember(owner = "client!mc", name = "u", descriptor = "Lmb;")
    public static class132 field2509 = class166.method1092("p11_full", 119);

    @OriginalMember(owner = "client!mc", name = "v", descriptor = "Lmb;")
    private static class132 field2510 = class166.method1092("Jun", 120);

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lmb;")
    public static class132 field2503 = field2506;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Lmb;")
    public static class132 field2502 = null;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "Lmb;")
    private static class132 field2490 = class166.method1092("Apr", 125);

    @OriginalMember(owner = "client!mc", name = "w", descriptor = "Lmb;")
    private static class132 field2511 = class166.method1092("May", 117);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "Lmb;")
    private static class132 field2489 = class166.method1092("Oct", 115);

    @OriginalMember(owner = "client!mc", name = "y", descriptor = "Lmb;")
    private static class132 field2513 = class166.method1092("Nov", 125);

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "[Lmb;")
    public static class132[] field2505 = new class132[] { field2495, field2508, field2494, field2490, field2511, field2510, field2492, field2491, field2496, field2489, field2513, field2507 };

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!mc", name = "x", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method908(int arg0) {
        if (arg0 != 23916) {
            field2503 = null;
        }
        field2497++;
        for (int var1 = 0; var1 < class131.field2423; var1++) {
            int var2 = class226.field4098[var1];
            class65 var3 = class11.field145[var2];
            if (var3 != null) {
                class222.method1392(var3, var3.field1072.field3422, -1);
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmf;IIIII)V")
    public static final void method909(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class231.field4167 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class225.field4079) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class14.field193 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class169 var14 = class101.field1900[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class78.field1364[var11][var12 + 1][var13] + class78.field1364[var11][var12][var13] + class78.field1364[var11][var12][var13 + 1] + class78.field1364[var11][var12 + 1][var13 + 1]) / 4 - (class78.field1364[arg1][arg2 + 1][arg3] + class78.field1364[arg1][arg2][arg3] + class78.field1364[arg1][arg2][arg3 + 1] + class78.field1364[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class186 var16 = var14.field3098;
                                    if (var16 != null) {
                                        if (var16.field3440.method467()) {
                                            arg0.method463(var16.field3440, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3449 != null && var16.field3449.method467()) {
                                            arg0.method463(var16.field3449, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3096; var17++) {
                                        class78 var18 = var14.field3103[var17];
                                        if (var18 != null && var18.field1363.method467() && (var18.field1353 == var12 || var7 == var12) && (var18.field1362 == var13 || var9 == var13)) {
                                            int var19 = var18.field1358 + 1 - var18.field1353;
                                            int var20 = var18.field1360 + 1 - var18.field1362;
                                            arg0.method463(var18.field1363, (var18.field1353 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1362 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method910(byte arg0) {
        field2498 = null;
        field2511 = null;
        field2490 = null;
        field2489 = null;
        field2509 = null;
        field2501 = null;
        field2491 = null;
        if (arg0 != -36) {
            field2513 = null;
        }
        field2504 = null;
        field2506 = null;
        field2492 = null;
        field2513 = null;
        field2507 = null;
        field2502 = null;
        field2505 = null;
        field2508 = null;
        field2503 = null;
        field2510 = null;
        field2494 = null;
        field2495 = null;
        field2496 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmb;B)V")
    public static final void method911(class132 arg0, byte arg1) {
        field2512++;
        if (class189.field3482.field1405 == null) {
            return;
        }
        try {
            class132 var2 = class205.field3752.method866((byte) 5, class189.field3482.field1405);
            class132 var3 = class32.field496.method866((byte) 5, class189.field3482.field1405);
            class132 var4 = class187.method1197(new class132[] { var2, class6.field56, arg0, class174.field3252, var3 }, -93);
            class132 var5;
            if (arg0.method902((byte) -4) == 0) {
                var5 = class187.method1197(new class132[] { var4, class162.field2942 }, -124);
            } else {
                var5 = class187.method1197(new class132[] { var4, class118.field2245, class74.method447(class113.method769(55) + 94608000000L, true), class138.field2593, class43.method294((byte) 88, 94608000L) }, -73);
            }
            class187.method1197(new class132[] { class125.field2318, var5, class57.field957 }, -102).method887(class189.field3482.field1405, 65);
            if (arg1 >= -81) {
                field2506 = null;
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
    public static final void method912(int arg0) {
        class153.field2795.method39((byte) -18);
        field2493++;
        for (int var1 = 0; var1 < 32; var1++) {
            class108.field2047[var1] = 0L;
        }
        for (int var2 = arg0; var2 < 32; var2++) {
            class208.field3787[var2] = 0L;
        }
        class34.field552 = 0;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIZI)V")
    public static final void method913(int arg0, int arg1, boolean arg2, int arg3) {
        field2499++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class145.field2697 = arg1;
        int var4 = 94 % ((arg0 + 33) / 33);
        class96.field1728 = arg3;
        client.field533 = arg2;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(BLjava/util/Random;I)I")
    public static final int method914(byte arg0, Random arg1, int arg2) {
        field2500++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class150.method992((byte) 108, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            if (arg0 != 53) {
                field2507 = null;
            }
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var3 <= var4);
            return class116.method781(-79, arg2, var4);
        }
    }
}
