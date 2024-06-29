import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class117 {

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public int field2564 = 0;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public int field2559 = 0;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "Lo;")
    public static class84 field2551 = class15.method124("Fps:", 255);

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Z")
    public static boolean[] field2546 = new boolean[5];

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lnb;")
    public static class80 field2547 = null;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "[Lne;")
    public static class83[] field2555 = new class83[4];

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Lo;")
    public static class84 field2556 = class15.method124(" is already on your friend list", 255);

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "Lo;")
    private static class84 field2549 = class15.method124("Loading)3)3)3 ", 255);

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lo;")
    public static class84 field2545 = class15.method124("Loading )2 please wait)3", 255);

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lo;")
    public static class84 field2557 = class15.method124("@cya@", 255);

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "Lo;")
    public static class84 field2562 = class15.method124("Jan", 255);

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "J")
    public static long field2570 = 0L;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "[I")
    public static int[] field2552 = new int[2048];

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field2568 = 0;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lo;")
    public static class84 field2571 = field2549;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "Lo;")
    public static class84 field2572 = class15.method124("(U4", 255);

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    public static int field2569 = 127;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public int field2544;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public int field2550;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public int field2558;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "Ljd;")
    public class58 field2548;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Ljd;")
    public class58 field2565;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "Lp;")
    public static class89 field2567;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIZIIIII)V", line = 11)
    public static final void method895(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2561++;
        if (arg1 >= 1 && arg3 >= 1 && arg1 <= 102 && arg3 <= 102) {
            if (class1.field23 && class1.field11 != arg5) {
                return;
            }
            int var8 = 0;
            boolean var9 = true;
            if (arg0 == 0) {
                var8 = class112.field2427.method845(arg5, arg1, arg3);
            }
            boolean var10 = false;
            if (arg0 == 1) {
                var8 = class112.field2427.method805(arg5, arg1, arg3);
            }
            if (arg0 == 2) {
                var8 = class112.field2427.method815(arg5, arg1, arg3);
            }
            boolean var11 = false;
            if (arg0 == 3) {
                var8 = class112.field2427.method844(arg5, arg1, arg3);
            }
            if (var8 != 0) {
                int var12 = var8 >> 14 & 0x7FFF;
                int var13 = class112.field2427.method835(arg5, arg1, arg3, var8);
                int var14 = var13 >> 6 & 0x3;
                int var15 = var13 & 0x1F;
                if (arg0 == 0) {
                    class112.field2427.method825(arg5, arg1, arg3);
                    class49 var16 = class110.method856((byte) -107, var12);
                    if (var16.field1021) {
                        class93.field2034[arg5].method299(var15, (byte) -122, var16.field1030, arg3, var14, arg1);
                    }
                }
                if (arg0 == 1) {
                    class112.field2427.method801(arg5, arg1, arg3);
                }
                if (arg0 == 2) {
                    class112.field2427.method809(arg5, arg1, arg3);
                    class49 var17 = class110.method856((byte) -124, var12);
                    if (var17.field1028 + arg1 > 103 || arg3 + var17.field1028 > 103 || var17.field1035 + arg1 > 103 || var17.field1035 + arg3 > 103) {
                        return;
                    }
                    if (var17.field1021) {
                        class93.field2034[arg5].method296(var17.field1028, var17.field1035, var14, var17.field1030, arg1, -1, arg3);
                    }
                }
                if (arg0 == 3) {
                    class112.field2427.method799(arg5, arg1, arg3);
                    class49 var18 = class110.method856((byte) -125, var12);
                    if (var18.field1021 && var18.field1059 == 1) {
                        class93.field2034[arg5].method304(arg3, arg1, (byte) -32);
                    }
                }
            }
            if (arg6 >= 0) {
                int var19 = arg5;
                if (arg5 < 3 && (class73.field1544[1][arg1][arg3] & 0x2) == 2) {
                    var19 = arg5 + 1;
                }
                class60.method480(var19, arg3, arg4, class93.field2034[arg5], arg6, class112.field2427, (byte) 79, arg7, arg5, arg1);
            }
        }
        if (arg2) {
            field2566 = -31;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V", line = 117)
    public static final void method896(byte arg0) {
        while (true) {
            if (class65.field1405.method985(true, class39.field794) >= 11) {
                int var1 = class65.field1405.method986(-73, 11);
                if (var1 != 2047) {
                    if (class119.field2643[var1] == null) {
                        class119.field2643[var1] = new class63();
                        if (class69.field1474[var1] != null) {
                            class119.field2643[var1].method492(class69.field1474[var1], -10496);
                        }
                    }
                    class85.field1949[class107.field2257++] = var1;
                    class63 var2 = class119.field2643[var1];
                    var2.field1379 = class128.field2837;
                    int var3 = class65.field1405.method986(-111, 5);
                    if (var3 > 15) {
                        var3 -= 32;
                    }
                    int var4 = class65.field1405.method986(-60, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class65.field1405.method986(-77, 1);
                    if (var5 == 1) {
                        field2552[class62.field1290++] = var1;
                    }
                    int var6 = class65.field1405.method986(83, 1);
                    var2.method507(var6 == 1, class107.field2271.field1436[0] + var3, (byte) 113, class107.field2271.field1374[0] + var4);
                    continue;
                }
            }
            class65.field1405.method982((byte) 43);
            field2560++;
            int var7 = 120 / ((arg0 - 54) / 44);
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)Lic;", line = 192)
    public static final class51 method897(byte arg0, int arg1) {
        field2563++;
        class51 var2 = (class51) class54.field1120.method737((long) arg1, (byte) -72);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class33.field663.method909((byte) -122, arg1, 16);
        class51 var4 = new class51();
        if (var3 != null) {
            var4.method442(new class27(var3), false);
        }
        int var5 = 69 / ((arg0 - 56) / 62);
        class54.field1120.method744(-121, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 257)
    public static void method898(int arg0) {
        field2552 = null;
        field2551 = null;
        field2562 = null;
        field2545 = null;
        field2549 = null;
        field2555 = null;
        if (arg0 <= 125) {
            field2572 = null;
        }
        field2571 = null;
        field2572 = null;
        field2546 = null;
        field2556 = null;
        field2567 = null;
        field2557 = null;
    }
}
