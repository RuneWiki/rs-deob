import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class102 {

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lmb;")
    private static class84 field2493 = class79.method672(true, "Unexpected server response");

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "Lmb;")
    public static class84 field2483 = class79.method672(true, "Okay");

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field2488 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Lmb;")
    public static class84 field2477 = field2493;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "Lr;")
    public static class112 field2490;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Lsd;")
    public static class122 field2494;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Ljf;")
    public class68 field2485;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Ljf;")
    public class68 field2487;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "Ljf;")
    public class68 field2501;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method847(int arg0) {
        field2490 = null;
        field2494 = null;
        field2493 = null;
        field2483 = null;
        field2477 = null;
        if (arg0 != -2) {
            field2493 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILmb;Lsd;Lmb;)[Lr;")
    public static final class112[] method848(int arg0, class84 arg1, class122 arg2, class84 arg3) {
        field2496++;
        int var4 = arg2.method997(49, arg3);
        int var5 = arg2.method1004(false, arg1, var4);
        return arg0 == -1 ? class107.method885(var4, arg2, var5, (byte) -104) : null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILia;)Lmb;")
    public static final class84 method849(int arg0, class57 arg1) {
        field2497++;
        if (class19.method128((byte) -70, class91.method780(-150310624, arg1)) == 0) {
            return null;
        } else if (arg1.field1405 == null || arg1.field1405.method698(-22).method718(51) == 0) {
            return class133.field3164 ? class30.field712 : null;
        } else if (arg0 < 35) {
            return null;
        } else {
            return arg1.field1405;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI[B)I")
    public static final int method850(byte arg0, int arg1, byte[] arg2) {
        field2481++;
        if (arg0 >= -113) {
            field2477 = null;
        }
        return class5.method33(arg1, arg2, 0, false);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lhe;")
    public static final class54 method851(int arg0) {
        if (arg0 < 8) {
            method852(null, (byte) 35);
        }
        field2495++;
        try {
            return (class54) Class.forName("ee").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BB)V")
    public static final void method852(byte[] arg0, byte arg1) {
        field2498++;
        class51 var2 = new class51(arg0);
        var2.field1128 = arg0.length - 2;
        class80.field1989 = var2.method383(-2056200760);
        class134.field3213 = new int[class80.field1989];
        class107.field2599 = new int[class80.field1989];
        class133.field3162 = new int[class80.field1989];
        class125.field3032 = new int[class80.field1989];
        client.field459 = new byte[class80.field1989][];
        var2.field1128 = arg0.length - class80.field1989 * 8 - 7;
        class80.field1991 = var2.method383(-2056200760);
        class58.field1452 = var2.method383(-2056200760);
        int var3 = (var2.method373(25094) & 0xFF) + 1;
        for (int var4 = 0; var4 < class80.field1989; var4++) {
            class107.field2599[var4] = var2.method383(-2056200760);
        }
        for (int var5 = 0; var5 < class80.field1989; var5++) {
            class134.field3213[var5] = var2.method383(-2056200760);
        }
        if (arg1 <= 98) {
            return;
        }
        for (int var6 = 0; var6 < class80.field1989; var6++) {
            class133.field3162[var6] = var2.method383(-2056200760);
        }
        for (int var7 = 0; var7 < class80.field1989; var7++) {
            class125.field3032[var7] = var2.method383(-2056200760);
        }
        var2.field1128 = arg0.length - class80.field1989 * 8 - (var3 - 1) * 3 - 7;
        class11.field181 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class11.field181[var8] = var2.method374((byte) -32);
            if (class11.field181[var8] == 0) {
                class11.field181[var8] = 1;
            }
        }
        var2.field1128 = 0;
        for (int var9 = 0; var9 < class80.field1989; var9++) {
            int var10 = class125.field3032[var9];
            int var11 = class133.field3162[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            client.field459[var9] = var13;
            int var14 = var2.method373(25094);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method412((byte) -84);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method412((byte) -84);
                    }
                }
            }
        }
    }
}
