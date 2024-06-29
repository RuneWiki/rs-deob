import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class215 extends class24 {

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "J")
    public long field3507;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "Ljk;")
    public static class76 field3499 = new class76();

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "[[I")
    public static int[][] field3508 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public static int field3509 = 0;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "Lej;")
    public static class204 field3510 = new class204(64);

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "[S")
    public static short[] field3511 = new short[256];

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "F")
    public static float field3504;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "[I")
    public static int[] field3502;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BJ)V", line = 10)
    public static final void method1488(byte arg0, long arg1) {
        field3506++;
        if (arg1 == 0L) {
            return;
        }
        class19.field218++;
        class249.field4262.method726(145, 2138389379);
        class249.field4262.method1053(arg1, 11247);
        if (arg0 != 68) {
            field3509 = -21;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V", line = 29)
    public static final void method1489(int arg0, int arg1, int arg2) {
        class122.field1891[arg0] = arg1;
        class215 var3 = (class215) class209.field3458.method493((long) arg0, 120);
        field3500++;
        if (arg2 != 69) {
            field3511 = (short[]) null;
        }
        if (var3 == null) {
            class215 var4 = new class215(class194.method1368((byte) 67) + 500L);
            class209.field3458.method490(var4, (long) arg0, true);
        } else {
            var3.field3507 = class194.method1368((byte) -115) + 500L;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILuf;IIZ)V", line = 71)
    public static final void method1490(int arg0, class168 arg1, int arg2, int arg3, boolean arg4) {
        field3505++;
        class242 var5 = class263.method1834(arg3, 2, arg0);
        if (var5 == null) {
            return;
        }
        if (var5.field4102 != null) {
            class182 var6 = new class182();
            var6.field2932 = arg2;
            var6.field2928 = var5;
            var6.field2918 = arg1;
            var6.field2919 = var5.field4102;
            class177.method1270(var6, (byte) -45);
        }
        boolean var7 = arg4;
        if (var5.field4115 > 0) {
            var7 = class291.method1999(var5, 7);
        }
        if (!var7 || !class136.method947(arg2 - 1, (byte) -114, client.method2015(var5))) {
            return;
        }
        if (arg2 == 1) {
            class249.field4262.method726(24, 2138389379);
            class148.field2280++;
            class249.field4262.method1045(arg0, (byte) 49);
            class249.field4262.method1047(-113, arg3);
        }
        if (arg2 == 2) {
            class249.field4262.method726(240, 2138389379);
            class249.field4262.method1045(arg0, (byte) 60);
            class199.field3280++;
            class249.field4262.method1047(-106, arg3);
        }
        if (arg2 == 3) {
            class249.field4262.method726(239, 2138389379);
            class249.field4262.method1045(arg0, (byte) 70);
            class249.field4262.method1047(0, arg3);
            class234.field3764++;
        }
        if (arg2 == 4) {
            class113.field1763++;
            class249.field4262.method726(116, 2138389379);
            class249.field4262.method1045(arg0, (byte) 7);
            class249.field4262.method1047(98, arg3);
        }
        if (arg2 == 5) {
            class79.field1109++;
            class249.field4262.method726(214, 2138389379);
            class249.field4262.method1045(arg0, (byte) 4);
            class249.field4262.method1047(107, arg3);
        }
        if (arg2 == 6) {
            class249.field4262.method726(35, 2138389379);
            class249.field4262.method1045(arg0, (byte) 113);
            class249.field4262.method1047(117, arg3);
            class187.field2974++;
        }
        if (arg2 == 7) {
            class249.field4262.method726(92, 2138389379);
            class268.field4527++;
            class249.field4262.method1045(arg0, (byte) 51);
            class249.field4262.method1047(93, arg3);
        }
        if (arg2 == 8) {
            class15.field154++;
            class249.field4262.method726(181, 2138389379);
            class249.field4262.method1045(arg0, (byte) 3);
            class249.field4262.method1047(-14, arg3);
        }
        if (arg2 == 9) {
            class167.field2682++;
            class249.field4262.method726(198, 2138389379);
            class249.field4262.method1045(arg0, (byte) 42);
            class249.field4262.method1047(-49, arg3);
        }
        if (arg2 == 10) {
            class71.field948++;
            class249.field4262.method726(69, 2138389379);
            class249.field4262.method1045(arg0, (byte) 45);
            class249.field4262.method1047(100, arg3);
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLj;)V", line = 195)
    public static final void method1491(byte arg0, class153 arg1) {
        field3501++;
        int var2 = -8 % ((arg0 + 55) / 38);
        while (true) {
            while (arg1.field2367 < arg1.field2359.length) {
                boolean var3 = false;
                int var4 = 0;
                int var5 = 0;
                if (arg1.method1042((byte) -63) == 1) {
                    var4 = arg1.method1042((byte) -20);
                    var5 = arg1.method1042((byte) 109);
                    var3 = true;
                }
                int var6 = arg1.method1042((byte) 85);
                int var7 = arg1.method1042((byte) -19);
                int var8 = var6 * 64 - class40.field506;
                int var9 = class261.field4420 + class172.field2801 - (var7 * 64) - 1;
                if (var8 >= 0 && var9 - 63 >= 0 && class140.field2161 > (var8 + 63) && var9 < class172.field2801) {
                    int var10 = var8 >> 6;
                    int var11 = var9 >> 6;
                    for (int var12 = 0; var12 < 64; var12++) {
                        for (int var13 = 0; var13 < 64; var13++) {
                            if (!var3 || (var4 * 8) <= var12 && var12 < (var4 * 8 + 8) && var13 >= (var5 * 8) && var13 < var5 * 8 + 8) {
                                byte var14 = arg1.method1078(-6338);
                                if (var14 != 0) {
                                    if (class125.field1931[var10][var11] == null) {
                                        class125.field1931[var10][var11] = new byte[4096];
                                    }
                                    class125.field1931[var10][var11][(63 - var13 << 6) + var12] = var14;
                                    byte var15 = arg1.method1078(-6338);
                                    if (class249.field4254[var10][var11] == null) {
                                        class249.field4254[var10][var11] = new byte[4096];
                                    }
                                    class249.field4254[var10][var11][(63 - var13 << 6) + var12] = var15;
                                }
                            }
                        }
                    }
                } else {
                    for (int var16 = 0; var16 < (var3 ? 64 : 4096); var16++) {
                        byte var17 = arg1.method1078(-6338);
                        if (var17 != 0) {
                            arg1.field2367++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V", line = 292)
    public class215() {
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 299)
    public static void method1492(byte arg0) {
        field3499 = null;
        field3511 = null;
        field3502 = null;
        if (arg0 >= -19) {
            field3503 = 113;
        }
        field3510 = null;
        field3508 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(J)V", line = 327)
    public class215(long arg0) {
        this.field3507 = arg0;
    }
}
