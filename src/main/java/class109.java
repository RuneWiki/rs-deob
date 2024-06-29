import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class109 {

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public int field2626 = 0;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "I")
    public int field2633 = 0;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field2630 = 0;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lmb;")
    public static class84 field2623 = class79.method672(true, ":0");

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2622 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lmb;")
    public static class84 field2636 = class79.method672(true, "::gc");

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "Lmb;")
    private static class84 field2638 = class79.method672(true, "Existing user");

    @OriginalMember(owner = "client!qc", name = "v", descriptor = "Lmb;")
    public static class84 field2641 = class79.method672(true, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!qc", name = "w", descriptor = "Lmb;")
    public static class84 field2642 = class79.method672(true, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!qc", name = "x", descriptor = "Lmb;")
    public static class84 field2643 = class79.method672(true, "Mem:");

    @OriginalMember(owner = "client!qc", name = "z", descriptor = "Lmb;")
    private static class84 field2645 = class79.method672(true, "flash2:");

    @OriginalMember(owner = "client!qc", name = "y", descriptor = "I")
    public static volatile int field2644 = 0;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[[S")
    public static short[][] field2635 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!qc", name = "A", descriptor = "Lmb;")
    public static class84 field2646 = class79.method672(true, "backright2");

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "Lmb;")
    public static class84 field2640 = field2638;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "Lmb;")
    public static class84 field2639 = field2645;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public int field2632;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!qc", name = "C", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!qc", name = "B", descriptor = "Lsc;")
    public static class121 field2647;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "Ljf;")
    public class68 field2625;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIBII[BI[Ljc;ILi;I)V")
    public static final void method890(int arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6, class65[] arg7, int arg8, class56 arg9, int arg10) {
        class51 var11 = new class51(arg5);
        int var12 = -1;
        if (arg2 <= 85) {
            field2641 = null;
        }
        field2624++;
        while (true) {
            int var13 = var11.method382(255);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method382(255);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var11.method373(25094);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg0 == var18 && arg4 <= var17 && arg4 + 8 > var17 && arg3 <= var16 && arg3 + 8 > var16) {
                    class36 var22 = class77.method661(var12, -48);
                    int var23 = class49.method358(31318, arg1, var22.field756, var16 & 0x7, var17 & 0x7, var22.field767, var21) + arg8;
                    int var24 = class10.method57(var22.field756, arg1, var22.field767, var17 & 0x7, 121, var16 & 0x7, var21) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg10;
                        if ((class62.field1540[1][var23][var24] & 0x2) == 2) {
                            var25 = arg10 - 1;
                        }
                        class65 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg7[var25];
                        }
                        class70.method620(var23, var24, arg9, var26, arg10, (byte) 52, var12, arg1 + var21 & 0x3, var20);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public static final void method891(byte arg0) {
        field2648++;
        if (arg0 < 50) {
            method893((byte) -74, true, null, null, null);
        }
        class105.field2552 = new class118(32);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method892(int arg0) {
        field2641 = null;
        field2635 = null;
        field2638 = null;
        field2646 = null;
        field2645 = null;
        field2642 = null;
        field2647 = null;
        field2643 = null;
        field2622 = null;
        field2640 = null;
        field2623 = null;
        field2636 = null;
        if (arg0 <= 17) {
            method890(93, 94, (byte) 75, 30, -43, null, 104, null, 78, null, 50);
        }
        field2639 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BZLdf;Lsd;Lsd;)V")
    public static final void method893(byte arg0, boolean arg1, class28 arg2, class122 arg3, class122 arg4) {
        class97.field2396 = arg4;
        field2631++;
        class94.field2327 = arg3;
        int var5 = -91 / ((arg0 - 49) / 49);
        class13.field241 = arg1;
        class87.field2156 = class97.field2396.method989(10, -119);
        class39.field877 = arg2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)Lua;")
    public static final class131 method894(int arg0, byte arg1) {
        if (arg1 <= 73) {
            return null;
        }
        field2621++;
        class131 var2 = (class131) class52.field1174.method970(-27059, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class138.field3331.method986(arg0, 13, (byte) 67);
        class131 var4 = new class131();
        var4.field3140 = arg0;
        if (var3 != null) {
            var4.method1058(new class51(var3), (byte) -65);
        }
        class52.field1174.method965(var4, 208, (long) arg0);
        return var4;
    }
}
